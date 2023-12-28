package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Array{

    public static void printArray(int[] inputArray, int n){
        System.out.print("Array : [");
        for( int i=0; i<n; i++){
            System.out.print(inputArray[i] + " ");
        }
        System.out.println("\b]");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the input array size : ");

        int n = Integer.parseInt(reader.readLine());

        int[] inputArray = new int[20];
        int inputSize;
        String input;

        do {
            System.out.print("Enter " + n + "integers, seperated using spase to sort (n1 n2 n2 ...) : ");
            input = reader.readLine();
            inputSize = input.split(" ").length;
        } while( inputSize != n);

        String[] numbers = input.split(" ");
        for (int i=0; i<n; i++){
            inputArray[i] = Integer.parseInt(numbers[i]);
        }

        printArray(inputArray, n);
/* Insert element in array */
        System.out.print("Enter new index you need to add value : ");
        int m = Integer.parseInt(reader.readLine());

        System.out.print("Enter new value : ");
        int val = Integer.parseInt(reader.readLine());
        n++;

        for(int k=n; k>=m; k--){
            inputArray[k] = inputArray[k-1];
        }
        inputArray[m] = val;

        printArray(inputArray, n);

/* Delete element in Array */

        System.out.print("Enter new index you need to delete value : ");
        m = Integer.parseInt(reader.readLine());

        for(int k=m; k<=n; k++){
            inputArray[k] = inputArray[k+1];
        }
        n--;

        printArray(inputArray, n);

/* Update element in array */ 

        System.out.print("Enter new index you need to update value : ");
        m = Integer.parseInt(reader.readLine());

        System.out.print("Enter new value : ");
        val = Integer.parseInt(reader.readLine());

        inputArray[m] = val;

        printArray(inputArray, n);

/* Search element in array */

        System.out.println("Array size is : " + n);

        System.out.print("Enter index you need to search value : ");
        m = Integer.parseInt(reader.readLine());

        System.out.println("The value is : " + inputArray[m]);
    }
}