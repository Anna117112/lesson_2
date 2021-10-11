package Lesson_2;

public class Dz_4 {
    public static void main(String[] args) {
        newWord("Oleg");
        newNumber();
        cycleFor(newWord("Oleg"),
                newNumber()
        );
//        pow(2,3);
    }
    // Задали строку
    public static String newWord(String name) {
        String resultName = "Hello " + name;
        //System.out.println(resultName);
        return resultName;
    }
    // Задали число
    public static int newNumber() {
        int a = 5;
        // System.out.println(a);
        return a;
    }
    // Вывели строку заданное число раз
    private static void cycleFor(String oleg, int newNumber) {
        for (int i = 0; i < newNumber; i++)
            // System.out.println(i);
            System.out.println(newWord("Oleg"));
    }
}

