public class StringToSub {
    public static void main(String[] args) {
        String str = new String("I am a hansome boy!");
        StringBuffer strbb1 = new StringBuffer();
        strbb1.append(str);

        System.out.println("String StringBuffer�໥ת�� : ");
        System.out.println(" ��� : " + strbb1);
        System.out.println();

        
        StringBuffer sb = new StringBuffer("This is a StringBuffer");
        String str1 = sb.toString();
        System.out.println("StringBufferת��ΪString : ");
        System.out.println("toString()���� : " + str1);
        System.out.println();

        StringBuffer sb2 = new StringBuffer("This is my fault!!");

        StringBuffer sb3 = new StringBuffer("I dont't think ");
        sb3.append(sb2);
        System.out.println("��� : " + sb3);

        sb3.insert(25, " big");
        System.out.println("���� : " + sb3);
        sb3.delete(2, 5);
        System.out.println("ɾ�� : " + sb3);
        sb3.reverse();
        System.out.println("ȡ�� : " + sb3);

    }
}