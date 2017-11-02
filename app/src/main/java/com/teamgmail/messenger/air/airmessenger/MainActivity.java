package com.teamgmail.messenger.air.airmessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Admin mAdmin;
    private EditText mUserName;
    private EditText mPassword;
    private Button mLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserName=(EditText)findViewById(R.id.userName);
        mPassword=(EditText)findViewById(R.id.password);
        mLogin=(Button)findViewById(R.id.Login);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic for the authentication fo the user form the fire base

                String usr=String.valueOf(mUserName.getText());
                mAdmin=new Admin();
                if(mAdmin.isAdmin(usr))
                {
                    //go to admin activity
                    Intent intent=new Intent(MainActivity.this , AdminActivity.class);
                    startActivityForResult(intent,0);

                }
                else
                {
                    //go to member activity

                    Intent intent=new Intent(MainActivity.this , MemberActivity.class);
                    startActivityForResult(intent,0);

                }
            }
        });
    }
}
