public class MergeSortDownToUp {

    static Comparable[] temp;

    public static void sort(Comparable[] a) {



        int length = a.length;
        temp = new Comparable[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);

        int mid,end;


        for (int i = 1; i < length; i = i+i) {//步长
            for (int j = 0; j < length - i; j += i+i) {//j作为每个小组的index
                mid = i + j - 1;

                end = Math.min(j+i+i-1,length-1);//对于数组长度不满足2的x次幂的数组，mid可能会大于end

                merge(a,j,mid,end);


            }

        }
    }

   private  static void merge(Comparable[] comparables, int left, int mid, int right) {

        int index1 = left;
        int index2 = mid + 1;

        int i = index1;

        System.arraycopy(comparables, 0, temp, 0, comparables.length);


        while (index1 <= mid && index2 <= right) {
            if (Example.less(temp[index1], temp[index2])) {
                comparables[i++] = temp[index1++];
            } else {
                comparables[i++] = temp[index2++];
            }
        }
        while (index1 <= mid)
            comparables[i++] = temp[index1++];


        while (index2 <= left)
            comparables[i++] = temp[index2++];

    }

}
