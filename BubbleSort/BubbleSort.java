import java.util.*;

public class BubbleSort {
    public static void main(String args[]){
        BubbleSort b = new BubbleSort();
        System.out.println("How Many Element you want to enter in array");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element at " + i + " position :");
            arr[i] = s.nextInt();
        }

        System.out.println("Sorted array is given below ");

        b.sortArray(arr, n);

    }

    public void sortArray(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
            int temp;
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}