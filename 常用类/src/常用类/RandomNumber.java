import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random r = new Random();

        System.out.println("�����Ϊ : ");
        for (int i = 0; i < 10; i++) {
            num[i] = r.nextInt(100);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        int[] copyNum = new int[10];
        System.arraycopy(num, 0, copyNum, 0, copyNum.length);
        System.out.println("���ƺ�������Ϊ");
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }
        System.out.println();

        System.out.println("���������� : ");
        Arrays.sort(copyNum);
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }

        System.out.println();
        System.out.print("������һ����:");
        Scanner s = new Scanner(System.in);
        int inputNum = s.nextInt();

        int index = Arrays.binarySearch(num, inputNum);
        if (index >= 0)
            System.out.println(inputNum + "�±�Ϊ" + index);
        else
            System.out.println("û�� " + inputNum);
    }
}
