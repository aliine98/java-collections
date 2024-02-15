package br.com.aline.collections.set.contact_book;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contactSet = new HashSet<>();

    public void addContact(String name, int phonenumber) {
        contactSet.add(new Contact(name, phonenumber));
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsFound = new HashSet<>();

        for (Contact c : contactSet) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                contactsFound.add(c);
            }
        }

        return contactsFound;
    }

    public void updateContactNumber(String name, int phoneNumber) {
        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setPhoneNumber(phoneNumber);
            }
        }
    }

    public void removeContact(String name) {
        Contact contactToRemove = null;
        for (Contact c : contactSet) {
            if(c.getName().equalsIgnoreCase(name)) {
                contactToRemove = c;
            }
        }
        contactSet.remove(contactToRemove);
    }

    public Set<Contact> getContactSet() {
        return contactSet;
    }
}
