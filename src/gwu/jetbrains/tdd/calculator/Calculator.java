package gwu.jetbrains.tdd.calculator;


public class Calculator {
    private StringProcessor stringProcessor;

    public Calculator(StringProcessor stringProcessor) {
        this.stringProcessor = stringProcessor;
    }

    public StringProcessor getStringProcessor() {

        return stringProcessor;
    }

    public void setStringProcessor(StringProcessor stringProcessor) {
        this.stringProcessor = stringProcessor;
    }

    public long addTwoNumbers(long number1, long number2) {
        return number1 + number2;
    }

    public long addNumbers(Iterable<Long> elements) {
        long result = 0;
        for (long entry : elements) {
            result = this.addTwoNumbers(result, entry);
        }
        return result;
    }

    public long addNumbersInString(String string) {
        return addNumbers(this.stringProcessor.parseString(string));
    }
}
