package com.moko.lib.mqtt.event;

public class DeviceModifyNameEvent {

    private String mac;

    public DeviceModifyNameEvent(String mac) {
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }
}
