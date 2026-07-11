class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int longest=0;
        for(int com:set)
        {
if(!set.contains(com-1))
{
    int current=com;
    int length=1;
    while(set.contains(current+1))
    {
        current++;
        length++;
    }

longest=Math.max(longest,length);
}
        }
        return longest;
    }
}
