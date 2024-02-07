package filosofia.java.p269.my_interface.change_test;

public class ChangeClass {
    public static void changeStringByArr(String s) {
        char[] arr = s.toCharArray();
        int time = arr.length / 4;
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < time * 4; i += 4) {

            strBuffer.append(arr[i + 2])
                    .append(arr[i + 3])
                    .append(arr[i])
                    .append(arr[i + 1]);
        }
        if (arr.length % 4 != 0) {
            int remainder = arr.length % 4;
            for (int i = arr.length - 1; i >= time * 4; i--) {
                strBuffer.append(arr[i]);
            }
        }
        System.out.println(strBuffer);
    }

    public static void changeByStringBuilder(String s) {
        StringBuilder changeStr = new StringBuilder(s);
        StringBuilder returnStr = new StringBuilder();

        while (0 < changeStr.length() / 4) {
            returnStr.append(changeStr.subSequence(2, 4))
                    .append(changeStr.subSequence(0, 2));
            changeStr.delete(0, 4);
        }

        if (changeStr.length() % 4 != 0) {
            returnStr.append(changeStr.reverse());
        }
        System.out.println(returnStr);
    }
}
