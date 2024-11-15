package Adapter;

public class AdapterJSON implements AdapterData{
    @Override
    public void read(String path) {
        System.out.println("Read JSON" + path);
    }

    @Override
    public void write(String path) {
        System.out.println("Write JSON" + path);
    }
}
