import java.util.Scanner;

public class Percentage_students {
public static void main (String[] args){
  Scanner sc=new Scanner(System.in);
  float physics,chemistry,maths,english,hindhi,totalmarks;
  System.out.println("enter the marks of the 5 subjects");
  System.out.println("enter the marks of the physics");
  physics=sc.nextFloat();
  System.out.println("enter the marks of the chemistry");
  chemistry=sc.nextFloat();
   System.out.println("enter the marks of the maths");
  maths=sc.nextFloat();
   System.out.println("enter the marks of the english");
  english=sc.nextFloat();
   System.out.println("enter the marks of the hindhi");
  hindhi=sc.nextFloat();
  totalmarks=(physics+chemistry+maths+english+hindhi/5*100 );
double percentage=(double)totalmarks/5;
  String grade;
  if(percentage>=90)
grade="A"  ;
  else if(percentage>=80)
     grade="B";
  else if(percentage>=70)
        grade="C";
else if(percentage>=60)
   grade="D";
  else if(percentage>=40)
 grade="E";
  else 
      grade="FAIL";
   System.out.println("total marks :"+ totalmarks);
   System.out.println("percentage :"+ percentage);
   System.out.println("grade :"+ grade);
  
  
}
}
  
  
  
  