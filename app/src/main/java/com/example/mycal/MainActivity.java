package com.example.mycal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView view1;
    boolean Addition, Subtract, Multiplication, Division, Decimal;
    Button btn1, getBtn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnMin,btnPlus,btnDot,
    btnEqual,btnStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnMin = (Button)findViewById(R.id.btnMin);
        btnDot = (Button)findViewById(R.id.btnDot);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnStar = (Button)findViewById(R.id.btnStar);
        btnEqual = (Button)findViewById(R.id.btnEqual);
        view1 = (TextView)findViewById(R.id.view1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText(view1.getText()+"0");
            }
        });
                btnPlus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(view1.getText().length()!=0){
                            input1=Float.parseFloat(view1.getText()+"");
                            Addition=true;
                            Decimal=false;
                            view1.setText(null);

                        }
                    }
                });
                btnMin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(view1.getText().length()!=0){
                            input1=Float.parseFloat(view1.getText()+"");
                            Subtract=true;
                            Decimal=false;
                            view1.setText(null);


                        }
                    }
                });
                btnStar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (view1.getText().length()!=0){
                            input1=Float.parseFloat(view1.getText()+"");
                            Multiplication=true;
                            Decimal=false;
                            view1.setText(null);
                        }
                    }
                });
                btnEqual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Addition||Multiplication||Subtract){
                            input2=Float.parseFloat(view1.getText()+"");

                        }
                        if (Addition){
                            view1.setText(input1+input2+"");
                            Addition=false;
                        }
                        if (Subtract){
                            view1.setText(input1-input2+"");
                            Subtract=false;
                        }
                        if (Multiplication){
                            view1.setText(input1*input2+"");
                            Multiplication=false;
                        }
                    }
                });

                btnDot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Decimal){

                        }
                        else {
                            view1.setText(view1.getText()+".");
                            Decimal=true;
                        }
                    }
                });







    }
}
