package IOStreams.OtherIOStream;

import java.io.Serializable;
import java.util.Random;

public class Animal implements Serializable {
    //   想要此类能被写入文件，要实现接口
    //   但是这个接口中没有东西
    //   这种接口叫标记性接口，拥有了就可以使用一些东西

    //  静态不可变的版本号
    private static final long serialVersionUID = 2814992975156812441L;

    private String name;
    private int age;
    private transient String secret;

    public Animal() {
    }

    public Animal(String name, int age, String secret) {
        this.name = name;
        this.age = age;
        this.secret = secret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {

        Random r = new Random();

        r.nextInt();

        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", secret='" + secret + '\'' +
                '}';
    }
}
