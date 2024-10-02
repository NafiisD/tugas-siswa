package datasekolah;

public class fullTime extends teacher{
    private int anualSalary;
    private String unit;

    public fullTime() {
        super();
        anualSalary = 0;
        unit = "";
    }

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public fullTime(String subject, int anualSalary, String unit, int age, String name) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }
    public void print(){
        super.print();
        System.out.println("Salary\t : " +anualSalary);
        System.out.println("Unit\t : " +unit);
    }
}
