import java.util.*;

class Bsorting {
    void sort(int a[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {  // Outer loop for n-1 iterations
            for (int j = 0; j < n - 1 - i; j++) {  // Inner loop for n-i-1 iterations
                if (a[j] > a[j + 1]) {  // Compare adjacent elements
                    // Swap elements if they are in the wrong order
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();
        int[] a = new int[n]; 
        System.out.println("Enter the Array Elements:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();            
        }
        
        // Create an instance of the Bsorting class and sort the array
        Bsorting bs = new Bsorting();
        bs.sort(a, n);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
