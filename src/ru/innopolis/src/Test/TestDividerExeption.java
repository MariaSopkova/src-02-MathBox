package ru.innopolis.src.Test;

import ru.innopolis.src.MathBox;

public class TestDividerExeption {
    public static void Test() {
        MathBox mathBox = new MathBox();
        System.out.println("Begin dividerExceptionInside test");
        System.out.println("4 + 2 is" + mathBox.dividerExceptionInside(4, 2));
        System.out.println("null / 4 is" + mathBox.dividerExceptionInside(null, 4));
        System.out.println("2 / null is" + mathBox.dividerExceptionInside(2, null));
        System.out.println("2 / 0 is" + mathBox.dividerExceptionInside(2, 0));
        System.out.println("End dividerExceptionInside test");
    }
}
