package CommonAlgorithms;

public class qSort {
    public qSort() {
    }
    public  void func(int[] array, int start, int end) {
        if (start >= end) return;
        int i = start;
        int j = end;
        int x = array[start];
        while (i < j) {
            while (i < j && array[j] > x) --j;
            if (i < j) {
                array[i] = array[j];
                ++i;
            }
            while (i < j && array[i] < x) ++i;
            if (i < j) {
                array[j] = array[i];
                --j;
            }
        }
        array[i] = x;
        if (start < i - 1)
            func(array, start, i - 1);
        if (end > i + 1)
            func(array, i + 1, end);
    }
}
