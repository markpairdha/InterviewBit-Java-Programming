//Solution 1

public class Solution 
{
    public int isPalindrome(String A) 
    {
        int start = 0,end = A.length()-1;
        
        while(start < end)
        {
          char head = Character.toLowerCase(A.charAt(start));
          
          if(Character.isLetterOrDigit(head))
          {
              char tail = Character.toLowerCase(A.charAt(end));
              
              if(Character.isLetterOrDigit(tail))
              {
                  if(head == tail)
                  {
                      start++;
                      end--;
                  }
                  else 
                    return 0;
              }
              else
                end--;
          }
          else
             start++;
        }
        return 1;
    }
}


// Solution 2

public class Solution 
{
    public int isPalindrome(String A) 
    {
      char[] arr = A.toLowerCase().toCharArray();
      int i=0,j = arr.length-1;
      
      while(i < j)
      {
          if(!((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= '0' && arr[i] <= '9')))
          {
              i++;continue;
          }
          
          if(!((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= '0' && arr[j] <= '9')))
          {
              j--;continue;
          }
          
          if(arr[i++] != arr[j--]) return 0;
      }
      return 1;
    }
}
