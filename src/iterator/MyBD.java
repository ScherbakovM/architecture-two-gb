package iterator;

public class MyBD implements Collection {
    private  String[] tables;

    @Override
    public Iterator getIterator() {
        return new tablesIterator();
    }

    public MyBD(String[] tables) {
        this.tables = tables;
    }

    public void setTables(String[] tables) {
        this.tables = tables;
    }

    public String[] getTables() {
        return tables;
    }

    private class tablesIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < tables.length;
        }

        @Override
        public Object next() {
            return tables[index++];
        }
    }
}
