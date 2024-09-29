//QUESTION-->
//Given two String , write a method to decide if one is a permutation of the other.

//ANSWER-->
import java.util.Arrays;

public class Q2_Check_Permutation {

    public static void main(String[] args) {

        // Creating 2 string for example
        String str1 = "abc";
        String str2 = "ac";

        // Storing lengths of 2 strings in 2 variables
        int s1l = str1.length();
        int s2l = str2.length();

        // Checking if string1 length is equals to string2 length or not


        // Sorting two arrays
        char[] astr1 = str1.toCharArray();
        Arrays.sort(astr1);

        char[] astr2 = str2.toCharArray();
        Arrays.sort(astr2);

        //printing result
        System.out.println(Arrays.equals(astr1, astr2));    }
}