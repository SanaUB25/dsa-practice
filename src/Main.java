//pure basics
/*public class Main {
    public static void main (String [] args ){
        System.out.println("my name is sana ");
         System.out.println("i love pizza");
        //this is my first code
        double sana = 26.255;
        System.out.println("the age of the girl mention above is "+ sana);
        char letter = 'S';
        System.out.println("the first letter of the name ab0ove is " +letter);
        boolean isPresident = false ;
        System.out.println(isPresident);
        String name = "sana ub";
        System.out.println(name);
    }
}

//BASICS - Scanner

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your percentage:");
        double percentage= scanner.nextDouble();
        System.out.println(percentage );
        scanner.nextLine();
        System.out.println("what is your name ");
        String name = scanner.nextLine();
        System.out.println(name );
        System.out.println("are u a student =");

        boolean isStudent = scanner.nextBoolean();
        if (isStudent){
            System.out.println("you are eligible for the scholorship");}
        else{
            System.out.println("you are not eligible");}
        scanner.close();
            }
        }
*/
//AREA OF THE RECTANGLE
/*import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double length;
        double breadth;
        double area;

        System.out.println("enter the length of the rectangle:");
         length = scanner.nextDouble();
        System.out.println("enter the breadth of the rectangle:");
        breadth = scanner.nextDouble();
        area = length * breadth;
        System.out.println("the area of the rectangle is "+area+"cm²");
        scanner.close();
    }

}*/
//MAD LIBS
/*import java.util.Scanner;
public class Main{
    public static void main (String[] args ){
        Scanner scanner = new Scanner (System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.println("enter the adjective1");
        adjective1 = scanner.nextLine();
        System.out.println("enter the adjective2");
        adjective2 = scanner.nextLine();
        System.out.println("enter the adjective3");
        adjective3 = scanner.nextLine();
        System.out.println("enter the noun1");
        noun1 = scanner.nextLine();
        System.out.println("enter the verb1");
        verb1 = scanner.nextLine();

        System.out.println("today i went to an "+adjective1+" zoo.\n In an exhibit i saw a "+noun1 +
                "\n the"+noun1+" was "+ adjective2+"and was "+verb1+" \nI was very "+adjective3);


    }

}*/
//ARITHEMATIC OPERATIONS
/*import java.util.Scanner;
public class Main{
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int x = 3;
        int y = 4;

        x +=1;
        //x*=y;
        //x =x+y;
        //x+=1
        System.out.println(x);
    }}
*/
//[P-E-M-D-A-S] RULE
/*import java.util.Scanner;
public class Main{
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        double result = 3 + 4 * ( 7 - 5 ) / 2.0 ;
        System.out.println(result);
        scanner.close();
    }}
*/


//AMOUNT CALCULATOR FOR THE DISH
/*
import java.util.Scanner;
public class Main {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        String dish;
        double prize;
        int count;
        System.out.println("What item would you like to buy?:");
        dish = scanner.nextLine();
        System.out.println("what is the price for each:");
        prize = scanner.nextDouble();
        System.out.println("how many would you like to have:");
        count = scanner.nextInt();
        double cost = prize *count ;
        System.out.println("you have bought "+count+"\n"+ dish+ "/s");
        System.out.println("your total is $" +cost);


       scanner.close();

    }

}*/
//IF ELSE AND ELSE IF STATEMENTS
/*import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int age ;
        System.out.println("enter your age");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter your name :");
        String name = scanner.nextLine();
        if (name.isEmpty()){
            System.out.println("ahhggg u didnt enter you name ");
        }
        if (age<18){
            System.out.println("you are not sligible to vote");
        }
        else if (age == 15){
            System.out.println("you are a teen");
        }
else {
            System.out.println("you are eligible to vote");
        }
    }

}*/
//RANDOM INTEGER
/*import java.util.Random;
public class Main {
    public static void main (String[] args ){
        Random random = new Random();
        int number = random.nextInt(1,10);
        System.out.println(number);


    }
}

*/
//random boolean value
/*import java.util.Random;
public class Main {
    public static void main (String[] args ){
        Random random = new Random();
        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads == true){
            System.out.println("yess!! its heads");
        }
        else {
            System.out.println("its tails");
        }}}*/
//HYPOTENEUSE
/*
public class Main {
    public static void main (String [] args ){
        int a = 3;
        int b = 4;
        double c ;
        c = Math.sqrt (Math.pow(a,2)+ Math.pow(b,2));
        System.out.println(c);


    }
}*/
//find the circumference,area,volume;
/*import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int radius;
        double circumference;
        double area;
        double volume;

        System.out.println("enter the radius ");
        radius = scanner.nextInt();
        circumference = - 2* Math.PI * radius *1000;
        area= Math.PI * Math.pow (radius,2);
        volume = (4.0/3.0)*Math.PI * Math.pow(radius,2);

        System.out.printf( "%f\n",circumference );
        System.out.printf("%f\n",area);
        System.out.printf("%f\n", volume);

    }
}
*/
//CHECKKKKKKKK
//BANKER PROGRAMM
/*import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        double amount;
        System.out.println ("Enter the principal amount:");
        int P = scanner.nextInt();
        System.out.println("enter the interest rate in % :");
        int rate = scanner.nextInt()/100;
        System.out.println("enter the number of times compounded in a year:");
        double timesCompounded = scanner.nextInt();
        System.out.println("enter the number of years: ");
        int years = scanner.nextInt();

         amount = P * Math.pow ( 1 + rate / timesCompounded, timesCompounded * years );
        System.out.printf("the amount after %d years is %.2f", years , amount);
      scanner.close();


    }

}*/
//STUDENT/SENIOR DISCOUNT
/*
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        double price = 9.99;

        boolean isStudent = true;
        boolean isSenior = true ;
        if(isStudent){

            if (isSenior){
                System.out.println("you get a senior discount of 20%");
                System.out.println("you get a student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("you get a student discount of 10%");
                price *=0.9;

            }
        }


            else{
                if (isSenior ) {
                System.out.println("you get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price*=1;
            }}
        System.out.println("the price is " +price);
        }
        }
*/
//REPLACE O WITH A
/*
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        String name = "";
        name = name.replace ("o","a");
        System.out.println(name.isEmpty());

    }
}

*/
//SUBSTRING
/*
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        String email;
        String username;
        String domain;
        System.out.println("ENTER YOUR EMAIL:");
        email= scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("emails should contain @ in them");
        }


    }}
*/

