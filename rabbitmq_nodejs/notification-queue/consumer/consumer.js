const amqp = require("amqplib");

const QUEUE = "order_queue";
const RABBITMQ_URL = "amqp://user:password@rabbitmq:5672";

async function connectWithRetry() {
  try {
    console.log("Consumer connecting to RabbitMQ...");
    const connection = await amqp.connect(RABBITMQ_URL);
    const channel = await connection.createChannel();

    await channel.assertQueue(QUEUE, { durable: true });

    console.log("Consumer is waiting for messages...");

    channel.consume(QUEUE, (msg) => {
      if (msg) {
        console.log("Received:", msg.content.toString());
        channel.ack(msg);
      }
    });
  } catch (err) {
    console.log("RabbitMQ not ready (consumer), retry in 3s...");
    setTimeout(connectWithRetry, 3000);
  }
}

connectWithRetry();
