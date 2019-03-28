package exceptions.generator;

import java.util.Random;

public class MixLetter {

    public void isWord(String text) {
        Random random = new Random();
        for (String splited : text.split("\\s+")) {
            char[] buf = splited.toCharArray();
            for (int i = 1; i < buf.length - 1; ++i) {
                int j = random.nextInt(buf.length - 2);
                char t = buf[i];
                buf[i] = buf[j];
                buf[j] = t;
            }
            System.out.print(new String(buf) + " ");
        }
    }

}