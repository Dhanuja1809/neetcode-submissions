class Solution {
    public boolean isPalindrome(String s) {
        String cleaned="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                cleaned+=Character.toLowerCase(ch);
            }
        }
        String rev="";
        for(int i=cleaned.length()-1;i>=0;i--)
        {
            char ch=cleaned.charAt(i);
            rev+=ch;        }
            if(cleaned.equals(rev))
            {
                return true;
            }
            return false;
    }
}
