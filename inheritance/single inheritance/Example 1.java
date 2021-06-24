class Employee {
    float salary=100000;
}
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("Programmer Salary:"+p.salary); 
        System.out.println("Programmer Salary:"+p.bonus); 
    }
}
/*Output:
Programmer Salary:100000.0
Programmer Salary:10000
*/
