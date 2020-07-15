/*Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать
(методы просто выводят информацию о действии в консоль).

Создайте два класса: беговая дорожка и стена, при прохождении через которые,
участники должны выполнять соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
У препятствий есть длина (для дорожки) или высота (для стены),
а участников ограничения на бег и прыжки.

Создайте два массива: с участниками и препятствиями,
и заставьте всех участников пройти этот набор препятствий.
Задание со звездочкой:
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
*/
package ru.geekbrains.java.oop.at;

import ru.geekbrains.java.oop.at.obstacles.Obstacles;
import ru.geekbrains.java.oop.at.obstacles.Treadmill;
import ru.geekbrains.java.oop.at.obstacles.Wall;
import ru.geekbrains.java.oop.at.participants.Cat;
import ru.geekbrains.java.oop.at.participants.Human;
import ru.geekbrains.java.oop.at.participants.Robot;
import ru.geekbrains.java.oop.at.participants.Runner;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
Runner catMurka=new Cat("Murka",12,7);
Runner catBarsik=new Cat("Barsik",11,4);
Runner catPushok=new Cat("Pushok",8,5);

Runner humanIvan = new Human("Ivan", 22,3);
Runner humanPetr = new Human("Petr", 20,2);
Runner humanSidor = new Human("Sidor", 30,3);

Runner robotRJ10=new Robot("RJ-10",15,9);
Runner robotTDD17=new Robot("TDD-17",19,3);
Runner robotX100=new Robot("X-100",31,10);
//Загоняем всех в один массив
Runner [] runners={catMurka,catBarsik,catPushok, humanIvan,humanPetr,humanSidor, robotRJ10,robotTDD17, robotX100};

Obstacles wallShort=new Wall(2);
Obstacles wallMidle=new Wall(6);
Obstacles wallHight= new Wall(10);

Treadmill treadmillSmall = new Treadmill(10);
Treadmill treadmillMidle = new Treadmill(20);
Treadmill treadmillLong = new Treadmill(30);

Obstacles[] obstacles={wallShort,wallMidle,wallHight,treadmillSmall,treadmillMidle,treadmillLong};
        System.out.println("Гонка началась!");
for (int i=0;i<obstacles.length;i++){
    System.out.println("\n\nИспытание "+ (i+1));

    for (Runner runner:runners){
if(runner.getSuccess()){
    System.out.println("----------------------");
    obstacles[i].check(runner);
}
    }

}

    }
}