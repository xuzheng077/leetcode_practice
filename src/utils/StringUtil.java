package utils;

/**
 * @author Xu Zheng
 * @description
 */
public class StringUtil {
    public static String reverseString(String string){
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
