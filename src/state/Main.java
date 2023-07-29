package state;

public class Main {
    public static void main(String[] args)  {
        Visible visible = new Visible();
        Invisible invisible = new Invisible();
        ReactComponent button = new ReactComponent(visible);
        button.doAction();
        System.out.println("\nМеняем состояние\n");
        button.setVisibility(invisible);
        button.doAction();
    }
}

// В зависимости от состояния мы можем использовать разные методы