// import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);

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

        // String adjective1;
        // String adjective2;
        // String adjective3;
        // String noun1;
        // String verb1;


        // System.out.println("Enter an adjective (description): ");
        // adjective1 = scanner.nextLine();
        // System.out.println("Enter a noun (person or animal): ");
        // noun1 = scanner.nextLine();
        // System.out.println("Enter an adjective (description): ");
        // adjective2 = scanner.nextLine();
        // System.out.println("Enter a verb ends with ing (action): ");
        // verb1 = scanner.nextLine();
        // System.out.println("Enter an adjective (description): ");
        // adjective3 = scanner.nextLine();


        // System.out.println("Today I went To a " + adjective1 + " " + "Zoo");
        // System.out.println("In an exhibition ,i saw a " + noun1 + ".");
        // System.out.println(noun1 + "was" + adjective2 + "and" +  verb1 + "!");
        // System.out.println("I was  " + adjective3 + "!");

 
        // scanner.close();

        // int x = 10;
        // int y = 20;
        // int z;

        // z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y;
        // z = x % y;

        // System.out.print(z);
        
        // Augmented Asxsignment operator
        
        // x = x + y;
        // x += y;
        // x *= y;
        // x -= y;
        // x /= y;

        // order of operation [p-e-m-d-a-s] - p stands for () , e stands for exponents , m - multiplication , d - divison  lastly addtion and subtraction

        // double result = 3 + 4 * (7 - 5) / 2.0;


        // System.out.print(result);


        // shopping cart program 

        // Scanner scanner = new Scanner(System.in);

        // String item;
        // double price;
        // int quantity;
        // char currency = '$';
        // double total ;

        // System.out.println("What item would You like to Buy?: ") ;
        // item = scanner.nextLine();
        // System.out.println("What is the Price for Each ? : ");
        // price = scanner.nextDouble();
        // System.out.println("How much would you like to buy?: ");
        // quantity = scanner.nextInt();

        // total = price * quantity;

        // System.out.println("Item :" +  item + "/s");
        // System.out.println("Item's price :" +  currency + price);
        // System.out.println("Quantity :" +  quantity);
        // System.out.println("Total bill : " + currency+ total);


        // scanner.close();

        // Scanner scanner  = new Scanner(System.in);
        // String name;
        // int age;
        // boolean Student;


        // System.out.println("What is your Name: ");
        // name = scanner.nextLine();
        // System.out.println("Enter your age : ");
        // age = scanner.nextInt();
        // System.out.println("What is your Status: ");
        // Student = scanner.nextBoolean();

        // if(name.isEmpty()){
        //     System.out.println("You didn't enter your name");
        // }else{
        //     System.out.println("Hello" + " " + name);
        // }
        // // group 2
        // if(age >= 18 & age < 65){
        //     System.out.println("You are adult");
        // }
        // else if(age < 0){
        //     System.out.println("You haven't Born yet");
        // }
        // else if(age >= 65){
        //     System.out.println("You are senior");
        // }
        // else{
        //     System.out.println("You are a Child");
        // }

        // //group 3

        // if(Student){
        //     System.out.println("You are a Student");
        // }
        // else{
        //     System.out.println("You are not a student");
        // }

        // scanner.close();

        Random random  = new Random();

        Boolean isHead;
        // double number2;
        // double number3;

        isHead = random.nextBoolean();

        // number2 = random.nextDouble(1,100);

        // number3 = random.nextDouble(1,100);
        System.out.println(isHead);
        // System.out.println(number2);
        // System.out.println(number3);

        if(isHead){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }


        





    }
}
