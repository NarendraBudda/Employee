public class Employee {
    String employeename;
    int employeecode;
    int age;
    String dob;
    String address;
    double salary;
    public Employee(String employeename,int employeecode,int age,String dob,String address,double salary){
        this.employeename=employeename;
        this.employeecode=employeecode;
        this.age=age;
        this.dob=dob;
        this.address=address;
        this.salary=salary;
    }
    public double calcualtingannualsalary(){
        return salary*12;

    }
    public double calcualtingpayhike(float hikepercentage){
            salary=salary+(salary*hikepercentage)/100;

        return salary;
    }
    public void displayemployeedetails(){
        System.out.println("The name of employee "+employeename);
        System.out.println("The employee code  "+employeecode);
        System.out.println("The employee age "+age);
        System.out.println("The date od brith of employee "+dob);
        System.out.println("The address of employee "+address);
        System.out.println("The salary of employee "+salary);

    }
}
