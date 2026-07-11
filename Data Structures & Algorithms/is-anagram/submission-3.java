class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length())
     {
    return false;
     }
     int freq[]=new int[26];
     int freq1[]=new int[26];
     for(int i=0;i<s.length();i++)
     {  char ch=s.charAt(i);
        freq[ch-'a']++;
     }
     for(int i=0;i<t.length();i++)
     {
        char ch=t.charAt(i);
        freq1[ch-'a']++;
     }
     if(Arrays.equals(freq,freq1))
     {
        return true;
     }
     return false;
    }
}
