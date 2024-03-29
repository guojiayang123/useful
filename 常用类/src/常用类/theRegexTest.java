import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class theRegexTest {

    public static void binPhoneFormat(String phone) {
        // 检查一个电话号码是否符合(0000)0000-0000
        Pattern p1 = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
        Matcher m1 = p1.matcher(phone);

        if (m1.matches())
            System.out.println(phone + "合法");
        else
            System.out.println(phone + "不合法");


    }
    public static void printIpAddress(String str) {
        Pattern p = Pattern.compile("(?=(\\b|\\D))(((\\d{1,2})|(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|" +
                "(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))(?=(\\b|\\D))");
        Matcher m = p.matcher(str);

        System.out.println("所有ip地址 : ");
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void RepeatLetter(String str) {
        // 压缩连续出现的字符成一个
        String reptStr = str.replaceAll("(.)(\\1)*", "$1");

        System.out.println("压缩后 : " + reptStr);
    }

    public static void endWithAbc(String str) {
        // 判断字符串是否以abc结尾
        Pattern p2 = Pattern.compile("(.)*(abc$)");
        Matcher m2 = p2.matcher(str);
        boolean check = m2.matches();

        if (check == true)
            System.out.println(str + "以abc结尾");
        else
            System.out.println(str + "不以abc结尾");
    }
    //将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数
    public static void IntegerToArray(String str) {
        Pattern p3 = Pattern.compile("(\\d)+");
        Matcher m3 = p3.matcher(str);

        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer Num = new Integer(0);

        while (m3.find()) {
        	Num = Integer.valueOf(m3.group());
            ((ArrayList) list).add(Num);
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void textReplace(String text, String word, String repalceWord) {
        // 文本替换：将字符串中所有的”pupel”替换为”pupil”。
        Pattern p4 = Pattern.compile(word);
        Matcher m4 = p4.matcher(text);
        String replace = new String();
        replace = m4.replaceAll(repalceWord);
        System.out.println("替换前 : " + text);
        System.out.println("替换后 : " + replace);
    }
    public static void Cxll(String str) {
        // 从一个字符串中提取以%cxll=开头，右部是%的字符串（不包含%）。
        Pattern p5 = Pattern.compile("%CXLL=.*?(?=%)"); // 右部必须有一个%,最小匹配
        Matcher m5 = p5.matcher(str);

        System.out.println("提取后 : ");
        while (m5.find()) {
            System.out.println(m5.group());
        }
    }
    public static void main(String[] args) {
    	binPhoneFormat("(1350)6500-1140");
        binPhoneFormat("1234-56789-1011");

        printIpAddress("Ip1 : 192.118.1.1, Ip2 : 1.10.10.100, WrongIp : 210.100.14.250");
        
        RepeatLetter("aaabbcccddd1123.");

        endWithAbc("ababc");
        endWithAbc("abcabcd");
        IntegerToArray("ae256dd-w348e6");
        textReplace("pupel I love you", "pupel", "pig");
        String cxll = "%...%CXLL=0001,01,103,123%CXLL=hhh2,31,114%CXLL=7127.33.1%LL=-o21.11";
        Cxll(cxll);
    }
}
    

   