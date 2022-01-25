package lesson1.task1;

public interface PersonBuilder {
    PersonBuilder setFirstName(String firstName);
    PersonBuilder setLastName(String lastName);
    PersonBuilder setMiddleName(String middleName);
    PersonBuilder setCountry(String country);
    PersonBuilder serAddress(String address);
    PersonBuilder setPhone(String phone);
    PersonBuilder setAge(Integer age);
    PersonBuilder setGender(String gender);
    Person build();
}
