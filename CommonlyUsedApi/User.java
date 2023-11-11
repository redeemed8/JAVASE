package CommonlyUsedApi;

import java.util.StringJoiner;

//像Cloneable这样什么也没有的接口
//叫做 标记性接口
//现在 Cloneable 表示一旦实现了，那么当前类的对象就可以被克隆
//如果没有实现，当前类的对象就不能被克隆
public class User implements Cloneable{
    private int id;
    private String userName;
    private String passWord;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String userName, String passWord, String path, int[] data) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "编号是：" + id + ", 用户名：" + userName +
                ", 密码：" + passWord + ", 游戏图片: " + path +
                ", 进度: " + arrToString();
    }

    public String arrToString() {
        //将成员数组变成相应字符串
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < data.length; ++i) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

/*    //浅克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于是让java帮助我们克隆一个对象，并把克隆之后的对象返回出去
        return super.clone();
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深克隆
        
        //先把被克隆对象中的数据获取出来
        int[] data = this.data;
        //创建一个新的数组
        int[] newData = new int[data.length];
        //拷贝数组中的数据
        System.arraycopy(data, 0, newData, 0, data.length);
        //调用父类中的方法克隆对象
        User u = (User)super.clone();
        //用我们的新数组来代替浅克隆的数组
        u.data = newData;

        return u;

    }

}
