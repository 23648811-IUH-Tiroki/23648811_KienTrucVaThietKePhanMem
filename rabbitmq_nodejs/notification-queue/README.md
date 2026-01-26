# Notification Queue System

## Mô tả
Hệ thống sử dụng RabbitMQ theo mô hình event-driven gồm Producer và Consumer.

## Kiến trúc
Producer -> RabbitMQ -> Consumer

## Công nghệ
- Node.js
- RabbitMQ
- Docker Compose

## Cách chạy
docker compose up --build

## Test
POST http://localhost:3000/send
