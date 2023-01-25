package LR7.example2;

public class SuperClassTest2 {
    private String str;
    public int length;

    SuperClassTest2(String value) {
        this.str = value;
        this.length = value.length();
    }

    SuperClassTest2() {
        this.str = null;
        this.length = 0;
    }

    public void setStr(String str) {
        this.str = str;
        this.length = str.length();
    }

    public void setStr() {
        this.str = null;
        this.length = 0;
    }

    public String getStr() {
        return str;
    }
}
