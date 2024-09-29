package org.example;

import org.example.TaskFive.Light;
import org.example.TaskFive.Button;
import org.example.TaskFive.Switchable;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Switchable light = new Light();
        Button button = new Button(light);

        button.press();

    }
}