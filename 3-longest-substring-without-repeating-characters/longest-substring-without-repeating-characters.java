class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> h=new HashSet<>();
        int l=0;
        int r=0;
        int m=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(!h.contains(c)){
                h.add(c);
                m=Math.max(m,r-l+1);
                r++;
            }
            else{
                h.remove(s.charAt(l));
                l++;
            }
        }
        return m;
    }
}
