package ru.innopolis.src;

public class MathBox {

    public MathBox() {
    }

    public int summa(Integer a, Integer b) {
        if (a == null) {
            System.out.println("Summa. A is null");
            return b;
        }
        if (b == null) {
            System.out.println("Summa. B is null");
            return a;
        }
        return a + b;
    }

    public int diff(Integer a, Integer b) {
        if (a == null) {
            System.out.println("Diff. A is null");
            return -b;
        }
        if (b == null) {
            System.out.println("Diff. B is null");
            return a;
        }
        return a - b;
    }

    public long factorial(Integer a) {
        try {
            return a == 1 ? 1 : a * factorial(a - 1);
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException in factorial");
            return 0;
        }
    }

    public double dividerExceptionInside(Integer a, Integer b) {
        try {
            return a / b;
        } catch (NullPointerException ex) {
            System.out.println("NullPointerExeption in dividerExceptionInside");
            return 0;
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException in dividerExceptionInside");
            return 0;
        }
    }

    public double divider(Integer a, Integer b) throws DivisionByZero {
        try {
            if (b == 0) {
                throw new DivisionByZero();
            }
            return a / b;
        } catch (NullPointerException ex) {
            System.out.println("NullPointerExeption in dividerExceptionInside");
            return 0;
        }
    }
}
