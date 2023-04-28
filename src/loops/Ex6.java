package loops;

public class Ex6 {

    public static void main(String[] args) {

        //Reverse each word of a sentence

        String sentence="Hi my name is yunus";
        String[] words=sentence.split("\\s+");

        String newSentence="";
        for (String each : words) {
            String reversedWord="";
            for (int i = each.length()-1; i >= 0; i--) {
                reversedWord+=each.charAt(i);
            }
            newSentence+=reversedWord+" ";
        }
        System.out.println(newSentence.trim());





    }
}
