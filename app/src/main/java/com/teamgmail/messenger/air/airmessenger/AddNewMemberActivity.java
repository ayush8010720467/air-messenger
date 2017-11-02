package com.teamgmail.messenger.air.airmessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddNewMemberActivity extends AppCompatActivity {

    private EditText mNewUser;
    private EditText mPassword;
    private EditText mConfirmPassword;
    private Button mSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_member);
        mNewUser=(EditText)findViewById(R.id.addUserName);
        mPassword=(EditText)findViewById(R.id.newPassword);
        mNewUser=(EditText)findViewById(R.id.newConfirmPassword);
        mSubmit=(Button)findViewById(R.id.submit);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName=String.valueOf(mNewUser.getText());
                String password=String.valueOf(mPassword.getText());
                String confirmpassword=String.valueOf(mConfirmPassword.getText());
                if(userName.length()>0&&password.length()>0&&confirmpassword.length()>0)
                {
                        //add to database
                    if(password.equals(confirmpassword)==false)
                    {
                        Log.d("Air","enter the pasword and the confirmpassword not the same");
                    }
                    else {
                        Intent intent = new Intent(AddNewMemberActivity.this, AdminActivity.class);

                        startActivityForResult(intent, 0);
                    }
                }
                else
                {
                    if(userName.length()<0)
                    {
                        Log.d("Air","enter the userName");
                    }
                    else
                    {


                        {
                            if(password==""||confirmpassword=="")
                            {
                                Log.d("Air","enter the respective fields");
                            }
                        }
                    }
                }
            }
        });
    }
}
