package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args) {
        //  收集方法 collection

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "男1", "女1", "男2", "女2", "男3", "女3", "男4");

        //  收集到 List 中
        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.substring(0, 1)))
                .collect(Collectors.toList());      //  可以简化

        System.out.println(newList);

        //  收集到 Map 中
        Set<String> newSet = list.stream()
                .filter(s -> "男".equals(s.substring(0, 1)))
                .collect(Collectors.toSet());
        System.out.println(newSet);

        //  收集到 Map 中
        //  toMap两个参数规则，一个
        //  注意点：键不能重复
        Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.substring(0, 1)))
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s;
                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.substring(1,2));
                            }
                        }));
        System.out.println(newMap);

        //  lambda 表达式
        Map<String,Integer> newMap2 = list.stream()
                .filter(s -> "男".equals(s.substring(0, 1)))
                .collect(Collectors.toMap(
                        s -> s,
                        s -> Integer.parseInt(s.substring(1,2))
                ));
        System.out.println(newMap2);

    }
}
