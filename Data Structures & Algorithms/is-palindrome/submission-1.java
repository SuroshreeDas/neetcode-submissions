class Solution {
    public boolean isPalindrome(String s) {
      int i,high=s.length(),low=0;
      String s1="",s2="";
      StringBuilder cleaned= new StringBuilder(0);
      for(i=0;i<high;i++)
      {
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            cleaned.append(Character.toLowerCase(ch));
        }
      }
      s1=cleaned.toString();
      s2=cleaned.reverse().toString();
      System.out.println(s1);
      System.out.println(s2);
      if(s1.equalsIgnoreCase(s2))
        return true;
    else 
        return false;
    }
}
