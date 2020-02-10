package com.java21days;

class MarsApplication {
    public static void main(String[] arguments) {
        // creates a new robot object w/ name "spirit"
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        
        spirit.showAttributes();
        System.out.println("Increasing speed to 3");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to to -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature");
        spirit.checkTemperature();
        spirit.showAttributes();
        
        MarsRobot opportunity = new MarsRobot();
        opportunity.speed = 2;
        opportunity.status = "exploring";
        opportunity.temperature = 187;
        opportunity.showAttributes();
    }
}