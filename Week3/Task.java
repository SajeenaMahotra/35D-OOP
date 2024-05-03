package Week3;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    /*1. Write a JAVA program to find the maximum between three numbers. */
    System.out.println("Enter Number1: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter Number3: ");
    int num2 = scanner.nextInt();
    System.out.println("Enter Number3: ");
    int num3 = scanner.nextInt();

    if (num1> num2 && num1 > num3){
        System.out.println("The maximum number is " +num1);
    }else if ( num2>num1 && num2 > num3){
        System.out.println("The maximun number is " + num2);
    }else{
        System.out.println(num3+" is the maximum number");
    }
    scanner.close();

    /*2. Write a JAVA program to check whether a number is negative, positive, or zero. */

    System.out.println("Enter a number: ");
    int num = scanner.nextInt();

    if (num == 0){
        System.out.println("The number is Zero");
    }else if (num>0){
        System.out.println("the number is positive");
    }else{
        System.out.println("The number is Negative");
    }
    scanner.close();
    /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
    
    System.out.println("Enter a number:" );
    int num4 = scanner.nextInt();

    if ( num4 % 5 == 0 && num4 % 11 ==0){
        System.out.println(num4+ " is divisible by 5 and 11");
    }else{
        System.out.println(num4+" is not divisible by 5 and 11");
    }
    /*4. Write a JAVA program to check whether a number is even or odd. */
    System.out.println("Enter a number:" );
    int num5 = scanner.nextInt();

    if ( num5 % 2 == 0){
        System.out.println(num5+ " is even");
    }else{
        System.out.println(num5+" is odd");
    }

    /*5. Write a JAVA program to check whether a year is a leap year or not.
     * Hint: if year%4==0; if year%100!==0 ; year%400==0; 
     */

    System.out.println("Enter a number:" );
    int num6 = scanner.nextInt();

    if ( num6 % 4 == 0){
        System.out.println(num6+ " is a leap year");
    }else{
        System.out.println(num5+" is not a leap year");
    }

    /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */

    System.out.println("Enter an alphabet: ");
    char alpha = scanner.next().charAt(0);
    alpha = Character.toLowerCase(alpha);
    
    if (alpha =='a' || alpha =='e' || alpha =='i'|| alpha=='o' || alpha == 'u'){
        System.out.println( alpha+ "is vowel");
    }else{
        System.out.println(alpha+"is consonant");
    }

    //Some Switch case Statements Questions:

    /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
    System.out.println("Enter an alphabet: ");
    char grade = scanner.next().charAt(0);
    grade= Character.toUpperCase(grade);

    switch(grade){
        case 'A':
        System.out.println("GPA Value:4.0");
        break;
        case 'B':
        System.out.println("GPA Value:3.5");
        break;
        case 'C':
        System.out.println("GPA Value:2.5");
        break;
        case 'D':
        System.out.println("GPA Value:1.5");
        break;
        case 'F':
        System.out.println("GPA Value:0.0");
        break;
        default:
        System.out.println("Invalid Grade");
    }

    /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement. */
    System.out.println("Enter Number1: ");
    int num7 = scanner.nextInt();
    System.out.println("Enter Number2:" );
    int num8 = scanner.nextInt();
    System.out.println("Enter an operator: ");
    char operator= scanner.next().charAt(0);
    switch (operator) {
        case '+':
        System.out.println("Sum is "+num7+num8);
        break;
        case '-':
        System.out.println("Difference is " +(+num7-num8));
        break;
        case '*':
        System.out.println("Product is "+num7*num8);
        break;
        case '/':
            if ( num8 != 0){
        System.out.println("R is "+num7/num8);
        break;
            }else{
                System.out.println("Division by zero");
                break;
        }
        default:
        System.out.println("Invalid operator");
            break;
    }

    /*3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
    System.out.println("Enter a month in number: ");
    int month = scanner.nextInt();

    switch (month) {
        case 1:
        case 2:
        case 3:
            System.out.println("Winter");
            break;
        case 4:
        case 5:
        case 6:
            System.out.println("Spring");
            break;
        case 7:
        case 8:
        case 9:
            System.out.println("Summer");
            break;
        case 10:
        case 11:
        case 12:
            System.out.println("Fall");
            break;

        default:
        System.out.println("Invalid Month");
            break;
    }
    

    /*4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
    System.out.println("Choose a shape: ");
    System.out.println("1. Circle");
    System.out.println("2. Rectangle");
    System.out.println("3. Square");
    System.out.println("4. Triangle");

    int shape = scanner.nextInt();
    

    switch (shape) {
        case 1:
        System.out.println("Enter radius: ");
                float radius = scanner.nextFloat();
                float area = 3.14f * radius * radius;
                System.out.println("Area of circle is: " + area);
                break;
            case 2:
                System.out.println("Enter length: ");
                float length = scanner.nextFloat();
                System.out.println("Enter breadth: ");
                float breadth = scanner.nextFloat();
                float area1 = length * breadth;
                System.out.println("Area of rectangle: " + area1);
                break;
            case 3:
                System.out.println("Enter a side: ");
                float side = scanner.nextFloat();
                float area2 = side * side;
                System.out.println("Area of Square : " + area2);
                break;
            case 4:
                System.out.println("Enter height: ");
                float height = scanner.nextFloat();
                System.out.println("Enter base: ");
                float base = scanner.nextFloat();
                float area7 = 1f / 2f * base * height;
                System.out.println("Area of triangle : " + area7);
                break;
            default:
                System.out.println("Invald choice.");
                break;
        }
        scanner.close();
            
          



    


}
    
    



    

    
}
