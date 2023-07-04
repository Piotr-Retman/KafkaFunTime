Recommended: 
a) Linux / macOS
b) Java 17

## **Install Kafka**

_https://kafka.apache.org/quickstart_

1 Run [Zookeeper](https://zookeeper.apache.org/)

``cd ~/PATH_TO_KAFKA/kafka_2.13-3.5.0``

``bin/zookeeper-server-start.sh config/server.properties``

2 Run Kafka

`` bin/kafka-server-start.sh config/server.properties ``
## Download tool:

_[KafkaMagic](https://www.kafkamagic.com/download/?v2)_

### Follow the instructions for tools above !!
and then

Put `` spring.kafka.bootstrap-servers `` prop value 

You can find it in the _**logs when you run kafka**_


3 Turn on **KafkaMagic** tool and connect to cluster

4 Call in the browser: http://localhost:8888/api/simple 
this will trigger sample Kafka call

It will be visible in the KafkaMagic tool where you can check values of the call.

