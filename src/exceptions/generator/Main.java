package exceptions.generator;

public class Main {
    public static void main(String[] args) {
        String text = "Java представляет собой язык программирования и платформу вычислений" +
                "Существует множество приложений и вебсайтов, которые не работают при отсутствии установленной Java";
        System.out.println(text);
        MixLetter shuffleLetters = new MixLetter();
        shuffleLetters.isWord(text);
    }
}