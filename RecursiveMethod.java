import java.util.Scanner;
public class Homework7_1 {
public static int fib(int n) {
       if (n == 0 || n == 1) return n;
       else return fib(n - 1) + fib(n - 2);}

public static int getPowerOfXtoN(int xBase, int nExp) {
       if (nExp == 0) return 1;
       else return xBase * getPowerOfXtoN(xBase, nExp - 1);}

private static int binarySearch(String arr[], int first, int last, String target) {
    if (first > last) return -1;
       int center_1 = first + (last - first) / 2;
    if (arr[center_1].equals(target))
        return center_1;
    else if (arr[center_1].compareTo(target) > 0)
        return binarySearch(arr, first, center_1 - 1, target);
    else
        return binarySearch(arr, center_1 + 1, last, target);
}
public static int binarySearch(String target, String[] words) {
    if (words == null) return - 1;
    return binarySearch(words, 0, words.length, target);
 
}

static int organizeParade(int paradeLength){
    if(paradeLength == 1) return 2;
    if(paradeLength == 2) return 3;
    return organizeParade(paradeLength - 1) + organizeParade(paradeLength - 2);
}

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int sn = scnr.nextInt();
    System.out.println("Output: " + organizeParade(sn));
}

public static int numJarsNeeded(int candyCount, int jarCapacity) {
        if(candyCount <= 0 || jarCapacity <= 0)
        return 0;
        if(candyCount <= jarCapacity)
            return 1;
        else
            return numJarsNeeded(candyCount/2, jarCapacity) + numJarsNeeded(candyCount - (candyCount/2), jarCapacity);
    }
}



   
 