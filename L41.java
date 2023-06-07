class Solution {
    public void sortColors(int[] nums) {
     process(nums,0,nums.length-1);

    }
    public static void process(int[] nums,int L,int R){
        if(L==R){
            return;
        }
        int mid=L+((R-L)>>1);
        process(nums,L,mid);
        process(nums,mid+1,R);
        merage(nums,L,R,mid);
    }
    public static void merage(int[] nums,int L,int R,int mid){
        int i=0;
        int p1=L;
        int p2=mid+1;
        int[] help=new int[R-L+1];
    while(p1<=mid && p2<=R){
        help[i++]=nums[p1]<=nums[p2]?nums[p1++]:nums[p2++];
        }
        while(p1<=mid){
            help[i++]=nums[p1++];
        }
        while(p2<=R){
            help[i++]=nums[p2++];
        
        }
        for(int j=0;j<help.length;j++){
            nums[L+j]=help[j];
        }
    
    }
}
/*
给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
必须在不使用库内置的 sort 函数的情况下解决这个问题。
示例 1：
输入：nums = [2,0,2,1,1,0]
输出：[0,0,1,1,2,2]
示例 2：
输入：nums = [2,0,1]
输出：[0,1,2]
思路：归并排序，递归，process方法里面将数组分成有序的两部分，merage里定义了双指针，分别从两个数组从左往右依次遍历，排序，最后返回
*/
