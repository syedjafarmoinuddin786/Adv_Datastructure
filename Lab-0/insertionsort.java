import java.util.Scanner;

class InsertionSort{
    // Method for performing insertion sort
    void sort(int[] a, int n) {
        int key, j;
        
        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            key = a[i];  // Store the current element (key)
            j = i - 1;   // Compare it with the elements before it
            
            // Shift elements of the sorted portion of the array to the right
            // to make space for the key
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];  // Shift element to the right
                j = j - 1;         // Move to the next element on the left
            }
            
            // Place the key in its correct position
            a[j + 1] = key;
        }
    }
}

public class Insertion_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] a = new int[n]; // Initialize the array
        
        System.out.println("Enter the array elements:");
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();            
        }
        
        // Create an instance of InsertionSort and sort the array
        InsertionSort sorter = new InsertionSort();
        sorter.sort(a, n);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
