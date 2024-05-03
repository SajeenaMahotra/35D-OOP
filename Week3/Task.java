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


}
    
    



    

    
}
