package datasekolah;

public class partTime extends teacher{
    private int hoursWorked;
    private int salary;

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public partTime() {
        super();
        hoursWorked = 0;
    }
    public partTime(String subject, int hoursWorked, int salary, int age, String name ) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }
    public void print(){
        super.print();
        System.out.println("HoursWorked\t : " +hoursWorked);
    }
}
