public class second{
    public static void main(String[] args) {
        System.out.println(Elm("1357", "24689"));
    };
    static String Elm(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int m = word1.length(), n = word2.length(), i = 0;
        while (i < m && i < n) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while(i < m){
            sb.append(word1.charAt(i++));
        };
        while(i <n){
            sb.append(word2.charAt(i++));
        };
        return sb.toString();
     };
};

