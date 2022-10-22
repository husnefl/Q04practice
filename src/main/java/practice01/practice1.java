package practice01;

public class practice1 {
    public static void main(String[] args){
        //Create a method that joins the given Strings
        // input => "Please", "join", "the", "given", "words"
        // output => "Please join the given words

//String str1= "Please", str2 = "join", str3= "the", str4="given", str5="words";
        System.out.println(joinString("Please", "join", "the", "given", "words"));


    }

    public static String joinString(String... str){

        String sum= "";
        for(String w : str){
            sum = sum + w + " ";
        }
        return sum;

    }
}







