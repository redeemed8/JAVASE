package NetCoding.Chat_Room_Senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class ClientMyRunnable implements Runnable{
    Socket socket;
    public ClientMyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        //循环，重复的接受
        while (true) {
            try {
                //接收服务器发送过来的聊天记录
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg = br.readLine();
                System.out.println(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

