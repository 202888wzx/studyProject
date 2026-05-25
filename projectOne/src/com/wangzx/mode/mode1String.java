package com.wangzx.mode;

import java.math.BigDecimal;
import java.util.Scanner;

public class mode1String {
    public static void main(String[] args) {
        //登陆测试
        //mothed1();
//        String a1="abcd";
//        //字符串反转
//        String a2 = new StringBuffer(a1).reverse().toString();
//        System.out.println(a2);
        //
//        new MyJframe();

        System.out.println(0.01+0.09);
        BigDecimal decimal = new BigDecimal("0.01");
        BigDecimal decimal1 = new BigDecimal("0.05");

        System.out.println(decimal.add(decimal1));
        System.out.println(decimal.subtract(decimal1));
        System.out.println(decimal.multiply(decimal1));
        System.out.println(decimal.divide(decimal1));

    }

    private static void mothed1() {
        //模拟登录三次不许登录
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "admin";
        int count = 0;
        while (count < 3) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("用户名或密码错误！");
                count++;
            }
            if (count == 3) {
                System.out.println("登录失败！");
            }
            System.out.println("您还有" + (3 - count) + "次机会！");
            System.out.println("--------------------------------");

        }
        sc.close();
        System.out.println("程序结束！");
    }
}
