package builder;

//Окно у которого есть ширина, высотаб видимость и методы устанавливающие значения
class Window {
    private Integer width;
    private Integer height;
    private boolean isVisible;

    public void setWidth(Integer width) {
        System.out.println("Установлена ширина окна " + width + "px");
        this.width = width;
    }

    public void setHeight(Integer height) {
        System.out.println("Установлена высота окна " + height + "px");
        this.height = height;
    }

    public boolean open()  {
        System.out.println("visibility: true");
        return isVisible = true;
    }

    public boolean close() {
        System.out.println("visibility: false");
        return isVisible = false;
    }

}
