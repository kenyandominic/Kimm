package com.whatsapp.kimm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        

    }
    public void onBtnClick (View view) {
        TextView txtfirstName = findViewById(R.id.txtMessage);
        TextView txtSecondName = findViewById(R.id.txtMessage);
        TextView txtEmail = findViewById(R.id.txtMessage);

        EditText edtTxtName1 = findViewById(R.id.edtTxtName1);
        EditText edtTxtName2 = findViewById(R.id.edtTxtName2);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtfirstName.setText("first name  "+edtTxtName1.getText().toString());
        txtSecondName.setText("Second Name "+edtTxtName2.getText().toString());
        txtEmail.setText("Email "+edtTxtEmail.getText().toString());
    }
}