import java.util.Scanner;

public class MichaelKarimizadehBEDMAS
{
  public static void main (String[] args)
  {
    //Q5
    /*
    double Num1 = 12.98;
    double Num2 = 64.34;
    double Num3 = 14.23;
    System.out.println("The average of "+Num1+", "+Num2+", and "+Num3+" is "+(Num1+Num2+Num3)/3);
    */
    
    //Q6
    /*
    double Time;
    double Height;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a time that is less than 4.5 seconds.");
    Time = sc.nextDouble();
    Height = 100-4.9*(Math.pow(Time,2));
    System.out.println("The height of the object at that time is "+Height);
    */
    
    //Q7
    /*
    int Diameter;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the diameter of the pizza in inches.");
    Diameter = sc.nextInt();
    double Cost = 0.05*Diameter*Diameter+0.75+1.00;
    System.out.println("The cost of making this pizza is $"+Cost);
    */

    //Q8
    /*
    int Byear;
    int Bmonth;
    int Bday;
    int Tyear;
    int Tmonth;
    int Tday;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your birthdate:");
    System.out.print("Year: ");
    Byear = sc.nextInt();
    System.out.print("Month: ");
    Bmonth = sc.nextInt();
    System.out.print("Day: ");
    Bday = sc.nextInt();
    System.out.println("Enter today's date:");
    System.out.print("Year: ");
    Tyear = sc.nextInt();
    System.out.print("Month: ");
    Tmonth = sc.nextInt();
    System.out.print("Day: ");
    Tday = sc.nextInt();
    int Alive = (Tyear-Byear)*365+(Tmonth-Bmonth)*30+(Tday-Bday);
    int Sleep = Alive*8;
    System.out.println("You have been alive for "+Alive+" days.");
    System.out.println("You have slept "+Sleep+" hours.");
    */

    //Q9
    /*
    int Burger;
    int Fries;
    int Soda;
    double Tender;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number of burgers ordered.");
    Burger = sc.nextInt();
    System.out.println("Please enter the number of fries ordered.");
    Fries = sc.nextInt();
    System.out.println("Please enter the number of sodas ordered.");
    Soda = sc.nextInt();
    double Subtotal = Burger+Fries+Soda;
    double Total = Subtotal*0.08+Subtotal*0.05+Subtotal;
    System.out.println("The total order price is $"+Total+".");
    System.out.println("Please enter the amount tendered.");
    Tender = sc.nextDouble();
    double Change = Tender-Total;
    System.out.println("The change is $"+Change+".");
    */

    //Q10
    /*
    int Num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a three digit number.");
    Num = sc.nextInt();
    int Hund = Num/100;
    int Remainder = Num%100;
    int Tens = Remainder/10;
    int Ones = Remainder%10;
    int Sum = Hund+Tens+Ones;
    System.out.println("The sum of digits is "+Sum);
    */
  }
}