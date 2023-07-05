public class Employee {String firstName;
    String lastName;
    int employmentYear;

    public Employee(String firstName, String lastName, int employmentYear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.employmentYear = employmentYear;
    }

    public boolean yearsOfWork(int employmentYear){
        int thisYear = 2023;
        if ((thisYear - employmentYear)>10){
            return true;
        }
        return false;
}}
