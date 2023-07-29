package builder;

// конкретный билдер окна
public class WindowBuilder implements Builder {
    private Window window;

    public WindowBuilder() {
        this.window = new Window();
    }

    @Override
    public void setWidth(Integer width) {
        window.setWidth(width);
    }

    @Override
    public void setHeight(Integer height) {
        window.setHeight(height);
    }

    @Override
    public void open()  {
        window.open();
    }

    @Override
    public void close()  {
       window.close();
    }
}