//WEIGHT CONVERSION PROGRAM USING JAVA
/*import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int choice;
        double lbs;
        double weight;
        double kgs;
        System.out.println("Option 1 = convert lbs to kgs");
        System.out.println("Option 2 = convert lbs to kgs");
        choice = scanner.nextInt();
        if (choice==1){
            System.out.println("enter the weight in lbs:");
            lbs = scanner.nextDouble();
            weight = lbs * 0.4535;
            System.out.printf("the weight in kgs is %.2f",weight);

        }
        else if  (choice ==2){
            System.out.println("enter the weight in kgs:");
            kgs = scanner.nextDouble();
            weight = kgs * 2.20462;
            System.out.printf ("the weight in lbs is %.2f ",weight);


        }
        else {
            System.out.println(" please enter a valid number ");
        }
    }}
*/
//TERNARY OPERATOR;
/*
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        int score = 25;
        String PassOrrFail = (score >=55)? "pass":"fail";
        System.out.println(PassOrrFail);

    }
}*/
//program to convert TEMP TO CELSIUS OR FAHRENHEIT
/*
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        double temp;
        String choice;
         Double newTemp;
        System.out.println("enter the temperture");
        temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("convert to celsius or fahrenheit?");
        choice = scanner.next().toUpperCase();
        newTemp = (choice.equals("C"))? (temp-32)*5/9 : (temp*5/9)+32;
        System.out.println(newTemp);}}*/


//MINI CALCULATOR
/*
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        String operator;
        Double result = 0.0;
        boolean validOperation;
        System.out.println("+,-,*,/,^");
        System.out.println("enter the operator:");
        operator = scanner.next();

        System.out.println("enter the number 1 :");
        double num1 = scanner.nextDouble();
        System.out.println("enter the number 2 :");
        double num2 = scanner.nextDouble();
        switch(operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("cannot be divided by zero");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case "^" -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }
        if (validOperation == true ){
            System.out.println(result);
        }
    }}
*/

// PROGRAM WHERE WE LEARNT ABOUT
//&&=AND
//||=OR
//!=NOT
/*
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        String username;

        System.out.println("enter you username");
        username = scanner.nextLine();
        //no space or underscore
    //should be between 4-12 characters
    if (username.contains(" ")||
            username.contains("_") ){
        System.out.println("username should not contain spaces or underscores");

    }
    else if (username.length()<=4 || username.length()>=12){
        System.out.println("username should contain characters from 4-12");}

    else
    {
        System.out.println("welcome\t " + username);
    }
    }}
*/
//WHILE LOOP
/*
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        String name = "";
        while (name.isEmpty()){
        System.out.print("enter you name ");
        name = scanner.nextLine();
        }
        System.out.println("helloww!!! "+name);}}
*/
//INFINITE LOOP
/*
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){


        Scanner scanner = new Scanner (System.in);
        while (1==1){
            System.out.println("helppp i am stuck in this looppppp");
        }}}*/
//q to quit the game
//WHILE LOOP
/*import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        String response = "";
        while (!response.equals("Q")){
            System.out.println("you are playing thge game ");
            System.out.println("press Q to quit the game ");
            response = scanner.next().toUpperCase();

        }
        System.out.println("you have quit the game ");}}
*/
//DO WHILE LOOP
//HERE THE LOOP RUNS ONCE BEFORE THE CONDITION IS CHECK
//BUT IN WHILE LOOP IT ENTERS THE CONDITION ONLY IF THE CONDITION FALLS TRUE
/*import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        int age = -5;
        do {
            System.out.println("age cant be negative");
            System.out.println("enter your age :");
        age = scanner.nextInt();
        }while (age<0);
        System.out.println("you are of " +age + "years old");
    }}
*/
//number from 1-10
/*

 /*
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        int number = 20;
        do{
            System.out.println(" the number should be between 1-10");
            System.out.println("enter a number ");
        number = scanner.nextInt();
        }while (number < 0 || number >10);
    }}
*/
//RANDOM NUMBER GUESSING GAME
/*
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        Random random = new Random() ;
        int min = 1;
        int max = 100;
        int randomNumber= random.nextInt(min,max+1);
        boolean correct = true;

        while(correct) {
            System.out.println("guess the number :");
            int number = scanner.nextInt();
            if (number > randomNumber){
                System.out.println("too high!!");}
            else if (number<randomNumber){
                System.out.println("too low !!!");
            }
            else {
                System.out.println("omg you got it right!! lessgoo");
                System.out.println(randomNumber);
                correct = false;
            }
        }


        }

        }
*/
//break- it stops the loop after the condition applied is correct
//continue - its skips that particular iteration of the loop
/*import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main (String [] args ) throws InterruptedException {
        Scanner scanner = new Scanner (System.in);
        int i;

        for (i =0 ;i<10;i++){

            if (i == 5){
            continue;}
            System.out.println(i);}

    }}*/
