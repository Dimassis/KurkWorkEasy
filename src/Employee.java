import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
    private int department;
    private int id = 0;
    private static int count = 1;
    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = count++;
    }
    public static void listEmployees(Employee[] employee) { // метод списка всех сотрудников
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    } // список всех сотрудников
    public static void sumSalary(Employee[] employee) { // метод всех зп
        int temp = 0;
        for (int i = 0; i < employee.length; i++) {
            temp = employee[i].salary + temp;
        }
        System.out.println("Сумма затрат: " + temp);
    } // Метод всех зп
    public static void maxSalary(Employee[] employee) { // метод максимальной зп
        int temp = 0;
        String tempName = "";
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].salary > temp) {
                temp = employee[i].salary;
                tempName = employee[i].name;
            }
        }
        System.out.println("Максимальная зп у " + tempName + " " + temp + " рублей");
    } // Макс зп
    public static void minSalary(Employee[] employee) { // метод минимальной зп
        int temp = Integer.MAX_VALUE;
        String tempName = "";
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].salary < temp) {
                temp = employee[i].salary;
                tempName = employee[i].name;
            }
        }
        System.out.println("Минимальная зп у " + tempName + " " + temp + " рублей");
    } // Мин за
    public static void middleSalary(Employee[] employee) {
        int temp = 0;
        for (int i = 0; i < employee.length; i++) {
                temp += employee[i].salary;
            }
        temp = temp / employee.length;
        System.out.println(temp);
    } // Средняя зп
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public boolean equals(Employee employee) {
        if (this.getName() != employee.getName() && this.getSalary() != employee.getSalary() && this.getDepartment() != employee.getDepartment() ) {
            return false;
        } else {
            return true;
        }
    }
    public String toString() {
        return id + ")" + getName() +  ", salary: " + getSalary() + ", Department: " + getDepartment();
    }
}

