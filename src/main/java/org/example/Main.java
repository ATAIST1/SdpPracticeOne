package org.example;


import org.example.TaskThree.Bird;
import org.example.TaskThree.Penguin;
import org.example.TaskThree.Flyable;
import org.example.TaskThree.Sparrow;
import org.example.TaskTwo.Circle;
import org.example.TaskTwo.Rectangle;
import org.example.TaskTwo.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());

    }
}