//QUESTION-->
//String Compression: Implement a method to perform basic string compression using the counts
// of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
// "compressed" string would not become smaller than the original string, your method should return
// the original string. You can assume the string has only uppercase and lowercase letters (a - z). 

//ANSWER-->
public class Q6_StringCompression {

    public static String helper(String str) {
        StringBuilder ans = new StringBuilder();
        //variable to store total repeating numbers
        int count = 0;

        //for loop to reads all possible elements
        for (int i = 0; i < str.length(); i++) {
            count++;

      //if character is not equal then insert it in ans string
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                ans.append(str.charAt(i));
                ans.append(count);
                //reset for other count
                count = 0; 
            }
        }
        
        return ans.length() < str.length() ? ans.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(helper("hhhello")); //not-working
        System.out.println(helper("a"));       
        System.out.println(helper("aaabbb"));  
    }
}
