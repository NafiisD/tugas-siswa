package datasekolah;

public class Student extends person{
    private int score;
    private int studentNumber;
    private String major;

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(int score, int studentNumber, String major, int age, String name){
        super(age, name);
        score = 0;
        studentNumber = 0;
        major = "Null";
    }
}
