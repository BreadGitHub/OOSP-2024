public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("bob1", "Manager");
        Employee employee2 = new Employee("bob2", "Designer");
        Employee employee3 = new Employee("bob3", "Programmer");
        
        Department develop_department = new Department("Development");
        Department design_department = new Department("Design");
        Department manage_department = new Department("Manage");

        develop_department.add(employee3);
        design_department.add(employee2);
        manage_department.add(employee1);
        
        Department main_department = new Department("Main");

        main_department.add(design_department);
        main_department.add(develop_department);
        main_department.add(manage_department);

        System.out.println("Main next");

        main_department.showDetails();
    }
}
