package FactoryPattern;

/**
 * Notice how simple it is for the user to create a new
 * phone type. All he has to do is pass a string indicating
 * what type of phone he wants and the factory does the rest.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Phone phone = PhoneFactory.getPhone("iphone");
        phone.getPhoneType();
        phone = PhoneFactory.getPhone("samsung");
        phone.getPhoneType();
        phone = PhoneFactory.getPhone("oneplus");
        phone.getPhoneType();
    }
}
