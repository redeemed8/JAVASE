package MySQL_JDBC;

public class Notice {
    public static void main(String[] args) {

        /*
            一个stmt多个rs进行操作.
            那么从stmt得到的rs1,必须马上操作此rs1后,才能去得到另外的rs2,再对rs2操作.
            不能互相交替使用,会引起rs已经关闭错误.
        */
    }
}
