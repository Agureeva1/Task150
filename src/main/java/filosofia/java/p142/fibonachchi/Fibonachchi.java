package filosofia.java.p142.fibonachchi;
/* Напишите метод,
* который получает целочисленный аргумент
* и выводит указанное количество чисел Фибоначчи
 */

public class Fibonachchi {
    public static void main(String[] args) {
        fib(57);
    }

    public static void fib(int n) {
       long [] arr = new long[n];
      if (n>0) arr[0] = 0;
      if (n>1) arr[1] = 1;
      if (n>2) {
        for (int i = 2; i <n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print("; ");

        }
    }
}
