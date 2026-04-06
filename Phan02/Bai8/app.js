const express = require("express");
const mysql = require("mysql2");

const app = express();
const PORT = 3000;

const db = mysql.createConnection({
    host: "mysql",
    user: "user",
    password: "password",
    database: "mydb"
});

db.connect((err) => {
    if (err) {
        console.error("MySQL connection failed:", err);
        return;
    }
    console.log("Connected to MySQL!");
});

app.get("/", (req, res) => {
    res.send("Node.js connected to MySQL successfully!");
});

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});