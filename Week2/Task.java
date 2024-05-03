package Week2;
import java.util.Scanner;


public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
    
    System.out.print("Enter your age: ");
    int age =scanner.nextInt();
    if (age >=18){
        System.out.println("You can cast a vote");
    }else{
        System.out.println("You cannot cast a vote");
    }
        
        scanner.close();

    /*2.Write a program to calculate SI.
    Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */

    System.out.println("Enter principle: ");
    Double principle = scanner.nextDouble();
    
    System.out.println("Enter Time: ");
    Double time = scanner.nextDouble();

    System.out.println("Enter Rate: ");
    double Rate = scanner.nextDouble();

    System.out.println("Simple Interest = " + ((principle*time*Rate/100)));

    scanner.close();

    /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
    Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */

    //Triangle
    System.out.println("Enter Height of triangle : ");
    float height = scanner.nextFloat();

    System.out.println("Enter the base: ");
    float base = scanner.nextFloat();

    System.out.println("Area of tringle= "+((height*base))/2);

    //Cube
    System.out.println("Enter side: ");
    int side = scanner.nextInt();

    System.out.println("Volume of cube = "+ (side*side*side));
    scanner.close();

    //Cuboid
    System.out.println("Enter Lenght of the cuboid: ");
    int length1 = scanner.nextInt();
    
    System.out.println("Enter Width of the cuboid: ");
    int width = scanner.nextInt();

    System.out.println("Enter height of the cuboid: ");
    int height1 = scanner.nextInt();

    System.out.println("Volume of the cuboid is : " +(length1*width*height1));
    scanner.close();

    /*4. Write the ternary operator for question no. 1 */

    System.out.println("Enter age: ");
    int age1 = scanner.nextInt();
    String message =( age1>=18 ) ?"You can cast a vote": "You cannot cast a vote";
    System.out.println(message);
    scanner.close();

    /*5. Write a program to take two integer inputs from the user and print the sum and product of them. */

    System.out.println("Enter num1: ");
    int num1=scanner.nextInt();
    System.out.println("Enter num2: ");
    int num2 = scanner.nextInt();
    System.out.println("Sum is : " +(num1+num2));
    System.out.println("Product is " + (num1* num2));
    scanner.close();

     /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result. */

    System.out.println("Enter num3: ");
    int num3 = scanner.nextInt();
    System.out.println("Enter num4: ");
    int num4 = scanner.nextInt();
    int sum = num3 + num4;
    int product = num3*num4;
    System.out.println("The sum is = " +sum);
    System.out.println("The product is = "+product);
    System.out.println("When divided sum by the prodcut.The asnwer is = " + (sum/product));
    System.out.println("When divided product by the sum.The asnwer is = " + (product/sum));
    scanner.close();

    /*7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
    
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your rollnumber: ");
    int rollnumber = scanner.nextInt();

    System.out.println("Enter your field of interest: ");
    String interest = scanner.nextLine();

    System.out.println("Hey, my name is " +name +"and my roll number is " + rollnumber + ".My field of interest are " +interest);
    scanner.close();

    /*8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
    System.out.println("Enter a side of square: ");
    int side1 = scanner.nextInt();
    System.out.println("Area is :" +(side1*side1));
    System.out.println("Perimeter is: " +(2*side1));
    scanner.close();

    //Triangle
    System.out.println("Enter Height of triangle : ");
    float height7 = scanner.nextFloat();

    System.out.println("Enter the base: ");
    float base7 = scanner.nextFloat();

    System.out.println("Area of tringle= "+((height7*base7))/2);

    //Cube
    System.out.println("Enter side: ");
    int side4 = scanner.nextInt();

    System.out.println("Volume of cube = "+ (side4*side4*side4));
    scanner.close();

    //Cuboid
    System.out.println("Enter Lenght of the cuboid: ");
    int length8 = scanner.nextInt();
    
    System.out.println("Enter Width of the cuboid: ");
    int width8 = scanner.nextInt();

    System.out.println("Enter height of the cuboid: ");
    int height8 = scanner.nextInt();

    System.out.println("Volume of the cuboid is : " +(length8*width8*height8));
    scanner.close();

    /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
    System.out.println("Enter a lenght of rectangle: ");
    double length9 = scanner.nextDouble();
    System.out.println("Enter bredth of rectangle: ");
    Double breadth9 = scanner.nextDouble();
    double Area =length9*breadth9;
    int AreaINT = (int) Area;
    System.out.println("Area is :" +AreaINT);
    scanner.close();

    /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
    a. If equal to or more than 70 -> First Class
    b. If more than 59 -> Upper Second Class
    c. If more than 49 -> Second class
    d. If more than 39 -> Third class and if below than 40 the result is fail. 
    Hint: Use ternary operator */

    System.out.println("Enter marks of 1st subject: ");
    int mark1 = scanner.nextInt();
    System.out.println("Enter marks of 2nd subject: ");
    int mark2 = scanner.nextInt();
    System.out.println("Enter marks of 3rd subject: ");
    int mark3 = scanner.nextInt();
    System.out.println("Enter marks of 4th subject: ");
    int mark4 = scanner.nextInt();

    float percentage = (float )((mark1+mark2+mark3+mark4)/400)*100;
    
    String result = ( percentage >= 70)?"First class":
                    (percentage > 59 )?"Upper class":
                    (percentage > 49 ) ?"Second class":
                    (percentage > 39)?"Third class":"Fail";

    System.out.println("The result is : " +result);
    scanner.close();

    
    }


}
    

