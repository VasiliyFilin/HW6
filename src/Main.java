public class Main {
    public static void main(String[] args) {
        {
            //Задача 1
            System.out.println("Задача 1:\n");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            System.out.println();
        }

        {
            //Задача 2
            System.out.println("Задача 2:\n");
            for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
            System.out.println();
        }
        {
            //Задача 3
            System.out.println("Задача 3:\n");
            for (int i = 2; i <= 17; i += 2) {
                System.out.println(i);
            }
            System.out.println();
        }
        {
            //Задача 4
            System.out.println("Задача 4:\n");
            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }
            System.out.println();

        }
        {
            //Задача 5
            System.out.println("Задача 5:\n");
            for (int i = 1904; i <= 2096; i += 4) {
                System.out.println(i + " год является високосным");
            }
            System.out.println();
        }
        {
            //Задача 6
            System.out.println("Задача 6:\n");
            for (int i = 7; i <= 98; i += 7) {
                System.out.println(i);
            }
            System.out.println();
        }
        {
            //Задача 7
            System.out.println("Задача 7:\n");
            for (int i = 1; i <= 512; i *= 2) {
                System.out.println(i);
            }
            System.out.println();
        }
        {
            //Задача 8
            System.out.println("Задача 8:\n");
            int money = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total += money;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
            System.out.println();
        }
        {
            //Задача 9
            System.out.println("Задача 9:\n");
            int money = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + total/100;
                total += money;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
            System.out.println();
        }
        {
            //Задача 10
            System.out.println("Задача 10:\n");
            int r = 1;
            for (int i = 1; i <= 10; i++) {
                r = i * 2;
                System.out.println("2*" + i + "=" + r);
            }
            System.out.println();
        }
    }
}