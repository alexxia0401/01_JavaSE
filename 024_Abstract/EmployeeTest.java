public class EmployeeTest {

    public static void main(String[] args) {
        Manager manager = new Manager("Cook", 1001, 5000, 50000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}