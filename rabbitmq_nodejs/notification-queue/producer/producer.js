const express = require("express");
const amqp = require("amqplib");

const app = express();
app.use(express.json());

const QUEUE = "order_queue";
let channel;

async function connectRabbitMQ() {
  while (true) {
    try {
      const connection = await amqp.connect(
        "amqp://user:password@rabbitmq:5672"
      );
      channel = await connection.createChannel();
      await channel.assertQueue(QUEUE, { durable: true });
      console.log("Connected to RabbitMQ");
      break;
    } catch (err) {
      console.log("RabbitMQ not ready, retrying...");
      await new Promise((res) => setTimeout(res, 3000));
    }
  }
}

connectRabbitMQ();

app.post("/send", (req, res) => {
  const message = JSON.stringify(req.body);
  channel.sendToQueue(QUEUE, Buffer.from(message));
  res.send("Message sent to queue");
});

app.listen(3000, () => {
  console.log("Producer running on port 3000");
});
