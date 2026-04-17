public class Heap
{
    public static void main(String[] args)
    {
        int[] mydata = new int[100];

        InputArray(mydata);
        System.out.println("Before sorting, contents of the array are");
        System.out.println("------------------------");
        OutputArray(mydata);

        HeapSort(mydata);
        System.out.println("After sorting, contents of the array are");
        System.out.println("------------------------");
        OutputArray(mydata);
    }


    public static void InputArray(int[] array)
    {
        int size = array.length;
        for (int i = 0; i < size; i++)
	{
            array[i] = (int)(Math.random()*(101))+0;
        }
    }


    public static void OutputArray(int[] array)
    {
        int size = array.length;
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
}

    public static void HeapSort(int[] numbers)
    {
        // your code goes here
        /*you might need to call the following two functions 
            percolateDown(int[], int, int);
            swap(int[], int, int);
        */
    }

    public static void swap(int[] a, int i, int j)
    {
  	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }

    public static int left_child(int i)
    {
  	return 2 * i + 1;
    }

    public static void percolateDown(int[] a, int i, int n)
    {
	// Your code goes here
    }
}

/*
sample output:

Before sorting, contents of the array are
------------------------
68 73 97 39 48 65 59 7 89 36 2 18 90 66 9 73 12 49 25 98 51 70 20 15 89 81 27 50 15 43 85 89 46 91 3 68 90 7 15 41 45 52 11 49 70 87 80 61 52 94 51 81 32 40 23 39 69 46 86 12 13 92 89 70 70 35 11 59 23 77 46 12 16 33 7 68 90 82 76 86 66 68 28 39 61 41 94 85 98 66 30 89 91 3 0 29 99 52 22 90

After sorting, contents of the array are
------------------------
0 2 3 3 7 7 7 9 11 11 12 12 12 13 15 15 15 16 18 20 22 23 23 25 27 28 29 30 32 33 35 36 39 39 39 40 41 41 43 45 46 46 46 48 49 49 50 51 51 52 52 52 59 59 61 61 65 66 66 66 68 68 68 68 69 70 70 70 70 73 73 76 77 80 81 81 82 85 85 86 86 87 89 89 89 89 89 90 90 90 90 91 91 92 94 94 97 98 98 99
*/