//NESTED LOOP
/*import java .util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<3;i++){
            System.out.println(" ");
        for (int j = 0 ;j<10;j++){
            System.out.print(j);
        }}
    }


}*/
//EXERCISE TO UNDERSTAND NESTED LOOPS A LITTLE BETTER
/*
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = scanner.nextInt();
        System.out.println("enter the number of columns");
        int columns = scanner.nextInt();
        System.out.println("enter the symbol to use");
        String symbol = scanner.next();
        for (int i = 0 ; i < rows ;i++){
            System.out.println();
            for(int j = 0 ; j< columns;j++){
                System.out.print(symbol);
            }
        }
        scanner.close();
    }
}
*/
//METHODS

/*public class Main {
    public static void main (String [] args ){

       String name = "SANA U B";
        int age = 25;
        happyBirthday(name,age);
        happyBirthday(name,age);


    }


    static void happyBirthday(String name,int years ){
        System.out.println("happy birthday to youuu ");
        System.out.println("happy birthday to uuu");
        System.out.printf("happy birthday to u dear %s\n",name);
        System.out.printf("yeahhhh you are %d years old\n\n ",years);
    }


}
//get your full name ;

 */
/*
public class Main {
    public static void main (String [] args ){
        int number = 25;
String fullname = getFullName ("Sana","UB");
        System.out.println(fullname);



    }
    static String getFullName (String firstname,String secondname){
        return firstname + " " + secondname;

    }
    static String getFullName (String firstname,String secondname , String lastname){
        return firstname + " " + secondname + " "+ lastname;
    }


}*/
//BANKING PROGRAM
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();


    int balance = 12000;

        switch(choice) {
            case 1 -> ShowBalance(balance);
            case 2 -> Deposit(balance);
            case 3 -> Withdraw(balance);
            case 4 -> isRunning = false;
        }}}

        static double ShowBalance (int balance) {
            System.out.println("the balance in your account is " + balance);
            return 0;
        }

        static double Deposit ( int balance){
        System.out.println("enter the amount to be deposited:");
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        int amount = deposit + balance;
        System.out.println("the amount in your account after deposit is " + amount);
        return 0;
    }


        static double Withdraw ( int balance){
        System.out.println("enter the amount that needs to be withdrawn from you account :");
       Scanner scanner = new Scanner (System.in);
        int withdraw = scanner.nextInt();
        int remaining = balance - withdraw;
        System.out.println("The balance in your account is " +remaining);
        return 0;
    }


    }
    */

//THE OG DICE GAME
/*
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;
        System.out.println("enter the number of times you wanna roll the die :");
        int num = scanner.nextInt();
        if (num>0){
           for (int i =0;i<num;i++){
               int roll = random.nextInt(1,7);
               printDie (roll);
               System.out.println("you rolled "+ roll);
               total +=roll;
           }
            System.out.println("Total:" +total);
        }
        else {
            System.out.println("no of dice cannot be lesser that 0");
        }

        scanner. close();



        }
        static void printDie(int roll){
        String dice1 = """
                 _________
                |         |
                |         |
                |    ●    |
                |         |
                |_________|
                               
                """;
            String dice2 = """
                   
                                 _________
                                |         |
                                |    ●    |
                                |         |
                                |    ●    |
                                |_________|
                
                                """;

            String dice3 = """
                   
                                 _________
                                |         |
                                |    ●    |
                                |    ●    |
                                |    ●    |
                                |_________|
                
                                """;
            String dice4 = """
                   
                                 _________
                                |         |
                                |  ●   ●  |
                                |         |
                                |  ●   ●  |
                                |_________|
                
                                """;
            String dice5 = """
                   
                                 _________
                                |         |
                                |  ●   ●  |
                                |    ●    |
                                |  ●   ●  |
                                |_________|
                
                                """;
            String dice6 = """
                   
                                 _________
                                |         |
                                |  ●   ●  |
                                |  ●   ● |
                                |  ●   ●  |
                                |_________|
                
                                """;
            switch (roll){
                case 1 -> System.out.println(dice1);
                case 2 -> System.out.println(dice2);
                case 3 -> System.out.println(dice3);
                case 4 -> System.out.println(dice4);
                case 5 -> System.out.println(dice5);
                case 6 -> System.out.println(dice6);
                default -> System.out.println("Invalid Roll");
        }


        }


    }*/
//ARRAYS - FRUITS
/*
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "banana", "grapes", "coconut"};
        //int numberOfFruits = fruits.length;
        //System.out.println(fruits[1]);
        //for (int i = 0;i < numberOfFruits;i++){
            //System.out.println(fruits[i]);
        //Arrays.sort(fruits);
        Arrays.fill(fruits,"pineapple");
        for (String fruit:fruits){
            System.out.println(fruit);
        }

    }}*/


//PROGRAM TO TAKE FOOD ORDERS
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String [] foods = new String[size];
    String[] foods ;
    int size;
        System.out.println("enter the number of food u want to order:");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
      for (int i = 0; i < foods.length;i++){
          System.out.print("enter the food name :");
          foods[i]= scanner.nextLine();
      }
        for (String food : foods){
            System.out.println(food);
        }}}*/

//TO FIND THE INDEX
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"pizza","hamburger","momos"};
        boolean isNotFound = true;
        String target;
        System.out.println("enter the element that u need to find");
        target = scanner.nextLine();

        for (int i =0;i<fruits.length;i++){
            if (fruits[i].equals(target)){
                System.out.println("element found at the index "+i);
            isNotFound= false;

            break;
        }}
            if (isNotFound){
                System.out.println("element not found in the array");
            }}}
