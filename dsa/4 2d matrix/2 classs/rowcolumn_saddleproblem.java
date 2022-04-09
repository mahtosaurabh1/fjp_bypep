import java.io.*;
import java.util.*;

public class Main {
    public static boolean check(int arr[][],int ci,int elem){
        for(int r=0;r<arr.length;r++){
            int val=arr[r][ci];
            if(val>elem){
                return false;
            }
        }
        return true;
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
        for(int r=0;r<n;r++){
            int elem=arr[r][0];
            int ci=0;
            for(int c=0;c<n;c++){
                if(arr[r][c]<elem){
                    elem=arr[r][c];
                    ci=c;
                }
            }
            boolean ans=check(arr,ci,elem);
            if(ans==true){
                System.out.println(elem);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}