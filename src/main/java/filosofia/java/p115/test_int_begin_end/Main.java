package filosofia.java.p115.test_int_begin_end;

/* Измените метод test так,
 * чтоб он получал два дополнительных числовых параметра (begin, end)
 * и проверял принадлежность значения testval к диапозону [begin, end].
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(testString(2, -3, 0, 5));
        System.out.println(testString(2, 2, 5, -5));
        System.out.println(testString(2, 3, -1, -5));
        System.out.println(testInt(1, 1, -9, 10));
        System.out.println(testInt(1, 3, -9, 10));
    }

    static int test(int testval, int target) {
        if (testval > target)
            return +1;
        else if (testval < target)
            return -1;
        else
            return 0;
    }

    static String testString(int testResult, int tar, int begin, int end) {
        String s;
        if (testResult >= begin) {
            s = "[" + test(testResult, tar);
        } else {
            s = "] " + test(testResult, tar);
        }
        if (testResult <= end) {
            s += "]";
        } else {
            s += " [";
        }
        return s;
    }

    static int testInt(int testInt, int tarInt, int beginInt, int endInd) {
        if (testInt >= beginInt && testInt <= endInd)
            return test(testInt, tarInt);
        else
            return 100;
    }
}