*/
//FIND AVERAGE
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(average(1, 2, 3, 44, 5, 56, 6, 6, 7, 8, 899, 77));
    }
    static double average (double... numbers){

        double sum = 0;
        for (double number :numbers)

     sum += number;
        return sum/numbers.length;

    }
}*/
//GROCERY SHOPPING
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String [] vegetables = {"carrot","capsicum","beetroot"};
String [] fruits = {"apple","banana","watermelon"};
String[] protein = {"Chicken","egg","paneer"};
String [][]  groceries= {vegetables, fruits,protein};
groceries[0][0]= "pineapple";

for (String[] foods : groceries){
    for (String food : foods){
        System.out.print(food+" ");
    }
    System.out.println();

    }
}}
*/

//TELEPHONE
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] telephone = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
        for (char[] row : telephone){
            for (char  number :row){
                System.out.print(number+ " ");
            }
            System.out.println();

            }
        }}

*/
//JAVA QUIZ GAME
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("*****************************");

        String[] questions = {"What is the main function of the router?",
                "who is known as the father of the computers",
                "what was the first programming language?"};

        String[][] options = {{"1.Storing files", "2.directing internet traffic", "3.collecting data", "4.Encrypting data"},
                {"1.you", "2.charles", "3.sana Ub", "4.Srusti ub"},
                {"1.C", "2.java", "3.python", "4.fortran"}};


        int[] answers = {2, 2, 4};
        int score = 0;
        int guess;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("enter you guess:");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("correct");
                score++;

            } else {
                System.out.println("wrong");
            }
        }
        System.out.println("your final score is " + score + " out of " + questions.length);
    }}
    */
//JAVA QUIZ GAME ;
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"who is the president of india:",
                "which city is the capital of india",
                "which is the national flower of india"};

        String[][] options = {{"1.modi","2.mahatma gandhi","3.draupadi murmu","4.Ramnath kovindh"},
        {"1.bengaluru","2.delhi", "3.chennai","4.Maharashtra"},
        {"1.rose","2.lotus","3.sunflower","4. jasmine"}};

        int answers[] = {3,2,2};
        int guess;
        int count = 0;

        for (int i = 0; i < questions.length;i++){
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);

            }
            System.out.println("enter your guess:");
            guess = scanner .nextInt();

            if (guess == answers[i]) {
                System.out.println("correct answer ");
                count ++;

            }
            else {
                System.out.println("wrong answer");
            }

            }
        System.out.println("you've got"+count + " out of "+questions.length);
            }

        }
*/

//ROCK PAPER SCISSORS GAME
/*
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random ();
        String playAgain = "yes";
        System.out.println("ROCK PAPER SCISSORS GAME");
        String userChoice;
        String computerChoice = "";
        String choice[] = {"rock","paper","scissors"};

        do {
            System.out.println("enter you choice (rock,paper,scissors)");
            userChoice = scanner.nextLine().toLowerCase();




            if (!userChoice.equals("rock")&&!userChoice.equals("paper")&&!userChoice.equals("scissors")) {
                System.out.println("INVALID INPUT");
                continue;
            }
            computerChoice = choice[random.nextInt(3)];
            System.out.println("computer's choice is " + computerChoice);


            if (userChoice.equals(computerChoice)) {
                System.out.println("its tie");
            }
            else if (computerChoice.equals("paper") && (userChoice.equals("scissors"))) {
                System.out.println("you win");
            } else if (computerChoice.equals("scissors") && (userChoice.equals("rock"))) {
                System.out.println("you win");

            } else if (computerChoice.equals("rock") && (userChoice.equals("paper"))) {
                System.out.println("you win");
            } else if (computerChoice.equals("rock") && (userChoice.equals("scissors"))) {
                System.out.println("you lose");
            } else if (computerChoice.equals("scissors") && (userChoice.equals("paper"))) {
                System.out.println("you lose");
            } else {
                System.out.println("you lose");}

        System.out.println("do you want to continue playing (yes/no)");
                playAgain = scanner.nextLine().toLowerCase();


            }
            while (playAgain.equals("yes"));
        System.out.println("thanks for playing !");
scanner.close();
        }}
*/


import java.util.*;


//get payout
//ask to play again
//display exit message
//JAVA SLOTS
/*
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int playout;
        String[] row = {"🍟", " 🍔", " 🌭", " 🍕", " 🍾"};
        String[] playAgain;

        System.out.println("  *********************  ");
        System.out.println("  WELCOME TO JAVA SLOTS  ");
        System.out.println(" Symbols: 🍟 🍔 🌭 🍕 🍾");
        System.out.println("  *********************  ");

        while (balance > 0) {

            System.out.println("Current balance:" + balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if (bet<=0){
                System.out.println("bet must be greater than 0");
                continue;
            }
            else {
                balance-=bet;
            }
            System.out.println("Spinning.....");
            row = spinRow();
             printRow(row);
           int payout = getPayout(row,bet);
           balance+=payout;
           if (payout >0) {
               System.out.println("yaYAyh!! YOU WON $" + payout);
           }
           else {
               System.out.println(" U LOST THIS ROUND");
           }
            System.out.println("do you wanna continue to play ?? (Y/N)");
           String continuePlay = scanner.next().toUpperCase();
           if (continuePlay.equals("Y")){
               continue;
           }
           else {
               break;
           }


        }
        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍟", " 🍔 ", "🌭", "🍕", " 🍾"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];

        }

        return row;


    }

    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ",row));

    }
    static int getPayout(String[]row, int bet) {
        if (row[0].equals(row[1]) && (row[1].equals(row[2]))) {
            return switch (row[0]) {
                case "🍟" -> bet * 3;
                case "🍔" -> bet * 4;
                case "🌭" -> bet * 5;
                case "🍕" -> bet * 6;
                case "🍾" -> bet * 20;
                default -> 0;
            };

        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍟" -> bet * 1;
                case "🍔" -> bet * 2;
                case "🌭" -> bet * 3;
                case "🍕" -> bet * 4;
                case "🍾" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {

            return switch (row[1]) {
                case "🍟" -> bet * 1;
                case "🍔" -> bet * 2;
                case "🌭" -> bet * 3;
                case "🍕" -> bet * 4;
                case "🍾" -> bet * 10;
                default -> 0;
            };
        }
return 0;
    }}

 */
