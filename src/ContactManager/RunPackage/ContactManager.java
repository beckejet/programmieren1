package ContactManager.RunPackage;

import ContactManager.Contact.Contact;

public class ContactManager {
    enum State{
        BEGIN,
        SHOWMENU,
        MENUCHOICE,
        CONTACTSHOWALL,

        CONTACTNEW,
        CONTACTDETAILS,
        CONTACTDELETE,
        END
    }

    public static void run(){
        State currentState = State.BEGIN;
        while(true){
            switch (currentState){
                case BEGIN:
                    Desktop.greet();
                    currentState = State.SHOWMENU;
                    break;
                case SHOWMENU:
                    Desktop.showMenu();

                    currentState = State.MENUCHOICE;
                    break;
                case MENUCHOICE:
                    Choice.getChoice();
                    currentState = State.END;
                    break;
                case CONTACTSHOWALL:
                    break;
                case CONTACTNEW:
                    Contact.setList();

                    case END:
                    return;
                default:
                    return;

            }
        }
    }
}
