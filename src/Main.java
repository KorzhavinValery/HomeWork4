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
        int age = 10;
        boolean canGoToSleep = age < 2;
        boolean canGoKinderGarten = age >= 2 && age <= 6;
        boolean canGoToSchool = age >= 7 && age <= 18;
        boolean canGoToUniversity = age > 18 && age < 24;
        boolean canGoToJob = age > 24;
        boolean canGoToRest = age > 60;
        if (canGoToSleep) {
            System.out.println("Возраст человека равен " + age + ", ему пора поспать.");
        } else {
            System.out.println("Можно не идти спать");
        }

        if (canGoKinderGarten) {
            System.out.println("Возраст человека равен " + age + ", ему нужно ходить в детский сад.");
        }

        if (canGoToSchool) {
            System.out.println("Возраст человека равен " + age + ", ему нужно ходит в школу.");
        }

        if (canGoToUniversity) {
            System.out.println("Возраст человека равен " + age + ", его место в университете.");
        }
        if (canGoToJob) {
            System.out.println("Возраст человека равен " + age + ", пора ходить на работу");
        }
        if (canGoToRest) {
            System.out.println("Возраст человека равен " + age + ", можно отдохнуть.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 4;
        boolean childAccompaniedByAnAdult = age >= 5 && age < 14;
        if (age < 5) {
            System.out.println("Возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе");

        } else if (childAccompaniedByAnAdult) {
            System.out.println("Возраст ребёнка равен " + age + ", можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int numberOfPlaces = 102;
        int numberOfSeats = 60;
        int numberOfStandingPlaces = numberOfPlaces - numberOfSeats;
        int numberOfSeatsOccupied = 40;
        int numberOfStandingPlacesOccupied = 40;
        int totalOccupiedPlaces = numberOfStandingPlacesOccupied + numberOfSeatsOccupied;
        boolean totalFreePlaces = totalOccupiedPlaces != numberOfPlaces;

        if (!totalFreePlaces) {
            System.out.println("Вагон полностью забит");
        } else {
            System.out.println("Всего в вагоне " + totalOccupiedPlaces + " человек");
        }
        if (numberOfSeatsOccupied < numberOfSeats) {
            System.out.println("В вагоне есть сидячее место");
        } else if (numberOfSeatsOccupied >= numberOfSeats) {
            System.out.println("В вагоне не осталось сидячих мест");
        }
        if (numberOfStandingPlacesOccupied < numberOfStandingPlaces) {
            System.out.println("В вагоне есть стоячее место");
        } else if (numberOfStandingPlacesOccupied >= numberOfStandingPlaces) {
            System.out.println("В вагоне нет стоячих мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 10;
        int three = 12;
        if (one > two) {
            System.out.println("Наиболее число one");
        } else if (two > three) {
            System.out.println("Наибольшее число two");
        } else {
            System.out.println("Наибольшее число three");
        }
    }

}