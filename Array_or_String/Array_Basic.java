package Array_or_String;

public class Array_Basic {
    public static void main(String[] args) {
        int n = 2, m = 3;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                arr[i][j] = i;

        for (int[] i : arr)
            for (int j : i)
                System.out.print(j + " ");
        System.out.println();
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        int[] arr1 = {99,99};
        int[] arr2 = {88,88,88};
        arr[0]=arr1;
        arr[1]=arr2;

        for (int[] i : arr)
            for (int j : i)
                System.out.print(j + " ");
        System.out.println();
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
    }

}

