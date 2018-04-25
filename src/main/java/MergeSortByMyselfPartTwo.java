public class MergeSortByMyselfPartTwo {

    static Comparable[] temp;

    static void merge(Comparable[] a, int left, int mid, int right) {

        temp = new Comparable[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);

        int index1 = left;
        int index2 = mid + 1;


        for (int i = left; i <= right; i++) {

            if (index1 > mid) {
                a[i] = temp[index2++];
            } else if (index2 > right) {
                a[i] = temp[index1++];
            } else if (Example.less(temp[index1], temp[index2])) {
                a[i] = temp[index1++];
            } else {
                a[i] = temp[index2++];
            }

        }


    }

    static void sort(Comparable[] a, int left, int right) {
        if (right <= left)
            return;
        int mid = (left + right) / 2;
        sort(a, left, mid);
        sort(a, mid + 1, right);
        merge(a, left, mid, right);

    }


}

