package Aufgabe9;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args){

        List<String>
                words
                = Arrays.asList("Hallo", "Informatik-Kurs", "bei","der", "DHBW", "Loerrach");

        List<String> wordLengthList =
                words
                    .stream()
                    .map(word -> word + " (" + word.length()+ ")")
                    .collect(Collectors.toList());

        BinaryOperator<String> reduceToLongest = ((s1, s2) -> s1.length() >= s2.length() ? s1:s2);

        String longestWord =
                words
                    .stream()
                    .reduce(reduceToLongest)
                    .orElse(null);

        BinaryOperator<String> reduceToShortest = ((s1, s2) -> s1.length() <= s2.length() ? s1:s2);

        String shortestWord =
                words
                    .stream()
                    .reduce(reduceToShortest)
                    .orElse(null);

        wordLengthList.forEach(System.out::println);
        System.out.println();
        System.out.println("kuerzestes Wort: " + shortestWord);
        System.out.println("laengstes Wort: " + longestWord);
    }
}
