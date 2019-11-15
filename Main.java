import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nPlease select which exercise you want to run, make a selection based on the numbers below.\n\n");

        System.out.println(" 1 = Hello Function. \n");
        System.out.println(" 2 = Even Or Odd. \n ");
        System.out.println(" 3 = Draw A Square. \n");
        System.out.println(" 4 = Draw A RightHanded Triangle. \n");
        System.out.println(" 5 = Draw An Isosceles Triangle. \n");
        System.out.println(" 6 = Longest String. \n");
        System.out.println(" 7 = Combine Two Lists. \n");
        System.out.println(" 8 = Frame Some Text. \n\n\n\n");

        int choice = 0;

        while (true) {
            System.out.print("\n\nPlease select any number between 1 and 8 : ");
            int choice1 = scanner.nextInt();
            if(choice1 == 1 || choice1 == 2 || choice1 == 3 || choice1 == 4 || choice1  == 5 || choice1 == 6 || choice1 == 7 || choice1 == 8) {
                choice = choice1;
                break;
            }

            System.out.println("\n\nInvalid selection, please make a selection between 1 and 8.\n\n");
        }
        switch (choice) {
            case 1:
                helloFunction();
                break;
            case 2:
                evenOrOdd();
                break;
            case 3:
                drawASquare();
                break;
            case 4:
                drawRightHandedTriangle();
                break;
            case 5:
                drawIsoscelesTriangle();
                break;
            case 6:
                longestString();
                break;
            case 7:
                combineTwoLists();
                break;
            case 8:
                frameSomeText();
                break;
            default:
                System.out.println("Invalid selection. Goodbye...");
        }

    }

    private static void helloFunction() {
        HelloFunction helloFunction = new HelloFunction();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        System.out.println(helloFunction.hello(scanner.nextLine()));
    }

    private static void evenOrOdd() {
        CheckIfEven checkIfEven = new CheckIfEven();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        System.out.println(checkIfEven.evenOrOdd(scanner.nextInt()));
    }
    private static void drawASquare() {
        DrawASquare drawASquare = new DrawASquare();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer of the length of the sides of the SQUARE: ");
        drawASquare.square(scanner.nextInt());
    }
    private static void drawRightHandedTriangle() {
        RightHandedTriangle rightHandedTriangle = new RightHandedTriangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer of the Height of the TRIANGE: ");
        rightHandedTriangle.triangle(scanner.nextInt());
    }
    private static void drawIsoscelesTriangle() {
        DrawIsoscelesTriangle drawIsoscelesTriangle = new DrawIsoscelesTriangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer of the Height of the TRIANGE: ");
        drawIsoscelesTriangle.isoscelesTriangle(scanner.nextInt());
    }
    private static void longestString() {
        LongestString longestString = new LongestString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the entries of an array and use a comma to separate them. NO SPACES!!!\n");
        System.out.print(": ");
        longestString.longest(scanner.nextLine().split(","));
    }
    private static void combineTwoLists() {
        CombineTwoLists combineTwoLists = new CombineTwoLists();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the entries of an array and use a comma to separate them. NO SPACES!!!\n");
        System.out.print("List 1 entries: ");
        String[] list1 = scanner.nextLine().split(",");

        System.out.println("");

        System.out.print("List 2 entries: ");
        String[] list2 = scanner.nextLine().split(",");

        combineTwoLists.combineTwoStrings(list1,list2);
    }
    private static void frameSomeText() {
        FrameSomeText frameSomeText = new FrameSomeText();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the entries of an array and use a comma to separate them. NO SPACES\n");
        System.out.print(": ");
        frameSomeText.frame(scanner.nextLine().split(","));
    }
}
