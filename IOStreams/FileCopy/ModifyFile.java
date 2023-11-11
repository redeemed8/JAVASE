package IOStreams.FileCopy;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class ModifyFile {
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
        String str = sb.toString();
        String[] arrStr = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);

        //  写回去
        FileWriter fw = new FileWriter(f);

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                fw.write(list.get(i)+"");
            }else{
                fw.write(list.get(i)+"-");
            }
        }

        fw.close();

    }
}
