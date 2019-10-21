import java.util.Scanner;

public class MyFirstJava {
    public static void main(String args[]){
        System.out.println("Welcome to my world!");
        System.out.println("My name is Amanpreet Singh.");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is " + userResponse);

        int firstNo, secondNo;
        System.out.println("Enter the first number.");
        firstNo = keyboard.nextInt();

        System.out.println("Enter the second number.");
        secondNo = keyboard.nextInt();

        int sum = firstNo + secondNo;

        System.out.println("The sum of " + firstNo + " and " + secondNo + " is " +sum);
    }

}
