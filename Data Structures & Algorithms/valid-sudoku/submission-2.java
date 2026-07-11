class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<board[0].length;j++)
            {
                char ch=board[i][j];
                if(ch=='.')
                continue;
                if(set.contains(ch))
                return false;
                set.add(ch);
            }
        }
        for(int i=0;i<board[0].length;i++)
        {
            HashSet<Character>set=new HashSet<>();
            for(int j=0;j<board.length;j++)
            {
                char ch=board[j][i];
                if(ch=='.')
                continue;
                if(set.contains(ch))
                return false;
                set.add(ch);
            }
        }
        for(int i=0;i<board.length;i+=3)
        {
            for(int j=0;j<board[0].length;j+=3)
            {
                HashSet<Character>set=new HashSet<>();
                for(int k=0;k<3;k++)
                {
                    for(int l=0;l<3;l++)
                    {
                      char ch=board[k+i][l+j];
                      if(ch=='.')
                      continue;
                      if(set.contains(ch))
                      return false;
                      set.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
