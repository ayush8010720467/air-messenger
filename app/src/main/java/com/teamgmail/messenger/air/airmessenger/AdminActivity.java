package com.teamgmail.messenger.air.airmessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdminActivity extends AppCompatActivity {

    private EditText mMessageToBeSent;
    private Button mNotify;
    private Button mAddNewMember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        mMessageToBeSent=(EditText)findViewById(R.id.messageToBeSent);
        mNotify=(Button)findViewById(R.id.notify);
        mAddNewMember=(Button)findViewById(R.id.addNewMembers);
        mAddNewMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(AdminActivity.this,AddNewMemberActivity.class);
                startActivityForResult(intent,0);
            }
        });
        mNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //the text in the posting section is sent and is empitied from their



                //code for empeting the string
                mMessageToBeSent.setText("");
            }
        });
    }
}
