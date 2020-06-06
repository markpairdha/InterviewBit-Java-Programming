//Solution 1
public class Solution 
{
   public String CountAndSay(int n)
   {
      String[] arr = new String[n];
      arr[0] = "1";
      for(int i=1;i<n;i++)
      {
         String old = arr[i-1];
         int j = 0;
         StringBuilder ans = new StringBuilder();
         while(j < old.length())
         {
            char c = old.charAt(j);
            int count = 1;
            j++;
            while(c == old.charAt(j) && j < old.length())
            {
               count++;
               j+++;
            }
            ans.append(new Integer(count).toString());
            ans.append(Character.toString(c);
         }
         arr[i] = ans.toString();
      }
      return arr[n-1];
   }
}

// solution 2 

public class Solution
{
    public String countAndSay(int A) 
    {
        
        if(A <= 0) return "";
        String string = "1";
        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=A;i++)
        {
            char[] chars = string.toCharArray();
            char ch = 0;
            int count = 0;
            for(int j=0;j<chars.length;j++)
            {
                if(j == 0)
                {
                    count = 1;
                    ch = chars[0];
                }
                else if(chars[j] == ch)
                {
                    count++;
                }
                else
                {
                    sb.append(count).append(ch);
                    string = sb.toString();
                    sb.delete(0,sb.length());
                }
            }
        }
        return string;
    }
}
