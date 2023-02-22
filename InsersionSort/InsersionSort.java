import java.util.*;

public class InsersionSort{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element at " + i + " position :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array using Insersion sort are given below : ");

        // since we create static method we do not need to create object of InsersionSort class we can call it without object of InsersionSort class
        insersionSort(arr, n);

    }

    static void insersionSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int iome = i;                               // iome=indexOfMinElement
            for(int j=i+1; j<n; j++){
                if(arr[iome] > arr[j]){
                    iome=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[iome];
            arr[iome] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}