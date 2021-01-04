package FactoryPattern;

public class OnePlus implements Phone{

    @Override
    public void getPhoneType() {
        System.out.println("This is an OnePlus phone. I am a bargain.");
    }
}
