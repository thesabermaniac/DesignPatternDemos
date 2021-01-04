package FactoryPattern;

public class iPhone implements Phone{

    @Override
    public void getPhoneType() {
        System.out.println("This is an iPhone. I am overpriced.");
    }
}
