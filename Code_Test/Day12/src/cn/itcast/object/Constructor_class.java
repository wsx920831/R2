package cn.itcast.object;

/**
 * @Author 王嗣鑫
 * @Date 2020/8/9 10:46
 * @Version 1.0
 */
public class Constructor_class {
    public static void main(String[] args) {
        //空字符串
        String s1 = new String();
        
        //传入字符串
        String s2 = new String("hello");
        System.out.println("s2 = " + s2);
        
        //传入byte数组
        byte[] b1 = {97,98,99};
        String s3 = new String(b1);
        System.out.println("s3 = " + s3);
        
        //传入byte数组并进行截取
        String s4 = new String(b1,1,2);
        System.out.println("s4 = " + s4);   
        
        //传入char数组
        char[] c = {'q','w','e','r'};
        String s5 = new String(c,1,3);
        System.out.println("s5 = " + s5);
    }
}
