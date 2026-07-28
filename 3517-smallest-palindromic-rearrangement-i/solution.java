class Solution {
    public String smallestPalindrome(String s) {
        int len=s.length();
        int partition = len / 2;
        char[]chars=s.toCharArray();
        Arrays.sort(chars, 0, partition);
        int j=len-1;
        for (int i = 0; i < partition; i++) {
            chars[j] = chars[i];
            j--;
        }
        
        return new String(chars);
    }
}