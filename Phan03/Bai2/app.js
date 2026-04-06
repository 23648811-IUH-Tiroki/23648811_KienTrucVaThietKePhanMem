const express = require("express");
const mongoose = require("mongoose");

const app = express();
const PORT = 3000;
const MONGO_URL = process.env.MONGO_URL || "mongodb://mongo:27017/mydb";

mongoose.connect(MONGO_URL)
    .then(() => console.log("Connected to MongoDB"))
    .catch(err => console.error(err));

app.get("/", (req, res) => {
    res.send("Node.js + MongoDB is running!");
});

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});