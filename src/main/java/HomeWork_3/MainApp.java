package HomeWork_3;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        String[] words = new String[] {"свекла", "картошка", "морковь", "свекла", "укроп", "петрушка", "щавель",
                "морковь", "укроп", "свекла", "картошка", "сельдерей", "петрушка",
                "морковь", "щавель", "картошка", "лук", "укроп", "свекла", "сельдерей"
        };

        System.out.print("Массив с набором слов:\n");
        for (String arr : words) {
            System.out.print(arr + ", ");
        }

        Set<String> setUniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("\nУникальные слова из вышеуказанного массива:\n" + setUniqueWords);

        Map<String, Integer> wordsCount = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            Integer count = wordsCount.getOrDefault(words[i], 0);
            wordsCount.put(words[i], count + 1);
        }

        System.out.println("Количество раз, когда повторяется каждое слово:\n" + wordsCount);

        System.out.println("\nТелефонный справочник:");

        TelephoneBook TelBook = new TelephoneBook();
        TelBook.add("Абрамов", "8(495)781-20-87");
        TelBook.add("Баранов", "8(495)315-29-20");
        TelBook.add("Баранов", "8(903)108-55-10");
        TelBook.add("Винников", "8(495)615-15-88");
        TelBook.add("Гладилина", "8(495)313-96-14");
        TelBook.add("Данилов", "8(495)718-36-46");
        TelBook.add("Емельянов", "8(495)909-16-77");
        TelBook.add("Жахов", "8(495)564-19-73");
        TelBook.add("Закирова", "8(495)479-64-14");
        TelBook.add("Игнатов", "8(495)647-37-11");
        TelBook.add("Котов", "8(495)777-66-55");
        TelBook.add("Котов", "8(926)515-71-17");
        TelBook.add("Котов", "8(915)308-22-33");

        TelBook.get();

        TelBook.get("Абрамов");
        TelBook.get("Баранов");
        TelBook.get("Котов");
    }
}
