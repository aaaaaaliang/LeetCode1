class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            Map<String,Integer> map=new HashMap<>();
            int[] counts=new int[list2.length];
            for(int i=0;i<counts.length;i++){
                counts[i]=9999;
            }
            for(int i=0;i<list1.length;i++){
                map.put(list1[i],i);
            }
            for(int i=0;i<list2.length;i++){
                if(map.containsKey(list2[i])){
                    counts[i]=i+map.get(list2[i]);
                }
            }
            int min=9999;
            for(int i=0;i<counts.length;i++){
                min=Math.min(min,counts[i]);
            }
            List<String> list=new ArrayList<>();
            for(int i=0;i<counts.length;i++){
                if(counts[i]==min){
                    list.add(list2[i]);
                }
            }
            return list.toArray(new String[list.size()]);
        }
    }
/*
599. 两个列表的最小索引总和
假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。
示例 1:
输入: list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
输出: ["Shogun"]
解释: 他们唯一共同喜爱的餐厅是“Shogun”。
示例 2:
输入:list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["KFC", "Shogun", "Burger King"]
输出: ["Shogun"]
解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。

思路：创建一个hashmap集合，定义一个int类型的数组名为counts，遍历一遍list1，将list1数组的
值和索引添加进map集合中，遍历一遍list2数组，首先map是否包含list2的值,如果包含，counts的第
i个的值等于list1的索引+list2的索引，遍历counts数组，找到最小值
*/
