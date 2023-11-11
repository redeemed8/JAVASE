package CommonAlgorithms;

public class InsertSort {
    public static void func(int[] arr){
        int startIndex = -1;
        //寻找无序位置
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        //向后往前推
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                //交换
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                --j;
            }
        }
    }
}
