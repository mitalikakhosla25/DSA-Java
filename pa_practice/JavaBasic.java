/*
Q1. Write a Java program to input two numbers and print:
Sum
Difference
Product
Quotient
Remainder
*/

import java.util.Scanner;
class JavaBasic{

    public static void checkNum(int x){
if(x==0){
    System.out.println("number is zero");
}
else if{
    (x > 0){
        if(x%2==0){
        System.out.println("NUMBER IS EVEN AND POSITIVE");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
    }
}
else{
    System.out.println("NUMBER IS ODD");

}

  

    }
 
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x,y;
    x=sc.nextInt();
    y=sc.nextInt();
    System.out.println("SUM OF "+x +"AND"+ y +" IS :"+x+y);
    System.out.println("DIFFERENCE OF "+x +"AND"+ y +" IS :"+ (x-y));
    System.out.println("PRODUCT OF "+x +"AND"+ y +" IS :"+ (x*y));
    System.out.println("QUOTIENT OF "+x +"AND"+ y +" IS :"+(x/y));
    System.out.println("REMAINDER  OF "+x +"AND"+ y +" IS :"+(x%y));



/*Q2. Write a program to swap two numbers:
Without using a third variable.
Using arithmetic operators only.
 */

/*Q3. Write a program to check whether a number is:
Even or Odd
Positive, Negative, or Zero
 */
int a;
a=sc.nextInt();
//System.out.print(checkNum(a));

}

}