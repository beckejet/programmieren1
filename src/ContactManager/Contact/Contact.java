package ContactManager.Contact;

import java.util.ArrayList;

import java.util.List;


public class Contact {

    String name;
    String surname;
    String telefon;
    String email;


    public Contact(String name, String surname, String telefon,String email){
        this.name = name;
        this.surname = surname;
        this.telefon = telefon;
        this.email = email;

    }

    public static void setList() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Jethro", "Becker", "076458767", "jethro.becker@web.de"));
        contacts.add(new Contact("Rimon", "Becker", "076458767", "jethro.becker@web.de"));
        contacts.add(new Contact("Matze", "Voelker", "076458767", "jethro.becker@web.de"));


    }
    public void changeList(){

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

}

