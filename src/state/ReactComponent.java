package state;

public class ReactComponent {
    private StateVisibility visibility;


    // реакт компонент принимает состояние visible / invisible
    public ReactComponent(StateVisibility visibility) {
        this.visibility = visibility;
    }

    public void setVisibility(StateVisibility visibility) {
        this.visibility = visibility;
    }
    public  void doAction() {
        visibility.doAction();
    }
}
