import java . util.Scanner;

import static java.lang.String.valueOf;


public class calculatorApplication {


    public static void main (String[] args ) {
        calculatorApplication obj = new calculatorApplication();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our CALCULATOR APPLICATION");
        callValue();
    }

    private static void callValue() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the operator(*,/,+,-,%)");
        String ch = sc.next();
        getOperator(ch);
    }



public static void exitImp(){



    System.out.println("Thank you for using our Application");
}





    public static boolean exitLoop() {
        boolean exitValue = false;
        int retry = 5;
        int times = 0;

        Scanner sc = new Scanner(System.in);

        do {
            for (times = 0; times < 5; times++) {
                System.out.println("Do you want to continue with the calculator ");
                System.out.print("y/n");
                String exit = sc.next();
                char ch = exit.charAt(0);
                if (ch == 'y') {

                    callValue();
                    return false;


                } else if (ch == 'n') {
                    System.out.println("thank you for using our application");
                    return true;


                }

            }

            if (times >= retry) {
                System.out.println("The Calculator application closed forcefully!!");
                System.out.println("thank you for using out application");
                break;
            }


        } while (exitValue = true);

        return exitValue;
    }





    public static int getNumber(){
        Scanner sc= new Scanner (System.in);

        int num = sc.nextInt();

        return num;

    }



    public static void getOperator(String ch){
        switch(ch){
            case "*" : int num1= getNumber();
                        int num2 = getNumber();
            System.out.println("ANSWER:" +(num1*num2));
            break;
            case "/" : int num3= getNumber();
                int num4 = getNumber();
                System.out.println("ANSWER:" +(num3/num4));
                break;
            case "+" : int num5= getNumber();
                int num6 = getNumber();
                System.out.println("ANSWER:" +(num5+num6));
                break;

            case "-" : int num7= getNumber();
                int num8 = getNumber();
                System.out.println("ANSWER:" +(num7-num8));
                break;

            case "%" : int num9= getNumber();
                int num10 = getNumber();
                System.out.println("ANSWER:"+(num9%num10));
                break;

            default :
                System.out.println("The operator you entered in wrong :( ");
                break;









        }

        exitLoop();}

}
