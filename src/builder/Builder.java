package builder;
// интерфейся для нашего конкретного билдера
public interface Builder {
    void setWidth(Integer width);
    void  setHeight(Integer height);
    void open() throws Exception;
    void close() throws Exception;
}
