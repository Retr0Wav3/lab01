/**
 * A class containing methods for sorting data in an array
 * @author Vasilev A.O. and Andrianov D.V.
 *
 */

public class MySort
{
    /** Method for sorting in ascending order
     * @param arr array for sorting
     * */
    public void SortByAscending(int[] arr)
    {
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size; i++)
            for(int j = 1; j < (size - i); j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
    }

    /** Method for sorting in descending order
     * @param arr array for sorting
     * */
    public void SortByDescending(int[] arr)
    {
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size; i++)
            for(int j = 1; j < (size - i); j++)
            {
                if(arr[j-1] < arr[j])
                {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
    }
}
