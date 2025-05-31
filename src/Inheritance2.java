//class employee, method-work(),getselery()
//subclass hr manager that overrides the method work() and add new method addemployee()
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000; // Base salary
    }
}
class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing the team");
    }

    void addEmployee() {
        System.out.println("Adding a new employee to the team");
    }

    @Override
    double getSalary() {
        return 70000; // HR Manager's salary
    }
}
class inheritance2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work(); // Calls the base class method
        System.out.println("Employee Salary: " + emp.getSalary());

        HRManager hr = new HRManager();
        hr.work(); // Calls the overridden method in HRManager
        hr.addEmployee(); // Calls the new method in HRManager
        System.out.println("HR Manager Salary: " + hr.getSalary());
    }
}