package Adapter;

public class AdapterXML implements AdapterData {
    @Override
    public void read(String path) {
        System.out.println("Read XML" + path);
    }

    @Override
    public void write(String path) {
        System.out.println("Write XML" + path);
    }
}
