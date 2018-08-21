package ru.innopolis.src.Test;

import ru.innopolis.src.MathBox;

public class TestFactorial {
    public static void Test() {
        MathBox mathBox = new MathBox();
        System.out.println("Begin factorial test");
        System.out.println("7! is " + mathBox.factorial(7));
        System.out.println("null! is " + mathBox.factorial(null));
        //System.out.println("30000! is" + mathBox.factorial(30000));
        System.out.println("End factorial test");
    }
}
