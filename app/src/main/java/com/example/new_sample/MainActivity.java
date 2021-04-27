package com.example.new_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;

    private Button b_equal;
    private Button b_multi;
    private Button b_divide;
    private Button b_add;
    private Button b_sub;

    private Button b_clear; //C
    private Button b_dot;
    private Button b_ans;
    private Button b_plusMinus;
    private Button b_backspace;

    private Button b_pi;

    private TextView t1;
    private TextView t2;

    private double aux = Double.NaN;
    private boolean primeraVez = true;

    private int count=0;
    private String expression="";
    private String text="";
    private Double result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSetup();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "1");


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                t2.setText(t2.getText().toString() + "0");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exceedLength();
                t2.setText(t2.getText().toString() + ".");
            }
        });

        b_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (primeraVez) {
                    t2.setText("0");
                } else {
                    t2.setText(String.valueOf(aux));
                }
                }
        });

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operationClicked("+");
            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operationClicked("-");
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operationClicked("*");
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operationClicked("/");

            }
        });

        b_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operationClicked("π");

            }
        });

        b_plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!t2.getText().toString().isEmpty() || !t1.getText().toString().isEmpty()) {
                    String s=t1.getText().toString();
                    char arr[]=s.toCharArray();
                    if(arr[0]=='-')
                        t1.setText(s.substring(1,s.length()));
                    else
                        t1.setText("-"+s);
                }
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(t2.length()!=0)
                {
                    expression=t2.getText().toString();
                }
                t1.setText("");
                if(expression.length()==0)
                    expression="0.0";
                try
                {
                    //evaluate the expression
                    result=calculate(expression);
                    t2.setText(result+"");
                    primeraVez = false;
                    aux = result;
                }
                catch (Exception e)
                {
                    t1.setText("Invalid Expression");
                    t2.setText("");
                    expression="";
                    e.printStackTrace();
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
            }
        });

        b_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((t2.getText().length() > 0)) {
                    if (t2.getText().length() == 1) {
                        t2.setText("");
                    } else {
                        CharSequence name = t2.getText().toString();
                        t2.setText(name.subSequence(0, name.length() - 1));
                    }
                }
            }
        });

        t2.addTextChangedListener(new TextWatcher () {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(t2.getText().toString().length() > 0) {
                    double resultadoParcial = 0;
                    char[] t2CharArray = t2.getText().toString().toCharArray();
                    if(Character.isDigit(t2CharArray[t2CharArray.length - 1]) && esOperacion(t2CharArray)) {
                        resultadoParcial = calculate(t2.getText().toString());
                        t1.setText(resultadoParcial+"");
                    }
                }

            }
        });

    }

    private boolean esOperacion(char[] arr) {
        int position = 0;
        int contador = 0;
        if(arr[0] == '-') {
            position++;
        }
        for(int i = position; i < arr.length - 1; i++) {
            if(arr[i] != '+' && arr[i] != '-' && arr[i] != '*' && arr[i] != '/') {
                contador++;
            }
        }
        return contador >= 1;
    }

    private void viewSetup() {
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);

        b_equal = findViewById(R.id.button_equal);
        b_multi = findViewById(R.id.button_multi);
        b_divide = findViewById(R.id.button_divide);
        b_add = findViewById(R.id.button_add);
        b_sub = findViewById(R.id.button_sub);

        b_clear = findViewById(R.id.button_clear);
        b_dot = findViewById(R.id.button_dot);
        b_ans = findViewById(R.id.button_ANS);
        b_plusMinus = findViewById(R.id.button_plusMinus);
        b_backspace = findViewById(R.id.button_backspace);

        b_pi = findViewById(R.id.button11);

        t1 = findViewById(R.id.input);
        t2 = findViewById(R.id.output);
    }

    // Remove error message that is already written there.
    private void ifErrorOnOutput() {
        if (t2.getText().toString().equals("Error")) {
            t2.setText("");
        }
    }

    // Make text small if too many digits.
    private void exceedLength() {
        if (t1.getText().toString().length() > 10) {
            t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }

    private void operationClicked(String op)
    {
        if(t2.length()!=0)
        {
            t2.setText(t2.getText() + op);
            count=0;
        }
        else
        {
            String text=t1.getText().toString();
            if(text.length()>0)
            {
                String newText=text.substring(0,text.length()-1)+op;
                t1.setText(newText);
            }
        }
    }

    private double calculate(String expression) {
        String op1String ="";
        String op2String ="";

        double op1 = 0;
        double op2 = 0;

        char simbol = '+';
        boolean neg = false;

        int position = 0;
        char arr[]=expression.toCharArray();

        boolean primeraVez = true;
        boolean cambiarSigno = false;

        if(arr[0]=='-')
            neg = true;

        while ((arr[position] != '+' && arr[position] != '-' && arr[position] != '*' && arr[position] != '/') || primeraVez) {
            op1String += arr[position];
            position++;
            primeraVez = false;
        }
        simbol = arr[position];
        if(arr[position + 1] == '-') {
            cambiarSigno = true;
            position++;
        }

        for (int i = position + 1; i < arr.length; i++) {
            if(arr[i] != '+' && arr[i] != '-' && arr[i] != '*' && arr[i] != '/') {
                op2String += arr[i];
            } else {
                op1 = Double.valueOf(op1String);
                op2 = Double.valueOf(op2String);
                if(cambiarSigno) {
                    op2 = op2 * (-1);
                    cambiarSigno = false;
                }

                switch (simbol) {
                    case '+': {
                        op1 += op2;
                        break;
                    }
                    case '-': {
                        op1 -= op2;
                        break;
                    }
                    case '*': {
                        op1 = op1 * op2;
                        break;
                    }
                    case '/': {
                        op1 = op1 / op2;
                        break;
                    }
                    case 'π': {
                        op1 = UtilesMatemáticas.pi();
                        break;
                    }

                }
                simbol = arr[i];
                if(arr[i + 1] == '-') {
                    cambiarSigno = true;
                    i++;
                }
                position = i;
                op2String ="";
                op1String = String.valueOf(op1);

            }
        }

        op1 = Double.valueOf(op1String);
        op2 = Double.valueOf(op2String);

        if(cambiarSigno) {
            op2 = op2 * (-1);
            cambiarSigno = false;
        }
        switch (simbol) {
            case '+': {
                op1 += op2;
                break;
            }
            case '-': {
                op1 -= op2;
                break;
            }
            case '*': {
                op1 = op1 * op2;
                break;
            }
            case '/': {
                op1 = op1 / op2;
                break;
            }

        }

        return op1;
    }

}