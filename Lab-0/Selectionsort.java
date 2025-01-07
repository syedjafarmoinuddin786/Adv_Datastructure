import java.util.*;
public class Selectionsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int i;
        int[] a = new int[n];
        System.out.println("Enter the elements in the Array:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        selection_sort(n,a);
        System.out.println("Array after selection sort:");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void selection_sort(int n,int a[]){
        int i,j;
        int min = 0;
        for(i=0;i<n-1;i++){
            min = i;
            for(j=i+1;j<n;j++){
                if(a[min] > a[j]){
                    min = j;
                }
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }    
}
