package com.example.newshub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
EditText username,password1,confirmpassword;
TextView welcomeuser,signup1,login1;
FirebaseAuth firebaseAuth;
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[@#$%^&+=])" +     // at least 1 special character
                    "(?=\\S+$)" +            // no white spaces
                    ".{4,}" +                // at least 4 characters
                    "$");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username=findViewById(R.id.usernamesignup);
        password1=findViewById(R.id.passwordsignup);
        confirmpassword=findViewById(R.id.confirmpasswordsignup);
        welcomeuser=findViewById(R.id.welcome);
        signup1=findViewById(R.id.signup1);
        login1=findViewById(R.id.login1);


        signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                register();


            }
        });





        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this,Login.class);
                startActivity(intent);
            }
        });
    }


    public void register()
    {
        firebaseAuth= FirebaseAuth.getInstance();

        String uname=username.getText().toString().trim();
        String pwd=password1.getText().toString().trim();
        String cnfpwd=confirmpassword.getText().toString().trim();

        if (TextUtils.isEmpty(uname))
        {
            username.setError("Please Enter Username");
        }
        else if (TextUtils.isEmpty(pwd))
        {
            password1.setError("Please Enter password");
        }
        else if(!PASSWORD_PATTERN.matcher(pwd).matches())
        {
            password1.setError("password format is not correct");
        }
        else if(!cnfpwd.matches(pwd))
        {
            confirmpassword.setError("password not match");
        }

        else
        {
            firebaseAuth.createUserWithEmailAndPassword(uname,pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        Toast.makeText(SignUp.this, "Succesfull created account", Toast.LENGTH_SHORT).show();

                        Intent intent1=new Intent(SignUp.this,MainActivity.class);
                        startActivity(intent1);
                    }
                    else {
                        if(task.getException() instanceof FirebaseAuthUserCollisionException)
                        {
                            Toast.makeText(SignUp.this, "Already have an account", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(SignUp.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}