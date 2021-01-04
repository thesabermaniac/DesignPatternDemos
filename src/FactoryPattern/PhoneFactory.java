package FactoryPattern;

/**
 * Offloads all the decision-making to this class.
 * All the user needs to do is pass a string to the
 * static class, specifying what type of phone they
 * want and the factory class does the rest.
 */
public class PhoneFactory {

    public static Phone getPhone(String phone){
        if(phone.equalsIgnoreCase("iphone")){
            return new iPhone();
        }
        else if(phone.equalsIgnoreCase("oneplus")){
            return new OnePlus();
        }
        else if(phone.equalsIgnoreCase("samsung")){
            return new Samsung();
        }
        return null;
    }
}
