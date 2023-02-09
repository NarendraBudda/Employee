public class Employeelmpl {
    public static void main(String args[]){
        Employee Daniel=new Employee("Daniel",130,32,"12/12/1990","124 Bridgewater Eville",3000);
        float hikepercentage=20;
        System.out.println("annual salary "+Daniel.calcualtingannualsalary());
        System.out.println("employee details before hike ");
        Daniel.displayemployeedetails();
         Daniel.calcualtingpayhike(hikepercentage);
         System.out.println();
        Daniel.displayemployeedetails();
    }
}
