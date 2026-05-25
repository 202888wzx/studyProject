package com.wangzx.mode;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AipStudy {
    public static void main(String[] args) throws IOException {
//        Mode1String();
//        Mode2Runtime();
    }

    private static void Mode2Runtime() throws IOException {
        Runtime runtime = Runtime.getRuntime();
//        runtime.exit(0);
        int processors = runtime.availableProcessors();
        long maxMemory = runtime.maxMemory();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        Process process = runtime.exec("calc.exe");
        System.out.println(processors);
        System.out.println(maxMemory);
        System.out.println(totalMemory);
        System.out.println(freeMemory);
    }

    private static void Mode1String() {
        //当前时间戳
        System.out.println(System.currentTimeMillis());
        //打印当前时间
        System.out.println(new Date());
        //年月日 时分秒
        System.out.println(new Date().toLocaleString());
        //格式化format YYYY-MM-DD HH:MM:SS
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String formattedDate = sdf.format(new Date());
        System.out.println(formattedDate);
//        System.exit(0);
        System.out.println(666);
    }
}
