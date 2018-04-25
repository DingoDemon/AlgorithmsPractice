public class QuickSort {


    private static int partition(Comparable[] comparables, int low, int high) {
        int index1 = low;//左指针
        int index2 = high + 1;//右指针

        Comparable v = comparables[low];

        while (true) {
            while (Example.less(comparables[++index1], v))
                if (index1 == high)//前面往后比了半天，发现前面全比v小
                    break;
            while (Example.less(v, comparables[--index2]))
                if (index2 == low)//后面往前比了半天，后面全比v大
                    break;
            if (index1 >= index2) break;//指针相遇了

            Example.exch(comparables, index1, index2);//前后交换

        }
        Example.exch(comparables, low, index2);//最后一次把v放在正确位置上

        return index2;

    }

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);

    }

    private static void sort(Comparable[] a, int low, int high) {
        if(low>=high)
            return;
        int i = partition(a,low,high);
        sort(a,low,i);//左排
        sort(a,i+1,high);//右排

    }
}
