package DesignPatterns.CreationalPatterns.Builder;

public class Student {
    private int age;
    private String name;
    private int psp;
    private String university;
    private int passoutYear;
    private String company;
    private int yoe;

    Student(Builder builder){
        this.age = builder.age;
        this.psp = builder.psp;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.company = builder.company;
        this.passoutYear = builder.passoutYear;
        this.university = builder.university;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPsp() {
        return psp;
    }

    public String getUniversity() {
        return university;
    }

    public int getPassoutYear() {
        return passoutYear;
    }

    public String getCompany() {
        return company;
    }

    public int getYoe() {
        return yoe;
    }

    public static Builder builder(){
        return new Builder();
    }

    static class Builder{

        private int age;
        private String name;
        private int psp;
        private String university;
        private int passoutYear;
        private String company;
        private int yoe;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setPassoutYear(int passoutYear) {
            this.passoutYear = passoutYear;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public void validate()  {
            if(age < 18) throw  new RuntimeException("age less than 18 not allowed.");
        }

        public Student build(){
            try{
                validate();
                return new Student(this);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return null;
        }
    }
}
