public class Convert {
    public static void main(String[] args) {

        int num = 100;
        Integer num2 = new Integer(233);
        String str = new String("250");

        // ��װ��������������͵�ת��
        Integer interNum = new Integer(num);  
        int basicNum1 = num2.intValue();  

        // ��װ����ַ�������ת��
        String str1 = num2.toString();  // Integerת��String
        Integer interNum1 = Integer.valueOf(str); // String����תInteger

        // �����������ͺ��ַ�������ת��
        String str3 = Integer.toString(num);  // int����ת��ΪString���ͷ���1

        int basicNum2 = Integer.parseInt(str);  // String����ת��Ϊint���ͷ���1
    }
}