package RefactoreSamples;

/**
 * Created by aganezov on 10/22/15.
 * JetBrains GWU
 */

/* Class created via    Ctrl + T -> Push Members Down... in BaseClass*/
public class BaseClassSubclass extends BaseClass {

    /* New constant created by     Ctrl + T -> Extract constant (greet method) */
    public static final String MY_NAME = "My name";

    /* Parameter extracted by Ctrl + T -> Extract Parameter */
    public void greet(String greeting){
        /* Variable extracted by Ctrl + T -> Extract Variable */
        StringBuilder stringBuilder = new StringBuilder();
        /* Variable extracted by Ctrl + T -> Extract Variable */

        /* Method invocation generated by Ctrl + T -> Extract Method */
        /* Parameter added by Ctrl + T (in appendName method) -> Extract parameter */
        /* String substituted by new constant by     Ctrl + T -> Extract constant   */
        appendName(stringBuilder, MY_NAME);
        System.out.println(greeting);
    }

    /* Generated by Ctrl + T -> Extract Method */
    /* Parameter extracted by Ctrl + T -> Extract parameter */
    private void appendName(StringBuilder stringBuilder, String name) {
        /* Variable was inlined by    Ctrl + T -> Inline Variable */
        stringBuilder.append(name.toLowerCase());
    }
}
