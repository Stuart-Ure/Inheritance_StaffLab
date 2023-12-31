package Staff;

public  class Employee {
    private String name;
    private String NiNumber;
    private double salary;

    public Employee(String name, String NiNumber, double salary){
        this.name = name;
        this.NiNumber = NiNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return NiNumber;
    }

    public double getSalary() {
        return salary;
    }
    public  void raiseSalary(double amount){
        if(amount > 0) {
            this.salary += amount;
        }
    }
    public double payBonus() {
        return salary * 0.01;
    }
}
