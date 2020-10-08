package com.example.mytest.design.builder;

public class Room{
    private String window;
    private String floor;
    private String lamp;

    public Room apply(WorkBuilder.RoomParas roomParas){
        this.window = roomParas.window;
        this.floor = roomParas.floor;
        this.lamp = roomParas.lamp;
        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                ", lamp='" + lamp + '\'' +
                '}';
    }
}
