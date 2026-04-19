package Part_05_Nested_Classes;

public class Part_36_NestedClass { // top level class

    static class SampleNestedStaticClass{} // static inner class
    class SimpleInnerClass{} // simple inner class

    void someMethod() {
        class SampleLocalInnerClass {} // local method class
    }

    {
        class SampleLocalInnerClass2 {} // local code block class
    }

    //nested anonymous classes
}
