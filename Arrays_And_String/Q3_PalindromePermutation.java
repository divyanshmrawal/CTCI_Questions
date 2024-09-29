import java.util.HashMap;

public class PalindromePermutation {
    public static boolean canFormPalindrome(String str) {
        // Create a hash table to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Normalize the string: convert to lowercase and remove spaces
        str = str.toLowerCase().replace(" ", "");

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            // If the character is in the map, increment its count
            // If not, add it to the map with count 1
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Count how many characters have an odd count
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // A string can form a palindrome if there's at most one character with an odd count
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canFormPalindrome("Tact Coa"));  // True
        System.out.println(canFormPalindrome("Hello"));     // False
        System.out.println(canFormPalindrome("A man a plan a canal Panama"));  // True
    }
}
