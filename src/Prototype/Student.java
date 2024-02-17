package Prototype;

public class Student {
    private String name;
    private double psp;
    private double batchPsp;
    private long phone;
    private String batch;

    public Student() {

    }

    public Student(Student other) {
        this.name= other.getName();
        this.psp = other.getPsp();
        this.batchPsp = other.getBatchPsp();
        this.phone = other.getPhone();
        this.batch = other.getBatch();
    }

    public Student clone() {
        return new Student(this);
    }


    public void setName(String name){
        this.name = name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchPsp(double batchPsp) {
        this.batchPsp = batchPsp;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getName() {
        return this.name;
    }

    public double getPsp() {
        return this.psp;
    }

    public double getBatchPsp() {
        return this.batchPsp;
    }

    public long getPhone() {
        return this.phone;
    }

    public String getBatch() {
        return this.batch;
    }


}
