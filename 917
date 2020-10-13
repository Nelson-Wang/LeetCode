package learn;

/**
 * Created by wWX945273 on 2020/10/13.
 */


/**
 917. Reverse Only Letters

 Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 Example 1:

 Input: "ab-cd"
 Output: "dc-ba"
 Example 2:

 Input: "a-bC-dEf-ghIj"
 Output: "j-Ih-gfE-dCba"
 Example 3:

 Input: "Test1ng-Leet=code-Q!"
 Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class Solution917 {
    public String reverseOnlyLetters(String S) {
        int length = S.length();
        char[] chars = new char[length];
        for (int i=0; i<length; i++){
            if (!(S.charAt(i)>='A' && S.charAt(i)<='Z' || S.charAt(i)>='a' && S.charAt(i)<'z')){
               chars[i] = S.charAt(i);
            }
        }
        int k = 0;

        for (int j=length-1; j>=0; j--){
            if (chars[k]!='\u0000'){
                k++;
            }
            if (S.charAt(j)>='A' && S.charAt(j)<='Z' || S.charAt(j)>='a' && S.charAt(j)<'z'){
                chars[k] = S.charAt(j);
                k++;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution917 solution917 = new Solution917();
//        String S = "Test1ng-Leet=code-Q!";
        String S = "a-bC-dEf-ghIj";
        System.out.println(solution917.reverseOnlyLetters(S));
    }
}
