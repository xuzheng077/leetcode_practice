package everyday;

/**
 * @author Xu Zheng
 * @description
 */
public class reverseWords {
    public static String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        if(s.length() == 0){
            return "";
        }
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        String result = reverseWords(str);
        System.out.println(result);
    }
}
