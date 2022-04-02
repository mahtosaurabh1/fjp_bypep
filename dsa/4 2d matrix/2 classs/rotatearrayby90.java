import java.io.*;
import java.util.*;

public class Main {
     public static void transpose(int arr[][],int n){
         for(int i=0;i<n;i++){
             for(int j=0;j<i;j++){
                 int temp=arr[i][j];
                 arr[i][j]=arr[j][i];
                 arr[j][i]=temp;
             }
         }
     }
     public static void rotate(int arr[][],int n){
         for(int row=0;row<n;row++){
             int i=0;
             int j=n-1;
             while(i<j){
                 int temp=arr[row][i];
                 arr[row][i]=arr[row][j];
                 arr[row][j]=temp;
                 i++;
                 j--;
             }
         }
     }
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr,n);
        rotate(arr,n);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}public class rotatearrayby90 {
    
}
