package com.example.patterns.decorate;

public class DecorateTest {
    public static void main(String[] args) {
        Room simpleRoom = new SimpleRoom();
        System.out.println(simpleRoom.getDescription());
        System.out.println(simpleRoom.getPrice());

        //done at compile time and it’s applicable to all the instances of the class.
        Room roomWithWifi = new RoomWithWifi();
        System.out.println(roomWithWifi.getDescription() + roomWithWifi.getPrice());

        //done at runtime and add responsibilities to individual objects dynamically without affecting other objects.
        Room wiFiDecorator = new WiFiDecorator(simpleRoom);
        System.out.println(wiFiDecorator.getDescription());
        System.out.println(wiFiDecorator.getPrice());

        Room breakfastDecorator = new BreakfastDecorator(simpleRoom);
        System.out.println(breakfastDecorator.getDescription());
        System.out.println(breakfastDecorator.getPrice());

        Room room = new BreakfastDecorator(new WiFiDecorator(simpleRoom));
        System.out.println(room.getDescription());
        System.out.println(room.getPrice());
    }
}
