package ContactManager.RunPackage;
import ContactManager.Contact.Contact;

public class Desktop {
   public static void greet(){
       System.out.println("***********************************************");
       System.out.println("** KONTAKTVERWALTUNG VON DER COOLSTEN SORTE! **");
       System.out.println("***********************************************");
   }
    public static void showMenu(){
        System.out.println("[A] Alle Kontakte anzeigen");
        System.out.println("[N] Neuen Kontakt anlegen");
        System.out.println("[K] Kontakt bearbeiten");
        System.out.println("[D] Kontakt Details anzeigen");
        System.out.println("[L] Kontakt loeschen");
        System.out.println("[B] Beenden\n");

    }
    /*public void showList(){
        List<> contacts = Contact.
        for(int i = 0; i< ); i++) {
            System.out.println(Contact.contacts.get(i).name + " " + contacts.get(i).surname + " " + contacts.get(i).telefon + " " + contacts.get(i).email);

        }



    }*/

}
