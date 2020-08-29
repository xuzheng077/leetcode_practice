package everyday;

import utils.StringUtil;

/**
 * @author Xu Zheng
 * @description
 */
public class shortestPalindrome {
    public static String shortestPalindrome(String s) {
        if (s == null){
            return null;
        }
        if(s.length() == 0){
            return "";
        }
        //求s最长的回文前缀，在reversed s中从后面砍掉这个最长回文前缀，把剩下的部分加到s的前面，返回
        //求最长回文前缀的时候，在这里可以简化一下，直接比较反转前后的字符串的前缀和后缀是否相同就可以了
        String reversed = StringUtil.reverseString(s);
        for(int i=s.length();i>=1;i--){
            if(s.substring(0,i).equals(reversed.substring(s.length()-i))){
                return reversed.substring(0,s.length()-i) + s;
            }
        }
        return reversed.substring(0,s.length()-1) + s;
    }

    public static void main(String[] args) {
        String str = "abcd";
        String str_1 = "aacecaaa";
        System.out.println(shortestPalindrome(str));
        System.out.println(shortestPalindrome(str_1));
    }
}
