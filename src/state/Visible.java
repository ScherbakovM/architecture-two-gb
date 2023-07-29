package state;

public class Visible implements StateVisibility{

    // состояние при котором наш реакт компонент будет видим
    // тут функции которые его приводят к этому визуальному состоянию
    @Override
    public void doAction() {
        System.out.println("set opacity : 100%");
        System.out.println("set  width : 100%, height: 100%");
        System.out.println("is visible");
    }
}
