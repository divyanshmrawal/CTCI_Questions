public class Q5_One_Away{

    
    public static boolean checking_length(String str1,String str2){
     if(str1.length()==str2.length()){
         return replacingstr(str1,str2);
     }

     else if(str1.length()+1==str2.length()){
        return changingstr(str1,str2);
     }

     else if(str1.length()-1==str2.length()){
        return changingstr(str2,str1);
     }
return false;
    }

    public static boolean replacingstr(String str_1,String str_2){
        boolean trackDifference=false;
        for(int i=0;i<str_1.length();i++){
            if(str_1.charAt(i)!=str_2.charAt(i)){
                if(trackDifference){
                    return false;
                }
                trackDifference= true;
                
            }
        }
        return true;
    }

   public static boolean changingstr(String str_1,String str_2){
        int num1 = 0;
        int num2 = 0;

        while (num1<str_1.length() && num2<str_2.length()) {
            if(str_1.charAt(num1)!=str_2.charAt(num2)){
                if(num1!=num2){
                    return false;
                }
                num2++;
            }
            else{
                num1++;
                num2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
System.out.println(checking_length("Pale","Pal"));
    }
}