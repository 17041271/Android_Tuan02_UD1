package com.hieunghia.student.tuan2_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtPass,txtPasLength;
    Button btnGenneratePass;
    CheckBox checkBoxUpper,checkBoxLower,checkBoxNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPass=(EditText) findViewById(R.id.editTextHienThi);

        btnGenneratePass=(Button) findViewById(R.id.btnGenerationPass);

        checkBoxUpper=(CheckBox) findViewById(R.id.checkBoxUppcase);

        checkBoxLower=(CheckBox) findViewById(R.id.checkBoxLower);

        checkBoxNumber=(CheckBox) findViewById(R.id.checkBoxNumber);

        btnGenneratePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Kimochi", Toast.LENGTH_SHORT).show();
                txtPass.setText("Yamate");
            }
        });
    }
}
