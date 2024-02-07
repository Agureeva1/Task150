package filosofia.java.p290.inner_class.link_test;

public class NewString {
    String s1;
    String s2;
    String s3;

 public NewString ( String s1, String s2, String s3) {
     this.s1=s1;
     this.s2=s2;
     this.s3=s3;
 }

    @Override
    public String toString() {
        return "NewString{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                '}';
    }
}
