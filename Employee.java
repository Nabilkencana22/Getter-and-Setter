
public class Employee {
    private String nama;
    private int Salary ;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        Salary = salary;
    }
    public Employee() {
        nama = "";
        Salary = 0 ;
    }
    //constructor parameter
    public Employee(String nama, int Salary){
        this.nama = nama;
        this.Salary = Salary;
    }
    //Method
    public void println() {  
        System.out.println("----------------------------");
        System.out.println("NAMA :" + nama);
        System.out.println("SALARY :" + Salary);
        System.out.println("----------------------------");
    }
    
}
