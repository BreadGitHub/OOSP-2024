package Adapter;

public class AdapterCSV implements AdapterData {

    @Override
    public void read(String path) {
        System.out.println("Read CSV: " + path);
    }

    @Override
    public void write(String path) {
        System.out.println("Write CSV" + path);
    }
}
