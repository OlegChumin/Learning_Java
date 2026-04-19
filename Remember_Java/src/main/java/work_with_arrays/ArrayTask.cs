using System;
using System.Linq;

class ArrayTask
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
        PrintArray(SortAscending(arr));
        PrintArray(SortDescending(arr));
        Console.WriteLine(MaxElement(arr));
        Console.WriteLine(MinElement(arr));
        PrintArray(NegativeNumbers(arr));
        PrintArray(EvenNumbers(arr));
        PrintArray(NumbersDivisibleByThree(arr));
        Console.WriteLine(SumArrayElements(arr));
    }

    static void PrintArray(int[] arr)
    {
        Console.WriteLine(string.Join(" ", arr));
    }

    static int[] SortAscending(int[] arr)
    {
        int[] sortedArr = (int[])arr.Clone();
        Array.Sort(sortedArr);
        return sortedArr;
    }

    static int[] SortDescending(int[] arr)
    {
        int[] sortedArr = (int[])arr.Clone();
        Array.Sort(sortedArr);
        Array.Reverse(sortedArr);
        return sortedArr;
    }

    static int MaxElement(int[] arr)
    {
        return arr.Max();
    }

    static int MinElement(int[] arr)
    {
        return arr.Min();
    }

    static int[] NegativeNumbers(int[] arr)
    {
        return arr.Where(x => x < 0).ToArray();
    }

    static int[] EvenNumbers(int[] arr)
    {
        return arr.Where(x => x % 2 == 0).ToArray();
    }

    static int[] NumbersDivisibleByThree(int[] arr)
    {
        return arr.Where(x => x % 3 == 0).ToArray();
    }

    static long SumArrayElements(int[] arr)
    {
        return arr.Sum(x => (long)x);
    }
}
