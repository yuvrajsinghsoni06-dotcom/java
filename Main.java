import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your Name: " );
        // System.out.println("Enter your Age: " );
        // System.out.println("Enter your GPA: " );
        // System.out.println("IS A Student : " );
        // String name = scanner.next();
        // int age = scanner.nextInt();
        // double gpa = scanner.nextDouble();
        // boolean isStudent = scanner.nextBoolean();

        // System.out.println("Hello, " + name + "!");
        // System.out.println("You are " + age + " years old.");
        // System.out.println("Your GPA is " + gpa + ".");
        // if(isStudent){
        //     System.out.println("You are Student.");
        // }else{
        //     System.out.println("You are not Student.");
        // }
        // scanner.close();

        double Length = 0;
        double width = 0;

        System.out.println("Enter Length:" );
        Length = scanner.nextDouble();
        System.out.println("Enter width:" );
        width = scanner.nextDouble();

        double area = Length * width;
        System.out.println("The area of the rectangle is: " + area);




    }
}