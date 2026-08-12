class Solution {
    public int lengthOfLastWord(String s) {
        char []arr=s.toCharArray();
        int t =arr.length;
        int count=0;
        while(t>0){
            if(arr[t]==' '){
                    t--;
            }else if(arr[t]!=' '){
                while(t >= 0 && arr[t]!=' '){
                    count++;
                    t--;
                }
                break;
            }
        }
        return count;
    }
}