public class bits {
    public static void main(String[] args) {
        int num = 86;
       // int bit = 1;
        int clearbit = 4;
        //printbits(num);
        System.out.println();
       // int x = unsetRightMostBit(num);
       // System.out.println();
      //  printbits(x);
        // oddOrEven(num);
        //zabardashtiSet(num,bit);
        //usingTilde(num, bit);
        //isPowerOfTwo(num);
        //noOfSetBits(num);
       // NoOfSetBits(num);
       //clearlsbs(num,clearbit);
      //  clearmsbs(num,clearbit);
       // clearmsbs2(num,clearbit);
       // clearmsbs2inotIncluded(num,clearbit);
        //char y = convertouppercase('a');
       // System.out.println(y);

      //  char x = convertolowercase('A');
      //System.out.println(x);
       /* System.out.println("The number a is : " );
        printbits(56);
        System.out.println();
        System.out.println("the number b is : ");
        printbits(78);
        System.out.println();
      swap(56,78);*/

        int arr[] ={2,3,4,5,6,6,3,2};
       // printOnlyUniqueElement(arr);
        printThe2uniqueElements(arr);


    }


    public static void printbits(int num) {

        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }

    }

    public static boolean isBitSet(int num, int bit) {
        int res = num & (1 << bit);
        return res != 0;


    }

    public static void oddOrEven(int num) {
        if (isBitSet(num, 0)) {
            System.out.println("number is odd");
        } else {
            System.out.println("number is even ");
        }
        // if ((num&1)==0) {
        //    System.out.println("even");

        //    }
        //  else {
        //    System.out.println("odd");
        //  }
    }

    public static void zabardashtiSet(int num, int bit) {

        System.out.println(num = num | 1 << bit);
        printbits(num);


    }

    public static void togglebit(int num) {
        int i = 2;

        int x = num ^ (1 << i);
        System.out.println(x);


    }

    public static void usingTilde(int num, int bit) {

        System.out.println(num = num & ~(1 << bit));
        printbits(num);


    }


    public static void isPowerOfTwo(int num) {
        if ((num & num - 1) == 0) {
            System.out.println("This number is a power of two");
        } else {
            System.out.println("This number is not a power of two");
        }


    }

    public static int unsetRightMostBit(int num) {
        return (num & num-1);



    }
    //method 1 of doing it
    public static void noOfSetBits(int num) {
        int count = 0;
        for (int i = 7; i>=0 ; i--) {
            if ((num & (1 << i)) != 0) {
                count++;
            }


        }
        System.out.println("the number of set bits are : " + count);
    }
//better method of doing it


    public static void NoOfSetBits(int num){
        int count =0;
        while (num!=0){
            count ++;
            num = unsetRightMostBit(num);

        }

        System.out.println(count);
    }

    public static void clearlsbs(int num,int clearbit){
        int x = 0;
        for (int i = clearbit; i>=0; i-- ){
            num = num &~(1<<i);



        }
        printbits(num);


    }
    public static void clearmsbs(int num,int clearbit){
        int x = 0;
        for (int i = 8; i>=clearbit; i-- ){
            num = num &~(1<<i);



        }
        System.out.println();
        printbits(num);}

    public static void clearmsbs2(int num,int clearbit){
        int x = 0;
        for (int i = clearbit; i>=0; i-- ){
            num = (num & (1<<clearbit)-1);



        }
        System.out.println();
        printbits(num);


}
    public static void clearmsbs2inotIncluded(int num,int clearbit){
        int x = 0;
        for (int i = clearbit; i>=0; i-- ){
            num = (num & (1<<clearbit+1)-1);



        }
        System.out.println();
        printbits(num);

}
public static char convertouppercase(char num){

        num = (char)(num ^ 1<<5);

return num ; }


    public static char convertolowercase(char num){

        num = (char)(num | 1<<5);

        return num ; }


    public static void swap (int a , int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping a : " +a);

        System.out.println("After swapping b : " +b);

    }
    public static void printOnlyUniqueElement(int arr[]){
        int res = 0;
        int l = arr.length;
        for (int i = 0; i <l; i++ ){
            res= res^arr[i];
        }

        System.out.println(res);

    }

    public static void printThe2uniqueElements(int arr[]){
        int count = 0;
        int res = 0;
        int l = arr.length;
        int a = 0;
        int b = 0;
        for (int i = 0; i<l; i ++){
            res = res^arr[i];
             while (res !=0){
                count ++;
                if (count==1){
                    a = res;
                }
                if (count==2){
                    b = res-a;
                }

            }

        }





        System.out.println("1:" +a);
        System.out.println("2:" +b);

    }

}