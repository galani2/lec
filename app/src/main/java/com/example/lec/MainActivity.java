package com.example.lec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText no1,no2;
    Button btn;
    TextView t;
    int a1=0,b1=0,sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1=findViewById(R.id.e1);
        no2=findViewById(R.id.e2);
        btn=findViewById(R.id.b);
        t=findViewById(R.id.t);


        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1=no1.getText().toString();
                String n2=no2.getText().toString();

                if(n1.equals("") && n2.equals(""))
                {
                    a1=0;
                    b1=0;
                }
                else if(n1.equals(""))
                {
                    a1=0;
                    b1=Integer.parseInt(n2);
                }
                else if(n2.equals(""))
                {
                    a1=Integer.parseInt(n1);
                    b1=0;
                }
                else
                {
                    a1=Integer.parseInt(n1);
                    b1=Integer.parseInt(n2);
                }

                sum=a1+b1;
                t.setText("sum="+sum);
                System.out.println("n1="+n1+"\tn2="+n2+"\tsum="+sum);

//                try {
//
//                }
//                catch (NumberFormatException e)
//                {
//                    System.out.println("Error");
//                }

            }
        });
    }
}