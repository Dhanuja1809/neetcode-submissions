class Solution {
    public boolean isAnagram(String s, String t) {
 if(s.length()!=t.length())
 {
    return false;
 }
 int[]freq1=new int[26];
 int[]freq2=new int[26];
 for(int i=0;i<s.length();i++)
 {  char ch=s.charAt(i);
    freq1[ch-'a']++;
 }
 for(int i=0;i<t.length();i++)
 {
    char ch1=t.charAt(i);
    freq2[ch1-'a']++;
 }
 if(Arrays.equals(freq1,freq2))
 {
    return true;
 }
 return false;
    }
}
