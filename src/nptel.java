import java.util.Scanner;

public class nptel {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int arr[][] = new int [2][3];
        System.out.println("enter the elements of the array");
        for (int i=0; i <2; i++){
            for (int j=0; j<3;j++){
                arr[i][j]= scanner.nextInt();

            }
        }

        System.out.println("The elements of the array are :");
        for (int i=0; i <2; i++){
            System.out.println();
            for (int j=0; j<3;j++){
                System.out.print(arr[i][j] +" ");

            }
        }


    }




}



