package filosofia.java.p192.access_control.test;

public class AccessControlTest {
    private String access;

    public AccessControlTest() {
        this.access="protected";
    }

    public String getAccess() {
        return access;
    }

    protected void setAccess(String access) {
        this.access = access;
    }
}
