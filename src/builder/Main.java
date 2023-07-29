package builder;

public class Main {
    public static void main(String[] args)  {
        WindowBuilder window = new WindowBuilder();
        EventDirector event = new EventDirector(window);
        event.createWindow(400, 200, false);
        event.setVisibility(true);
    }
}