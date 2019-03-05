package com.example.shivamkumar.mcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonDot, buttonC, buttonEql;
    EditText answer;

    float mValueOne, mValueTwo;

    boolean Addition, mSubtract, Multiplication, Division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEql = (Button) findViewById(R.id.buttoneql);
        answer = (EditText) findViewById(R.id.answer);
try {
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "1");
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "2");
        }
    });

    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "3");
        }
    });

    button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "4");
        }
    });

    button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "5");
        }
    });

    button6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "6");
        }
    });

    button7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "7");
        }
    });

    button8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "8");
        }
    });

    button9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "9");
        }
    });

    button0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + "0");
        }
    });

    buttonAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (answer == null) {
                answer.setText("");
            } else {
                try {
                    mValueOne = Float.parseFloat(answer.getText() + "");
                } catch (Exception e) {
                }
                ;
                Addition = true;
                answer.setText(null);
            }
        }
    });

    buttonSub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                mValueOne = Float.parseFloat(answer.getText() + "");
            } catch (Exception e) {
            }
            ;
            mSubtract = true;
            answer.setText(null);
        }
    });

    buttonMul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                mValueOne = Float.parseFloat(answer.getText() + "");
            } catch (Exception e) {
            }
            ;
            Multiplication = true;
            answer.setText(null);
        }
    });

    buttonDiv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                mValueOne = Float.parseFloat(answer.getText() + "");
            } catch (Exception e) {
            }
            ;
            Division = true;
            answer.setText(null);
        }
    });

    buttonEql.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mValueTwo = Float.parseFloat(answer.getText() + "");

            if (Addition == true) {
                answer.setText(mValueOne + mValueTwo + "");
                Addition = false;
            }

            if (mSubtract == true) {
                answer.setText(mValueOne - mValueTwo + "");
                mSubtract = false;
            }

            if (Multiplication == true) {
                answer.setText(mValueOne * mValueTwo + "");
                Multiplication = false;
            }

            if (Division == true) {
                answer.setText(mValueOne / mValueTwo + "");
                Division = false;
            }
        }
    });

    buttonC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText("");
        }
    });

    buttonDot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText() + ".");
        }
    });
}catch (Exception e){};

    }
}
