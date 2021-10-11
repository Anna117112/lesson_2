package Lesson_2;

public class Dz_1_3 {

//public class Main {


    public static void main(String[] args) {

        sumA(8, 2);
        sumB(5, 20);
        printSum(sumA(8, 2));
        int x = sumA(8, 2);


    }

    public static int sumA(int x, int y) {
        int resualt = x + y;
        System.out.println(+resualt);
        return x + y;
    }

    // Задание 1
    public static boolean sumB(int a, int b) {
        if ((a + b) <= 10 && (a + b) <= 20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }

    // Задани 2
    public static void printSum(int x) {

        if (x >= 0) {
            System.out.println("Положительная");
        } else {
            System.out.println("Отрицательная");
        }

    }

}