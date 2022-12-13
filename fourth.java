public class fourth {
    public static void main(String[] args) {
        System.out.println(  isPalindrome("mom"));
    }
    public static boolean isPalindrome (String s) {
        if(s.length()==0){
            return true;}
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            while (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;}
            while (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;}
        if(left > right)
            break;
        if (s.charAt(left) != s.charAt(right))
            return false;
        else {
            right--;
            left++;}
        }
    return true;
    };
}


