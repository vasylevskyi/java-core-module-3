package main.java;

import java.util.Scanner;

/**
 * Module 3 Tasks 4-5
 */

public class PassportFormCreator {

    public void createForms() {
        Scanner scanner = new Scanner(System.in);

        String yourName = new String();
        //System.out.print("yourName = ");
        yourName = scanner.nextLine();

        String yourSurname = new String();
        //System.out.print("yourSurname = ");
        yourSurname = scanner.nextLine();

        int moonAge;
        //System.out.print("moonAge in years = ");
        moonAge = scanner.nextInt() * 10;

        System.out.println(yourName + " " + yourSurname + " " + moonAge);
        System.out.println(yourName.toUpperCase());
        System.out.println(yourSurname.toUpperCase());
        System.out.println(moonAge);

        scanner.close();
    }

    public void main(String[] args) {
        PassportFormCreator personalData = new PassportFormCreator();
        personalData.createForms();


    }

}

