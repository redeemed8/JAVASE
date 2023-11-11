package MySQL_JDBC;


//  解决Sql注入问题
//  提高效率
//  精确提示用户问题
public class Demo6 {
    public static void main(String[] args) {

        //  我们可以尝试着
        //  把查到的 username 表 起一个别名 temptable 先存起来，
        //  然后让下一条sql语句 去temptable中直接查
        //  因为这个临时表要一直使用，所以我们每次操作前，可以先对临时表做一个清空的操作。


        //  改进方法2
        //  把查询结果放到一个User类中
        //  然后去逐个匹配密码即可


    }
}
