package lesson1.task1;

public class Main {
    public static void main(String[] args) {
     Person person = new PersonBuilderImpl()
             .setFirstName("Petr")
             .setLastName("Ivanov")
             .setAge(33)
             .setGender("Male")
             .setCountry("Poland")
             .build();

     Person person1 = new PersonBuilderImpl()
             .setFirstName("Ivan")
             .setLastName("Petrov")
             .setAge(18)
             .build();

    }
}
