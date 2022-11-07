package com.androidfisac.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    String userName = "";
    String userPassword = "";

    /* Class to hold credentials */
    static class Credentials
    {
        String name = "Admin";
        String password = "123456";
    }

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Bind the XML views to Java Code Elements */
        eName = findViewById(R.id.Username);
        ePassword = findViewById(R.id.Password);
        Button eLogin = findViewById(R.id.LoginBtn);

        /* Describe the logic when the login button is clicked */
        eLogin.setOnClickListener(view ->  {
                /* Obtain user inputs */
                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();

                /* Check if the user inputs are empty */
                if(userName.isEmpty() || userPassword.isEmpty())
                {
                    /* Display a message toast to user to enter the details */
                    Toast.makeText(MainActivity.this, "Please enter name and password!", Toast.LENGTH_LONG).show();

                }else {

                    /* Validate the user inputs */
                    isValid = validate(userName, userPassword);

                    /* Validate the user inputs */

                    /* If not valid */
                    if (!isValid) {

                        Toast.makeText(MainActivity.this, "Wrong Credentials! Try again.", Toast.LENGTH_LONG).show();

                    }
                    /* If valid */
                    else {

                        /* Allow the user in to your app by going into the next activity */
                        Intent i=new Intent(getApplicationContext(), HomePageActivity.class);
                        startActivity(i);

                    }

                }
            });
    }

    /* Validate the credentials */
    private boolean validate(String userName, String userPassword)
    {
        /* Get the object of Credentials class */
        Credentials credentials = new Credentials();

        /* Check the credentials */
        return userName.equals(credentials.name) && userPassword.equals(credentials.password);
    }
}
