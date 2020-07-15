package ru.geekbrains.java.oop.at.obstacles;

import ru.geekbrains.java.oop.at.participants.Runner;
//Беговая дорожка с дистанцией
public class Treadmill implements Obstacles {
    private int length;
    public  Treadmill(int length){
        this.length=length;
    }

    public void check(Runner runner) {
runner.run();
runner.setSuccess(runner.getMaxLength()>=length);
if (runner.getSuccess()){
    System.out.println("Бегун " + runner.getName()+ " выполнил испытание, пробежав дорожку длиной: "+ length);
}
else {
        System.out.println("Бегун " + runner.getName()+ " не пробежал дорожку длиной "+ length);

}

    }
}