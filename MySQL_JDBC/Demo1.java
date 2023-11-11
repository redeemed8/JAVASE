package MySQL_JDBC;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws SQLException {

        //  1.注册驱动      (可以省略)
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //  2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mynote","root","123456");

        //  3.执行sql
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from product");

        //  4.处理结果集
        while (resultSet.next()) {        //  先判断有没有下一个         //  获取一行数据
            //  获取每一列数据
            /*int pid = resultSet.getInt("pid");
            String pname = resultSet.getString("pname");
            int price = resultSet.getInt("price");
            String categoryId = resultSet.getString("category_id");*/

            //  也可以写索引
            int pid = resultSet.getInt(1);
            String pname = resultSet.getString(2);
            int price = resultSet.getInt(3);
            String categoryId = resultSet.getString(4);

            System.out.println(pid + " " + pname + " " + price + " " + categoryId);
        }

        //  5.关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
