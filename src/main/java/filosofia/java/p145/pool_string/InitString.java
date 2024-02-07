package filosofia.java.p145.pool_string;

public class InitString {
    private String str1 = "Hello";
    private String str2;
    private String str3;

    public InitString(String str3) {
        this.str2 = "Hello";
        this.str3 = str3;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
