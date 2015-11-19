package gwu.jetbrains.tdd.test;

import gwu.jetbrains.tdd.calculator.StringProcessor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.*;

public class StringProcessorTest {

    private int numbersCount = 4;
    private StringProcessor stringProcessor;

    @Before
    public void setUp() throws Exception {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void testParseString(){
        assertEquals(stringProcessor.parseString("1 2 3 4"), getListOfFourLongs());
    }

    @Test
    public void testParseStringWithNewLineEnding(){
        assertEquals(stringProcessor.parseString("1 2 3 4\n"), getListOfFourLongs());
    }

    private ArrayList<Long> getListOfFourLongs() {
        ArrayList<Long> result = new ArrayList<>();
        for (int i = 1; i <= numbersCount; i++) {
            result.add((long)i);
        }
        return result;
    }

    @Test
    public void testParseStringMultipleSpaces(){
        assertEquals(stringProcessor.parseString("1   2 3 4\n"), getListOfFourLongs());
    }

    @Test
    public void testParseStringEmptyString(){
        assertEquals(stringProcessor.parseString(""), new ArrayList<Long>());
    }
}
