package BuilderPattern;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setName("Deepeeca")
                .setPsp(96.75)
                .setBatch(Year.of(2023))
                .setUniversity("University of Utah")
                .setId(23)
                .setDegree("Masters")
                .build();
        System.out.println("Student created");
    }
}
