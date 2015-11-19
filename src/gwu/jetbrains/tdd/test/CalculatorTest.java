package gwu.jetbrains.tdd.test;


import gwu.jetbrains.tdd.calculator.Calculator;
import gwu.jetbrains.tdd.calculator.StringProcessor;
import org.easymock.
        EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {


    private Calculator calculator;
    private int arrayElementCount = 4;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(new StringProcessor());
    }

    @Test
    public void addTwoNumbers() {
        assertEquals(11, calculator.addTwoNumbers(5, 6));
    }

    @Test
    public void addTwoNumbersReallyBigNumbers() {
        assertEquals(new Long(Integer.MAX_VALUE) + new Long(Integer.MAX_VALUE),
                calculator.addTwoNumbers(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void addNumbersInArray() {
        assertEquals(10, calculator.addNumbers(getListOfElementsToSum()));
    }

    private ArrayList<Long> getListOfElementsToSum() {
        ArrayList<Long> elements = new ArrayList<>();
        for (int i = 1; i <= arrayElementCount; i++) {
            elements.add((long) i);
        }
        return elements;
    }

    /*
    Integration test with a Top --> Down approach
     */
    @Test
    public void addNumbersInString() {
        StringProcessor mock = EasyMock.createMock(StringProcessor.class);
        EasyMock.expect(mock.parseString("1 2 3 4")).andReturn(this.getListOfElementsToSum());
        EasyMock.replay(mock);
        this.calculator.setStringProcessor(mock);
        assertEquals(calculator.addNumbersInString("1 2 3 4"), 10);
    }

    /*
    Behavioural test 1
     */
    @Test
    public void addNumberFromFileCaseOne() {
        behaviouralTest("case1.txt", new long[]{10L, 15L, 6L});
    }

    /*
    Behavioural test 1
     */
    @Test
    public void addNumberFromFileCaseTwo() {
        behaviouralTest("case2.txt", new long[]{0L, 4L, 0L});
    }

    private void behaviouralTest(String caseFileName, long[] expectedResult) {
        try {
            List<String> strings = getPathToCaseFile(caseFileName);
            for (int i = 0; i < expectedResult.length; i++) {
                assertEquals(calculator.addNumbersInString(strings.get(i)), expectedResult[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            fail();
        }
    }

    private List<String> getPathToCaseFile(String case_file) throws IOException {
        String currentPath = CalculatorTest.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        return Files.readAllLines(Paths.get(currentPath, "gwu", "jetbrains", "tdd", "test", "data", case_file));
    }

}
