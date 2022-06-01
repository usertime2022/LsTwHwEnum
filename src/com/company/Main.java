package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Апта кундорунон бир кунду жазыныз!");
            String soz = scanner.nextLine().toUpperCase();
            switch (soz) {
                case ("ДУЙШОМБУ"):
                    System.out.println(Kundor.ДУЙШОМБУ.getName() + " куну java тилин уйроном!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case ("ШЕЙШЕМБИ"):
                    System.out.println(Kundor.ШЕЙШЕМБИ.getName() + " куну Англис тилин уйроном!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case ("ШАРШЕМБИ"):
                    System.out.println(Kundor.ШАРШЕМБИ.getName() + " куну Soft skills уйроном!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case ("БЕЙШЕМБИ"):
                    System.out.println(Kundor.БЕЙШЕМБИ.getName() + " куну java тилин практика кылам!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case ("ЖУМА"):
                    System.out.println(Kundor.ЖУМА.getName() + " куну Англис тилин практика кылам!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case ("ИШЕМБИ"):
                    System.out.println(Kundor.ИШЕМБИ.getName() + " жумуш кылам!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case ("ЖЕКШЕМБИ"):
                    System.out.println(Kundor.ЖЕКШЕМБИ.getName() + " эс алам!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                default:
                    System.out.println("Ката жаздыныз!");
            }
        }
    }
}
