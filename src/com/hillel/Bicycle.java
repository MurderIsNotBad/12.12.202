package com.hillel;

public class Bicycle {

    int height;
    String model;

    public Bicycle(int height, String model){
        this.height = height;
        this.model = model;
    }

    public void ride(){

    }
    public class SteeringWheel {
        public void left() {
            System.out.println("left");
        }

        public void right() {
            System.out.println("right");
        }
    }
        public class Seat{
            public void seatUp(){
                System.out.println("up");
                height++;
            }
            public void seatDown(){
                System.out.println("down");
                height--;
            }
        }
    }


