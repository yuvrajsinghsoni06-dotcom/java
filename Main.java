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

        // double Length = 0;
        // double width = 0;

        // System.out.println("Enter Length:" );
        // Length = scanner.nextDouble();
        // System.out.println("Enter width:" );
        // width = scanner.nextDouble();

        // double area = Length * width;
        // System.out.println("The area of the rectangle is: " + area);

        // scanner.close();

        // MAd LAb Game

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;


        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (person or animal): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb ends with ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();


        System.out.println("Today I went To a " + adjective1 + " " + "Zoo");
        System.out.println("In an exhibition ,i saw a " + noun1 + ".");
        System.out.println(noun1 + "was" + adjective2 + "and" +  verb1 + "!");
        System.out.println("I was  " + adjective3 + "!");

 
        scanner.close();



    }
}
