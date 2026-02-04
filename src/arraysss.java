import java.util.Scanner;

public class arraysss {

    /*public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index of the array:");
        int noOfElements = scanner.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] arr = new int[noOfElements];
        for (int i = 0; i < noOfElements;i++){
            arr[i]=scanner.nextInt();
            }
        for(int i = 0; i <arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }

        }
    }


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index of the array:");
        int noOfElements = scanner.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] arr = new int[noOfElements];
        for (int i = 0; i < noOfElements;i++){
            arr[i]=scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0; i <arr.length;i++){
            sum +=arr[i];
            }
        System.out.println("the sum of the array is :" +sum);

        }*/
//MAXIMUM VALUE
    /*public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index of the array:");
        int noOfElements = scanner.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] arr = new int[noOfElements];
        for (int i = 0; i < noOfElements;i++){
            arr[i]=scanner.nextInt();
        }

        int greatest =Integer.MIN_VALUE;//OR greatest = arr[0];
        for(int i = 0; i <arr.length;i++){
            if(arr[i]>greatest){
                greatest = arr[i];
            }
        }
        System.out.println("the greatest number of the array is :" +greatest);

    }*/



    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index of the array:");
        int noOfElements = scanner.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] arr = new int[noOfElements];
        for (int i = 0; i < noOfElements;i++){
            arr[i]=scanner.nextInt();
        }

        int lowest =Integer.MAX_VALUE;//OR greatest = arr[0];
        for(int i = 0; i <arr.length;i++){
            if(arr[i]<lowest){
                lowest = arr[i];
            }
        }
        System.out.println("the greatest number of the array is :" +lowest);

    }

    }





