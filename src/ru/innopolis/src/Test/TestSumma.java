package ru.innopolis.src.Test;

import ru.innopolis.src.MathBox;

public class TestSumma {
    public static void Test() {
        MathBox mathBox = new MathBox();
        System.out.println("Begin summa test");
        System.out.println("2 + 4 is " + mathBox.summa(2, 4));
        System.out.println("null + 4 is " + mathBox.summa(null, 4));
        System.out.println("2 + null is " + mathBox.summa(2, null));
        System.out.println("End summa test");
    }
}
