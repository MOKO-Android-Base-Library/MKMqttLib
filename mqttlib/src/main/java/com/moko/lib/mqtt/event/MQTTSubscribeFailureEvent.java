package com.moko.lib.mqtt.event;

public class MQTTSubscribeFailureEvent {
    private String topic;

    public MQTTSubscribeFailureEvent(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
