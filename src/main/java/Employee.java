/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    private String name;
    private String manager;
    /**
     * Constructor for initialization.
     * @param name
     * @param manager
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }

    public Employee findManager(Employee employee) {
        return manager;
    }
    public int countManagerAbove(Employee employee) {
        Employee manager = findManager(employee);
        if (manager == null) {
            return 0;
        } else {
            return 1 + countManagerAbove(manager);
        }
    }
}
    public int countEmployeeUnder(Employee employee) {
    int count = 0;
    for(int i = 0; i < employee.size(); i++) {
    }
    }