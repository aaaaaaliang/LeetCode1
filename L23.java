class Solution {
        public String[] findWords(String[] words) {
            String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
            List<String> result = new ArrayList<>();

            for (String word : words) {
                String lowercaseWord = word.toLowerCase();
                if (isWordInRow(lowercaseWord, rows)) {
                    result.add(word);
                }
            }

            return result.toArray(new String[0]);
        }

        private boolean isWordInRow(String word, String[] rows) {
            for (String row : rows) {
                Set<Character> rowSet = new HashSet<>();
                for (char c : row.toCharArray()) {
                    rowSet.add(c);
                }
                boolean isInRow = true;
                for (char c : word.toCharArray()) {
                    if (!rowSet.contains(c)) {
                        isInRow = false;
                        break;
                    }
                }
                if (isInRow) {
                    return true;
                }
            }
            return false;
        }
    }

/*
题目描述：给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。美式键盘 中:
    第一行由字符“qwertyuiop”组成。
    第二行由字符“asdfghjkl”组成。
    第三行由字符“zxcvbnm”组成。
    
思路：遍历字符串，先将三行的单词添加进hashset里面，在遍历字符串，判断是否包含
    */
