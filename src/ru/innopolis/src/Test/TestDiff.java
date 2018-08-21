package ru.innopolis.src.Test;

import ru.innopolis.src.MathBox;

public class TestDiff {
    public static void Test() {
        MathBox mathBox = new MathBox();
        System.out.println("Begin diff test");
        System.out.println("2 - 4 is " + mathBox.diff(2, 4));
        System.out.println("4 - 4 is " + mathBox.diff(4, 2));
        System.out.println("null + 4 is " + mathBox.diff(null, 4));
        System.out.println("2 - n-ll is " + mathBox.diff(2, null));
        System.out.println("End diff test ");
    }
}
