import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    System.out.println(firstindex(arr,n,k));
    System.out.println(lastindex(arr,n,k));
 }
 public static int firstindex(int arr[],int n,int k){
     int low=0;
     int high=n-1;
     int ans=-1;
     while(low<=high){
         int mid=(low+high)/2;
         if(arr[mid]>k){
             high=mid-1;
         }else if(arr[mid]<k){
             low=mid+1;
         }else{
             ans=mid;
             high=mid-1;
         }
     }
     return ans;
 }
 public static int lastindex(int arr[],int n,int k){
     int low=0;
     int high=n-1;
     int ans=-1;
     while(low<=high){
         int mid=(low+high)/2;
         if(arr[mid]>k){
             high=mid-1;
         }else if(arr[mid]<k){
             low=mid+1;
         }else{
             ans=mid;
             low=mid+1;
         }
     }
     return ans;
 }

}