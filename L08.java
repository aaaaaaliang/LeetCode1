class Solution
    public int titleToNumber(String columnTitle) {
        char[]cs=columnTitle.toCharArray();
        int res=0;
        for(char c:cs ){
            res=res*26+c-'A'+1;
        }
        return res;
    }

/*
题目描述：
a-z 1-26 输入a就是1 输入b就是26  输入ab就是27

思路：找规律比如a-z 是26^0，26^0+1 以此类推，aa-az 就是26^1，26^1+1 类推
*/
