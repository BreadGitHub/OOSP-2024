import Adapter.AdapterCSV;
import Adapter.AdapterData;
import Adapter.AdapterJSON;
import Adapter.AdapterXML;

public class Main {
    public static void main(String[] args) {
        AdapterData csvAdapter = new AdapterCSV();
        csvAdapter.read("data.csv");
        csvAdapter.write("data.csv");

        AdapterData jsonAdapter = new AdapterJSON();
        jsonAdapter.read("data.json");
        jsonAdapter.write("data.json");

        AdapterData xmlAdapter = new AdapterXML();
        xmlAdapter.read("data.xml");
        xmlAdapter.write("data.xml");
    }
}