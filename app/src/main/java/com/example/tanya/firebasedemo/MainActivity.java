package com.example.tanya.firebasedemo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity
{
    private FirebaseAuth mAuth;
    private EditText edtemail, edtpass;
    private Button buttonlogin, buttonsignup;
    String email, password;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        edtemail = (EditText)findViewById(R.id.edituser);
        edtpass = (EditText)findViewById(R.id.editpass);

        buttonlogin = (Button)findViewById(R.id.btnsignin);
        buttonsignup = (Button)findViewById(R.id.btnsignup);

        email = edtemail.getText().toString();
        password = edtpass.getText().toString();

//        buttonsignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task)
//                    {
//                        if (task.isSuccessful())
//                        {
//                            Log.d(TAG, "createUserWithEmail:success");
//
//                            FirebaseUser user = mAuth.getCurrentUser();
//                            if (user != null)
//                            {
//                                String email = user.getEmail();
//
//                                // Check if user's email is verified
//                                boolean emailVerified = user.isEmailVerified();
//
//                                String uid = user.getUid();
//                            }
//                            updateUI(user);
//                        }
//                        else {
//
//                            // If sign in fails, display a message to the user.
//                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
//                            Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//
//                            updateUI(null);
//                        }
//
//                        // ...
//                    }
//                });
//
//            }
//        });
//
//        buttonlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mAuth.signInWithEmailAndPassword(email, password)
//                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (task.isSuccessful()) {
//                                    // Sign in success, update UI with the signed-in user's information
//                                    Log.d(TAG, "signInWithEmail:success");
//                                    FirebaseUser user = mAuth.getCurrentUser();
//                                    updateUI(user);
//                                } else {
//                                    // If sign in fails, display a message to the user.
//                                    Log.w(TAG, "signInWithEmail:failure", task.getException());
//                                    Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
//                                            Toast.LENGTH_SHORT).show();
//                                    updateUI(null);
//                                }
//
//                                // ...
//                            }
//                        });
//            }
//        });
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        updateUI(currentUser);
//    }
//
//    private void updateUI(FirebaseUser currentUser) {
//
//
    }


}
