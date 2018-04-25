import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.Selection;

public class Example {
   public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) <= 0;
    }


    public static boolean more(Comparable v, Comparable w) {
        return v.compareTo(w) >= 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i] + "");
        StdOut.println();
    }

    public static void show(int[] a) {
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i] + "");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
//        int[] a = new int[]{4, 7, 1, 23, 9, 0, 54, 4, 11, 22, 31, 42, 55};
        Integer[] b = new Integer[]{99, 101, 2, 66, 11, 9, 78, 5, 6, 113, 0, 190, 55, 15, 14, 13};
//        Integer[] temp = new Integer[b.length];
        QuickSort.sort(b);
        show(b);
//        System.out.println((-2)>>>1);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(3&5);



    }


    public static double time(String alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);
        if (alg.equals("Merge")) Merge.sort(a);
        if (alg.equals("Quick")) Quick.sort(a);
        if (alg.equals("Heap")) Heap.sort(a);
        return timer.elapsedTime();
    }


}
