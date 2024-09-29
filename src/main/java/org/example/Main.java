package org.example;

import org.example.TaskFour.Eatable;
import org.example.TaskFour.HumanWorker;
import org.example.TaskFour.RobotWorker;
import org.example.TaskFour.Workable;
import org.example.TaskFour.Worker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        humanWorker.work();
        ((Eatable) humanWorker).eat();

        robotWorker.work();

    }
}