package datasekolah;

public class teacher extends person{
    private String subject;

    public teacher() {
        super();
        subject = "";
    }

    public teacher(String subject, int age, String name){
        super(age, name);
        this.subject = subject;

    }
    public String getSubject() {
        return this.subject; 
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void print(){
        super.print();
        System.out.println("Subject\t : " +subject);
    }
    
}
