public class ShellByMyself {
    public static void sort(int[] a) {

        int length = a.length;

        int step = 1;

        while (step < length / 3)
            step = 3 * step + 1;//计算步伐

        while (step >= 1) {//开始排序
            for (int i = step; i < length; i++) {
                for (int j = i; j >= step && a[j] < a[j - step]; j = j - step) {
                    int temp = a[j - step];
                    a[j - step] = a[j];
                    a[j] = temp;
                }


            }
            step = step / 3;//缩小步子

        }


    }
}
