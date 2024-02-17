package Prototype;

public class Main {
    public static void main(String[] args) {
        Registry<Student> reg = new Registry();
        fillRegistry(reg);

        Student s1 = reg.getRegistry("April23").clone();
        Student cl1 = reg.getRegistry("College").clone();
        Student ps1 = reg.getRegistry("Professional").clone();
        ((CollegeStudent) cl1).setUniversity("Pondicherry Univeristy");

        System.out.println("Done");

    }

    public static void fillRegistry(Registry reg) {
        Student st = new Student();
        st.setName("Deepeeca");
        st.setPsp(96.75);
        st.setBatchPsp(95.00);
        st.setPhone(944255678);
        st.setBatch("April23");

        reg.register("April23", st);

        CollegeStudent cl = new CollegeStudent(st);
        cl.setUniversity("PEC");
        cl.setMajor("Computer Science");
        reg.register("College", cl);

        ProfessionalStudent ps = new ProfessionalStudent(st);
        ps.setCompany("MSG");
        ps.setSalary(100000);
        reg.register("Professional", ps);

    }
}
