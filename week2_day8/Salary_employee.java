import java.util.Scanner;

public class Salary_employee{
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
      int basic_salary;
    System.out.println("enter the employee of salary :");
    basic_salary=sc.nextInt();
    int hra,da,gross_salary;
    if(basic_salary<=10000){
      hra=((basic_salary *20)/100);
        da=((basic_salary *80)/100);
    gross_salary=(hra+da);
    System.out.println("gross_salary : "+gross_salary);}
    else if (basic_salary<=20000){
      hra=((basic_salary *25)/100);
        da=((basic_salary *90)/100);
    gross_salary=(hra+da);
    System.out.println("gross_salary : "+ gross_salary);}
      else if (basic_salary>20000) {
      hra=((basic_salary *30)/100);
        da=((basic_salary *95)/100);
    gross_salary=(hra+da);
    System.out.println("gross_salary : "+ gross_salary);
      }
    }
    }
