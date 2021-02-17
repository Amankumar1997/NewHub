package com.example.newshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
   FirebaseAuth firebaseAuth;
EditText username1,password1;
TextView signup,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username1=findViewById(R.id.email);
        password1=findViewById(R.id.password);
        signup=findViewById(R.id.signup);
        login=findViewById(R.id.login);
        firebaseAuth=FirebaseAuth.getInstance();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loginuser();

            }
        });


    }
    public void loginuser()
    {

        String username=username1.getText().toString();
        String password=password1.getText().toString();
        firebaseAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(Login.this, "Log in Success", Toast.LENGTH_SHORT).show();
Intent intent=new Intent(Login.this,MainActivity.class);
startActivity(intent);
                }
                else
                {
                    Toast.makeText(Login.this, "Log In Failed", Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Login.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(firebaseAuth.getCurrentUser() !=null)
        {
            finish();
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}