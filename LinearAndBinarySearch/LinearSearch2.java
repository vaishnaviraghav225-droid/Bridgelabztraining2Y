package LinearAndBinarySearch;
public class LinearSearch2 {

    public static String searchWord(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                return sentences[i];
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is easy to learn",
                "Python is a programming language",
                "I am learning Java",
                "C++ is also popular"
        };

        String word = "Java";

        String result = searchWord(sentences, word);

        System.out.println(result);
    }
}