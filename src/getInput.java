// Coded by Jacob Aaron Espinoza @ jacob.espinoza@malad.us
// For CTE Software Development 2
// Instructor: Mr. Gross
// This program allows the user to add items to the linked list.

// import scanner class
import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {

        boolean debug = false;
        // Creating Scanner class object
        Scanner scn = new Scanner(System.in);
        if (debug) {
            System.out.println("Debugging mode is on");
            System.out.println("New scanner created");
        }
        linkedList list = new linkedList();
        if (debug) {
            System.out.println("New linked list created");
        }
        boolean flag = true;
        System.out.println("Printing linked list... adding items...");
        while (flag == true) {
            // Enter first input
            String candy1; // Declaring a string variable to store candy1
            System.out.println("Enter your favorite candy: Enter 'exit' to quit"); // Prompting the user to enter their favorite candy
            candy1 = scn.nextLine(); // Reading the candy entered by the user
            if (debug) {
                System.out.println("New candy has been inputted");
            }
            if (candy1.equals("exit")) { // Checking if the user entered "exit"
                flag = false; // Setting flag to false in order to exit the loop
            } else {
                list.add(candy1); // Adding the candy to the linked list
                if (debug) {
                    System.out.println("New candy added to list");
                }
            }
        }
        System.out.println("Printing the list from head to tail");
        list.setCurrToHead();
        while (list.getCurr() != null) {
            System.out.println(list.getCurr());
            list.setCurr(list.getCurr().getNext());
        }
        System.out.println("Printing the list from tail to head");
        list.setCurrToTail();
        while (list.getCurr() != null) {
            System.out.println(list.getCurr());
            list.setCurr(list.getCurr().getPrev());
        }
        // Closing the scanner to release resources
        linkedList stack = new linkedList();
        System.out.println("Adding items to the stack...");
        flag = true;
        while (flag == true) {
            // Enter first input
            String candy1; // Declaring a string variable to store candy1
            System.out.println("Enter your favorite candy: Enter 'exit' to quit"); // Prompting the user to enter their favorite candy
            candy1 = scn.nextLine(); // Reading the candy entered by the user
            if (candy1.equals("exit")) { // Checking if the user entered "exit"
                flag = false; // Setting flag to false in order to exit the loop
            } else {
                stack.push(candy1); // Adding the candy to the linked list
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            if (!stack.isEmpty()) {
                stack.setCurr(stack.getCurr().getPrev());
            }
        }
            flag = true;
            System.out.println("Adding items to the queue...");
            while (flag == true) {
                // Enter first input
                String candy1; // Declaring a string variable to store candy1
                System.out.println("Enter your favorite candy: Enter 'exit' to quit"); // Prompting the user to enter their favorite candy
                candy1 = scn.nextLine(); // Reading the candy entered by the user
                if (candy1.equals("exit")) { // Checking if the user entered "exit"
                    flag = false; // Setting flag to false in order to exit the loop
                } else {
                    stack.enQueue(candy1); // Adding the candy to the linked list
                }
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.deQueue());
                if (!stack.isEmpty()) {
                    stack.setCurr(stack.getCurr().getPrev());
                }
                scn.close();
            }
        }
    }