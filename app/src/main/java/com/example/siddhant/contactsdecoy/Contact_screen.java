package com.example.siddhant.contactsdecoy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Contact_screen extends AppCompatActivity {

    String phone_num, contact_name;
    String email="NA",id="NA";
    TextView phone_num_tv, contact_name_tv, contact_email,contact_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_screen);

        phone_num_tv = findViewById(R.id.contact_number);
        contact_name_tv = findViewById(R.id.contact_name);
        contact_email = findViewById(R.id.email_cont);
        contact_id =findViewById(R.id.cont_id);

        Intent i = getIntent();
        contact_name = i.getStringExtra("contact_name");
        phone_num = i.getStringExtra("contact_no");
        email = i.getStringExtra("email_contact");
        id = i.getStringExtra("id_cont");

        phone_num_tv.setText(phone_num);
        contact_name_tv.setText(contact_name);
        contact_email.setText(email);
        contact_id.setText(id);
    }
}
