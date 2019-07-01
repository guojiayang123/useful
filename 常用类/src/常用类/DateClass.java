import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("����������(yyyy-MM-dd) :");
        String str = br.readLine();
        int year = Integer.parseInt(str.substring(0, 4));
        int month = Integer.parseInt(str.substring(5, 7));
        int day = Integer.parseInt(str.substring(8, 10));

        LocalDate inputDate = LocalDate.of(year, month, day);
        inputDate = inputDate.plusDays(7);  
        System.out.println("��FormatStyle.MEDIUM��ʽ�������:" +
                inputDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println();

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("������:" + datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT)));
        System.out.println("�е�����:" + datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
        System.out.println("������:" + datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG)));
        System.out.println("��������:" + datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println();
        System.out.println("���Ϊԭ����1��:" + datetime.plusYears(1));
        System.out.println("�·�Ϊԭ����1��:" + datetime.plusMonths(1));
        System.out.println("����Ϊԭ����1��:" + datetime.plusDays(1));
        System.out.println("СʱΪԭ����1Сʱ:" + datetime.plusHours(1));
    }
}
