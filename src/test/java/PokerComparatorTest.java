import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PokerComparatorTest {

    @Test
    void whenNullThanMinusOne(){
        int actual = PokerComparator.compare(null);
        int expected = -1;
        assertEquals(expected, actual);
    }
    @Test
    void whenBlinkThanMinusOne(){
        int actual = PokerComparator.compare("");
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void whenSpaceThanMinusOne(){
        int actual = PokerComparator.compare(" ");
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void whenTwoBlinkStringThanMinusOne(){
        int actual = PokerComparator.compare("", "");
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void whenCardsLessFiveThanMinusTwo(){
        int actual = PokerComparator.compare("6Т");
        int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    void whenFiveCardsWithWrongCardThanMinusThree(){
        int actual = PokerComparator.compare("ПТ 7Б ТП 3Б ВБ");
        int expected = -3;
        assertEquals(expected, actual);
    }

    @Test
    void whenFiveGoodCardsThanOne(){
        int actual = PokerComparator.compare("10П 10Т 8П 10Ч 8Т");
        int expected = 1;
        assertEquals(expected, actual);
    }
}