class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            int n=nums.length;
            Set<Integer> set=new HashSet<>();
            for(int num : nums){
                set.add(num);
            }
            List<Integer> list=new ArrayList<>();
            for(int i=1;i<=n;i++){
               if(!set.contains(i)){
                   list.add(i);
               }
            }
            return list;
    }
}
/*
思路：创建一个哈希数组，将nums里的值加进去，再定义一个集合，在遍历这个范围，如果哈希数组中不包含这个数，就添加进去，输出这个数组
*/
