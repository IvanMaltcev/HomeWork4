
public class Main {
    public static void main(String[] args) {

        // Задача 1

        int age = 17;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2

        int temperature = 10;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3

        int speed = 63;

        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        // Задача 4

        int agePerson = 26;
        boolean isPersonChild = agePerson > 2 && agePerson < 6;
        boolean isPersonPupil = agePerson > 7 && agePerson < 17;
        boolean isPersonStudent = agePerson >= 18 && agePerson <= 24;

        if (isPersonChild) {
            System.out.println("Если возраст человека равен " + agePerson
                    + ", то ему нужно ходить в детский сад");
        } else if (isPersonPupil) {
            System.out.println("Если возраст человека равен " + agePerson
                    + ", то ему нужно ходить в школу");
        } else if (isPersonStudent) {
            System.out.println("Если возраст человека равен " + agePerson
                    + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + agePerson
                    + ", то ему пора ходить на работу");
        }

        // Задача 5

        int ageChild = 15;
        boolean isChildWithAdult = false;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild
                    + ", то он не может кататься на аттракционе");
        } else if (ageChild > 5 && ageChild < 14) {
            if (!isChildWithAdult) {
                System.out.println("Если возраст ребенка равен " + ageChild
                        + ", то он не может кататься на аттракционе без сопровождения взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + ageChild
                        + ", то он может кататься на аттракционе в сопровождения взрослого");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild
                    + ", он может кататься без сопровождения взрослого");
        }

        // Задача 6

        int nextPassengerNumber = 103;
        int carriageCapacity = 102;
        int amountOfSeats = 60;
        boolean isCarriageFull = nextPassengerNumber <= carriageCapacity;
        boolean isSeatInCarriage = nextPassengerNumber <= amountOfSeats;
        if (isCarriageFull && isSeatInCarriage) {
            System.out.println("В вагоне есть сидячие места");
        } else if (isCarriageFull && !isSeatInCarriage) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне нет мест!");
        }

        // Задача 7

        int one = 5;
        int two = 10;
        int three = 3;
        boolean isOneGreaterTwo = one > two;
        boolean isTwoGreaterThree = two > three;

        if (isOneGreaterTwo && !isTwoGreaterThree) {
            System.out.println("Большее число one равное " + one);
        } else if (!isOneGreaterTwo && !isTwoGreaterThree) {
            System.out.println("Большее число three равное " + three);
        } else {
            System.out.println("Большее число two равное " + two);
        }

    }
}