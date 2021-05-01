package com.example.new_sample;

public class UtilesMatemáticas {

    public static double invertir(double x) {
        return 1/x;
    }

    public static String notacionCientifica(double x) {

        int cifras = calcularCifras(x);

        return x/Math.pow(10, cifras)+"E"+cifras;


    }

    public static int calcularCifras(double x) {

        if(Math.abs(x/10) < 10) {
            return 1;
        }else {
            return 1+calcularCifras(x/10);
        }

    }

    public static  double DosAlaX(double x){
        return Math.pow(2,x);
    }

    public static double cuadrado(double x){
        return Math.pow(x,2);
    }

    public static double cubo(double x){
        return Math.pow(x,3);
    }

    public static double eElevadoX(double x){
        return Math.pow(Math.E,x);
    }

    public static double XelevadoY(double x, double y){
        return Math.pow(x,y);
    }

    /**
     * Metodo que devuelve 10 elevado a la x.
     * @param x es la potencia a la que se elvará 10.
     * @return devuelve el resultado de 10 elevado a la x.
     */
    public static double diezElevadoX(double x){
        return Math.pow(10,x);
    }

    public static double raízCuadrada(double x){
        return Math.sqrt(x);
    }

    public static double raízCubica(double x){
        return Math.cbrt(x);
    }

    public static double raizYdeX(double x, double y){
        return Math.pow(x, invertir(y));
    }

    public static double lnDeX(double x){
        return Math.log(x);
    }

    public static double log10deX(double x){
        return Math.log10(x);
    }
    public static double logydeX(double y,double x){
        return (Math.log10(x) / Math.log10(y));
    }

    public static double seno(double x){
        return Math.sin(Math.toRadians(x));
    }

    public static double ArcSeno(double x){
        return Math.asin(Math.toRadians(x));
    }

    public static double coseno(double x){
        return Math.cos(Math.toRadians(x));
    }

    public static double ArcCoseno(double x){
        return Math.acos(Math.toRadians(x));
    }

    public static double tangente(double x){
        return Math.tan(Math.toRadians(x));
    }

    public static double ArcTangente(double x){
        return Math.atan(Math.toRadians(x));
    }

    public static int factorial(int i) {
        if(i>=0) {
            if(i==0) {
                return 1;
            }
            if(i==1) {
                return 1;
            }
            else {
                return i*factorial(i-1);
            }
        }else {
            System.out.println("MathError");
            return 0;
        }
    }

    public static double pi(){
        return Math.PI;
    }

    public static double e(){
        return Math.E;
    }

    public static int ncr(int n,int m) {
        return factorial(n)/(factorial(m)*factorial(n-m));
    }

    public static double parentesis(String numero) {

        String parte1 = "";
        String parte2 ="";
        for(int n = 0 ; n < numero.length()-1 ; ++n) {
            if (numero.charAt(n) == '(') {
                for (int j = numero.length() - 1; j > n; --j) {
                    if (numero.charAt(j) == ')') {
                        if (n != 0) {
                            parte1 = numero.substring(0, n);
                        }
                        if (j != numero.length() - 1) {
                            parte2 = numero.substring(j+1, numero.length());
                        }
                        return evaluar(parte1 + parentesis(numero.substring(n + 1, j)) + parte2);
                    }
                }
            }
        }

        return evaluar(numero);

    }

    public static double evaluar(final String numero) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos <numero.length()) ?numero.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos <numero.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(numero.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func =numero.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}
