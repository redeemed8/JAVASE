package NetCoding.TCP.TCP_Test06;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {

        //  创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,              //  核心线程数量
                16,                         //  线程池总大小
                60,                         //  空闲时间
                TimeUnit.SECONDS,           //  单位
                new ArrayBlockingQueue<>(2),        //  阻塞队列
                Executors.defaultThreadFactory(),           //  线程工厂，让线程池如何创建线程对象
                new ThreadPoolExecutor.AbortPolicy()        //  任务过多的解决方案
        );

        //  创建对象并且绑定端口
        ServerSocket ss = new ServerSocket(10965);

        while (true) {
            //  等待客户端连接
            Socket socket = ss.accept();

            //  开启一条线程
            //  一个用户就对应服务端的一条线程
            //new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }

        //ss.close();

    }
}
