//Question-->
// Implement an algorithm to determine if a string has all unique characters, what if you cannot use additional data structure?

//Answer-->
public class Q1_Unique_characters_in_String {
public static void main(String[] args) {
    boolean checker (String str){
    if(str.length()>128){
        return false;
    }

    boolean[] arr=new boolean[128];
    for(int i=0;i<str.length();i++){
        int num=str.charAt(i);
        if(arr[str.charAt(i)]){
            return false;
        }
        else {
            arr[num]=true;
        }
    }
    return true;
}
}
}