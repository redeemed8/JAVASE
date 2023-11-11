package MySQL_JDBC;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException {

        //  1.注册驱动      (可以省略)
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //  2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mynote","root","123456");

        //  3.执行sql
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from product");

        //  优化
        //  先获取表的列数
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        //  4.处理结果集
        while (resultSet.next()) {        //  先判断有没有下一个         //  获取一行数据
            //  获取每一列数据
            for(int i = 1;i <= columnCount; ++i){
                System.out.print(resultSet.getObject(i) + "  ");
            }
            System.out.println();
        }

        //  5.关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
