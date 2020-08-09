package cn.itcast.object;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.Arrays;

/**
 * @Author 王嗣鑫
 * @Date 2020/8/9 14:05
 * @Version 1.0
 */
public class String_Method {
    public static void main(String[] args) {
        //获取方法
        String s = new String("Hello World Hello World");
        System.out.println("获取字符串长度：" + s.length());
        System.out.println("获取指定位置字符：" + s.charAt(4));
        System.out.println("查找子串第一次出现的索引值：" + s.indexOf("World"));
        System.out.println("查找子串最后一次出现的索引值：" + s.lastIndexOf("World"));

        //判断方法
        System.out.println("是否以指定字符串结束：" + s.endsWith("rld"));
        System.out.println("判断长度是否为0：" + "".isEmpty());
        System.out.println("是否包含子串：" + s.contains("llo"));
        System.out.println("两个字符串内容是否一致：" + s.equals("hello world hello world"));
        System.out.println("两个字符串内容是否一致(忽略大小写)：" + s.equalsIgnoreCase("hello world hello world"));

        //转换方法
        System.out.println("字符串转字符数组：" + Arrays.toString(s.toCharArray()));
        System.out.println("字符串转byte数组：" + Arrays.toString(s.getBytes()));
        System.out.println("字符串替换：" + s.replace("Hello","Hi"));
        System.out.println("字符串分割：" + Arrays.toString(s.split(" ")));
        System.out.println("字符串截取：" + s.substring(6,11));
        System.out.println("转为大写：" + s.toUpperCase());
        System.out.println("转为小写：" + s.toLowerCase());

        String s1 = new String(" hello  ");
        System.out.println("去空格：" + trim0(s1) + ", 长度：" + trim0(s1).length());

        //从字符串中获取文件名
        String s2 = "D:\\a\\b\\test1.java";
        System.out.println("s2 = " + s2);
        String[] sp = s2.split("\\\\");
        System.out.println("sp = " + Arrays.toString(sp));
        for (int i = 0; i < sp.length; i++) {
            if (sp[i].endsWith("java")){
                System.out.println("文件名提取结果:" + sp[i]);
                break;
            }

        }

        //字符串倒序
        String s3 = "Hello";
        System.out.println("倒序结果: " + reverse(s3));

        //统计子串出现的次数
        String s4 = "javaabcjavacjavapythonjavamatlabjava";
        System.out.println("次数 = " + countSubstring(s4,"j"));
    }

    //自实现trim方法
    public  static String trim0(String s){
        char[] c = s.toCharArray();
        int startIndex = 0;
        int endIndex = c.length;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' '){
                startIndex++;
            }
            else{
                break;
            }
        }
        int index2 = 0;
        for (int i = c.length-1; i >= 0; i--) {
            if (c[i] == ' '){
                endIndex--;
            }
            else{
                break;
            }
        }
        return s.substring(startIndex,endIndex);

    }

    //字符串倒序排列
    public static String reverse(String s){
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length/2; i++) {
            char temp = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = temp;
        }

        return new String(c);
    }

    //统计子串出现的次数
    public static int countSubstring(String s,String s1){
        int count = 0;
        int index = 0;
        while (index < s.length()){
            if (s.indexOf(s1,index) != -1){
                count++;
                index = s.indexOf(s1,index) + s1.length();
            }
            else{
                break;
            }
        }
        return count;
    }


}
