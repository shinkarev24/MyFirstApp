package LR7.example3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new SuperClassTest3(42));
        System.out.println(new InheritedClass(42, 'F'));
        System.out.println(new FinalClass(42, 'F', "text"));

        var sup = new SuperClassTest3(42);
        var inherited = new InheritedClass(42, 'F');
        var finalObject = new FinalClass(42, 'F', "text");

        sup.setValue(43);
        inherited.setValue(43, 'A');
        finalObject.setValue(43, 'A', "test text");

        System.out.println(sup);
        System.out.println(inherited);
        System.out.println(finalObject);
    }
}

class InheritedClass extends SuperClassTest3 {
    public char character;

    public InheritedClass(int value, char character) {
        super(value);
        this.character = character;
    }

    public void setValue(int value, char character) {
        this.value = value;
        this.character = character;
    }

    @Override
    public String toString() {
        return "InheritedClass{" + "character=" + character + ", value=" + value + '}';
    }
}

final class FinalClass extends InheritedClass {
    public String text;

    public FinalClass(int value, char character, String text) {
        super(value, character);
        this.text = text;
    }

    public void setValue(int value, char character, String text) {
        this.value = value;
        this.character = character;
        this.text = text;
    }

    @Override
    public String toString() {
        return "FinalClass{" + "text='" + text + '\'' + ", character=" + character + ", value=" + value + '}';
    }
}