// OBJECTS - CAR
/*
public class Main {
    public static void main (String [] args ){
       Car car1 = new Car();
       Car car2 = new Car ();

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);
        System.out.println(car1.isRunning);
        car1.start ();
        System.out.println(car1.isRunning);

        car1.drive();

        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.price);
        System.out.println(car2.isRunning);
        System.out.println(car2.isRunning);
        car2.start ();
        System.out.println(car2.isRunning);

        car2.drive();



    }
}*/
//Student biodata using constructor
/*


public class Main {
    public static void main (String[] args){
        Student student1 = new Student ("Sana",18,9.7);
        Student student2 = new Student ("Srusti",21,9.8);
        Student student3 = new Student ("Mali",45,9.9);
        Student student4 = new Student ("Belli",54,10);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);


        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);


        System.out.println(student4.name);
        System.out.println(student4.age);
        System.out.println(student4.gpa);
        System.out.println(student4.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
        student4.study();

    }

}*/
//STUDENT USER SUING OVERLOADED METHODS
/*
public class Main {
    public static void main (String[] args){
        User user1 = new User("Sana UB");
        User user2 = new User("Srusti","srustiub@gmail.com");
        User user3 = new User("Shinchan","shinchan@gmail.com,18",5);
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);



    }}
*/
/*
public class Main {
    public static void main(String[] args) {

        car1 car11 = new car1("bmw", "b lack");
        car1 car12 = new car1("porche", "GREEN");
        car1 car13 = new car1("harle", "black");

        car1[] cars  ={car11,car12,car13};

        for (car1 car : cars){

        car.drive();
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend ("srusti");
        Friend friend2 = new Friend ("malini");
        Friend friend3 = new Friend ("belli");
        System.out.println(friend1.numOfFriend);
        System.out.println(friend2.numOfFriend);
        System.out.println(friend1.numOfFriend);
        Math.round(4.99);
    }}
    */
/*
public class Main {
    public static void main(String[] args) {
        dog dog = new dog ();
        cat cat = new cat();

        dog.eat();
        cat.eat();

        System.out.println(" cat lives for  "+ cat.lives);
        System.out.println(" dog lives for  "+ dog.lives);
        dog.speak();
        cat.speak();

    }}
*/
/*public class Main {
    public static void main(String[] args) {
rabbit rabbit = new rabbit();
fish fish = new fish ();
lion lion = new lion ();

rabbit.flee();
fish.hunt();
fish.flee();
lion.hunt();


    }
}*/
/*
public class Main {
    public static void main(String[] args) {
cars cars = new cars ();
bikes bike = new bikes();
boat boat = new boat();


Vehi[] vehicle = {cars,bike,boat};

for (Vehi vehicles : vehicle){
    vehicles.go();
}

    }
    }
*/
/*
import java . util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        doggy dog = new doggy ();
        catty cat = new catty();
        ANI animal ;

        System.out.println("enter you choice (1 for dog / 2 for cat)");
        int choice = scanner.nextInt();

        if(choice==1){
           animal = new doggy();
            animal.speak();
        }
        else if (choice ==2){
            animal = new catty ();
            animal.speak();
        }
    }
}*/
/*
public class Main {
    public static void main (String[] args){


mycar car = new mycar ("swift","white",100000 );
        car.setColor("blue") ;
        car.setname ("corvette");
        car.setprice(5000);
        System.out.println(car.getname() +" - " + car.getcolor()+ " that costed " + car.getprice());
    }}*/

/*
public class Main {
    public static void main (String[] args){

        Book book1 = new Book("The 11 rules of life",254);
        Book book2 = new Book("2 states of marriage",231);
        Book book3 = new Book("the consitution",314);


        Book[] books = {book1,book2,book3};

Library library = new Library ("NYC public library",1897,books);
        library.displayInfo();
        }

    }*/
/*
public class Main {
    public static void main (String[] args){
        impCar car = new impCar("corvette",2025,"V8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
       car.start();
    }

    }*/
/*
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> foods = new ArrayList<> ();
        System.out.println("enter the number of foods :");
        int no = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1;i<=no;i++){
            System.out.println("enter the name of the food" +i+ ":");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();
    }}*/
/*
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        ArrayList <String> foods =    new ArrayList<>();
        System.out.println("enter the number of foods you wanna order");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numOfFood ;i++) {
            System.out.println("enetr the name of food " + i + ":");
            String food = scanner.nextLine();
            foods.add(food);
        }
            System.out.println(foods);
            scanner.close();
        }}*/
