package ru.geekbrains.java.oop.at.obstacles;

import ru.geekbrains.java.oop.at.participants.Runner;
//Стена с высотой
public class Wall implements Obstacles {
    private int width;
public Wall(int width) {this.width=width;
}
public void check(Runner runner){
runner.jump();
runner.setSuccess(runner.getMaxLength()>=width);
if(runner.getSuccess()){
    System.out.println("Прыгун " + runner.getName()+ " выполнил испытание , перепрыгнув стену высотой "+  width);}
    else {System.out.println("Прыгун = " + runner.getName()+ " не перепрыгнув стену высотой: "+
            width);
    }
  }
}


