package gwu.jetbrains.refactoring;

/**
 * Created by aganezov on 10/22/15.
 * JetBrains GWU
 */


public class BaseClassSubclass extends BaseClass<String, String> {


    public static final String MY_NAME = "My name";


    public void greet(String greeting){

        StringBuilder stringBuilder = new StringBuilder();

        appendName(stringBuilder, MY_NAME);
        System.out.println(greeting);
    }


    private void appendName(StringBuilder stringBuilder, String name) {

        stringBuilder.append(name.toLowerCase());
    }
}
