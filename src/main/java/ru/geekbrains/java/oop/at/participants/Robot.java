package ru.geekbrains.java.oop.at.participants;

public class Robot implements Runner {
    private String name;
    private int maxLength;
    private int maxWeight;
    private boolean success = true;

    public Robot(String name, int maxLength, int maxWeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
    }

    public void run() {
        System.out.println(name + " бежит максимум: " + maxLength);
    }

    public void jump() {
        System.out.println(name + " прыгает максимум: " + maxWeight);
    }

    public String getName() {
        return name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
