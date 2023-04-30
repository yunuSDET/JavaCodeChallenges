package regexes;

public class Ex10 {

    public static void main(String[] args) {

        //Remove extra spaces between words of a sentence
        String sentence="Hi,    hello,   my  name is   Yunus  ";
        sentence=sentence.replaceAll("\\s+"," ").trim();
        System.out.println(sentence);


    }
}
