package MySQL_JDBC;

import java.sql.*;
import java.util.Scanner;

public class Demo4 {
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
        Statement statement = connection.createStatement();
        String sqlName = "select * from user where username = '" + username + "'";
        String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";
        ResultSet resultSetName = statement.executeQuery(sqlName);

        //  但是这个没有优化
        //  就是在查账号后，又重新全查了密码，导致效率变低
        //  我们应该在查到的账号表上，去核对密码，可以节约一半的时间2
        if (!resultSetName.next()) {
            //  用户名不存在
            System.out.println("用户名不存在！");
        } else if (!statement.executeQuery(sql).next()) {
            //  用户名存在了，查查密码
            System.out.println("密码输入错误！");
        } else {
            System.out.println("登录成功！");
        }

        //  SQL 注入
        //  ww 'or' 1=1
        //  可以通过这种方式 绕过我们的密码

        //  5.关闭连接
        resultSetName.close();
        statement.close();
        connection.close();

    }
}
