public class PersonBuilder {
    private String name;
    private String surname;
    private  int age;
    private  String address;

    public PersonBuilder setName(String name){
        this.name=name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build(){
        if(age<1){
            throw new IllegalArgumentException("Возраст недопустимый");
        }
        if(name==null || surname==null || address==null){
            throw  new IllegalStateException("Не хватает обязательных полей");
        }
        return new Person(name,surname,age,address);
    }
}
