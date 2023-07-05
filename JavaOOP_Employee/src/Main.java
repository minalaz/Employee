public class Main {
    public static void main(String[] args) {
        Employee employee1= new Employee("Milica","Markovic",2007);
        Employee employee2 = new Employee("Sanja", "Vuckovic", 2015);
        Employee employee3 = new Employee("Marko", "Markovic",2010);

        if(employee1.yearsOfWork(employee1.employmentYear)==true){
            System.out.println("Employee is working for more than ten years! ");
        }
        else{
            System.out.println("Employee is working less than ten years! ");
        }
        if(employee2.yearsOfWork(employee2.employmentYear)==true){
            System.out.println("Employee is working for more than ten years! ");
        }
        else {
            System.out.println("Employee is working less than ten years! ");
        }
        if(employee3.yearsOfWork(employee3.employmentYear)==true){
            System.out.println("Employee is working for more than ten years! ");
        }
        else{
            System.out.println("Employee is working less than ten years! ");
        }
    }
}