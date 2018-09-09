package com.gstar.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    TextView result;
    Button btn1,btn2,btn3,btn4,btn5;
    String a,b;
    int c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(EditText) findViewById(R.id.editText4);
        txt2=(EditText) findViewById(R.id.editText5);
        result=(TextView)findViewById(R.id.textView);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                a = txt1.getText().toString();
                b = txt2.getText().toString();

                c = Integer.parseInt(a);
                d = Integer.parseInt(b);
                e = c+d;

                result.setText(Integer.toString(e));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                a = txt1.getText().toString();
                b = txt2.getText().toString();

                c = Integer.parseInt(a);
                d = Integer.parseInt(b);
                e = c-d;

                result.setText(Integer.toString(e));

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                a = txt1.getText().toString();
                b = txt2.getText().toString();

                c = Integer.parseInt(a);
                d = Integer.parseInt(b);
                e = c*d;

                result.setText(Integer.toString(e));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                a = txt1.getText().toString();
                b = txt2.getText().toString();

                c = Integer.parseInt(a);
                d = Integer.parseInt(b);
                e = c/d;

                result.setText(Integer.toString(e));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText("");
                result.setText("");
            }
        });

    }
}
