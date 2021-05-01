package com.example.new_sample;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Esta clase define el comportamiento de la calculadora científica, su funcionalidad y elementos.
 * @author: Pablo Ascorbe, Alberto Escalona, David Íñiguez e Iñaki Lafuente a partir de la librería de ritik2410
 * @version: 01/05/2021
 * @see <a href = "https://github.com/ritik2410/Elegant_Calculator"/>Elegant_Calculator</a>
 */

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
    private Button b_cbrt;
    private Button b_factorial;
    private Button b_ncr;
    private Button b_cos;
    private Button b_sin;
    private Button b_tan;
    private Button b_ln;
    private Button b_Atan;
    private Button b_Acos;
    private Button b_Asen;
    private Button b_xAlay;
    private Button b_xRaizY;
    private Button b_logyX;
    private Button b_ParenIZ;
    private Button b_ParenDe;

    private boolean estaNCR=false;
    private int posi=0;

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
            /**
             * Listener para el botón b1, permite escribir un 1 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b2, permite escribir un 2 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b3, permite escribir un 3 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b4, permite escribir un 4 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b5, permite escribir un 5 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b6, permite escribir un 6 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b7, permite escribir un 7 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b8, permite escribir un 8 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b9, permite escribir un 9 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b0, permite escribir un 0 en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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

        b_ParenIZ.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_ParenIZ, permite escribir un ( en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + "(");
            }
        });

        b_ParenDe.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_ParenDe, permite escribir un ) en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                out.setText(out.getText().toString() + ")");
            }
        });

        b_pi.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_pi, permite escribir el numero pi en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b_e, permite escribir el numero e en la calculadora, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b_10x, permite escribir la expresión potencia de 10 en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.diezElevadoX(0.0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.diezElevadoX(calculate(out.getText().toString()))+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.diezElevadoX(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1)) && !contieneParentesis(out.getText().toString())) {
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
            /**
             * Listener para el botón b_log10, permite escribir la expresión logaritmo base 10 en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText("");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.log10deX(calculate(out.getText().toString()))+"");
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

        b_ln.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_ln, permite escribir la expresión logaritmo neperiano en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText("");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.lnDeX(calculate(out.getText().toString()))+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.lnDeX(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.lnDeX(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_cuadrado.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_cuadrado, permite escribir la expresión cuadrado en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.cuadrado(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.cuadrado(calculate(out.getText().toString()))+"");
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
            /**
             * Listener para el botón b_cuadrado, permite escribir la expresión cubo en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.cubo(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.cubo(calculate(out.getText().toString()))+"");
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
            /**
             * Listener para el botón b_dosX, permite escribir la expresión potencia de 2 en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.DosAlaX(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.DosAlaX(calculate(out.getText().toString()))+"");
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
            /**
             * Listener para el botón b_eX, permite escribir la expresión e elevado al numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.eElevadoX(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.eElevadoX(calculate(out.getText().toString()))+"");
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
            /**
             * Listener para el botón b_inv, permite escribir la expresión inverso de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {

                ifErrorOnOutput();
                exceedLength();
                if (in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())) {
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                } else if (in.getText().toString().equals("")||in.getText().toString().equals("-")) {
                    out.setText("");
                } else if (in.getText().toString().equals("0")){
                    out.setText("Indeterminación");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.invertir(calculate(out.getText().toString()))+"");
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
            /**
             * Listener para el botón b_sqrt, permite escribir la expresión raiz cuadrada de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())) {
                    in.setText("");
                }  else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if (in.getText().toString().equals("") || in.getText().toString().equals("-")) {
                    out.setText(UtilesMatemáticas.raízCuadrada(0) + "");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.raízCuadrada(calculate(out.getText().toString()))+"");
                } else {
                    try {
                        /*Double d = (Double) Double.parseDouble(in.getText().toString());
                        if (d instanceof Double) {
                            if (d < 0) {
                                out.setText("Math Error");
                                return;
                            } else {
                                out.setText(UtilesMatemáticas.raízCuadrada(d) + "");
                            }


                        }*/
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            if(Double.parseDouble(out.getText().toString()) > 0)
                                out.setText(UtilesMatemáticas.raízCuadrada(Double.parseDouble(in.getText().toString())) + "");
                            else
                                out.setText("Entrada inválida");
                        }

                    } catch (NumberFormatException e) {
                        if (!esSimbolo(out.getText().charAt(out.getText().toString().length() - 1))) {
                            if (ultimoSignoMenos(out.getText().toString())) {
                                out.setText("Entrada inválida");
                            } else {
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


        b_cbrt.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_cbrt, permite escribir la expresión raiz cubica de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                /*ifErrorOnOutput();
                exceedLength();
                if (in.getText().equals("Invalid Expression")) {
                    in.setText("");
                } else if (in.getText().toString().equals("") || in.getText().toString().equals("-")) {
                    out.setText(UtilesMatemáticas.raízCubica(0) + "");
                } else {
                    Double d = (Double) Double.parseDouble(in.getText().toString());
                    if (d instanceof Double) {
                        if(d<0){
                            out.setText("-"+UtilesMatemáticas.raízCubica((-1)*d)+"");
                        }else{
                            out.setText(UtilesMatemáticas.raízCubica(d) + "");
                        }


                    }
                }
            }*/
                ifErrorOnOutput();
                exceedLength();
                if (in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())) {
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                } else if (in.getText().toString().equals("") || in.getText().toString().equals("-")) {
                    out.setText(UtilesMatemáticas.raízCubica(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.raízCubica(calculate(out.getText().toString()))+"");
                }else {
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            out.setText(UtilesMatemáticas.raízCubica(Double.parseDouble(in.getText().toString())) + "");
                        }
                    } catch (NumberFormatException e) {
                        if (!esSimbolo(out.getText().charAt(out.getText().toString().length() - 1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            out.setText(partes[0] + UtilesMatemáticas.raízCubica(Double.parseDouble(partes[1])) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });






        b_factorial.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_factorial, permite escribir la expresión factorial de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                if (in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())) {
                    in.setText("");
                }else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if (in.getText().toString().equals("") || in.getText().toString().equals("-")) {
                    out.setText(UtilesMatemáticas.factorial(0) + "");
                }else if(ultimoSignoMenos(out.getText().toString())) {
                    out.setText("Math Error");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString())) {
                        Double resultado = calculate(out.getText().toString());
                        if(!resultado.isNaN()) {
                            String partes[] = resultado.toString().split("\\.");
                            out.setText(UtilesMatemáticas.factorial(Integer.parseInt(partes[0] + "")) + "");
                        }
                    }
                }else {
                    try {
                        String ultimo = ultimoNumero(out.getText().toString());
                        String partes[] = ultimo.split("º");
                        if(partes.length > 1) {
                            Integer i = (Integer) Integer.parseInt(partes[1]);
                            if (i instanceof Integer) {
                                if (i < 0) {
                                    out.setText("Math Error");
                                    return;
                                } else {
                                    out.setText(partes[0]+UtilesMatemáticas.factorial(i) + "");
                                }
                            }
                        }else{
                            Integer i = (Integer) Integer.parseInt(in.getText().toString());
                            if (i instanceof Integer) {
                                if (i < 0) {
                                    out.setText("Math Error");
                                    return;
                                } else {
                                    out.setText(UtilesMatemáticas.factorial(i) + "");
                                }
                            }

                        }
                    } catch (NumberFormatException e) {
                        String ultimo = ultimoNumero(out.getText().toString());
                        String partes[] = ultimo.split("º");
                        if(partes.length> 1) {
                            String decimal[] = partes[1].split("\\.");
                            if (decimal.length > 1 && Integer.parseInt(decimal[1]) == 0) {
                                int IntValue = (int) Math.round(Double.parseDouble(partes[1]));
                                out.setText(partes[0]+UtilesMatemáticas.factorial(IntValue) + "");
                            }else{
                                out.setText("Math Error");
                            }
                        }else{
                            String decimal[] = ultimo.split("\\.");
                            if (decimal.length > 1 && Long.parseLong(decimal[1]) == 0) {
                                int IntValue = (int) Integer.parseInt(decimal[0]);
                                out.setText(UtilesMatemáticas.factorial(IntValue) + "");
                            }else{
                                out.setText("Math Error");
                            }
                        }

                    }
                }
            }
        });


        b_ncr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                String cadena=out.getText().toString();
                if(contieneParentesis(out.getText().toString())) {
                }else if(solo1NCR(out.getText().toString()) && !tieneSimbolo(cadena))
                    out.setText(cadena+"NCR");
            }
        });

        b_xAlay.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_xAlay, permite escribir la expresión x elevado a y en la calculadora
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                String cadena=out.getText().toString();
                if(contieneParentesis(out.getText().toString())) {
                }if(solo1NCR(cadena) && !tieneSimbolo(cadena))
                    out.setText(cadena+"^");
            }
        });

        b_xRaizY.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_xRaizY, permite escribir la expresión raiz de grado y del numero x en la calculadora
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                String cadena=out.getText().toString();
                if(contieneParentesis(out.getText().toString())) {
                }if(solo1NCR(cadena) && !tieneSimboloQueNoSeaMenos(cadena))
                    out.setText(cadena+"√");
            }
        });

        b_logyX.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_logyX, permite escribir la expresión logaritmo base y del numero x en la calculadora
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                String cadena=out.getText().toString();
                if(contieneParentesis(out.getText().toString())) {
                }if(solo1NCR(cadena) && !tieneSimboloQueNoSeaMenos(cadena))
                    out.setText(cadena+"LOG");
            }
        });

        b_cos.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_cos, permite escribir la expresión coseno de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double coseno;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.coseno(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.coseno(calculate(out.getText().toString()))+"");
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

        b_Acos.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_Acos, permite escribir la expresión arcoseno de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double coseno;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.ArcCoseno(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.ArcCoseno(calculate(out.getText().toString()))+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            coseno = Double.parseDouble(in.getText().toString());
                            out.setText(df.format(UtilesMatemáticas.ArcCoseno(coseno)) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            coseno = Double.parseDouble(partes[1]);
                            out.setText(partes[0] + df.format(UtilesMatemáticas.ArcCoseno(coseno)) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });

        b_sin.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_sin, permite escribir la expresión seno de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double seno;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.seno(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.seno(calculate(out.getText().toString()))+"");
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

        b_Asen.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_Asen, permite escribir la expresión arcoseno de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double seno;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.ArcSeno(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.ArcSeno(calculate(out.getText().toString()))+"");
                }else{
                    try {
                        if ((Double) Double.parseDouble(out.getText().toString()) instanceof Double) {
                            seno = Double.parseDouble(in.getText().toString());
                            out.setText(df.format(UtilesMatemáticas.ArcSeno(seno)) + "");
                        }
                    } catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            seno = Double.parseDouble(partes[1]);
                            out.setText(partes[0] + df.format(UtilesMatemáticas.ArcSeno(seno)) + "");
                            in.setText("");
                        }
                    }
                }
            }
        });



        b_tan.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_tan, permite escribir la expresión tangente de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double tangente;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.tangente(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.tangente(calculate(out.getText().toString()))+"");
                }else{
                    //try {
                    Double d=(Double) Double.parseDouble(in.getText().toString());
                        if (d instanceof Double) {
                            for(int n=1;n<400;n++) {
                                if (d == (90 * n)) {
                                    out.setText("Math Error");
                                    return;
                                }
                            }
                            tangente = Double.parseDouble(in.getText().toString());
                            out.setText(df.format(UtilesMatemáticas.tangente(tangente)) + "");
                        }
                   // }
                    /*
                    catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            tangente = Double.parseDouble(partes[1]);
                            out.setText(partes[0] + df.format(UtilesMatemáticas.tangente(tangente)) + "");
                            in.setText("");
                        }
                    }*/
                }
            }
        });

        b_Atan.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_Atan, permite escribir la expresión arcotangente de un numero en la calculadora, borrando el texto invalid expression si estuviese
             * Hace las comprobaciones pertinentes para mostrar error si lo hubiese y no permitir operaciones que no sean correctas
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                ifErrorOnOutput();
                exceedLength();
                Double tangente;
                DecimalFormat df = new DecimalFormat("#");
                df.setMaximumFractionDigits(8);
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
                    in.setText("");
                } else if(out.getText().toString().equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }else if(in.getText().toString().equals("")||in.getText().toString().equals("-")){
                    out.setText(UtilesMatemáticas.ArcTangente(0)+"");
                }else if(contieneParentesis(out.getText().toString())){
                    if(contieneParejasCerradasDeParentesis(out.getText().toString()))
                        out.setText(UtilesMatemáticas.ArcTangente(calculate(out.getText().toString()))+"");
                }else{
                    //try {
                    Double d=(Double) Double.parseDouble(in.getText().toString());
                    if (d instanceof Double) {
                        for(int n=1;n<400;n++) {
                            if (d == (90 * n)) {
                                out.setText("Math Error");
                                return;
                            }
                        }
                        tangente = Double.parseDouble(in.getText().toString());
                        out.setText(df.format(UtilesMatemáticas.ArcTangente(tangente)) + "");
                    }
                    // }
                    /*
                    catch (NumberFormatException e) {
                        if(!esSimbolo(out.getText().charAt(out.getText().toString().length()-1))) {
                            String ultimo = ultimoNumero(out.getText().toString());
                            String partes[] = ultimo.split("º");

                            tangente = Double.parseDouble(partes[1]);
                            out.setText(partes[0] + df.format(UtilesMatemáticas.tangente(tangente)) + "");
                            in.setText("");
                        }
                    }*/
                }
            }
        });





        b_dot.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_dot, permite escribir un punto decimal en la calculadora, borrando el texto invalid expression si estuviese
             * e impidiendo que haya mas de un punto decimal por número
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                exceedLength();
                if(in.getText().equals("Invalid Expression") || !solo1NCR(in.getText().toString())){
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
            /**
             * Listener para el botón b_ans, permite escribir la respuesta anterior en la calculadora, borrando el texto invalid expression si estuviese
             * y añadiendo un 0 en el caso de que no se haya realizado ninguna operación previa
             * @param view vista en la que esta el boton
             */
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
            /**
             * Listener para el botón b_add, permite escribir un + en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(!solo1NCR(out.getText().toString())){
                    in.setText("Entrada inválida");
                } else if((!out.getText().toString().isEmpty()) && (permiteSimbolo(out.getText().toString(),"+"))){
                    operationClicked("+");
                }else{
                    out.setText(out.getText().toString() + "");
                }

            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_sub, permite escribir un - en la calculadora, borrando el texto invalid expression si estuviese
             * y realizando las comprobaciones oportunas para que permita escribir numeros negativos pero no permita sintaxis incorrectas.
             * Se da por válida la sintaxis de dos símbolos seguidos siempre que el segundo sea un - representando un numero negativo: 1*-5
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(out.getText().toString().isEmpty()){
                    out.setText("-");
                }else if(!solo1NCR(out.getText().toString())){
                    in.setText("Entrada inválida");
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
            /**
             * Listener para el botón b_multi, permite escribir un * en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(!solo1NCR(out.getText().toString())){
                    in.setText("Entrada inválida");
                }else if((!out.getText().toString().isEmpty()) && (permiteSimbolo(out.getText().toString(),"*"))){
                    operationClicked("*");
                }else{
                    out.setText(out.getText().toString() + "");
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_divide, permite escribir una / en la calculadora, borrando el texto invalid expression si estuviese
             * y comprobando que la sintaxis lo permite, en caso contrario no añade nada
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(!solo1NCR(out.getText().toString())){
                    in.setText("Entrada inválida");
                }else if((!out.getText().toString().isEmpty()) && (permiteSimbolo(out.getText().toString(),"/"))){
                    operationClicked("/");
                }else{
                    out.setText(out.getText().toString() + "");
                }

            }
        });

        b_plusMinus.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_plusMinus, permite  poner en negativo el resultado actual, borrando el texto invalid expression si estuviese
             * Funciona con la expresión y con el resultado calculado. Pone el opuesto como resultado para seguir calculando desde ahi
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }else if(!solo1NCR(out.getText().toString())){
                    in.setText("Entrada inválida");
                } else if (!out.getText().toString().isEmpty() || !in.getText().toString().isEmpty()) {
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
            /**
             * Listener para el botón b_equal, permite ecalcular el resultado de la expresión escrita, con caso especial por si esta vacía la expresion
             * y empleando el metodo calculate que se ve mas adelante. Si sucede una excepción muestra Invalid Expression
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {

                if (out.length() != 0) {
                    expression = out.getText().toString();
                }
                if(expression.equals("Math Error")){
                    out.setText("");
                    in.setText("");
                }
                in.setText("");
                if (expression.length() == 0)
                    expression = "0.0";
                try {

                    if(expression.contains("NCR")){
                        int resultado=NCR();
                        if(resultado==0){
                            out.setText("Math Error");
                            return;
                        }else{
                            out.setText(resultado+"");
                            return;
                        }
                    }else {
                        result = calculate(expression);
                        if(result.isNaN()){
                            out.setText("Math Error");
                        }else {
                            out.setText(result + "");
                            primeraVez = false;
                            aux = result;
                        }
                    }
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
            /**
             * Listener para el botón b_clear, permite borrar los campos de texto
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                in.setText("");
                out.setText("");
            }
        });

        b_backspace.setOnClickListener(new View.OnClickListener() {
            /**
             * Listener para el botón b_backspace, permite eliminar el ultimo caracter escrito en el cuadro de texto de escritura de la expresion, borrando el texto invalid expression si estuviese
             * @param view vista en la que esta el boton
             */
            @Override
            public void onClick(View view) {
                if(in.getText().equals("Invalid Expression")){
                    in.setText("");
                }
                if(out.getText().toString().contains("NCR")){
                    in.setText(in.getText().toString().replace("NCR", ""));
                    out.setText(in.getText().toString().replace("NCR", ""));
                }else if(out.getText().toString().contains("LOG")){
                    in.setText(in.getText().toString().replace("LOG", ""));
                    out.setText(in.getText().toString().replace("LOG", ""));
                }else if ((out.getText().length() > 0)) {
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

            /**
             * Listener para calcular el resultado provisional de la expresion escrita hasta el momento, con casos particulares para calcular el resultado correctamente de la expresión mas larga
             * valida hasta el momento, ignorando los ultimos signos: 14+8*- mostraría 22. Si es un número lo muestra tal cual. Se activa cada vez que el texto de la expresión cambia
             * @param s interfaz de elementos que se puede editar su contenido
             */
            @Override
            public void afterTextChanged(Editable s) {
                if (out.getText().toString().length() > 0) {
                    Double resultadoParcial = 0.0;
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
                            if(resultadoParcial.isNaN())
                                in.setText("Math Error");
                            else
                                in.setText(resultadoParcial + "");
                        }

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

            /**
             * Listener para mostrar Math Error en caso de un resultado NaN
             * @param s interfaz de elementos que se puede editar su contenido
             */
            @Override
            public void afterTextChanged(Editable s) {
                if (in.getText().toString().equals("NaN")){
                    in.setText("Math Error");
                    out.setText("Math Error");
                }
            }
        });

    }
    /**
     * Divide la cadena en dos, separando por el operando ncr
     * @return int 0
     */
            private int NCR(){
                ArrayList entrada1=new ArrayList();
                ArrayList entrada2=new ArrayList();
                if (in.getText().equals("Invalid Expression")) {
                    in.setText("");
                } else if (out.getText().toString().equals("") || out.getText().toString().equals("-")) {
                    System.out.println("################################-------HOLA OTRA VEZ "+expression+"---------"+ entrada1.toString());
                    out.setText("");
                } else {
                    //out.setText(i + "NCR");
                    System.out.println("################################-------ADIOS " + expression);
                    String primerNum=expression;
                    System.out.println("################################-------PRIMER NUMERO " + primerNum);
                    int posicion= BuscarNCR(primerNum.toCharArray());
                    System.out.println("################################-------POSICION " + posicion);
                    for (int m = 0; m <= (posicion-3); m++) {
                        entrada1.add(m, primerNum.charAt(m));
                        System.out.println("################################-------BUCLE " + entrada1.toString());
                    }

                    System.out.println("################################-------PRIMERO " + entrada1.toString());
                    System.out.println("################################-------PRIMERO " + entrada1.size());
                   // System.out.println("################################-------PRIMERO " + entrada1.get(0).toString());
                    String result = "";
                    for (int q = 0; q < entrada1.size(); q++) {
                        result += entrada1.get(q).toString();
                    }
                    System.out.println("#################################-------PRIMERO " + result.toString());
                    Integer entero1 = Integer.parseInt(result);
                    //String numero1=new String(entrada1);
                    //String numero1=entrada1.toString();
                    String numero1 = entero1.toString();
                    System.out.println("#################################--------Cadena1: " + numero1.toString());
                    /*int l=0;
                    while(l<entrada1.length&&entrada1[i]<999999999&&entrada1[i]>0){
                        numero1+=entrada1[i];
                        l++;
                    }
                    */
                    Integer n1 = (Integer) Integer.parseInt(numero1);

                    String segundoNum=expression;
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO "+expression);
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO NUM LENGTH "+segundoNum.length());
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO POSICION "+posicion);
                    int j = segundoNum.length()-1;
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO VALOR J "+j);
                    while(j >= posicion+1){
                        int n=0;
                        entrada2.add(n,expression.charAt(j));
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO BUCLE "+entrada2.toString());
                        j--;
                        n++;
                    }
                    /*
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO NUME+ TOSTRING "+entrada2.toString());
                    Integer entero2=Integer.parseInt(entrada2.toString());
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------Cadena2: "+entero2);
                    */
                    String result3 = "";
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO ENTRADA2 SIZE " + entrada2.size());
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO ENTRADA2 POSICION 0 " + entrada2.get(0));
                    for (int q = 0; q < entrada2.size(); q++) {
                        result3 += entrada2.get(q).toString();
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO BUCLE 2 " + result3);
                    }
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------SEGUNDO NUME TOSTRING " + result3);
                    Integer entero2 = Integer.parseInt(result3);
                    Integer n2 = entero2;
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------ENTERO 1: " + n1);
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------ENTERO 2: " + n2);
                    if(n1<n2||n1<0||n2<0){
                        return 0;
                       // out.setText("MathError");
                    }
                    else{
                        int p=UtilesMatemáticas.ncr(n1,n2);
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------NCR RESULTADO: " + p);
                        return p;
                        //out.setText(p);
                    }
                           /* out.setText((""));
                            Integer n = (Integer) Integer.parseInt(in.getText().toString());
                            if (n instanceof Integer) {
                                if (n < 0) {
                                    out.setText("Math Error");
                                    return;
                                } else {
                                    out.setText(UtilesMatemáticas.ncr(i, n));
                                }
                            }*/


                }
                return 0;
            }

    /**
     * Método que analiza si es válido escribir el símbolo sim a continuación en la expresión, caso especial para el - ya que es el único que puede ir detrás de otro símbolo.
     * @param s es la propia expresión
     * @param sim simbolo en concretoq ue se va a analizar si es válido sintácticamente en la expresion
     * @return true si el símbolo se puede escribir a continuación y false si sería sintaxis incorrecta
     */
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


    /**
     * Método que detecta si hay NCR en la cadena
     * @param cad es la cadena en cuestion
     * @return true si hay NCR en la cadena, falso en caso contrario
     */
    private int  BuscarNCR (char[] cad){
        int i=0;
        boolean esta=false;
        while(i<cad.length&&esta==false){
            if(cad[i]=='N'){
                        esta=true;
                        this.estaNCR=true;
                        return i+2;
                }else{
                i++;
            }
        }
        return i;
    }

    /**
     * Método que analiza si la expresión permite escribir un punto decimal, es decir si el último número no tenía punto hasta ahora
     * @param s es la propia expresión
     * @return true si permite un decimal a continuación y false si sería sintaxis incorrecta
     */
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


    /**
     * Método que transforma un array de caracteres en una string
     * @param arr array de caracteres a transformar
     * @return string correspondiente al array de caracteres
     */
    private String charArrayToString(char[] arr) {
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    /**
     * Método que calcula el número de símbolos en un array de caracteres, correspondiente a la expresión. El - (marca de numero negativo) inicial no se cuenta
     * @param arr es la propia expresión
     * @return int con el numero de símbolos (sin contar el negativo inicial si lo hubiere)
     */
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

    /**
     * Método que analiza si el caracter en cuestión es uno de los símbolos de las operaciones (+,-,*,/)
     * @param caracter caracter a analizar
     * @return true si es un símbolo de operación y false en caso contrario
     */
    private boolean esSimbolo(char caracter) {
        return (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/');
    }

    /**
     * Método que elimina de la expresión los ultimos simbolos que finalizan la expresión(18*9+-, en este caso deja 18*9)
     * Se emplea para crear una operación válida para el cálculo automático del resultado provisional
     * @param arr es la propia expresión
     * @return array de caracteres con la expresión válida para ser calculada
     */
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

    /**
     * Método que inicializa los botones de la vista, original de la librería
     */
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
        b_cbrt = findViewById(R.id.b_cbrt);
        b_cos = findViewById(R.id.b_cos);
        b_sin = findViewById(R.id.b_sin);
        b_tan = findViewById(R.id.b_tan);
        b_factorial = findViewById(R.id.b_factorial);
        b_ncr = findViewById(R.id.b_ncr);
        b_ln = findViewById(R.id.b_ln);
        b_Atan = findViewById(R.id.b_Atan);
        b_Acos = findViewById(R.id.b_Acos);
        b_Asen = findViewById(R.id.b_Asen);
        b_xAlay = findViewById(R.id.b_xAlaY);
        b_xRaizY = findViewById(R.id.b_xRaizY);
        b_logyX = findViewById(R.id.b_logyX);
        b_ParenIZ = findViewById(R.id.b_ParenIZ);
        b_ParenDe = findViewById(R.id.b_ParenDE);

        in = findViewById(R.id.input);
        out = findViewById(R.id.output);
    }


    /**
     * Método original de la librería
     */
    // Remove error message that is already written there.
    private void ifErrorOnOutput() {
        if (out.getText().toString().equals("Error")) {
            out.setText("");
        }
    }


    /**
     * Método original de la librería
     */
    // Make text small if too many digits.
    private void exceedLength() {
        if (in.getText().toString().length() > 10) {
            in.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }

    /**
     * Método que se ejecuta cuando se hace click en un boton de operacion, añade el simbolo a la expresión
     * @param op es el símbolo a añadir
     */
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

    /**
     * Método que calcula el resultado de una expresión dada, tiene en cuenta distintos casos dependiendo del tipo de operación
     * Tiene en cuenta si un número es negativo, le cambia el signo si es necesario y calcula la expresión al completo
     * @param expression es la propia expresión
     * @return double con el resultado de la expresión redondeado a 5 cifras decimales
     */
    private double calculate(String expression) {
        if(expression.contains("^")){
            String partes[] = expression.split("\\^");
            return UtilesMatemáticas.XelevadoY(Double.parseDouble(partes[0]),Double.parseDouble(partes[1]));
        }else if(expression.contains("√")) {
            String partes[] = expression.split("√");
            return UtilesMatemáticas.raizYdeX(Double.parseDouble(partes[1]),Double.parseDouble(partes[0]));
        }else if(expression.contains("LOG")){
            String partes[] = expression.split("LOG");
            return UtilesMatemáticas.logydeX(Double.parseDouble(partes[0]),Double.parseDouble(partes[1]));
        }else if(expression.contains("(") || expression.contains(")")){
            if(expression.contains("(") && expression.contains(")")){
                if(ParentesisIzAntesDe(expression) && contieneParejasCerradasDeParentesis(expression) && !ParentesisVacios(expression))
                    return UtilesMatemáticas.parentesis(expression);
                else
                    return Double.NaN;
            }else{
                return Double.NaN;
            }
        } else{
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
            return round(op1, 5);
        }
    }


    /**
     * Método que redondea un double al numero de cifras decimales deseadas
     * @param value número a redondear
     * @param places número de cifras decimales
     * @return double redondeado a places cifras decimales
     */
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

    /**
     * Método que detecta si se puede poner pi a continuacion en la cadena
     * @param cadena es la cadena en cuestion
     * @return true si se puede poner pi a continuacion en la cadena, falso en caso contrario
     */
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

    /**
     * Método que detecta si el caracter no es ni un numero ni un punto
     * @param c es el caracter en cuestion
     * @return true si el caracter no es ni un numero ni un punto, falso en caso contrario
     */
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

    /**
     * Método que devuelve el ultimo numero de la expresion
     * @param expression es la expresion en cuestion
     * @return devuelve en string el ultimo numero de la expresion
     */
    public String ultimoNumero(String expression){

        for(int i = expression.length()-1; i>=0; --i){
            if(esSimbolo(expression.charAt(i))){
                return expression.substring(0,i+1)+'º'+expression.substring(i+1,expression.length());
            }
        }
        return expression;

    }

    /**
     * Método que detecta si el ultimo signo de la expresión es un -
     * @param expression es la expresion en cuestion
     * @return true si el ultimo signo de la expresión es un -, falso en caso contrario
     */
    public boolean ultimoSignoMenos(String expression){

        for(int i=expression.length()-1; i>=0; --i){
            if(expression.charAt(i) == '-')
                return true;
            else if(esSimbolo(expression.charAt(i)))
                return false;
        }

        return false;

    }

    /**
     * Método que detecta si la expresión contiene un simbolo
     * @param expression es la expresion en cuestion
     * @return true si detecta que la expresión contiene un simbolo, falso en caso contrario
     */
    public boolean tieneSimbolo(String expression){

        for(int i = expression.length()-1; i>=0; --i){
            if(NoEsNumeroNiPunto(expression.charAt(i))){
                return true;
            }
        }
        return false;

    }

    /**
     * Método que detecta si la expresión contiene un simbolo que no sea menos
     * @param expression es la expresion en cuestion
     * @return true si detecta que la expresión contiene un simbolo que no sea -, falso en caso contrario
     */
    public boolean tieneSimboloQueNoSeaMenos(String expression){

        for(int i = expression.length()-1; i>=0; --i){
            if(NoEsNumeroNiPunto(expression.charAt(i)) && expression.charAt(i) != '-' ){
                return true;
            }
        }
        return false;

    }

    /**
     * Método que detecta si la expresión no contiene NCR, ^, √ o LOG
     * @param expression es la expresion en cuestion
     * @return true si detecta que la expresión contiene dichos simbolos, falso en caso contrario
     */
    public boolean solo1NCR (String expression){
        if(expression.contains("NCR") || expression.contains("^") || expression.contains("√") || expression.contains("LOG"))
            return false;
        else
            return true;
    }

    /**
     * Método que detecta si la expresión contiene paréntesis
     * @param expression es la expresion en cuestion
     * @return true si detecta que la expresión contiene paréntesis, falso en caso contrario
     */
    public boolean contieneParentesis(String expression){
        return (expression.contains("(") || expression.contains("(") ? true : false);
    }

    /**
     * Método que detecta si los parentesis estan cerrados
     * @param expression es la expresion en cuestion
     * @return true si detecta que todos los paréntesis estan cerrados, falso en caso contrario
     */
    public boolean contieneParejasCerradasDeParentesis(String expression){
        int contIz = 0;
        int contDe = 0;
        for(char i : expression.toCharArray()){
            if(i == '(')
                ++contIz;
            if(i == ')')
                ++contDe;
        }
        return (contIz == contDe ? true : false);
    }

    /**
     * Método que detecta si esta el parentesis izq antes que el derecho
     * @param expression es la expresion en cuestion
     * @return true si detecta ( antes que ), falso en caso contrario
     */
    public boolean ParentesisIzAntesDe(String expression){

        for(char i : expression.toCharArray()){
            if(i == ')')
                return false;
            else if (i == '(')
                return true;
        }

        return true;

    }

    /**
     * Método que detecta si hay parentesis vacios
     * @param expression es la expresion en cuestion
     * @return true si detecta dos parentesis vacios como (), falso en caso contrario
     */
    public boolean ParentesisVacios(String expression){
        char anterior= ' ';
        for(char i : expression.toCharArray()){
            if(anterior == '(' && i==')')
                return true;
            anterior = i;
        }
        return false;
    }


}