package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        GroceryStore arons = new GroceryStore();
        GroceryStoreProxy proxy = new GroceryStoreProxy(arons);

        Person abe = new Person("Avraham");
        Person jake = new Person("Yaakov");
        Person isaac = new Person("Yitzchak");
        Person ruben = new Person("Reuven");
        Person simon = new Person("Shimon");
        Person levi = new Person("Levi");
        Person jude = new Person("Yehudah");

        proxy.enter(abe);
        proxy.enter(isaac);
        proxy.enter(jake);
        proxy.enter(ruben);
        proxy.enter(simon);
        proxy.enter(levi);
        proxy.enter(jude);
        proxy.leave(abe);
        //should complain that jude isn't in the store
        proxy.leave(jude);
    }
}
