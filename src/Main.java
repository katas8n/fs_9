import java.util.ArrayList;
import java.util.Scanner;

// Initial point of a program
class Main {
    // public
    // static
    // void
    // main

    public static void main(String [] people) {
//        for(int i = 0; i < people.length; i++) {
//            System.out.println("Welcome to the gey-party : " + people[i]);
//
//        }
//
//        short widthOfLine = 31000;
//        byte widthOfSquare = -120;
//        int widthOfCircle = 2138437023;

//        System.out.println(widthOfLine);
//        System.out.println(widthOfSquare);
//        System.out.println(widthOfCircle);
        // Hello

        // Hello from git!
//        char correctAnswer = '@';
//        boolean isDrunk = true;


        // Comment
//        System.out.println(correctAnswer);

//      Math: +, -, *, /, %
//      Logical: < , > , >=, <=, ==, !=

//        System.out.println(2 * (2 + 2.3));
//        System.out.println(2 - 2.3);
//        System.out.println(2 * 2.3);
//        System.out.println(2 / 2);
//
//        System.out.println(13 % 2);

//        System.out.println(2 > 2);
//        System.out.println(2 < 2);
//        System.out.println(2 <= 2);
//        System.out.println(2 >= 2);
//        System.out.println(2 == 2);


//  ! - ne , && , ||
//        boolean hasMoney = false;
//        boolean isHandsome = false;
//
//        int cryptoBill = 4000000;
//
//        if(hasMoney && (isHandsome || cryptoBill > 500)) {
//            System.out.println("Here we are!");
//        }
//  !

//        System.out.println("Welcome! What's ur name?");
//        Scanner scanner = new Scanner(System.in);
//
//        String userName = scanner.nextLine();
//
//        // else if
//
//// range
//
//        if (userName.equals("Jim")) {
//            System.out.println("Nice to meet ya " + userName);
//        } else if(userName.equals("John")) {
//            System.out.println("I haven't see ya for hundred years! " + userName);
//        } else {
//            System.out.println("You are not a Jim. You must go away!s");
//        }

//        System.out.println("Welcome! How old are you?");
//        Scanner scanner = new Scanner(System.in);
//
//        String userAge = scanner.nextLine();

        // else if

        // range
//         0 - 18 -> forbidden
//         19 - 65 -> successfully
//         66 - ... -> too old
//        int parsedUserAge = Integer.parseInt(userAge);
//
//        if(parsedUserAge > 0 && parsedUserAge <= 18) {
//            System.out.println("Go out of the club");
//        } else if (parsedUserAge > 18 && parsedUserAge <= 65) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Are you still alive ?");
//        }
//
//        if(parsedUserAge > 28 && parsedUserAge <= 100) {
//            System.out.println("Take ur VIP-ticket!");
//        }

//        System.out.println("Welcome! What's ur name ?");
//        Scanner scanner = new Scanner(System.in);
//
//        String name = scanner.nextLine();

//        switch (name) {
//            case "Anastas":
//            case "Maria":
//                System.out.println("Let's go to the rest...");
//                break;
//            case "Angelina":
//                System.out.println("Let's go to the park...");
//                break;
//            case "Sasha":
//                System.out.println("Let's go to the river...");
//                break;
//            default:
//                System.out.println("WTH? Who are you?");
//        }

//        Program should ask user step-by-step: email, login and password
//        then when user data saved  we must ask user to repeat its to authorisation : login or email and password
//        if one of fields is incorrect we should sout an alert with message : invalid data, t...
//        if fields are correct we should sout -> welcome to the service

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Fill ur login");
//        String login = input.nextLine();
//
//        System.out.println("Fill ur email");
//        String email = input.nextLine();
//
//        System.out.println("Fill ur password");
//        String password = input.nextLine();
//
//
//        System.out.println("Enter ur email, or login: ");
//        String enteredUC = input.nextLine();
//
//        System.out.println("Enter ur password : ");
//        String enteredPass = input.nextLine();
//
//        if(password.equals(enteredPass)) {
//            switch (enteredUC) {
//                case login:
//                case password:
//                    System.out.println("Welcome to the program");
//                    break;
//                default:
//                    System.out.println("Something went wrong");
//            }
//            if(login.equals(enteredUC) || email.equals(enteredUC)) {
//                System.out.println("Welcome");
//            } else {
//                System.out.println("[INNER_BLOCK] Goodbye!");
//            }
//
//        } else {
//            System.out.println("[OUTER_BLOCK] Goodbye!");
//        }

//  Description: Process of registratiion and authorization
//  Goal: Working with condition, Scanner, leading to types

//        You should write a program where you will :
//        1. Ask User about registration :
//                if user want to be a part of ur program ->
//                    ask user about : name, age, email, password
//                    accodrding to the information u've gotten
//                    apply following validation rules:
//                      * if user name length < 2 : incorrect name goodbye -> x
//                      * if if user name length > 2 : glad to see ya here ->
//                                ask user email -> if email doesn't contain "@" or "." -> x (method contains)
//                              * if password contains > 8 symbols >
//                                                How old are you <= 18 -> you are junior
        //                                                How old are you > 19 and  How old are you < 40 -> you are middle
        //                                                How old are you > 40 and  How old are you < 60 -> you are senior
//                                          if name == John and junior and password == 2323 || email contains "ua"
//                otherwise - we should say : "It was nice to meet you!"

//        System.out.println("Hello, user\nDo you want to register an account on the platform?");
//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//
//        System.out.println("[INPUT] " + input);
//
//        if(input.equals("yes")) {
//            System.out.println("Here is a registration!");
//            String name = scanner.nextLine();
//
//            if(name.length() > 2) {
//                System.out.println("Glad to see ya, " + name);
//
//                String email = scanner.nextLine();
//                if(email.contains("@") && email.contains(".")) {
//                    String password = scanner.nextLine();
//
//                    if(password.length() > 8) {
//                        String age = scanner.nextLine();
//
//                        if(Integer.parseInt(age) <= 18) {
//                            System.out.println("Junior");
//                        }else if(Integer.parseInt(age) > 18 && Integer.parseInt(age) < 45) {
//                            System.out.println("ADult");
//                        }else if(Integer.parseInt(age) >= 45) {
//                            System.out.println("Adult!");
//                        }else {
//                            System.out.println("Invalid input");
//                        }
//                    }
//
//                }
//
//            }
//
//
//        } else {
//            System.out.println("Goodbye");
//        }

//        Service for quiz
//        1. User should be able to create an account and
//        1.2. After user's created an account we should ask it about confirmation of credentials
//        2. It should be able to get questions and give answers
//        3. After session of quiz ended, user has 3 more attempts

//        for(int i = 0; i < 3; i++) {
//            System.out.println("Welcome! Here is a quiz app. Next 3 attempts will be interesting for you!\n a) Start q) Finish ");
//
//            Scanner scanner = new Scanner(System.in);
//            String userAnswer = scanner.nextLine();
//            int scoreCounter = 0;
//
//            String lowerCasedAnswer = userAnswer.toLowerCase();
//            boolean isAvoid = lowerCasedAnswer.equals("q");
//
//            if(isAvoid) { System.out.println("Goodbye"); break; }
//
////        toLowerCase
//            switch (userAnswer.toLowerCase()) {
//                case "a":
//                    System.out.println("Java is ... \n a) OOP L b) Functional PL c) Procedure PL");
//                    String q1 = scanner.nextLine();
//                        switch (q1.toLowerCase()) {
//                            case "a":
//                                System.out.println("You are correct!");
//
//                                scoreCounter++;
//                                System.out.println("[SCORE]: " + scoreCounter);
//                                break;
//
//                            case "b":
//                                System.out.println("You are incorrect!");
//                                System.out.println("[SCORE]: " + scoreCounter);
//                                break;
//                            case "c":
//                                System.out.println("You are incorrect!");
//                                System.out.println("[SCORE]: " + scoreCounter);
//                                break;
//                            default:
//                        }
//
//                    System.out.println("Java is ... \n a) PL b) Language PL c) JavaScript");
//                    String q2 = scanner.nextLine();
//                    switch (q2.toLowerCase()) {
//                        case "a":
//                            System.out.println("You are correct!");
//
//                            scoreCounter++;
//                            System.out.println("[SCORE]: " + scoreCounter);
//                            break;
//
//                        case "b":
//                            System.out.println("You are incorrect!");
//                            System.out.println("[SCORE]: " + scoreCounter);
//                            break;
//                        case "c":
//                            System.out.println("You are incorrect!");
//                            System.out.println("[SCORE]: " + scoreCounter);
//                            break;
//                        default:
//                    }
//
//                    System.out.println("Java has ... \n a) JRE / JVM / JDK b) Children PL c) Money");
//                    String q3 = scanner.nextLine();
//                    switch (q3.toLowerCase()) {
//                        case "a":
//                            System.out.println("You are correct!");
//
//                            scoreCounter++;
//                            System.out.println("[SCORE]: " + scoreCounter);
//                            break;
//
//                        case "b":
//                            System.out.println("You are incorrect!");
//                            System.out.println("[SCORE]: " + scoreCounter);
//                            break;
//                        case "c":
//                            System.out.println("You are incorrect!");
//                            System.out.println("[SCORE]: " + scoreCounter);
//                            break;
//                        default:
//                    }
//                    break;
//                default:
//                    System.out.println("Something went wrong! Try again later!");
//                    System.out.println(i--);
//
//            }
//    }

//        Get word from user and then give to user word by letters
//        Input : "Hello world",
//        Output :
//        "H",
//        "e",
//        "l",
//        "l",
//        "o",
//        " ",
//        "w"
//        "o"
//        "r"
//        "l"
//        "d"


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the string: ");
//        String row = scanner.nextLine();
//
//        for(int i = 0; i < row.length(); i++) {
//            char letter = row.charAt(i);
//            System.out.println(letter);
//
//        }


//                     0123
//        String name = "John";

//        length = lastElementIndex + 1

        //                    4
//        for(int i = 0; i < name.length(); i++) {
//            System.out.println("[NAMES_LETTER] : " + name.charAt(i));
//        }
//    boolean isRunning = true;
//    Scanner scanner = new Scanner(System.in);
//    int i = 0;
//
//    while(isRunning) {
//        System.out.println("Ti chipidrist? \n YES / NO");
//        String answer = scanner.nextLine();
//
//        if(answer.equals("YES")) {
//            isRunning = false;
//        } else {
//            ++i;
//
//            System.out.println("You were wrong for " + i + " times");
//        }
//
//    }


//        Son of major
//        boolean isRunning = true;
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (isRunning) {
//            int scoreCounter = 0;
//            System.out.println("What is ur surname?");
//
//            String surname = scanner.nextLine();
//
//            if (!surname.equals("Poposhenko")) continue;
//
//            System.out.println("Welcome to the test! Good luck, have fun!");
//
//
//            boolean isIncorrectAnswer = true;
//
//            while(isIncorrectAnswer) {
//                System.out.println("Java is ... \n a) OOP L b) Functional PL c) Procedure PL");
//                String q1 = scanner.nextLine();
//                switch (q1.toLowerCase()) {
//                    case "a":
//                        System.out.println("You are correct!");
//
//                        scoreCounter++;
//                        System.out.println("[SCORE]: " + scoreCounter);
//                        isIncorrectAnswer = false;
//                        break;
//
//                    case "b":
//                        System.out.println("You are incorrect!");
//                        System.out.println("[SCORE]: " + scoreCounter);
//                        break;
//                    case "c":
//                        System.out.println("You are incorrect!");
//                        System.out.println("[SCORE]: " + scoreCounter);
//                        break;
//                    default:
//                        System.out.println("You are incorrect!");
//                        break;
//                }
//            }
//
//
//            isRunning = false;

            //
            //
            //

//        Registration of user
//        1. Ask email, if user email doesn't contain "@" or "." -> we should ask about it until it's correct
//        2. Ask password, if user password < 7 -> we should ask about it until it's correct

//        System.out.println("Welcome to our service!");
//        boolean isRunning = true;
//        Scanner scanner = new Scanner(System.in);
//
//        while(isRunning) {
//            System.out.println("Please enter ur email below: ");
//
//            String email =  scanner.nextLine();
//
//            if(email.contains("@") && email.contains(".")) {
//                int attmpts = 0;
//                boolean isInvalidPassword = true;
//
//                while(attmpts < 3 && isInvalidPassword) {
//                    System.out.println("Enter ur password");
//                    String password =  scanner.nextLine();
//
//                    if(password.length() > 5) isInvalidPassword = false;
//                    attmpts++;
//                }
//
//                if(!isInvalidPassword) {
//                    isRunning = false;
//                    System.out.println("Welcome to the service!");
//                }
//            }
//        }
//

//    double randomNumber = Math.random();
//        System.out.println(randomNumber);
//        CASINO
//        You should register amountOfAttempts variable
//        You should welcome user in Casinp
//        You should ask user about it's age.
//        if user.age < 18 the game is over ( but user able to write it's age infinitely )
//        Otherwise we ask user about the number
//        then we should run Math.random() ( and some additional logic to get number from 0 to 31 )
//        if number of user is equal to the number which accidentally appeared
//        User should get the message that it's win
//        otherwise we should amountOfAttempts++
//        if amountOfAttempts > 5 { then we should each attempt after tell it's that he plays via credits  }

        }
//        ArrayList
//    FS .tsv
//        "JVM - is a part of ... " + " ...." + " ...."
//    }
}
