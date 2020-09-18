package everyday;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xu Zheng
 * @description
 */
public class MinLetterDeletion {
    public static void main(String[] args) {
        String s = "badabpzib";
        String result = deleteMinLetter(s, 3);
        System.out.println(result);
    }

    public static String deleteMinLetter(String s, int k) {
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 97]++;
        }
        int sum = 0;
        int offset = 0;
        char stopAt = 0;
        for (int i = 0; i < letters.length; i++) {
            if (sum + letters[i] >= k) {
                offset = k - sum;
                stopAt = (char) (i + 97);
                break;
            } else {
                sum = sum + letters[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < stopAt) {
                //do nothing
            } else if (s.charAt(i) == stopAt) {
                if (offset > 0) {
                    offset--;
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
