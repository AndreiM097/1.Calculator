package model;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        calculate();

    }



    public static void calculate() {

        boolean doAnotherOperation = true;

        while (doAnotherOperation) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Introduceti primul numar: ");

            int numarUnu = scan.nextInt();
            scan.nextLine();

            System.out.println("Introduceti o operatie: ");

            String operatie = scan.nextLine();

            System.out.println("Introduceti al doilea numar: ");

            int numarDoi = scan.nextInt();

            int rezultat = 0;

            switch (operatie) {
                case "+":
                    rezultat = numarUnu + numarDoi;
                    break;
                case "-":
                    rezultat = numarUnu - numarDoi;
                    break;
                case "*":
                    rezultat = numarUnu * numarDoi;
                    break;
                case "/":
                    rezultat = numarUnu / numarDoi;
                    break;

                default:
                    System.out.println("Operatia este incorecta!");

            }
            System.out.println("Rezultatul este: " + rezultat);

            System.out.println();

            System.out.println("Doriti sa efectuati o alta operatie? da/nu");



            String decizie = scan.next(); // daca folosesc scan.nextLine(); de ce nu o sa-mi ia valoarea?


            switch (decizie) {
                case "da":
                    doAnotherOperation = true;
                break;
                case "nu":
                    doAnotherOperation = false;
                break;

                default:
                    System.out.println("Va rog folositi 'da' sau 'nu'");
                    scan.nextLine();
            }
        }
    }
}

