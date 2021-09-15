package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Otpsingin extends AppCompatActivity {
    EditText input_otp;
    Button verifi_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpsingin);
        input_otp= findViewById(R.id.write_otp);
        verifi_button=findViewById(R.id.otp_verification);

        verifi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!input_otp. getText (). toString().trim(). isEmpty()){
                    if((input_otp.getText().toString().trim()).length()==6){

                        //write here your code for fire base.


                       //Intent intent=new Intent(getApplicationContext(), Demone.class);
                       //startActivity(intent);

                    }else {
                        Toast.makeText(Otpsingin.this, "Please enter the PASSWORD", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(Otpsingin.this, "NOT MATCHING CHECK AGAIN", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}