package datasekolah;

public class person {
    private String name;
    private int age;

    public person(){
        age = 0;
        name = "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void print(){
        System.out.println("Umur\t : " +age);
        System.out.println("Nama\t : " +name);
    }
}
