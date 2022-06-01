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
                    System.out.println(Kundor.ДУЙШОМБУ + " куну java тилин уйроном!");
                    break;
                case ("ШЕЙШЕМБИ"):
                    System.out.println(Kundor.ШЕЙШЕМБИ + " куну Англис тилин уйроном!");
                    break;
                case ("ШАРШЕМБИ"):
                    System.out.println(Kundor.ШАРШЕМБИ + " куну Soft skills уйроном!");
                    break;
                case ("БЕЙШЕМБИ"):
                    System.out.println(Kundor.БЕЙШЕМБИ + " куну java тилин практика кылам!");
                    break;
                case ("ЖУМА"):
                    System.out.println(Kundor.ЖУМА + " куну Англис тилин практика кылам!");
                    break;
                case ("ИШЕМБИ"):
                    System.out.println(Kundor.ИШЕМБИ + " жумуш кылам!");
                    break;
                case ("ЖЕКШЕМБИ"):
                    System.out.println(Kundor.ЖЕКШЕМБИ + " эс алам!");
                    break;
                default:
                    System.out.println("Ката жаздыныз!");
            }
        }
    }
}
