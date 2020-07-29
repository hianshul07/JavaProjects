import java.util.Scanner;

public class BubbleSort {

    //Function to print the numbers of the array
    private static void PrintNumber(int[] Number){

        int i;

        for (i = 0; i < Number.length; i++){
            System.out.print(Number[i] + "," + " " );
        }

        System.out.println("\n");
    }
    //Function to swap values
    private static void SwapNumber(int i, int j, int[] array){

        int temp;

        temp = array[i]  ;
        array[i] = array[j];
        array[j] = temp;

    }
    //Function of sorting
    public static void BubbleSort(int[] array){

        int n = array.length;
        int k;

        for (int m = n; m >= 0; m--){
            for (int i = 0; i < n - 1; i++){
                k = i + 1;
                if (array[i] > array[k]){
                    SwapNumber(i, k, array);
                }
            }
            PrintNumber(array);
        }
    }

    public static void main(String[] args) {

        int[] inputArray = {12, 43, 4, 3, 9, 10, 5, 8, 7, 2};

//        int i;
//        Scanner Input = new Scanner(System.in);

//        for (i = 0; i < InputArray.length; i++){
//            int scan = Input.nextInt();
//        }

        BubbleSort(inputArray);
    }
}
