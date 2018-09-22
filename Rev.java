import java.io.*;
import java.util.*;
  public class Rev{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Some Integer Value:");
      int a=sc.nextInt();
      int b,c=0;
      while(a>0)
      {
      b=a%10;
      c=(c*10)+b;
      a=a/10;
      }
      System.out.println("Reversed Int:"+c);
      }
    }  
      
