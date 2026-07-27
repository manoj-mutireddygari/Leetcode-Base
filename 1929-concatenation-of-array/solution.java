class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[]new_list=new int[len*2];
        int i=2;
        int a=0;
        while(i>=1){
            for(int j=0;j<len;j++){
                new_list[a]=nums[j];
                a++;
            }
            i--;
        }
        return new_list;
    }
}