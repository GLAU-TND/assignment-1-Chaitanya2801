package contact;

import adt.ContactADT;

import java.util.ArrayList;

public class ContactList<Person> implements ContactADT<Person> {
    ArrayList<String> arrayOfNames = new ArrayList<>();
    ArrayList<String> arrayOfFirstName = new ArrayList<>();

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public void search(String name) {

    }

    @Override
    public void viewAll() {

    }
}
