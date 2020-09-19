package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 final    EditText x=findViewById(R.id.editTextNumber);
  final   EditText y=findViewById(R.id.editTextNumber3);
        Button add=findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
int s =  Integer.parseInt(x.getText().toString());
    int a = Integer.parseInt(y.getText().toString());
        int sum = s+ a ;
                Toast.makeText(MainActivity.this,sum+"",Toast.LENGTH_SHORT).show();

            }
        });
   final EditText V=findViewById(R.id.editTextNumber);
    final EditText d=findViewById(R.id.editTextNumber3);
   Button mult=findViewById(R.id.button3);
   mult.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           int z= Integer.parseInt(V.getText().toString());
           int u=Integer.parseInt(d.getText().toString());
           int simba = z*u;
           Toast.makeText(MainActivity.this, simba+"",Toast.LENGTH_SHORT).show();
       }
   });
        final EditText C=findViewById(R.id.editTextNumber);
        final EditText B=findViewById(R.id.editTextNumber3);
        Button divid=findViewById(R.id.button5);
        divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f = Integer.parseInt(C.getText().toString());
                int l = Integer.parseInt(B.getText().toString());
                int musafaa = f / l;
                Toast.makeText(MainActivity.this, musafaa + "", Toast.LENGTH_SHORT).show();

            }
        });

    }
}