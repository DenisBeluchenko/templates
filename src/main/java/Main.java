public class Main {
    public static void main(String[] args) {
        Person dad = new PersonBuilder()
                .setName("Денис")
                .setSurname("Белюченко")
                .setAge(47)
                .setAddress("Норильск")
                .build();
        Person son = dad.newChildBuilder()
                .setName("Ардрей")
                .setAge(14)
                .build();
        System.out.println("У " + dad + "\n есть сын, " + son);
        dad.setAddress("Москва");
        son.happyBirthday();
        System.out.println("У " + dad + "\n есть сын, " + son);
    }
}
