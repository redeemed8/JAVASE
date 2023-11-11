package IOStreams.ByteOutput;

import java.io.*;

public class TryCatchDemo {
    public static void main(String[] args) throws IOException {
        //  finally 控制的语句一定执行，除非虚拟机退出
        //  包裹的快捷键  Ctrl + Alt + t

        FileInputStream fis = null;         //  null 必须写
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\protjct\\test.txt");
            fos = new FileOutputStream("D:\\protjct\\aaa\\test09.txt");
            //  拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //  释放资源
            if(fos != null){            //  判断是否联通
                try{
                    fos.close();        //  尝试关闭
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }


    }
}
