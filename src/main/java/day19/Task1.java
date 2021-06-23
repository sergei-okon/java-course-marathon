package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws IOException {

        countMaxWords();
    }

    static public void countMaxWords() throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Java\\AlishevMarathon\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        int lenght = stream.available();
        byte[] data = new byte[lenght];
        stream.read(data);

        String text = new String(data);
        String[] words = text.split("[.,:;()?!\"\\s–]+");

        Map<String, Long> wordsCount = new HashMap<>();

        for (String word : words) {
            long countOfWord = wordsCount.get(word) == null ? 0 : wordsCount.get(word);
            wordsCount.put(word, countOfWord + 1);
        }
        System.out.println(wordsCount.get("Чичиков"));

        Map<String, Long> top100 = new LinkedHashMap<>();
        wordsCount.entrySet().stream()
                .sorted((x1, x2) -> Long.compare(x2.getValue(), x1.getValue()))
                .limit(100)
                .forEach(x -> top100.put(x.getKey(), x.getValue()));

        System.out.print(top100);
    }
}

