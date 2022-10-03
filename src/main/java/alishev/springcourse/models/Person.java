package alishev.springcourse.models;

import javax.validation.constraints.*;

public class Person {
    public Person() {
    }

    private int id;
    @NotEmpty(message = "Name should nit be empty")
    @Size(min = 2, max = 30, message = "Name short or long")
    private String name;
    @Min(value = 0, message = "Can't be negative")
    @Max(value = 150, message = "Sorry, peoples can't live so much")
    private int age;
    @NotEmpty(message = "E-mail should not be empty")
    @Email(message = "Should be valid")
    private String email;
//Страна, Город, Индекс (6 цифр)
    //Russia, Moscow, 123456
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Your address should be in this format: Country, City, 123456 (index)")
    private String address;

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
