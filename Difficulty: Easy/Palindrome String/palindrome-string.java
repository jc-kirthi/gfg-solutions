class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(sb.reverse().toString()))
        return true;
        else
        return false;
    }
}