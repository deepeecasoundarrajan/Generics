package Prototype;

public class CollegeStudent extends Student {
    private String university;
    private String major;

    public CollegeStudent() {

    }

    public CollegeStudent(Student st) {
        super(st);
    }

    public CollegeStudent(CollegeStudent other) {
        super(other);
        this.university = other.getUniversity();
        this.major = other.getMajor();
    }

    public CollegeStudent clone() {
        return new CollegeStudent(this);
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return this.university;
    }

    public String getMajor() {
        return this.major;
    }
}
