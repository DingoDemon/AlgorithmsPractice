






public class InsertionByMyself {



    /**
     *
     * @param a
     * 时间复杂度为n^2
     *
     */
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {//n
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {//n
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;

            }

        }

    }

}