/*
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner (System.in);
        try{
            System.out.println("enter any number from 1 to 10");
        int num = scanner.nextInt();
        System.out.println(num);}
        catch (InputMismatchException e){
            System.out.println("that wasnt a number");
        }
        catch (ArithmeticException e){
            System.out.println("you cant divide by zero");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        finally {
            scanner.close();
            System.out.println("this is always executes");
        }
    }
}*/
/*
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static  void main (String [] args ) {

        String location ="C:\\Users\\ubsan\\OneDrive\\Desktop\\test.txt";
       try(FileWriter writer = new FileWriter(location)){
         String writeValue = """
                 heyyy! wassupp 
                 i like pizza 
                 and buy me pizzas please mannnn """;

           writer.write (writeValue);
        System.out.println("succesfully created");}
       catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }

       catch (IOException e){
           System.out.println("unable to create a file ");
       }
    }
}*/
/*
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main (){
        String path = "C:\\Users\\ubsan\\OneDrive\\Desktop\\test.txt";
        try (BufferedReader reader = new BufferedReader (new FileReader (path))){
            String line ;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("could'nt create the file");
        }
        catch (IOException e){
            System.out.println("error");
        }



    }
}*/
/*
import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws UnsupportedAudioFileException, IOException {
        String filePath = "src\\s_o_paulo_the_weeknd.wav";
        File file = new File (filePath);

        try(Scanner scanner = new Scanner (System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
         Clip clip =AudioSystem.getClip();
         clip.open(audioStream);
         clip.start();
         String response = "";
         while (!response.equals("Q")){

             System.out.println("P=Play");
             System.out.println("S=Stop");
             System.out.println("R=Reset");
             System.out.println("Q=quit");
             System.out.println("enter your choice :");
             response = scanner.nextLine().toUpperCase();

            switch(response){
                case "P"-> clip.start();
                case "S"-> clip.stop();
                case "R"-> clip.setMicrosecondPosition(0);
                case "Q"-> clip.stop();
                default -> System.out.println("Invalid choice");
            }
         }
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("unsupported");}
        catch (LineUnavailableException e) {
            System.out.println("error");
        }

    }
}
 */
/*
import java.util.ArrayList;
import java.util .Scanner ;
public class Main {
    public static void main (String[] args){
        String word = "pizza";
        Scanner scanner = new Scanner (System.in);
        ArrayList<Character> wordState = new ArrayList<> () ;
        int wrongGuesses = 0;

        for (int i = 0; i < word.length();i ++){
        wordState.add('_');}
        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");
        while (wrongGuesses<6) {
            System.out.print(hangman(wrongGuesses));
            System.out.print("Word- ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println("");

            System.out.println("enter the letter");
            char guess = scanner.next().toLowerCase().charAt(0);


            if (word.indexOf(guess) >= 0) {
                System.out.println("correct guess");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);

                    }
                }

                    if (!wordState.contains("_")) {
                        System.out.println(hangman(wrongGuesses));
                        System.out.println("YOU WIN");
                        System.out.println("the word was " + word);
                        break;
                    }
                }

            else{
                    wrongGuesses++;
                    System.out.println("wrong guess");
                }
            }
            if (wrongGuesses >= 6) {
                System.out.println(hangman(wrongGuesses));
                System.out.println("GAME OVER");
                System.out.println("the word was " + word);
            }

        scanner.close();


    }


    static String hangman (int wrongGuesses){
        return switch(wrongGuesses){

            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                       o
                    
                    
                    """;
            case 2 -> """
                       o
                      /
                    
                    """;
            case 3 -> """
                       o
                      /|
                    
                    """;
            case 4 -> """
                       o
                      /|\\
                    
                    """;
            case 5 -> """
                       o
                      /|\\
                      /
                    """;

            case 6 -> """
                       o
                      /|\\
                      / \\
                    """;
            default -> "";


        };
    }
}
*/
//THE HANGMAN GAME
/*

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\ubsan\\IdeaProjects\\my new project\\src\\wordss.txt";
        ArrayList<String> wordss= new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordss.add(line.trim());

            }

        }
    catch(FileNotFoundException e){
        System.out.println("the file is not found");

    }
        catch(IOException e) {
            System.out.println("error! please do check the file ");

        }
    Random random = new Random();
        String word = wordss.get(random.nextInt(wordss.size()));




        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");

        while (wrongGuesses < 6) {
            System.out.print(hangman(wrongGuesses));
            System.out.print("Word- ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println("");

            System.out.println("enter the letter");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("correct guess");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(hangman(wrongGuesses));
                    System.out.println("YOU WIN");
                    System.out.println("the word was " + word);
                    break;
                }

            } else {
                wrongGuesses++;
                System.out.println("wrong guess");
            }
        }

        if (wrongGuesses >= 6) {
            System.out.println(hangman(wrongGuesses));
            System.out.println("GAME OVER");
            System.out.println("the word was " + word);
        }

        scanner.close();
    }

    static String hangman(int wrongGuesses) {
        return switch (wrongGuesses) {

            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                       o
                    
                    
                    """;
            case 2 -> """
                       o
                      /
                    
                    """;
            case 3 -> """
                       o
                      /|
                    
                    """;
            case 4 -> """
                       o
                      /|\\
                    
                    """;
            case 5 -> """
                       o
                      /|\\
                      /
                    """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                    """;
            default -> "";
        };
    }
}
*/
/*
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main (String[] args){
        LocalDate Date = LocalDate.now();
        LocalTime Time = LocalTime.now();
        LocalDateTime DateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = DateTime.format(formatter);
        System.out.println(newDateTime);
        System.out.println(Date);
        System.out.println(Time);
        LocalDateTime Datetime = LocalDateTime.now();
        System.out.println(Datetime);

        Instant instant = Instant.now();
        System.out.println(instant);



    }
public class Main {
    public static void main (String[] args){
        MyDog dog1 = new MyDog();
        MyDog dog2 = new MyDog(){
        @Override
            void speak (){
            System.out.println("The Scooby Doo says *Ruh Roh *");
        }
    };
        dog1.speak();
        dog2.speak();




    }}
*/
/*
public class Main {
    public static void main (String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
       int count = 3;
            @Override
            public void run() {
                System.out.println("hello!!");
                count--;
                if(count<=0){
                    System.out.println("TASK COMPLETED!");
                    timer.cancel();
                }
            }

        };
        timer.schedule(task, 3000,1000);

    }}*/
