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
题目描述：a-z对应1-26 aa就是28以此类推

思路：找规律比如a-z 是26^0，26^0+1 以此类推，aa-az 就是26^1，26^1+1 类推
*/
