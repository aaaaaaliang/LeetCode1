class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
         while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            sb.append(sum % 2);
            carry = sum / 2;
        }
        
        if (carry > 0) {
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}

/*
题目描述：给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。

 

示例 1：

输入:a = "11", b = "1"
输出："100"
示例 2：

输入：a = "1010", b = "1011"
输出："10101"



思路：从后向前遍历，对最后一位进行相加，然后逢2进1
*/
