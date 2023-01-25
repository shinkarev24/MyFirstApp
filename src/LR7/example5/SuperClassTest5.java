package LR7.example5;

public class SuperClassTest5 {
    protected String text;

    public SuperClassTest5(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperClassTest5{" + "text='" + text + '\'' + '}';
    }
}
