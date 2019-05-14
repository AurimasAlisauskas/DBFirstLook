package com.alication.dbfirstlook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        Log.d("DB Count: ", String.valueOf(db.getContactCount()));

        Log.d("Insert: ", "Inserting...");
        db.addContact(new Contact("Agne", "867909876"));
        db.addContact(new Contact("Aurimas", "867453567"));
        db.addContact(new Contact("Ignas", "865467854"));


        Log.d("Reading: ", "Reading all contacts...");
        List<Contact> contactList = db.getAllContacts();


        //Get one contact

        //Contact oneContact = db.getContact(10);
        //oneContact.setName("Agnyte");
        //oneContact.setPhoneNumeber("868866666");

        //int newContact = db.updateContact(oneContact);

        //Log.d("One contact: ", "Updated row: " + newContact + "Name: " + oneContact.getName() + " Phone: "+ oneContact.getPhoneNumeber());

        //Get all contacts

        //db.deleteContact(oneContact);

        for (Contact c : contactList) {
            String log = "ID: " + c.getId() + " , Name: " + c.getName() + " , Phone number: " + c.getPhoneNumeber();

            Log.d("Name: ", log);
        }
    }
}
