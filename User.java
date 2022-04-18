package MiniEcommerceProject;

import java.util.Calendar;
import java.util.TimeZone;

public class User {
    String firstName;
    String lastName;
    private int age;
    String email;
    String password;
    boolean ifGuest = true;

    //Normal account
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.ifGuest = false;
    }

    //Guest account
    public User(String email) {
        this.email = email;
        this.ifGuest = true;
    }

    //Method to create user account from guest status
    public void changeStatus(String firstName, String lastName,String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.ifGuest = false;
    }

    public void setAge(int birthYear) {
        if (birthYear < 0){
            throw new IllegalArgumentException("Year can not be smaller than 0");
        }
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;
        if (currentYear < birthYear || birthYear > currentYear){
            throw new IllegalArgumentException("Type again your birth year");
        }
        System.out.println("You are " + age + " years old");
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", ifGuest=" + ifGuest +
                '}';
    }
}
