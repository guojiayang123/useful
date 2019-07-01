import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringOperator {

    public static int countLetters(String str, char letter) {
        // 统计字母出现的次数
        int appearNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)
                appearNum++;
        }

        return appearNum;
    }

    public static void toUpper(String str) {
        String word = null;
        StringBuilder strB = new StringBuilder();

        Pattern pattern = Pattern.compile("([a-z])([a-z]*)");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            word = matcher.group();
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            strB.append(word).append(" ");
        }
        System.out.println("首字母大写 : " + strB.toString());
    }

   
