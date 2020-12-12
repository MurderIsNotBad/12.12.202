package com.hillel;

public class BicycleTest {
    public static void main(String[] args) {


        Bicycle bicycle = new Bicycle(70, "34");

        Bicycle.Seat seat = bicycle.new Seat();
        Bicycle.SteeringWheel steeringWheel = bicycle.new SteeringWheel();
        seat.seatUp();
        seat.seatUp();
        seat.seatUp();
        seat.seatUp();
        seat.seatUp();
        seat.seatUp();
        seat.seatUp();
        System.out.println(bicycle.height);

    }
}