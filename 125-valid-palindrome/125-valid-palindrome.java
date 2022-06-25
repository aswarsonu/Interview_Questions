class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder  str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                str.append(ch);
            }
        }
        String st = str.toString();
        int i=0,j=st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}