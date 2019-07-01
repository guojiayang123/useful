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
    

   