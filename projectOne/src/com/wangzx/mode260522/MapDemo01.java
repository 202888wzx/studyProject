package com.wangzx.mode260522;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("itheima001","林青霞");
        map.put("itheima002","张曼玉");
        map.put("itheima003","王祖贤");
        map.put("itheima003","柳岩");

        //输出集合对象
        System.out.println(map);
    }
}