public class Person {
    private final String name;
    private final String surname;
    private  int age;
    private  String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasAge() {
        return false;
    }

    public void setAddress(String city) {
        this.address = city;
    }

    public void happyBirthday() {
        this.age++;
    }

    public  boolean hasAddress(){
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public PersonBuilder newChildBuilder() {
PersonBuilder son=new PersonBuilder()
        .setSurname(this.getSurname())
        .setAddress(this.getAddress());
        return son;
    }
}
