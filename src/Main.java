public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Человек достиг совершеннолетия его возраст равен " + age + " лет.");
        } else {
            System.out.println("Человек не достиг совершеннолетия, его возраст равен " + age + "," +
                    "  нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Ваша скорость составляет " + speed + " км/ч, превышения скорости нет," +
                    " можно ездить спокойно.");
        } else {
            System.out.println("Ваша скорость составляет" + speed + " км/ч, скорость превышена, " +
                    "придется заплатить штраф.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
    }

    public static void task5() {
        System.out.println("Задача 5");
    }

    public static void task6() {
        System.out.println("Задача 6");
    }

    public static void task7() {
        System.out.println("Задача 7");
    }

}