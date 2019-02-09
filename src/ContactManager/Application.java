package ContactManager;
import ContactManager.RunPackage.*;
import ContactManager.Contact.*;
import java.util.List;


public class Application {

    public static void main(String[] args){

        Contact.setList();
        List<String> contacts = Contact.getList();
        System.out.println(contacts.get(0));
        ContactManager.run();

    }
}
