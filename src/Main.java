//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Cycles");
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " ");
        }

        System.out.println("Задача 3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i + " ");
        }
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");

        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i + " ");
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
        System.out.println("Задача 8");
        int amount = 29000;
        int sum = 0;
        for (int mount = 1; mount <= 12; mount++) {
            sum += amount;
            System.out.println("Месяц " + mount + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 9");
        sum = 0;
        double percent = 1D / 100;
        for (int mount = 1; mount <= 12; mount++) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            System.out.println("Месяц " + mount + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}