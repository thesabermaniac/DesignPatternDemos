package FactoryPattern;


public class Samsung implements Phone{

    @Override
    public void getPhoneType() {
        System.out.println("This is a Samsung phone. I am priced well.");
    }
}
