package LR7.example1;

class SubClassTest extends SuperClassTest {
    final private String str2;
    final private String str3;

    SubClassTest(String strEx) {
        super(strEx);
        this.str2 = null;
        this.str3 = null;
    }

    SubClassTest(String strEx2, String strEx3) {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    @Override
    public String toString() {
        return "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.getStr2() + "\n" +
                " str 3 = " + this.getStr3();
    }

    public String getStr3() {
        return str3;
    }

    public String getStr2() {
        return str2;
    }
}
