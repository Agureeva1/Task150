package filosofia.java.p182.variable_length_arguments;

/* Напишите метод,
* получающий список аргументов переменной длинны с массивом String.
* Убедитесь в том, что этому методу может передаваться в качестве аргумента
* как список объектов String, разделенные запятой, так и массив String.
 */
/* Напишите метод main(),
* использующий список аргументов переменной длинны
* вместо обычного синтаксиса.
 */
public class Main {

    public static void main(String[] args) {
        String [] arr = {"Пончик","Булочка", "Батон"};
        variableLengthArguments("Огурец","Помидор", "Лук");
        variableLengthArguments(new String[]{"Яблоко","Груша", "Арбуз"});
        variableLengthArguments(arr);
    }

    public static void variableLengthArguments(String ...arr) {
        for (String s:arr) {
            System.out.println("Это " + s);
        }

    }
}
