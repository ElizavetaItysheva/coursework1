import java.util.Objects;

public class Employee {
    private String fio;

    private int office;

    private int salary;
    private static int counter;
    private int id;
    public String getFio() {
        return fio;
    }

    public int getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    private static int getCounter() {
        return counter;
    }

    private int getId() {
        return id;
    }

    private void setOffice( int office ) {
        this.office = office;
    }

    private void setSalary( int salary ) {
        this.salary = salary;
    }

    public Employee( String fio, int office, int salary, int id ) {
        this.fio = fio;
        this.office = office;
        this.salary = salary;
        this.id = counter++;
    }
    @Override
    public String toString() {
        return "Сотрудник: " + fio + "\nОтдел - " + office + "\nЗарплата - " + salary + "\nid - " + id;
    }
    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return office == employee.office && salary == employee.salary && id == employee.id && Objects.equals(fio, employee.fio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fio, office, salary, id);
    }
}



