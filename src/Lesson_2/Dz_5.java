package Lesson_2;

public class Dz_5 {
    public static void main(String[] args) {
        longYear(2023);
    }
    public static boolean longYear(int b) {
        boolean a =
                (((b % 4 == 0) && (b % 100 != 0)) || (b % 400 == 0));
        if (a)
            System.out.println("Этот год високосный");
        return true;
    }
}

