package day25_loops;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String s = "abcdabcabc";
        String uniqueChars = ""; //

        for(int i = 0; i < s.length(); i++){

//            if(uniqueChars.contains("" + s.charAt(i))){
//                continue;
//            }

            if(!uniqueChars.contains("" + s.charAt(i))){
                uniqueChars += s.charAt(i);
            }

        }

        System.out.println(uniqueChars);

    }
}
