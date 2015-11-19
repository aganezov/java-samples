package gwu.jetbrains.tdd.calculator;

import java.util.ArrayList;

public class StringProcessor {

    public ArrayList<Long> parseString(String string) {
        ArrayList<Long> result = new ArrayList<>();
        for(String value: string.trim().split(" ")){
            if (value.length() == 0){
                continue;
            }
            result.add(Long.parseLong(value));
        }
        return result;
    }
}
