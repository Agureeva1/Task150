package filosofia.java.p126.logical_comparison;

/* Напишите метод,
 * который получает два аргумента String,
 * выполняет с ними операции логического сравнения и выводит результат.
 * Также выполните проверку equals().
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.logicalComparison("Hello", "One");
        main.logicalComparison("One", "One");
    }
    /**
     * Метод выводит в консоль результат сравнения двух переменных типа String по средствам:
     * equals() и !equals();
     * ("строка" + a) == b и ("строка" + a) != b;
     * ("строка" + a == b) и ("строка" + a == b);
     * оператора сравнения == и !=
     *
     * @param a,b - параметры типа String, которые сравниваются между собой
     *            через метод equals() и логические операторы
     * @return - метод ничего не возвращает
     */
    public void logicalComparison(String a, String b) {
        System.out.println("a - " + a + "; b - " + b);
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("!a.equals(b): " + !a.equals(b));
        System.out.print("(\"a==b: \" + a)==b: ");
        System.out.println(("a==b: " + a) == b);
        System.out.print("(\"a!=b: \" + a)!=b: ");
        System.out.println(("a!=b: " + a) != b);
        System.out.print("\"a==b: \" + a==b: ");
        System.out.println("a==b: " + a == b);
        System.out.print("\"a!=b: \" + a!=b: ");
        System.out.println("a!=b: " + a != b);
        System.out.print("a==b: ");
        System.out.println(a == b);
        System.out.print("a!=b: ");
        System.out.println(a != b);
        System.out.println("");

    }
}
