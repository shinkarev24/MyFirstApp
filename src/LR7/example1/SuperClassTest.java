package LR7.example1;

public class SuperClassTest {
    final private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    SuperClassTest() {
        this.str1 = null;
    }

    @Override
    public String toString() {
        return "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
    }

    public String getStr1() {
        return str1;
    }
}

