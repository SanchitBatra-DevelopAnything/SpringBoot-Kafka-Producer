# SpringBoot-Kafka-Producer

1.) Start a zookeeper server
2.) Start a kafka broker

Follow Along : https://kafka.apache.org/quickstart

This is a POC on kafka producer , and has been tested on CLI Consumer by running shell script for consumer where we specify the topic "cab-location" to send the data through KafkaTemplate from this codebase.

In the below image , one window starts the broker , other one the zookeeper and the 3rd one the consumer , where we receive the locations every second as sent by the producer.


![image](https://github.com/SanchitBatra-DevelopAnything/SpringBoot-Kafka-Producer/assets/61592754/fd8a7095-25db-4537-96ca-fe22e7371a26)

-----------------

SpringBoot-Kafka-Consumer Repo code listens to this producer.

![image](https://github.com/SanchitBatra-DevelopAnything/SpringBoot-Kafka-Producer/assets/61592754/2859dc16-ee40-4bcd-936f-fbbed4ac2d2b)

