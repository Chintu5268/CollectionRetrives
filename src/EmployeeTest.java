import java.util.ArrayList;

import java.util.List;

public class EmployeeTest {
  public static void main(String[] args) {
    
    List<Employee> emp = new ArrayList<>();
    emp.add(new Employee(101, "Sandesh", "Pune"));
    emp.add(new Employee(102, "Piyush", "Mohadi"));
    emp.add(new Employee(103, "Rakesh", "Bhandara"));
    emp.add(new Employee(104, "Amol", "Pune"));

    System.out.println(emp);
    
  }
}
