//package NetCoding.Chat_Room_Senior;
//
//import java.io.*;
//import java.net.Socket;
//import java.util.Properties;
//
//class MyRunnable implements Runnable {
//    Socket socket;
//    Properties prop;
//
//    public MyRunnable(Socket socket, Properties prop) {
//        this.prop = prop;
//        this.socket = socket;
//    }
//
//    @Override
//    public void run() {
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//            while (true) {
//                String choose = br.readLine();
//                switch (choose) {
//                    case "login" -> login(br);
//                    case "register" -> System.out.println("用户选择了注册操作");
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //获取用户登录时，传递过来的信息。
//    //并进行判断
//    public void login(BufferedReader br) throws IOException {
//        System.out.println("用户选择了登录操作");
//        String userinfo = br.readLine();
//        //username=zhangsan&password=123
//        String[] userInfoArr = userinfo.split("&");
//        String usernameInput = userInfoArr[0].split("=")[1];
//        String passwordInput = userInfoArr[1].split("=")[1];
//        System.out.println("用户输入的用户名为:" + usernameInput);
//        System.out.println("用户输入的密码为:" + passwordInput);
//
//        if (prop.containsKey(usernameInput)) {
//            //如果用户名存在，继续判断密码
//            String rightPassword = prop.get(usernameInput) + "";
//            if (rightPassword.equals(passwordInput)) {
//                //提示用户登录成功，可以开始聊天
//                writeMessage2Client("1");
//                //登录成功的时候，就需要把客户端的连接对象Socket保存起来
//                Server.list.add(socket);
//                //写一个while(){}表示正在聊天
//                //接收客户端发送过来的消息，并打印在控制台
//                talk2All(br, usernameInput);
//            } else {
//                //密码输入有误
//                writeMessage2Client("2");
//            }
//        } else {
//            //如果用户名不存在，直接回写
//            writeMessage2Client("3");
//        }
//    }
//
//    private void talk2All(BufferedReader br, String username) throws IOException {
//        while (true) {
//            String message = br.readLine();
//            System.out.println(username + "发送过来消息：" + message);
//
//            //群发
//            for (Socket s : Server.list) {
//                //s依次表示每一个客户端的连接对象
//                writeMessage2Client(s, username + "发送过来消息：" + message);
//            }
//        }
//    }
//
//    public void writeMessage2Client(String message) throws IOException {
//        //获取输出流
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bw.write(message);
//        bw.newLine();
//        bw.flush();
//    }
//
//    public void writeMessage2Client(Socket s, String message) throws IOException {
//        //获取输出流
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//        bw.write(message);
//        bw.newLine();
//        bw.flush();
//    }
//}
