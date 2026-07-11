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
        for(int row=0;row<board.length;row+=3)
        {
          for(int col=0;col<board[0].length;col+=3)
          {
            HashSet<Character>set=new HashSet<>();
            for(int i=0;i<3;i++)
            {
              for(int j=0;j<3;j++)
              {
                char ch=board[row+i][col+j];
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
