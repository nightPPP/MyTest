package com.example.mytest.design.builder;

public class WorkBuilder {
    Room room = new Room();
    private RoomParas paras = new RoomParas();

    public WorkBuilder makeWindow(String window){
        paras.window = window;
        return this;
    }
    public WorkBuilder makeFloor(String floor){
        paras.floor = floor;
        return this;
    }
    public WorkBuilder makeLamp(String lamp){
        paras.lamp = lamp;
        return this;
    }

    public Room build(){
        room.apply(paras);
        return room;
    }

    public class RoomParas {
        public String window;
        public String floor;
        public String lamp;
    }
}
