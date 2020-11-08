import java.util.Scanner;

/**
 * Main-class
 * @author Vasilev A.O. and Andrianov D.V.
 * @version 1.0
 */

public class Main
{
    /** Method for outputting array values to the console
     * @param arr array for console output
     * */
    public static void ShowArray(int[] arr)
    {
        for(int element : arr)
            System.out.print(element + " ");

        System.out.println();
    }

    /** Program entry point (main-method)
     * @see MySort#SortByAscending(int[])
     * @see MySort#SortByDescending(int[])
     * */
    public static void main(String[] args)
    {
        var input = new Scanner (System.in);

        System.out.println("Enter size of the array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println();

        for(int i = 0; i < size; i++)
            arr[i] = input.nextInt();
        System.out.println();

        System.out.println("Unsorted array:");
        ShowArray(arr);


        MySort.SortByAscending(arr);
        System.out.println("Array sorted in ascending order:");
        ShowArray(arr);

        MySort.SortByDescending(arr);
        System.out.println("Array sorted in descending order:");
        ShowArray(arr);
        System.out.println();
    }
}
