import java.util.Scanner;


class Solution {
    public boolean isPalindrome(int x) {
        int colll = x;
        int length = theLength(x);
        int num = 0;

        for (int i = 0;i<=length;i++){
            int imp = x%10;

            num+=imp*10;
            x/=10;
        }
       return colll==num;



    }

    public int theLength(int x){
        int i = 0;
        while(x>0){

            x/=10;
            i++;


        }
        return i ;

    }}
