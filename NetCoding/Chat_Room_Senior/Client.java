//package NetCoding.Chat_Room_Senior;
//
//import java.io.*;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class Client {
//    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("127.0.0.1", 10001);
//        System.out.println("服务器已经连接成功");
//
//
//        while (true) {
//            System.out.println("==============欢迎来到聊天室================");
//            System.out.println("1登录");
//            System.out.println("2注册");
//            System.out.println("请输入您的选择：");
//            Scanner sc = new Scanner(System.in);
//            String choose = sc.nextLine();
//            switch (choose) {
//                case "1" -> login(socket);
//                case "2" -> System.out.println("用户选择了注册");
//                default -> System.out.println("没有这个选项");
//            }
//        }
//    }
//
//    public static void login(Socket socket) throws IOException {
//        //获取输出流
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        //键盘录入
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名");
//        String username = sc.nextLine();
//        System.out.println("请输入密码");
//        String password = sc.nextLine();
//
//        //拼接
//        StringBuilder sb = new StringBuilder();
//        //username=zhangsan&password=123
//        sb.append("username=").append(username).append("&password=").append(password);
//
//        //第一次写的是执行登录操作
//        bw.write("login");
//        bw.newLine();
//        bw.flush();
//
//        //第二次写的是用户名和密码的信息
//        //往服务器写出用户名和密码
//        bw.write(sb.toString());
//        bw.newLine();
//        bw.flush();
//
//        //接收数据
//        //获取输入流
//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String message = br.readLine();
//        System.out.println(message);
//        //1：登录成功  2 密码有误   3 用户名不存在
//        if ("1".equals(message)) {
//            System.out.println("登录成功，开始聊天");
//            //开一条单独的线程，专门用来接收服务端发送过来的聊天记录
//            new Thread(new ClientMyRunnable(socket)).start();
//            //开始聊天
//            talk2All(bw);
//        } else if ("2".equals(message)) {
//            System.out.println("密码输入错误");
//        } else if ("3".equals(message)) {
//            System.out.println("用户名不存在");
//        }
//
//    }
//
//    //往服务器写出消息
//    private static void talk2All(BufferedWriter bw) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("请输入您要说的话");
//            String str = sc.nextLine();
//            //把聊天内容写给服务器
//            bw.write(str);
//            bw.newLine();
//            bw.flush();
//        }
//    }
//}
//
//
