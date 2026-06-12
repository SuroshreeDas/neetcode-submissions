class Solution {
    public boolean isAnagram(String s, String t) {
        int i;
        char str1[]=new char[s.length()],str2[]=new char[t.length()];
        if(s.length()!=t.length())
            return false;
        str1=s.toCharArray();
        str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2))
            return true;
        return false;
    }
}
