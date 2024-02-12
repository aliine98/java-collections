package br.com.aline.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contactSet = new HashSet<>();

    void addContact(String name, int phonenumber) {
        contactSet.add(new Contact(name, phonenumber));
    }

    Set<Contact> searchByName(String name) {
        Set<Contact> contactsFound = new HashSet<>();

        for (Contact c : contactSet) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                contactsFound.add(c);
            }
        }

        return contactsFound;
    }

    void updateContactNumber(String name, int phoneNumber) {
        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setPhoneNumber(phoneNumber);
            }
        }
    }

    void removeContact(String name) {
        Contact contactToRemove = null;
        for (Contact c : contactSet) {
            if(c.getName().equalsIgnoreCase(name)) {
                contactToRemove = c;
            }
        }
        contactSet.remove(contactToRemove);
    }

    Set<Contact> getContactSet() {
        return contactSet;
    }
}
