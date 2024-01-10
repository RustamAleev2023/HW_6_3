import entity.CardDeck;

import java.util.ArrayList;
import java.util.Arrays;

public class PokerComparator {
//   private final String[] CARD_DECK = new String[] {"2Б","3Б","4Б","5Б","6Б","7Б","8Б","8Б","10Б","ВБ","ДБ","КБ","ТБ",
//            "2Т","3Т","4Т","5Т","6Т","7Т","8Т","8Т","10Т","ВТ","ДТ","КТ","ТТ",
//            "2П","3П","4П","5П","6П","7П","8П","8П","10П","ВП","ДП","КП","ТП",
//            "2Ч","3Ч","4Ч","5Ч","6Ч","7Ч","8Ч","8Ч","10Ч","ВЧ","ДЧ","КЧ","ТЧ"};

    private static final ArrayList<String> CARD_DECK = new ArrayList<>(Arrays.asList("2Б", "3Б", "4Б", "5Б", "6Б", "7Б", "8Б", "8Б", "10Б", "ВБ", "ДБ", "КБ", "ТБ",
            "2Т", "3Т", "4Т", "5Т", "6Т", "7Т", "8Т", "8Т", "10Т", "ВТ", "ДТ", "КТ", "ТТ",
            "2П", "3П", "4П", "5П", "6П", "7П", "8П", "8П", "10П", "ВП", "ДП", "КП", "ТП",
            "2Ч", "3Ч", "4Ч", "5Ч", "6Ч", "7Ч", "8Ч", "8Ч", "10Ч", "ВЧ", "ДЧ", "КЧ", "ТЧ"));

    static int compare(String value) {
        int result = 1;
        if (value == null || value.isBlank()) {
            result = -1;
        }
        String[] cards = value.split(" ");
        if (cards.length != 5) {
            result = -2;
        }
        for (int i = 0; i < cards.length; i++) {
            if (!CARD_DECK.contains(cards[i])) {
                result = -3;
            }
        }

        return result;
    }

    static int compare(String s1, String s2) {
        int result = 1;
        if (s1 == null || s1.isBlank() || s2 == null || s2.isBlank()) {
            result = -1;
        }

        return result;
    }

}
