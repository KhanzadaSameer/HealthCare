package com.example.healthcare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class Registration extends AppCompatActivity {
    DatabaseReference db;
    TextView haveacc;
    TextInputEditText name,email,phone,password;
    Button registeration;
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        haveacc = findViewById(R.id.regAcc);
        haveacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Registration.this, Login.class);
                startActivity(i);
            }
        });

        getdetails();
        registeration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n,e,p,s;

                n = name.getText().toString();
                e = email.getText().toString();
                p = phone.getText().toString();
                s = password.getText().toString();

                if (n.isEmpty() ) {
                    name.setError("Name is required");
                }
                else if(e.isEmpty()){
                    email.setError("Email is required");
                } else if(p.isEmpty()) {
                    phone.setError("Phone is required");
                }else if(s.isEmpty()) {
                    password.setError("Password is required");
                } else{
                    auth.createUserWithEmailAndPassword(e,s).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                String uid = task.getResult().getUser().getUid().toString();
                                model m = new model(n,e,p,s);
                                db.child(uid).setValue(m);
                                Toast.makeText(Registration.this, "Data Submitted", Toast.LENGTH_SHORT).show();

                                Intent i = new Intent(Registration.this, Login.class);
                                startActivity(i);
                            }
                        }
                    });
                }
            }
        });
    }
    void getdetails(){
        name = findViewById(R.id.sname);
        email = findViewById(R.id.semail);
        phone = findViewById(R.id.sphone);
        password= findViewById(R.id.spass);
        registeration = findViewById(R.id.btnsub);

        db = FirebaseDatabase.getInstance().getReference().child("emai");
        auth = FirebaseAuth.getInstance();
    }
}