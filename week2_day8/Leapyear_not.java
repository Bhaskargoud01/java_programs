import java.util.Scanner;

public class Leapyear_not{
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
      int year;
     System.out.println("enter the days of the year :");
    year=sc.nextInt();
    if(year%4!=0)
    System.out.println("its not an leap year:");
      else if((year%4==0) && (year%100==0))
        System.out.println("is a leap year:");
 else if((year%4==0)&&(year%100==0) && (year%400==0) )      
   System.out.println("is a leap year:");
    else if((year%4==0) && (year%100==0) && (year%400!=0))  
        System.out.println("its not an leap year:");
  }
      
  }