// Solution 1

public class Solution 
{
   public String LCP(ArrayList<String> A)
   {
      int count = 0;
      for(int i=0;i<A.get(0).length();i++)
      {
         char c = A.get(0).charAt(i);
         int j;
         for(int j=1;j<A.size();j++)
         {
            char t = A.get(j).charAt(i);
            if(Character.isWhitespace(t) || t != c) break; 
         }
         if(j == A.size()) count++;
         else break;
      }
      return A.get(0).substring(0,count);
   }
}

// Solution 2
public class Solution 
{
    public String longestCommonPrefix(ArrayList<String> A) 
    {
        if(A.size() == 0) return "";
        if(A.size() == 1) return A.get(0);
        
        int min = Integer.MAX_VALUE;
        
        for(String str : A)
        {
            if(str == "") return "";
            if(str.length() < min) 
                min = str.length();
        }
        int count = 0;
        for(int i=0;i<min;i++)
        {
            char c = A.get(0).charAt(i);
            int j;
            for(j=1;j<A.size();j++)
            {
                char t = A.get(j).charAt(i);
                if(Character.isWhitespace(t) || t != c ) break;
            }
            if(j == A.size()) count++;
            else break;
        }
        return A.get(0).substring(0,count);
    }
}
