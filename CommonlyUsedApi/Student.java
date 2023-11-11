package CommonlyUsedApi;

import java.util.Objects;

public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    //因为Object内部的 toString 方法会打印类的地址
    //所以我们可以重写
    @Override
    public String toString() {
        return name + ", " + age;
    }


    //下面有点类似于重载
    @Override
    public boolean equals(Object o) {                   //重写equals方法，来比较类
        //如果不重写方法，它会比较两个类的地址值
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
        //重写后，会比较成员属性的值
    }

}
