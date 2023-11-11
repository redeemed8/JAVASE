package CommonAlgorithms;
public class test {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 6, 4, 3, 44, 66, 7, 899, 11, 2, 3, 4, 55};
        qSort q = new qSort();
        q.func(arr,0,arr.length-1);

        for(int i : arr)
            System.out.print(i+" ");
    }


}
