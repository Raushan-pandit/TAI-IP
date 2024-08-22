import java.util.*;

public class Task2 {

    public static class Contact {
        private String name;
        private String phoneNumber;
        private String email;

        public Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
        }
    }

    public static class AddressBook {
        private List<Contact> contacts;

        public AddressBook() {
            contacts = new ArrayList<>();
        }

        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        public void removeContact(String name) {
            contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        }

        public Contact findContact(String name) {
            for (Contact contact : contacts) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    return contact;
                }
            }
            return null;
        }

        public void listContacts() {
            if (contacts.isEmpty()) {
                System.out.println("No contacts in the address book.");
                return;
            }
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();

            // Adding contacts
            addressBook.addContact(new Contact("John Doe", "123-456-7890", "john.doe@example.com"));
            addressBook.addContact(new Contact("Jane Smith", "987-654-3210", "jane.smith@example.com"));

            // Listing contacts
            System.out.println("Contacts in Address Book:");
            addressBook.listContacts();

            // Finding a contact
            String nameToFind = "John Doe";
            Contact contact = addressBook.findContact(nameToFind);
            if (contact != null) {
                System.out.println("\nFound contact:");
                System.out.println(contact);
            } else {
                System.out.println("\nContact not found: " + nameToFind);
            }

            // Removing a contact
            addressBook.removeContact("John Doe");
            System.out.println("\nContacts after removal:");
            addressBook.listContacts();
        }
    }
}
