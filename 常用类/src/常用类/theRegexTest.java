import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class theRegexTest {

    public static void binPhoneFormat(String phone) {
        // ���һ���绰�����Ƿ����(0000)0000-0000
        Pattern p1 = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
        Matcher m1 = p1.matcher(phone);

        if (m1.matches())
            System.out.println(phone + "�Ϸ�");
        else
            System.out.println(phone + "���Ϸ�");


    }
    public static void printIpAddress(String str) {
        Pattern p = Pattern.compile("(?=(\\b|\\D))(((\\d{1,2})|(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|" +
                "(1\\d{1,2})|(2[0-4]\\d)|(25[0-5]))(?=(\\b|\\D))");
        Matcher m = p.matcher(str);

        System.out.println("����ip��ַ : ");
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void RepeatLetter(String str) {
        // ѹ���������ֵ��ַ���һ��
        String reptStr = str.replaceAll("(.)(\\1)*", "$1");

        System.out.println("ѹ���� : " + reptStr);
    }

    public static void endWithAbc(String str) {
        // �ж��ַ����Ƿ���abc��β
        Pattern p2 = Pattern.compile("(.)*(abc$)");
        Matcher m2 = p2.matcher(str);
        boolean check = m2.matches();

        if (check == true)
            System.out.println(str + "��abc��β");
        else
            System.out.println(str + "����abc��β");
    }
    //��һ���ַ����е�����������ȡ������������һά�����С����硱ae256dd��w348e6������ȡ��256,348,6��������
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
        // �ı��滻�����ַ��������еġ�pupel���滻Ϊ��pupil����
        Pattern p4 = Pattern.compile(word);
        Matcher m4 = p4.matcher(text);
        String replace = new String();
        replace = m4.replaceAll(repalceWord);
        System.out.println("�滻ǰ : " + text);
        System.out.println("�滻�� : " + replace);
    }
    public static void Cxll(String str) {
        // ��һ���ַ�������ȡ��%cxll=��ͷ���Ҳ���%���ַ�����������%����
        Pattern p5 = Pattern.compile("%CXLL=.*?(?=%)"); // �Ҳ�������һ��%,��Сƥ��
        Matcher m5 = p5.matcher(str);

        System.out.println("��ȡ�� : ");
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
    

   