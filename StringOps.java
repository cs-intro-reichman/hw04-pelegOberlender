public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("One two tHRee world"));
        
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        for(int i = 0; i < string.length(); i++) {
            char charCurrent = string.charAt(i);
            if(charCurrent == 'a' || charCurrent == 'e'|| charCurrent == 'i'|| charCurrent == 'o' || charCurrent == 'u') {
            newString += (char)(charCurrent - 32); 
            }   
            else if (charCurrent >= 65 && charCurrent <= 90) {
                newString += (char)(charCurrent + 32); 
            } 
            else {
                newString += charCurrent;  
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        String newString = "";
        int indexChar = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                newString += (char)(string.charAt(i) + 32); 
            } else if {
                newString += string.charAt(i);
            } else if (string.charAt(i) == 32 && string.charAt(i+1) >= 97 && string.charAt(i+1) <= 122) {
                newString += (char)(string.charAt(i) - 32);
            }
            }
            
        }
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
