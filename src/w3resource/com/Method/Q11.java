package w3resource.com.Method;

public class Q11 {

    /*
Write a Java method to check whether a string is a valid password. Go to the editor
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
     */
    public static void main(String[] args) {


    }

    private static boolean passwordChecker(String password) {

        char[] letters = password.toCharArray();

        char[] Letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        if (letters.length < 10) {
            return false;
        }

        int digitCount = 0;
        for(int i = 0; i < letters.length; i++){
            for(int j = 0; j < digits.length; j++){
                if(letters[i] == digits[j]){
                    digitCount++;
                    letters[i] = 'z';

                }
            }
        }
        if(digitCount < 2){
            return false;
        }
        for(int i = 0; i < letters.length; i++){
            for(int j = 0; j < Letters.length; j++) {
                if (letters[i] == Letters[j]) {
                    letters[i] = 'z';
                }
            }
        }
        for(int i = 0; i < letters.length; i++){
            if(letters[i] != 'z'){
                return false;
            }
        }
        return true;
    }



}