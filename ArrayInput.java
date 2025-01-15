package cybernxt;

 
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Declare the array with the specified size
        int[] arr = new int[n];

        // Ask the user to enter the array elements
        System.out.println("Enter " + n + " elements:");

        // Loop to take the array input from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Display the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    
    }
}



