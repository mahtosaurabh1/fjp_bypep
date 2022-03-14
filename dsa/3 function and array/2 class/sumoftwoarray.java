import java.io.*;
import java.util.*;

public class sumoftwoarray{

public static void main(String[] args) throws Exception {
    // write your code here
     Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int arr1[]=new int[n1];
    for(int i=0;i<n1;i++)
    {
        arr1[i]=sc.nextInt();
    }
   
    int n2=sc.nextInt();
    int arr2[]=new int[n2];
    for(int i=0;i<n2;i++)
    {
        arr2[i]=sc.nextInt();
    }
   int ans[]= arraysum(arr1,arr2);
   for(int val:ans){
       System.out.println(val);
   }

 }
 public static int[] arraysum(int []arr1,int arr2[]){
     int n1=arr1.length;
     int n2=arr2.length;
      int n3=Math.max(n1,n2);
    int res[]=new int[n3];
    int p1=n1-1;
    int p2=n2-1;
    int p3=n3-1;
    int c=0;
    while(p1>=0||p2>=0){
        int v1=p1>=0?arr1[p1]:0;
        int v2=p2>=0?arr2[p2]:0;
        int sum=v1+v2+c;

        int digit=sum%10;
        c=sum/10;
        res[p3]=digit;
        p1--;p2--;p3--;
    }
    if(c!=0){
          int newsum[]=new int[n3+1];
          newsum[0]=c;
          for(int i=1;i<newsum.length;i++){
              newsum[i]=res[i-1];
          }
          return newsum;
    }
    return res;
 }

}