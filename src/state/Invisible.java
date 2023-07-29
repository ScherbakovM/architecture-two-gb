package state;

public class Invisible implements StateVisibility {

    // состояние при котором наш реакт компонент будет невидимым
    // тут функции которые его приводят к этому визуальному состоянию
    @Override
    public void doAction() {
        System.out.println("set opacity : 0");
        System.out.println("set  width : 0 , height: 0");
        System.out.println("is invisible");
    }
}
