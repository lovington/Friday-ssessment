package MusaPackage12;



public class Person2 {

        private String name;
        public int age;

        public Person2(String name, int age, String gender, String[] interest) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.interest = interest;
        }

        public String gender;
        public String[] interest;

    public String Hello(){
        String interestString = String.join(", ",  interests);
        return String.format("Hello, my name is , my gender is  and I am  years old. My interests are .",
                name, gender, age, interestString);

    }

    public static void main(String[] args) {
        Person2 person=new Person2("Ryuk",35,"Male","being a hardarse","agile","SSD hard drives",);
        person.Hello();

    }
}


