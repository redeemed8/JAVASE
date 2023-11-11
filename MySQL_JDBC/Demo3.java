package MySQL_JDBC;

import java.sql.*;

public class Demo3 {
    public static void main(String[] args) throws SQLException {

        //  1.注册驱动      (可以省略)
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //  2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mynote","root","123456");

        //  3.执行sql
        Statement statement = connection.createStatement();

        //  增加数据
        //  int rows = statement.executeUpdate("insert into product values(NULL,'八嘎',1500,'c001')");
        //  System.out.println(rows);

        //  修改数据
        //  int row2 = statement.executeUpdate("update product set price = 6666 where category_id = 'c003'");
        //  System.out.println(row2);

        //  删除数据
        //  int row3 = statement.executeUpdate("delete from product where pname = '八嘎'");
        //  System.out.println(row3);

        //  4.关闭连接
        statement.close();
        connection.close();

    }
}
