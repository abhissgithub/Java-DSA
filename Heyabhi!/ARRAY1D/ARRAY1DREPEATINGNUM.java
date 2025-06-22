package ARRAY1D;

import java.util.Scanner;

class ARRAY1DREPEATINGNUM
{
    static int repeated (int [] arr)
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            for (int j = i+1 ; j < arr.length ; j++)
            {
                if (arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
            int size = sc.nextInt();
        System.out.println("Enter the"+" "+size+" "+"Elements in array");
            int [] arr = new int [size];
            for (int i = 0 ; i < arr.length ; i++){
                arr [i] = sc.nextInt();
            }
        System.out.println("The First Element Repeated Is :"+" "+repeated(arr));

    }
}