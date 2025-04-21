package com.moko.lib.mqtt.entity;

public class MsgConfigReq<T> {
    public int msg_id;
    public MsgDeviceInfo device_info;
    public T data;
}
