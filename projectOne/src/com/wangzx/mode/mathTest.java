package com.wangzx.mode;

public class mathTest {
    public static void main(String[] args) {

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
//细节:
//方法在底层跟之前一样也会创建文本解析器的对象
//然后从头开始去读取字符串中的内容，只要有满足的，那么就切割。
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //用正则表达式判断字符串首尾字符是否相同
        String s1 = "abcba";
        boolean b = s1.matches("([\\w&&[^_]])+\\1");

//        extracted();
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("aaa123aab".matches(regex3));

    }

    private static void extracted() {
        // public static int abs(int a)         返回参数的绝对值
        System.out.println("-2的绝对值为：" + Math.abs(-2));
        System.out.println("2的绝对值为：" + Math.abs(2));

        // public static double ceil(double a)  返回大于或等于参数的最小整数
        System.out.println("大于或等于23.45的最小整数位：" + Math.ceil(23.45));
        System.out.println("大于或等于-23.45的最小整数位：" + Math.ceil(-23.45));

        // public static double floor(double a) 返回小于或等于参数的最大整数
        System.out.println("小于或等于23.45的最大整数位：" + Math.floor(23.45));
        System.out.println("小于或等于-23.45的最大整数位：" + Math.floor(-23.45));

        // public static int round(float a)     按照四舍五入返回最接近参数的int
        System.out.println("23.45四舍五入的结果为：" + Math.round(23.45));
        System.out.println("23.55四舍五入的结果为：" + Math.round(23.55));

        // public static int max(int a,int b)   返回两个int值中的较大值
        System.out.println("23和45的最大值为: " + Math.max(23, 45));

        // public static int min(int a,int b)   返回两个int值中的较小值
        System.out.println("12和34的最小值为: " + Math.min(12, 34));

        // public static double pow (double a,double b)返回a的b次幂的值
        System.out.println("2的3次幂计算结果为: " + Math.pow(2, 3));

        // public static double random()返回值为double的正值，[0.0,1.0)
        System.out.println("获取到的0-1之间的随机数为: " + Math.random());
        //打印所有水仙花数
        for (int i = 100; i < 1000; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;
            if (i == hundreds * hundreds * hundreds + tens * tens * tens + units * units * units) {
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
