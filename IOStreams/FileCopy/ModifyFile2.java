package IOStreams.FileCopy;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class ModifyFile2 {
    public static void main(String[] args) throws IOException {
        //  先创建一个文本文件
        File f = new File("D:\\protjct\\paixu.txt");
        String start = "2-2-8-7-4-1-6-2-4-2-8";
        FileWriter fos = new FileWriter(f);
        fos.write(start);
        fos.close();

        //  读取数据
        FileReader fr = new FileReader(f);
        StringBuffer sb = new StringBuffer();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();

        //  排序

        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted((o1, o2) -> o2 - o1)
                .toArray(Integer[]::new);

        //  写回去
        FileWriter fw = new FileWriter(f);

        String s = Arrays.toString(arr).replace(", ", "-");
        String ret = s.substring(1, s.length() - 1);
        fw.write(ret);

        fw.close();

    }
}
