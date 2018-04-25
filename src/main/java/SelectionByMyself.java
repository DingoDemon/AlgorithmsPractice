public class SelectionByMyself {

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {//n
            int min = i;//n
            for (int j = i+1; j < a.length ; j++) {//n方
                if (a[min] >= a[j]) {//n
                    min = j;
                }
            }
            int temp = a[i];//n
            a[i] = a[min];
            a[min] = temp;
        }
        return a;

    }


}
