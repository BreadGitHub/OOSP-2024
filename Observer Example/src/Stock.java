import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String sym;
    private double price;
    private List<Observer> observers;

    public Stock(String sym, double price) {
        this.sym = sym;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public String getSym() {
        return sym;
    }

    public double getPrice() {
        return price;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObserver();
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(sym, price);
        }
    }
}
