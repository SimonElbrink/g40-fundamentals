package se.lexicon;

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
        objects();
    }

    public static int nextId(){
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

    public static void strings(){

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














}
