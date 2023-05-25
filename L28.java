class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack=new Stack<>();
      for(char c:s.toCharArray()){
       if(c=='('||c=='{'||c=='['){
           stack.push(c);
       }
       else if(c==')'||c=='}'||c==']'){
       if(stack.isEmpty()||!isMatch(stack.peek(),c)){
           return false;
       }
       stack.pop();
       }
      }
      return stack.isEmpty();
    }
    public static boolean isMatch(char left,char right){
      return (left=='('&&right==')')||(left=='{'&&right=='}')||(left=='['&&right==']');
    }
}
/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。
示例 1：
输入：s = "()"
输出：true
示例 2：
输入：s = "()[]{}"
输出：true
示例 3：
输入：s = "(]"
输出：false

思路：创建栈，循环遍历字符串，定义一个方法判断符号是否匹配，如果满足{([里的一个，就添加进栈，如果是}])里的一个，
判断栈里的首个元素是否为空，如果为空或不满足定义里的方法的条件的时候，返回false，否则就将它弹出，最后只需要判断
这个栈是否为空就行
*/
