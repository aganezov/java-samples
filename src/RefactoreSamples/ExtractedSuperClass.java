package RefactoreSamples;

/**
 * Created by aganezov on 10/22/15.
 * JetBrains GWU
 */

/* Super Class was created via    Ctrl + T -> Extract Superclass  in BaseClass */
public class ExtractedSuperClass extends SuperClass {
    protected int field1;

    /* Member was pulled from descendant class by    Ctrl + T -> Pull Members Up  */
    AnotherClass anotherClass;
}
