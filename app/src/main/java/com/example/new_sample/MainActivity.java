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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


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
    private Button b_e;
    private Button b_10x;
    private Button b_log10;
    private Button b_cuadrado;
    private Button b_cubo;
    private Button b_dosX;
    private Button b_eX;
    private Button b_inv;
    private Button b_sqrt;
    private Button b_cos;
    private Button b_sin;

    private TextView in;
    private TextView out;

    private double aux = Double.NaN;
    private boolean primeraVez = true;

    private String expression = "";
    private String text = "";
    private Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSetup();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "0");
            }
        });

        b_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if(puedePi(out.getText().toString()))
                    out.setText(out.getText().toString() + UtilesMatemáticas.pi());
            }
        });

        b_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if(puedePi(out.getText().toString()))
                    out.setText(out.getText().toString() + UtilesMatemáticas.e());
            }
        });

        b_10x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.diezElevadoX(0.0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.diezElevadoX(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.diezElevadoX(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText("");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.log10deX(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.log10deX(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.cuadrado(0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.cuadrado(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.cuadrado(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_cubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.cubo(0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.cubo(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.cubo(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_dosX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.DosAlaX(0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.DosAlaX(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.DosAlaX(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_eX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.eElevadoX(0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.eElevadoX(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.eElevadoX(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (in.getText().equals("Invalid Expression")) {
                    in.setText("");
                } else if (in.getText().toString().equals("")||in.getText().toString().equals("-")) {
                    out.setText("");
                } else if (in.getText().toString().equals("0")){
                    out.setText("Indeterminación");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.invertir(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.invertir(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (in.getText().equals("Invalid Expression")) {
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.raízCuadrada(0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            if(out.getText().charAt(0) == '-'){
                                out.setText("Entrada inválida");
                            }else {
                                out.setText(UtilesMatemáticas.raízCuadrada(Double.parseDouble(in.getText().toString())) + "");
                            }
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            if(ultimoSignoMenos(out.getText().toString())){
                                out.setText("Entrada inválida");
                            }else {
                                String ultimo = ultimoNumero(out.getText().toString());
                                String partes[] = ultimo.split("º");

                                out.setText(partes[0] + UtilesMatemáticas.raízCuadrada(Double.parseDouble(partes[1])) + "");
                                in.setText("");
                            }
                        }
                    }
                }
            }
        });

        b_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double coseno;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.coseno(0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            coseno = Double.parseDouble(in.getText().toString());
                            out.setText(df.format(UtilesMatemáticas.coseno(coseno)) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            coseno = Double.parseDouble(partes[1]);
                            out.setText(partes[0] + df.format(UtilesMatemáticas.coseno(coseno)) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double seno;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.seno(0)+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            seno = Double.parseDouble(in.getText().toString());
                            out.setText(df.format(UtilesMatemáticas.seno(seno)) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            seno = Double.parseDouble(partes[1]);
                            out.setText(partes[0] + df.format(UtilesMatemáticas.seno(seno)) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });


        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if((!out.getText().toString().isEmpty()) && (puedeDecimal( out.getText().toString())) ){
                    out.setText(out.getText().toString() + ".");
                }else{
                    out.setText(out.getText().toString() + "");
                }

            }
        });

        b_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if (primeraVez) {
                    out.setText(out.getText().toString() + "0");
                } else {
                    out.setText(out.getText().toString() + String.valueOf(aux));
                }
            }
        });

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if((!out.getText().toString().isEmpty()) && (permiteSimbolo(out.getText().toString(),"+"))){
                    operationClicked("+");
                }else{
                    out.setText(out.getText().toString() + "");
                }

            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(out.getText().toString().isEmpty()){
                    out.setText("-");
                }
                else if(out.getText().toString().equals("-")){
                    out.setText(out.getText().toString() + "");
                }else if(permiteSimbolo(out.getText().toString(),"-")){
                    if (out.length() != 0) {
                        String s = out.getText().toString() + "-";
                        out.setText(s);
                    } else {
                        String text = in.getText().toString();
                        if (text.length() > 0) {
                            String newText = text.substring(0, text.length() - 1) + "-";
                            in.setText(newText);
                        } else if (text.length() == 0) {
                            out.setText("-");
                        }
                    }
                }
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if((!out.getText().toString().isEmpty()) && (permiteSimbolo(out.getText().toString(),"*"))){
                    operationClicked("*");
                }else{
                    out.setText(out.getText().toString() + "");
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if((!out.getText().toString().isEmpty()) && (permiteSimbolo(out.getText().toString(),"/"))){
                    operationClicked("/");
                }else{
                    out.setText(out.getText().toString() + "");
                }

            }
        });

        b_plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if (!out.getText().toString().isEmpty() || !in.getText().toString().isEmpty()) {
                    String s = in.getText().toString();
                    char arr[] = s.toCharArray();
                    if (arr[0] == '-')
                        out.setText(s.substring(1, s.length()));
                    else
                        out.setText("-" + s);
                }
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (out.length() != 0) {
                    expression = out.getText().toString();
                }
                in.setText("");
                if (expression.length() == 0)
                    expression = "0.0";
                try {
                    result = calculate(expression);
                    out.setText(result + "");
                    primeraVez = false;
                    aux = result;
                } catch (Exception e) {
                    try {
                        if ((Double) Double.parseDouble(expression) instanceof Double) {
                            in.setText(expression);
                        }
                        else {
                            in.setText("Invalid Expression");
                            expression = "";
                        }
                    } catch (NumberFormatException numberFormatException) {
                        numberFormatException.printStackTrace();

                    }
                    out.setText("");
                    e.printStackTrace();
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.setText("");
                out.setText("");
            }
        });

        b_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if ((out.getText().length() > 0)) {
                    if (out.getText().length() == 1) {
                        out.setText("");
                    } else {
                        CharSequence name = out.getText().toString();
                        out.setText(name.subSequence(0, name.length() - 1));
                    }
                }
            }
        });

        out.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (out.getText().toString().length() > 0) {
                    double resultadoParcial = 0;
                    char[] t2CharArray = out.getText().toString().toCharArray();
                    char[] t2CharArrayCopia;
                    int numSimbolos = getNumSimbolos(t2CharArray);
                    if (numSimbolos == 0) {
                        in.setText(out.getText().toString());
                    } else {
                        if ((numSimbolos == 1 && esSimbolo(t2CharArray[t2CharArray.length - 1])) || (numSimbolos == 2 && esSimbolo(t2CharArray[t2CharArray.length - 1]) && esSimbolo(t2CharArray[t2CharArray.length - 2]))) {
                            t2CharArrayCopia = eliminarUltimosSimbolos(t2CharArray);
                            in.setText(charArrayToString(t2CharArrayCopia));
                        } else {
                            t2CharArrayCopia = out.getText().toString().toCharArray();
                            if (numSimbolos > 1 && esSimbolo(t2CharArray[t2CharArray.length - 1])) {
                                t2CharArrayCopia = eliminarUltimosSimbolos(t2CharArray);
                            }
                            resultadoParcial = calculate(charArrayToString(t2CharArrayCopia));
                            in.setText(resultadoParcial + "");
                        }

                    }
                }
            }
        });

    }

    private boolean permiteSimbolo(String s, String sim){
        char[] arr = s.toCharArray();
        int n=arr.length-1;
        boolean valido=true;
        if (esSimbolo(arr[n])) {
            if(!sim.equals("-")){
                valido=false;
            }else{
                if(esSimbolo(arr[n-1])){
                    valido=false;
                }
            }
        }
        return valido;
    }


    private boolean puedeDecimal(String s){
        char[] arr = s.toCharArray();
        int n=arr.length-1;
        boolean valido=true;
        while (n>=0 && !esSimbolo(arr[n])) {
            if(arr[n]=='.'){
                valido=false;
            }
            n--;
        }
        if(esSimbolo(arr[arr.length-1])){
            valido=false;
        }
        return valido;
    }


    private String charArrayToString(char[] arr) {
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    private int getNumSimbolos(char[] arr) {
        int position = 0;
        int contador = 0;
        boolean anterior = false;
        if (arr[0] == '-') {
            position++;
        }
        for (int i = position; i < arr.length; i++) {
            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/') {
                if (!anterior) {
                    contador++;
                    anterior = true;
                }
            }
            anterior = false;
        }
        return contador;
    }

    private boolean esSimbolo(char caracter) {
        return (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/');
    }

    private char[] eliminarUltimosSimbolos(char[] arr) {
        int n = arr.length;
        while (esSimbolo(arr[n - 1])) {
            n--;
        }
        char[] arrReturn = new char[n];

        for (int i = 0; i < n; i++) {
            arrReturn[i] = arr[i];
        }

        return arrReturn;
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

        b_pi = findViewById(R.id.button_Pi);
        b_e = findViewById(R.id.b_e);
        b_10x = findViewById(R.id.b_10x);
        b_log10 = findViewById(R.id.b_log10);
        b_cuadrado = findViewById(R.id.b_cuadrado);
        b_cubo = findViewById(R.id.b_cubo);
        b_dosX = findViewById(R.id.b_dosX);
        b_eX = findViewById(R.id.b_eX);
        b_inv = findViewById(R.id.b_inv);
        b_sqrt = findViewById(R.id.b_sqrt);
        b_cos = findViewById(R.id.b_cos);
        b_sin = findViewById(R.id.b_sin);

        in = findViewById(R.id.input);
        out = findViewById(R.id.output);
    }


    // Remove error message that is already written there.
    private void ifErrorOnOutput() {
        if (out.getText().toString().equals("Error")) {
            out.setText("");
        }
    }


    // Make text small if too many digits.
    private void exceedLength() {
        if (in.getText().toString().length() > 10) {
            in.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }

    private void operationClicked(String op) {
        if (out.length() != 0) {
            out.setText(out.getText() + op);
        } else {
            String text = in.getText().toString();
            if (text.length() > 0) {
                String newText = text.substring(0, text.length() - 1) + op;
                in.setText(newText);
            }
        }
    }

    private double calculate(String expression) {
        String op1String = "";
        String op2String = "";
        double op1 = 0;
        double op2 = 0;

        char simbol = '+';
        boolean neg = false;

        int position = 0;
        char arr[] = expression.toCharArray();

        boolean primeraVez = true;
        boolean cambiarSigno = false;

        if (arr[0] == '-')
            neg = true;

        while ((arr[position] != '+' && arr[position] != '-' && arr[position] != '*' && arr[position] != '/') || primeraVez) {
            op1String += arr[position];
            position++;
            primeraVez = false;
        }
        simbol = arr[position];
        if (arr[position + 1] == '-') {
            cambiarSigno = true;
            position++;
        }

        for (int i = position + 1; i < arr.length; i++) {
            if (arr[i] != '+' && arr[i] != '-' && arr[i] != '*' && arr[i] != '/' && arr[position] != 'π') {
                op2String += arr[i];
            } else {
                op1 = Double.valueOf(op1String);
                op2 = Double.valueOf(op2String);
                if (cambiarSigno) {
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
                simbol = arr[i];
                if (arr[i + 1] == '-') {
                    cambiarSigno = true;
                    i++;
                }
                position = i;
                op2String = "";
                op1String = String.valueOf(op1);

            }
        }

        op1 = Double.valueOf(op1String);
        op2 = Double.valueOf(op2String);

        if (cambiarSigno) {
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
        return round(op1,5);
    }


    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        Double valor = value;
        if(!valor.isNaN()) {
            BigDecimal bd = new BigDecimal(Double.toString(value));
            bd = bd.setScale(places, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }
        return value;
    }

    private static boolean puedePi(String cadena){

        if(cadena.isEmpty())
            return true;
        else
            if(NoEsNumeroNiPunto(cadena.charAt(cadena.length()-1))){
                return true;
            }else{
                return false;
            }

    }

    private static boolean NoEsNumeroNiPunto(char c){
        switch (c){
            case '0':
                return false;
            case '1':
                return false;
            case '2':
                return false;
            case '3':
                return false;
            case '4':
                return false;
            case '5':
                return false;
            case '6':
                return false;
            case '7':
                return false;
            case '8':
                return false;
            case '9':
                return false;
            case '.':
                return false;
            default:
                return true;

        }
    }

    public String ultimoNumero(String expression){

        for(int i = expression.length()-1; i>=0; --i){
            if(esSimbolo(expression.charAt(i))){
                return expression.substring(0,i+1)+'º'+expression.substring(i+1,expression.length());
            }
        }
        return expression;

    }

    public boolean ultimoSignoMenos(String expression){

        for(int i=expression.length()-1; i>=0; --i){
            if(expression.charAt(i) == '-')
                return true;
            else if(esSimbolo(expression.charAt(i)))
                return false;
        }

        return false;

    }


}