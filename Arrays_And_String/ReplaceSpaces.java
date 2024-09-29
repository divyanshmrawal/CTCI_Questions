public class ReplaceSpaces {
    
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        
        // Count the number of spaces within the true length of the string
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        
        // Calculate the new length after replacements
        index = trueLength + spaceCount * 2;
        
        // If there's excess space at the end of the array, adjust the length accordingly
        if (trueLength < str.length) {
            str[trueLength] = '\0'; // End of the true string
        }
        
        // Start replacing from the end
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
    
    public static void main(String[] args) {
        char[] str = "Mr John Smith    ".toCharArray();
        int trueLength = 13; // The true length of the string "Mr John Smith"
        replaceSpaces(str, trueLength);
        System.out.println(str);  // Output: "Mr%20John%20Smith"
    }
}