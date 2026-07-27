class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        int max=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int product=(nums[i]-1)*(nums[j]-1);
                if(max<product){
                    max=product;
                }
            }
        }
        return max;
    }
}