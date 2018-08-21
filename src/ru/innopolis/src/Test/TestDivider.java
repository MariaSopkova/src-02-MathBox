package ru.innopolis.src.Test;

import ru.innopolis.src.DivisionByZero;
import ru.innopolis.src.MathBox;

public class TestDivider {
    public static void Test() {
        MathBox mathBox = new MathBox();
        System.out.println("Begin divider test");
        try {
            System.out.println("4 + 2 is " + mathBox.divider(4, 2));
            System.out.println("null / 4 is " + mathBox.divider(null, 4));
            System.out.println("2 / null is " + mathBox.divider(2, null));
            System.out.println("2 / 0 is " + mathBox.divider(2, 0));
        } catch (DivisionByZero ex) {
            System.out.println("Division by zero");
        }
        System.out.println("End divider test");
    }
}
