package BuilderPattern;

import java.time.Year;

public class Student {
    private String name;
    private double psp;
    private Year batch;
    private String university;
    private int id;
    private String degree;

    private Student(Builder builder) {
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.university = builder.getUniversity();
        this.id = builder.getId();
        this.degree = builder.getDegree();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private double psp;
        private Year batch;
        private String university;
        private int id;
        private String degree;

        public Builder() {

        }

        public Builder setName(String name) {
            if(name.length() >  0) {
                this.name = name;
            }
            else {
                this.name = null;
            }
            return this;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatch(Year batch) {
            if(batch.compareTo(Year.of(2000)) > 0) {
                this.batch = batch;
            }
            else {
                this.batch = null;
            }
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setDegree(String degree) {
            this.degree = degree;
            return this;
        }

        public String getName() {
            return this.name;
        }

        public Double getPsp() {
            return this.psp;
        }

        public Year getBatch() {
            return this.batch;
        }

        public String getUniversity() {
            return this.university;
        }

        public int getId() {
            return this.id;
        }

        public String getDegree() {
            return this.degree;
        }

        public Student build() {
            return new Student(this);
        }

    }
}
