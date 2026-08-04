class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s=new HashSet<>();
        for(var i:candyType)
            s.add(i);
        var n=candyType.length/2;
        if(s.size()>=n)
            return n;
        else
            return s.size();
    }
}