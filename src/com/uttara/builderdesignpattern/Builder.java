package com.uttara.builderdesignpattern;

/*
 * The Builder Pattern is a creational design pattern used to construct complex objects step-by-step.
 * Separates the construction of an object from its representation.
 * Useful when a class has many optional parameters or complex construction logic.
 */
 class User {
	// Required parameters
    private final String firstName;
    private final String lastName;
    
    // Optional parameters
    private final int age;
    private final String email;
    private final String country;
    
 // Private constructor
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.country = builder.country;
    }
 // Static Builder Class
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;

        private int age;
        private String email;
        private String country;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder country(String country) {
            this.country = country;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ") - " + email + ", " + country;
    }
    
}
 public class Builder {
    public static void main(String[] args) {

    	User user = new User.UserBuilder("John", "Doe")
                            .age(30)
                            .email("john@mail.com")
                            .country("USA")
                            .build();

        System.out.println(user);
    }
 }
