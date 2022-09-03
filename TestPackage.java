package test;
import firstpackage.EmployeeDetails;
import firstpackage.Department;

class TestPackage
{
public static void main(String[] ar)
{
EmployeeDetails details=new EmployeeDetails();
details.displayMessage();
System.out.println("welcome to the main class");
Department department=new Department();
//department.displayMessage();
}
}