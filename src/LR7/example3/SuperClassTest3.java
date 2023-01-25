package LR7.example3;

public class SuperClassTest3 {
    protected int value;

    public SuperClassTest3(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperClassTest3{" + "value=" + value + '}';
    }
}
