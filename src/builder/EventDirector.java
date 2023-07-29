package builder;
// Дирректор запускает одним методом createWindow все методы WindowBuilder
public class EventDirector {
    private WindowBuilder windowBuilder;

    public EventDirector(WindowBuilder windowBuilder) {
        this.windowBuilder = windowBuilder;
    }

    public  void createWindow(Integer width, Integer height, boolean arg)  {
        windowBuilder.setWidth(width);
        windowBuilder.setHeight(height);
        if (arg)  {
            windowBuilder.open();
        }
        else {
            windowBuilder.close();
        }
    }

    public void setVisibility(boolean arg) {
        if (arg) windowBuilder.open();
        else {
            windowBuilder.close();
        }
    }
}
