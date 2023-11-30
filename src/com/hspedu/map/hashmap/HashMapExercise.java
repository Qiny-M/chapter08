package com.hspedu.map.hashmap;

import java.util.*;

@SuppressWarnings({"all"})
public class HashMapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack", 650);
        map.put("jim", 1500);
        map.put("smith", 950);
        System.out.println(map);

        //jack工资更改为2600
        map.put("jack", 2600);
        System.out.println(map);

        //为所有员工工资加100
        Set keySet = map.keySet();
        for (Object key : keySet) {
            map.put(key, (Integer) map.get(key) + 100);
        }
        System.out.println(map);

        //用EntrySet遍历
        Set entrySet = map.entrySet();
        //用迭代器, entrySet取出来的是一个个entry
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        //遍历所有工资
        Collection values = map.values();
        for (Object sal : values) {
            System.out.println("工资==" + sal);
        }

    }
}
