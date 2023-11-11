package NetCoding.TCP.TCP_Test05;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{

    Socket socket;
    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //  读取数据并且保存到本地文件中
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            String name = UUID.randomUUID().toString().replace("-","");
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("D:\\protjct\\jjj\\Server\\src\\NetCoding\\TCP\\TCP_Test05\\"+ name +".png"));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bos.flush();                //  !~!!!!!!!!!!!!!!!!

            //  回写数据
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功！~");
            bw.newLine();
            bw.flush();                 //  !~!!!!!!!!!!!!!!!!


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //  释放资源
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
