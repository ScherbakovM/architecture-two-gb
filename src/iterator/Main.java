package iterator;

public class Main {
    public static void main(String[] args) {
        String[] tables = {"Workers","Teachers","Students"};
        MyBD geakBrains = new MyBD(tables);
        Iterator iterator = geakBrains.getIterator();
        System.out.println("__________\ngeakBrains\n__________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


//интерфейс итератор проверяет есть ли следующий элемент и если он есть вовзращает тру
//таким образов в цикле проходя по массиву строк мы печатаем строки пока возвращается тру

