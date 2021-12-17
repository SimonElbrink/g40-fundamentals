package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static int number = 0;

    public static void main( String[] args )
    {
//        primitives();
//        assignmentOperator();
//        guessANumber();
//        whatIsYourRole();

//        strings();
//        objects();




        while (true){

            int score = UserInputUtil.getIntFromUser("What Score did you have: ");
            String message = scoreEvaluation(score);
            System.out.println(message);

            String continueRunning = UserInputUtil.getStringFromUser("Do you want to continue?  (Y / N)");

            if (continueRunning.equalsIgnoreCase("N")){
                break;
            }

        }



    }

    static int nextId(){
        return ++number;
    }



    public static void primitives(){
        byte b = 127;
        short s = 14000;
        int i = 64;
        long l = 42342342423434234L;
        float f = 10.0F;
        double d = 10.0;
        char c = '5';
        boolean yes = true;
    }

    public static void assignmentOperator(){
        int number = 100;
        int number2 = 10;
        int number3 = 5;

        int result = number3 = number2 = number;

        System.out.println(result);
    }


    public static void guessANumber(){
        int numberToGuess = 55;
        int myGuess = 55;

        if (myGuess > numberToGuess){
            System.out.println("Number is to High! try a lower number!");
        } else if (myGuess < numberToGuess){
            System.out.println("Number is to Low! try a higher number!");
        } else{
            System.out.println("You have guess it! number was " + numberToGuess);
        }
    }


    public static void whatIsYourRole(){

        // Guest, Employee, Manger, CEO
        String role = "Manager";

        switch(role){
            case "Guest":
                System.out.println("Hello and Welcome to the office let me show you around!");
                break;
            case "Employee":
                System.out.println("Welcome back! Here are today's tasks.");
                break;
            case "Manager":
                System.out.println("Hello, Here is the report from yesterday!");
                break;
            case "CEO":
                System.out.println("Hello, Here is the report of the company's health ");
                break;
            default:
                System.out.println("Hmm.. not sure what role you have. Welcome anyway!");

        }

    }

    private static void strings(){

        String name = "Simon";
//        name = name.concat(" Elbrink");
        name = name + " Elbrink";
        System.out.println(name);

        String firstName = "Simon";
        String lastName = "Elbrink";
        int age = 24;
        String hobby = "Programming";

        String sentence = "Hello my name is " + firstName + " " + lastName + " and I'm " + age + " and interesting in " + hobby;

        System.out.println(sentence + "!");

    }

    public static void objects(){

        Car volvo = new Car();

        volvo.brand = "Volvo";
        volvo.ownerName = "Susanne";
        volvo.color = "red";
        volvo.doors = 4;
        volvo.weightInTons = 1.5;

        System.out.println("Car{ " + volvo.brand + ", " + volvo.color + ", " + volvo.weightInTons + ", "+ volvo.ownerName + ", " + volvo.doors + "}");

        System.out.println(volvo.getInformation());

        Car bmw = new Car();

        bmw.brand ="bmw";
        bmw.color = "Black";
        bmw.weightInTons = 1.0;

        System.out.println(bmw.getInformation());
    }

    /**
     * Make an integer called score and assign a value to it.
     * Create an if-statement that should print out ”Hurray, You passed!”
     * if the score is above or equals to 65.
     * If the score is Equal or between 55 and 64 it should print ”You are
     * almost there.”.
     * If score is below 55 it should print ”Sorry, You did not pass.”.
     */
    public static String scoreEvaluation(int score){
        String message;

        if (score >= 65){
            message = "Hurray, You passed!";
        } else if (score >= 55){
            message = "You are almost there.";
        }else {
            message = "You did not pass. :( ";
        }

        return message;
    }















}
