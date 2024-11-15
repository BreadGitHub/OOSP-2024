import java.util.ArrayList;
import java.util.List;

public class Department implements Component {
    private String name;
    private List<Component> employees = new ArrayList<>();

    public Department (String name) {
        this.name = name;
    }

    public void add(Component component) {
        employees.add(component);
    }

    public void remove(Component component) {
        employees.remove(component);
    }
    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (Component component:employees) {
            component.showDetails();
        }
    }
}
