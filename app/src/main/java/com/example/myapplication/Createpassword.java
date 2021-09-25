package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Createpassword extends AppCompatActivity {

    EditText newpass;
    EditText confpass;
    Button sub_npas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpassword);

        newpass= findViewById(R.id.new_pass);
        confpass =findViewById(R.id.confirm_pass);
        sub_npas= findViewById(R.id.submit_new_pass);

        sub_npas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!newpass.getText (). toString().trim(). isEmpty()){
                    if((newpass.getText().toString().trim()).equals((confpass.getText().toString().trim()))){

                        //write here your code for fire base.


                        Intent intent=new Intent(getApplicationContext(), Demone.class);
                        startActivity(intent);

                    }else {
                        Toast.makeText(Createpassword.this, "PASSWORD not matched", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(Createpassword.this, "Please enter the PASSWORD", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}