/*import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the count:");

        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
int count = response;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count<=0){
                    System.out.println("HAPPY NEW YEAR !!");
                    timer.cancel();

                }
            }

        };
        timer.scheduleAtFixedRate(task,0,1000);

    }

}*/
/*
public class Main{
    public static void main (String[] args){
        bOXX<String>box = new bOXX<>();
        box.setItem("Bro I HATE YOU");
        System.out.println(box.getItem());
    }}
*/

/*
public class Main{
    public static void main (String[] args){
        Product <String,Double > product1 = new Product <> ("apple",0.50);
        Product <String,Double > product2 = new Product <> ("pineapple",2.50);
        System.out.println(product2.getItem());}}

 */
/*
import java.util.HashMap;
public class Main {
    public static void main (String[] args){
        HashMap<String,Double> map = new HashMap<>();

        map.put("apple",20.00);
        map.put("pineapple",30.30);
        map.put("cherry",50.21);


        map.put("cherry",25.21);
        map.remove("cherry");
        System.out.println(map.containsValue(20.00));
        System.out.println(map.containsKey("pineapple"));

        System.out.println(map.size());

        for (String key : map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
        if(map.containsKey("pineapple")){
            System.out.println("pineapple is present in the map ");
        }
      else{
            System.out.println("pineapple is'nt a key in the map");
        }

    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static void main (){
        Scanner scanner= new Scanner (System.in );
            System.out.println("enter the weekname:");
            String response = scanner.nextLine().toUpperCase();
           try {
               Day day = Day.valueOf(response);

               switch (day) {
                   case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Agg! it is a weekday");

                   case SATURDAY, SUNDAY -> System.out.println("it is a weekend!!! lets enjoyyyyyyy");

                   default -> System.out.println("Enter the right dayyy againnn");
               }
           }
           catch (IllegalArgumentException e){
               System.out.println("error found !!");
           }


        };

    }*/
/*
public class Main {
    public static void main (String[] args){
Scanner scanner = new Scanner (System.in);
System.out.println("Enter your name within 5 seconds");

MyRunnable myRunnable = new MyRunnable ();
Thread thread = new Thread(myRunnable);
thread.start();


String response = scanner.nextLine();
        System.out.println( "Hello!!" +response );


        }

    }
*/
/*
public class Main {
    public static void main (){
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));


        System.out.println("Game start!!!");
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Error seen!!");
        }
        System.out.println("Game over!");
    }
}
*/
/*
import java.time.format.DateTimeParseException;
import java. util.Scanner;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "s_o_paulo_the_weeknd.wav";


        while(alarmTime==null){
            try{
                System.out.println("enter an alarm time (HH:MM:SS)");
                String inputTime = scanner.nextLine();



                alarmTime  = LocalTime.parse (inputTime,formatter);
                System.out.println("Alarm set for "+ alarmTime);
            }
            catch (DateTimeParseException e){
                System.out.println("invalid format");

            }
        }
        AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start ();

}
    }

*/
/*
Scanner scanner = new Scanner ();
class MyFirstCode {
    public static void main (String args[] ){
        System.out.println("enter the word");
        String word =
        System.out.println(args[0]+args[1]+"Hello sana ");
    }
}
*/
/*
import java.util.Scanner;


class sana{
    public static void main  (String args[])  {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Hellow coder!!");
        System.out.println("enter your name :");
        String name = scanner.nextLine();
        System.out.println("enter your age:");
        String  ageInput = scanner.next();
        int age = Integer.parseInt(ageInput);



        scanner.nextLine ();
        System.out.println("enter your address :");
        String address= scanner.nextLine();
        System.out.println("Hello " +name+ " Madam and youre age is " +age+ "and you live in " + address);




    }
/*

}

 */
/*public class Main{
    public static void main (String[] args){
        int oop = 10;

        int x = --oop;
        int y = ++oop;
        int z = oop--;
        int a = oop++;
       // System.out.println(x + " " +y + " " +z + " " +a);
        int op = 15;
        int ans = --op + ++op - op-- +op++;
      //
        //  System.out.println(ans);

    boolean res = (2>5)?(true):(false);
        System.out.println(res);
    }

}

*/
/*
 class myMain{

     int a = 5 ;
     static int b = 9  ;
      static int res = b +10;
public static  void main (String[] args ){
    System.out.println(myMain.res);



   // myMain m = new myMain ();
   // System.out.println(m.a+m.b);
}

}*/
/*

class Temp{
    int myVar1= 0;
}
class myFunc{
    public static void main (String[] args){
        myFunc mf = new myFunc();
        Temp obj1 = new Temp ();
        Temp obj2 = new Temp();

        obj1.myVar1 = 10;
        obj2.myVar1 = 20;
        System.out.println( obj1.myVar1 +","+ obj2.myVar1);

        mf.swap(obj1.myVar1,obj2.myVar1);
        System.out.println(mf.calculateArea(2,4));


    }
    public int calculateArea(int length, int breadth ){
        int res = length * breadth;
        return res;

    }
    public void swap (int a , int b ){
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("Swapped a :" +a);
        System.out.println ("Swapped b :" +b);
    }


}*/

/*
public class swapping {
    public static void main (String[] args){
        swapping sp = new swapping();

        sp.swap(6,5);
        sp.swap(7, 3.5);

    }
    public static void swap(int a,int b){
        int temp = a;
        a = b ;
        b = temp;

        System.out.println("A:" + a + ","+b);


    }
    public static void swap(int a,double b){
        int temp = a;
        a =(int) b ;
        b = temp;

        System.out.println("B:" + a +","+b);


    }



}*/


