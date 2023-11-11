package MySQL_JDBC;

import java.sql.*;
import java.util.Scanner;
//  防止 SQL 注入
//  ww 'or' 1=1
//  可以通过这种方式 绕过我们的密码
public class Demo5 {
    public static void main(String[] args) throws SQLException {
        //  用户输入用户名和密码，判断是否能够登录
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名: ");
        String username = scanner.nextLine();

        System.out.println("请输入密码: ");
        String password = scanner.nextLine();

        //  1.注册驱动      (可以省略)
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //  2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mynote", "root", "123456");

        //  3.执行sql
        //  Statement statement = connection.createStatement();

        String sql = "select * from user where username = ? and password = ? ";

        //  对SQl语句进行一个预处理
        //  原理就是  通过使用转义字符 \    使得单引号失去了作为SQL字符串包裹的作用
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1, username);
        preparedStatement.setObject(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }

        //  5.关闭连接
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
