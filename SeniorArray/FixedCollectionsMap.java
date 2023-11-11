package SeniorArray;

import java.util.HashMap;
import java.util.Map;

public class FixedCollectionsMap {
    public static void main(String[] args) {
        //  要是想要超过 10 个, 参考下面
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "3");
        hm.put("李四", "4");
        hm.put("王五", "5");
        hm.put("赵六", "6");
        hm.put("头七", "7");
        hm.put("粑八", "8");

/*        //  利用上面的数据来获取一个不可变的集合
        //  获取到所有的键值对对象
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //  把entries变成一个数组
        Map.Entry[] arr = new Map.Entry[0];
        //  toArray方法在底层会比较 集合的长度 和 数组的长度
        //  如果 集合的长度大  它会根据你实际数据的个数，重新创建一个数组
        //  如果 相等 或者 数组的长度大  不会创建新的数组，而是直接使用，，，，，，，其余的默认为 null
        Map.Entry[] arr2 = entries.toArray(arr);
        //  不可变的Map集合
        Map map1 = Map.ofEntries(arr2);*/                   //  太长了

        //Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        //  最简单的方法  ↓
        Map<String,String> map = Map.copyOf(hm);

    }
}