//------------------------------------
//EVEN ODD
//------------------------------------
/*
import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        evenOdd();

    }
    public static void evenOdd(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter the number :");
        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println("the number u entered is even");
        }
        else{
            System.out.println("the number u entered id odd");
        }
    }


}
*/

/*
//-------------------------------------
//CODE TO REVERSE THE NUMBER///////
//--------------------------------------
import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        revNum(100);
    }
        public static void revNum(int num){

        int revNum = 0;
        while(num>0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num/= 10;
        }
            System.out.println("reverse is :"+revNum);





    }}*/
/*
public class Main{
    public static void main (String[] args){
        int num = 2;
        int power =3;

        callPower(num,power);




    }
    public static void callPower(int num,int power){
        int res = 1;
        for(int i = 0; i < power ; i ++){
            res = res * num ;

        }
        System.out.println(res);
    }

}
*/
/*
//----------------------------
//COUNT THE NUMBER OF DIGITS IN THE NUMBER ENTERED
//----------------------------------------
public class Main{
    public static void main (String[] args){
        countnumbers(546564545);
    }

    public static void countnumbers(int val){

        int num = (int)((int)Math.log(val)/Math.log(10))+1;
        System.out.println(num);
    }
}
*/


//----------------------------
//ARMSTRONG NUMBER
//--------------------------
public class Main{
    public static void main (String[] args) {
        //armstrong(153);
        //palindrome(124465464);
        // printDivisors();
        //divisor2();
        //primeornot();
        // euclideanGcd(24,23);
        //seiveAlgorithm(40);
        // lcm (24,36);
        //fastExponentiation(8,5,100);
//factorial(5);
//countZeroes(780003000);
        //findTrainlingZeroesInFactorial(30);
        //bit(35);



        oddEven(555);
    }



    public static void armstrong(int num){
        int copy = num;
        int res = 0;
        while(num>0) {
            int imp = num % 10;

            res = res +(int) (Math.pow(imp, 3));
            num /= 10;
        }
        System.out.println(res==copy);






    }




    public static void palindrome (int num) {

int copy = num;
        int res = 0;
        while (num > 0) {
            int imp = num % 10;
            res = res*10 + imp;
            num /= 10;
        }

        System.out.println(copy==res );

    }

    public static void printDivisors( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num  = scanner.nextInt();
        ;
        for (int i = 1;i <= num;i ++){
           if(num % i==0){
               System.out.println(i);
           }

        }
    }


    public static void divisor2(){
        int num = 124;
        int imp =(int) Math.sqrt(num);
        int counter = 1;
        while (counter <= imp) {
            if (num % counter==0){
                System.out.println(counter);
                int othernumber = num/counter;
                if(othernumber!=counter){
                    System.out.println(counter +"is a divisor of "+num );

                }
            }

        counter++;
    }}

    public static void primeornot(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter the number:");
        int num = scanner .nextInt();
        int counter = 2;
        int sqrt = (int)Math.sqrt(num);
        while (counter<=sqrt) {
            if (num % counter == 0) {

                System.out.println("it is not a prime number");
                return;
            }
            counter++;

        }

        System.out.println("it is a prime number");
        }


        public static void seiveAlgorithm(int num){
            boolean arr[]= new boolean[num +1];
            Arrays.fill(arr,true);
        int counter = 2;
        


        while(counter<=num){
            if(arr[counter]==true){
            for(int factor =counter + counter ;factor<=num; factor+=counter){
                arr[factor]= false;
            }
            }
            counter++;
        }
        for (int i = 0; i <=num;i++ ){
            System.out.println(i+":"+arr[i]);
        }




        }
        public static int euclideanGcd(int num1 , int num2) {
            int res = 0;
            while (num1 != 0 && num2 != 0) {
                if (num1 > num2) {
                    num1 %= num2;
                } else {
                    num2 %= num1;
                }

                res = num1;
                if (num1 == 0) {
                    res = num2;
                }


            }
            System.out.println("the GCD is" + res);
            return res;
        }
        public static void lcm (int num1 ,int num2 ){
        int res = (num1*num2)/euclideanGcd(num1,num2);
            System.out.println("the lcm of "+num1+ " & "+num2+ " is " + res);
        }


static double fastExponentiation (long num, long power, long limit){
        double res = 1 ;
        while(power>0){
            if (power%2!=0){
                 res = (res*(num%limit))%limit;
               // res = res * num;
            }
            power/=2;
            num = ((num%limit)*(num%limit))%limit;
          //  num = num *num ;
        }
    System.out.println(res);
        return res;

}
public static void factorial (int fact){
       int  res = 1;
        while (fact>1){
            res = res* fact;
           fact--;


        }
    System.out.println("the value of the fact = " +res);
}
public static void countZeroes (long num){//WHILE LOOP
        int res=0;

        while (num>0){
            long imp = num%10;
            if (imp ==0){
                res= res +1;
            }
            else {
                break;

            }

            num/=10;
        }
    System.out.println("The number of zeroes are" +res);
}


public static void findTrainlingZeroesInFactorial(int num){
        double res = 0;
        for (int i = 5; i <=num ; i = i*i){
        res = res+Math.floor(num/i);

        }

    System.out.println(res);

}

public static void bit(int num){
        for (int i = 7;i>=0;i--){
            System.out.print((num>>i)&1);
        }
}

public static void oddEven(int num){
if(isBitSet(num,0)){
    System.out.println("Number is Odd");


}
else {
    System.out.println("Number is Even");
}


        }
        public static boolean isBitSet(int num, int bit){
        int res = num &(1<<bit);
        return(res==0)?false:true;



}

public static void  setIthBit(int num , int bit){




    }


            }





