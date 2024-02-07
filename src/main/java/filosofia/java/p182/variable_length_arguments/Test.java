package filosofia.java.p182.variable_length_arguments;

public class Test {
    public static void main(String... s) {
        Main.variableLengthArguments(new String[]{"Яблоко", "Груша", "Арбуз"});
        for (String ss:s) {
            System.out.println(ss);
        }
    }
}
