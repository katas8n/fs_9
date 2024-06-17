package com.example.www;

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
//        1. Client should be registered in application
//               userName should be loner than 2
//               Equal-case validation : Kirill, KiRilL ...
//               ask user about email : kirka6061512@icloud.com -> Profile name its -> 0 ... 8 symbol
//              if user used spaces in str -> remove them
//              Client name should be different of usual in conspiracy mode -> all letters a should be replaced on "o" and all "o" should be replaced by "0" L -> 1

//        boolean isRunning = true;
//        boolean isAuthorized = false;
//
//        String name = "";
//        String email = "";
//        String password = "";
//        String profileName = "";
//        String secretName = "";
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (isRunning) {
//            System.out.println("Welcome to the blue-bar:\na) Registration \nb) Authorisation \nc) Show user info \nq) Quit");
//            String item = scanner.nextLine();
//
//            switch (item.trim().toLowerCase()) {
//                case "a":
//                    name = scanner.nextLine();
//                    email = scanner.nextLine();
//                    password = scanner.nextLine();
//
//                    if(name.length() < 2) break;
//
//                    profileName = email.substring(0, 8);
//
//                    break;
//                case "b":
//                    String enteredEmail = scanner.nextLine();
//                    String enteredPassword = scanner.nextLine();
//
//                    if(enteredEmail.equalsIgnoreCase(email) && enteredPassword.equals(password)) {
//                        System.out.println(profileName);
//
//                        secretName = name.replace("o", "a");
//                        isAuthorized = true;
//                        System.out.println("[IS AUTHORIZED]: " + isAuthorized);
//                    }
//
//                    break;
//
//                case "c":
//                    if(isAuthorized) {
//                        System.out.println("Name: " + name);
//                        System.out.println("Secret Name: " + secretName);
//                        System.out.println("Profile Name: " + profileName);
//                        System.out.println("Email: " + email);
//                    }
//                    break;
//
//                case "q":
//                    isRunning = false;
//                    break;
//            }
//        }
//        10
//        int number = Integer.parseInt(scanner.nextLine());
//
//        for(int i = 1; i <= 20; i++) {
//            System.out.println(number + " * " + i + " = " + number * i);
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number which will calculated as a factorial");
//
//        String  userNumber = scanner.nextLine();
//        int factorial = 1;
//
////        7
//        for (int i = 1; i <= Integer.parseInt(userNumber); i++) {
//
//            factorial *= i;
//            System.out.println("[FACTORIAL]:" + factorial);
//        }
//
//        System.out.println(factorial);

//        a) Get inverted name
//        q) exit

//        boolean isRunning = true;
//        Scanner scanner = new Scanner(System.in);

//        while(isRunning) {
//            System.out.println("If you wanna play please enter : yes or Y ");
//            String answer = scanner.nextLine();
//
//            switch (answer) {
//                case "Y":
//                case "yes":
//                    System.out.println("Hello, enter ur name to get it in reverse form!");
//                    String userName = scanner.nextLine();
//
//                    for(int i = userName.length() - 1; i >= 0; i--) {
//                        System.out.println(userName.charAt(i));
//                    }
//
//                    break;
//
//                default:
//                    isRunning = false;
//            }
//        }



//        boolean isRunning = true;
//        int attemptsAmount = 0;
//        Scanner scanner = new Scanner(System.in);
//
//
//        while(isRunning) {
//            System.out.println("Welcome to casino! How old are you?");
//            String userAge = scanner.nextLine();
//            if(Integer.parseInt(userAge) < 18) { continue; }
//
//            while (true) {
//                System.out.println("You should write here number with which you wanna play: ");
//                double randomNumber = Math.ceil(Math.random() * 31);
//                System.out.println("randomNumber: " + randomNumber);
//
//                String userNumber = scanner.nextLine();
//
//                if(Double.parseDouble(userNumber) == randomNumber) {
//                    System.out.println("You won!");
//
//                    break;
//                }
//
//                attemptsAmount++;
//
//                if(attemptsAmount >= 5) System.out.println("You will play using credits since now!");
//            }
//
//        }
    }
}
