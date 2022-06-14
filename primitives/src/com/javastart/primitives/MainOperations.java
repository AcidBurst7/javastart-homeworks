package com.javastart.primitives;

/**
 * 2.
 * 	Создать проект, имя operations
 * 	В методы main создать все численные переменные
 * 	Инициализировать их начальными значениями
 * 	Провести математические операции над ними (не только с одниковыми, но и например int + long и тд)
 * 	Создать переменные под результаты операций
 * 	Результаты вывести в консоль
 *
 * *3.
 * 	Повторить задание 2, но все математические операции выполнять в отделных, разных методах.
 */

public class MainOperations {
    public static void main(String[] args) {
        long longValue = 50;
        int intValue = 29;
        byte byteValue = 89;
        short shortValue = 130;
        float floatValue = 180.01f;
        double doubleValue = 348.98;

        int result1 = byteValue + shortValue;
        long result2 = intValue + longValue;
        double result3 = floatValue + doubleValue;
        double result4 = intValue + doubleValue;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println(sumOfByteAndShort(byteValue, shortValue));
        System.out.println(sumOfIntAndLong(intValue, longValue));
        System.out.println(sumOfFloatAndDouble(floatValue, doubleValue));
        System.out.println(sumOfDoubleAndInt(doubleValue, intValue));
    }

    public static int sumOfByteAndShort(byte a, short b) {
        return a + b;
    }

    public static long sumOfIntAndLong(int a, long b) {
        return a + b;
    }

    public static double sumOfFloatAndDouble(float a, double b) {
        return a + b;
    }

    public static double sumOfDoubleAndInt(double a, int b) {
        return a + b;
    }
}
