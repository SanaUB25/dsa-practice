
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //printelementofarray();
        shiftElement();

    }

    public static void printelementofarray(){
        Scanner scanner = new Scanner(System.in);

            int arr[] = new int[5];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("enter the" + i + "th element: ");
                int element = scanner.nextInt();
                arr[i] = element;

            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);


            }

        }


    public static void shiftElement (){
        Scanner scanner = new Scanner(System.in);


        int[] arr = new int[10];
        arr[0]= 3;
        arr[1]= 5;
        arr[2]= 8;
        arr[3]= 17;
        arr[4]= 9;
        arr[5]= 66;
        arr[6]= 2;
        arr[7]= 4;
        int size = 8;



        System.out.println("At which place do u want to insert an element");
        int insertindex= scanner .nextInt();;
        System.out.println("eneter the element");
        int element = scanner . nextInt();


        for(int i=size ;i>=insertindex;i-- ){
            arr[i+1]= arr[i];
        }
        arr[insertindex]=element;


    for (int i = 0 ; i<=arr.length;i++){
        System.out.println(arr[i]);
    }



    }

    public static void shiftElement2 (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("At which place do u want to insert an element");
        int insertindex= scanner .nextInt();
        System.out.println("eneter the element");
        int element = scanner . nextInt();

        int[] arr = new int[9];
        arr[0]= 3;
        arr[1]= 5;
        arr[2]= 8;
        arr[3]= 17;
        arr[4]= 9;
        arr[5]= 66;
        arr[6]= 2;
        arr[7]= 4;
        int size = 8;

        if (insertindex<0|| insertindex>size-1){
            System.out.println("Error: array out of bound");
            return;
        }

        for (int i = size-1; i>=insertindex;i--){
            arr[i+1]=arr[i];

        }
        arr[insertindex]=element;
        for (int i = 0 ; i<=size+1;i++){
            System.out.println(arr[i]);


    }}}