import static com.company.Example.less;

public class MergeByMyself {


    private static void merge(Comparable[] a, Comparable[] temp, int low, int mid, int hi) {
        int index1 = low;
        int index2 = mid + 1;

        int i = low;

        System.arraycopy(a, 0, temp, 0, a.length);
        while ((index1 <= mid) && (index2 <= hi)) {
            if (less(temp[index1], temp[index2]))
                a[i++] = temp[index1++];
            else
                a[i++] = temp[index2++];
        }
        while (index1 <= mid) {
            a[i++] = temp[index1++];
        }
        while (index2 <= hi) {
            a[i++] = temp[index2++];
        }


    }


    static void mergeSort(Comparable[] comparables, Comparable[] temp, int low, int hi) {
        if (low < hi) {
            int mid = (low + hi) / 2;

            mergeSort(comparables, temp, low, mid); //左边
            mergeSort(comparables, temp, mid + 1, hi);//右边
            merge(comparables, temp, low, mid, hi);


        }


    }
}
