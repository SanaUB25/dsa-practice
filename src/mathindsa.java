/*public class bitManipulation {


    public static void main(String[] args) {
        printBit(112);
        //printEvenOdd(677);
        //int res = setIthBit(32,5);
       // printBit(res);
       //int imp = toggleBit(32,4);
       //printBit(imp);
      //int imp2 = tildeBit(54,4);
     //  printBit(imp2);
       // int res2 = unSetIthBit(33,5 );
        //printBit(res2);
        //isPowerOfTwo(10);
//int res6 =unsetRightMostSetBit(48);
       //
        //printBit(res6);
        NoOfSetBits(112);
    }


    public static void printBit(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);

        }
        System.out.println();
    }

    public static void printEvenOdd(int num){
if (isBit(num,0)){
    System.out.println("the number is odd");
}
else {
    System.out.println("the number is even");
}

    }

public static boolean isBit(int num, int bit){
        int res = num & (1<<bit);
        return (res==0)?false:true;
}

public static int setIthBit(int num , int bit){

        return num | (1<<bit);



        }


public static int toggleBit(int num,int bit){

    return num ^ (1<<bit);
}


public static int tildeBit(int num , int bit) {
    return num = num & ~(1<<bit) ;
}

public static int unSetIthBit(int num , int bit){//CHECK THIS CODE CLEARELY


        return num | -(1<<bit);
    }
    public static void isPowerOfTwo(int num){
        if ((num & num-1)==0){
            System.out.println(" number is a power of Two");
        }
        else {
            System.out.println("number is not a power of two");
        }



    }

public static int unsetRightMostSetBit(int num ){
        return (num &num-1);
}
public static void NoOfSetBits(int num){
        int count = 0;
        while (num!=0){
            count++;
            num=unsetRightMostSetBit(num);
        }
    System.out.println(count);



}


}*/


import java.util.Arrays;

public class mathindsa {
    public static void main(String[] args) {
        int number = 12345;
        int base = 3;
        int num = 3;
int limit = 10007;
        // printnum(number,base);
        // reverseNum(number);
        // mathPower(base,num);
        // int ans = mathPowerReturnMethod(base,num);
        // System.out.println(ans);
        //fastExponentiation(num,base,limit);
        //countDigit(number);
        //countDigit2(number);
        // armstrong(number);
        //primeOrNot(num);
        //seiveAlgo(num);
        //newtonRaphson(num);
        //printAllDivisors(24);
        //GCD (24,36);
        //EuclideanGcd(24,36);
        //EfficientEuclideanGcd(24,36 );
        //lcm (24,36);
        factorial( num);
    }

    static void printnum(int number, int base) {
        int res = 0;
        int total = 0;
        int n = 0;
        while (number > 0) {
            res = number % 10;
            number /= 10;

            total += (int) (res * Math.pow(10, n));
            n++;
        }
        System.out.println("The number is " + total);

        //toanyBase(total,base);

    }

    static void toanyBase(int number, int base) {
        int res = 0;
        int total = 0;
        int n = 0;
        while (number > 0) {

            res = number % base;
            number /= base;
            total += res * Math.pow(10, n);
            n++;
        }
        System.out.println(total);
    }


    static void reverseNum(int number) {
        int copy = number;
        int R = 0;
        while (number > 0) {
            int rev = number % 10;
            R = R * 10 + rev;
            number /= 10;
        }
        System.out.println(R);

        if (copy == R) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

    static void mathPower(int base, int num) {

        int total = 1;
        while (num != 0) {
            total *= base;
            num--;

        }
        System.out.println("The value is " + total);

    }

    static int mathPowerReturnMethod(int base, int num) {
        int res = 1;
        for (int i = 0; i < num; i++) {
            res *= base;
        }
        return res;

    }

    static double fastExponentiation(long num, long power,long limit) {
        double res = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                res = (res * (num%limit))%limit;
              //res = res *num
            }

            power /= 2;
            num = (num%limit * num%limit)%limit;
            //num = num *num;
        }
        System.out.println(res);
        return res;

    }


    static void countDigit(int number) {
        int count = 0;
        if (number == 0) {
            System.out.println("the number of digits are 1 ");
            return;
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);
    }


    public static void countDigit2(int number) {
        if (number == 0) {
            System.out.println("the number of digits are 1 ");
            return;
        }
        int res = (int) (Math.log(number) / Math.log(10)) + 1; //Math.log10(num) - BETTER WAY
        System.out.println(res);
    }

    static void armstrong(int number) {
        int copy = number;
        int sum = 0;
        int x = String.valueOf(number).length();
        while (number > 0) {
            int res = number % 10;
            int num = mathPowerReturnMethod(res, x);

            sum += num;
            number /= 10;

        }
        System.out.println(sum);

        if (sum == copy) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("the number is not an armstrong number");
        }
    }


   public static void printAllDivisors(int num) {
        int sqrt = (int) newtonRaphson(num);
        int counter = 1;


        while (counter <= sqrt) {

            if (num % counter == 0) {
                System.out.println(counter + "is a divisor of " + num);
                int othernumber = num / counter;
                if (othernumber != counter)
                    System.out.println(othernumber+ "is a divisor of " + num);
            }
            counter++;

        }
    }


    public static void primeOrNot(int num) {
        int counter = 2;

        int sqrt = (int) newtonRaphson(num);

        while (sqrt >= counter) {
            if (num % counter == 0) {
                System.out.println("The number is not a prime number");
                break;
            } else {
                counter++;
            }
            System.out.println("The number is a prime number");
        }
    }


    public static void seiveAlgo(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int counter = 2;

        while (counter < num) {
            if (arr[counter] == true) {
                for (int factor = counter + counter; factor <= num; factor += counter) {
                    arr[factor] = false;

                }
            }
            counter++;


        }
        for (int i = 2; i <= num; i++) {
            System.out.println(i + " " + arr[i]);
        }


    }


    public static double newtonRaphson(int num) {
        double root;
        double X = num;
        double tolerance = 0.0001;

        while (true) {


            root = 0.5 * (X +(num/X));
            double ans = X-root;

            if (ans < tolerance) {
                break;

            }

            X = root;


        }


        return root;
    }

    public static double GCD (int num1,int num2){
        int min = (num1<=num2)?num1:num2;
        while(min>0){
            if(num1%min==0&&num2%min==0){
                System.out.println(min+" is a GCD of the number " +num1 + " and "+num2);

            }
            min--;
        }
        int max =  (num1<=num2)?num2:num1;
        System.out.println("GCD IS :" +max);

        return max;

    }


    public static void EuclideanGcd(int num1,int num2){
        int res;
        while(num1!=0 && num2!=0){
            if (num1 > num2){
                num1-=num2;

            }
            else {
                num2-=num1;

            }


        }
        if (num1==0){
            res = num2;
        }
        else{
            res = num1;
        }

        System.out.println(res);
    }


   public static double EfficientEuclideanGcd(int num1, int num2){
       int res;
       while(num1!=0 && num2!=0){
           if (num1 > num2){
               num1%=num2;

           }
           else {
               num2-=num1;

           }


       }
       if (num1==0){
           res = num2;
       }
       else{
           res = num1;
       }

       System.out.println(res);
       return res;
   }



   public static void lcm(int num1, int num2) {
        double y = EfficientEuclideanGcd(num1,num2);
       double x = (num1 * num2) ;
       double lcm = x/y;

       System.out.println("The lcm is "+lcm);
   }


   public static void factorial (int num){
        int res = 1 ;
        while (num>1){
            res*=num;
            num--;
        }
       System.out.println(res);
   }

   }








