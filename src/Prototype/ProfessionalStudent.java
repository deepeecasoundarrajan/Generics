package Prototype;

public class ProfessionalStudent extends Student {
    private String company;
    private int salary;

    public ProfessionalStudent() {

    }

    public ProfessionalStudent(Student st) {
        super(st);
    }

    public ProfessionalStudent(ProfessionalStudent other){
        super(other);
        this.company = other.getCompany();
        this.salary = other.getSalary();
    }

    public ProfessionalStudent clone() {
        return new ProfessionalStudent(this);
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return this.company;
    }

    public int getSalary() {
        return this.salary;
    }
}
