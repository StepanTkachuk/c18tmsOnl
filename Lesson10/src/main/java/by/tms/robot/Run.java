package by.tms.robot;

import by.tms.robot.hands.SamsungHand;
import by.tms.robot.hands.SonyHand;
import by.tms.robot.hands.ToshibaHand;
import by.tms.robot.heads.SamsungHead;
import by.tms.robot.heads.SonyHead;
import by.tms.robot.heads.ToshibaHead;
import by.tms.robot.legs.SamsungLeg;
import by.tms.robot.legs.SonyLeg;
import by.tms.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например, у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot robot1 = new Robot(new ToshibaHead(10), new SamsungHand(5), new SonyLeg(7));
        robot1.action();
        System.out.println(robot1.getPrice());
        Robot robot2 = new Robot(new SamsungHead(15), new SonyHand(3), new ToshibaLeg(9));
        robot2.action();
        System.out.println(robot2.getPrice());
        Robot robot3 = new Robot(new SonyHead(20), new ToshibaHand(7), new SamsungLeg(5));
        robot3.action();
        System.out.println(robot3.getPrice());
    }
}
