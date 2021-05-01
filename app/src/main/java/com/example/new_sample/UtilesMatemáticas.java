package com.example.new_sample;

/**
 * Esta clase incluye una serie de métodos de utilidad en la calculadora científica
 * @author: Pablo Ascorbe, Alberto Escalona, David Íñiguez e Iñaki Lafuente
 * @version: 01/05/2021
 */

public class UtilesMatemáticas {

    /**
     * Metodo que devuelve el inverso de un número
     * @param x es el número en cuestion
     * @return devuelve el resultado de 1/x
     */
    public static double invertir(double x) {
        return 1/x;
    }

    /**
     * Metodo que devuelve el número en notación científica
     * @param x es el número en cuestión
     * @return devuelve el número en notación científica
     */
    public static String notacionCientifica(double x) {

        int cifras = calcularCifras(x);

        return x/Math.pow(10, cifras)+"E"+cifras;


    }

    /**
     * Metodo que devuelve el número de cifras de un numero
     * @param x es el número en cuestión
     * @return devuelve el número de cifras
     */
    public static int calcularCifras(double x) {

        if(Math.abs(x/10) < 10) {
            return 1;
        }else {
            return 1+calcularCifras(x/10);
        }

    }

    /**
     * Metodo que devuelve la potencia x de 2
     * @param x es el número en cuestión
     * @return devuelve 2 elevado al numero en cuestion
     */
    public static  double DosAlaX(double x){
        return Math.pow(2,x);
    }

    /**
     * Metodo que devuelve el cuadrado de un numero
     * @param x es el número en cuestión
     * @return devuelve el cuadrado del numero x
     */
    public static double cuadrado(double x){
        return Math.pow(x,2);
    }

    /**
     * Metodo que devuelve el cubo de un numero
     * @param x es el número en cuestión
     * @return devuelve el cubo del numero x
     */
    public static double cubo(double x){
        return Math.pow(x,3);
    }

    /**
     * Metodo que devuelve e elevado al numero x
     * @param x es el número en cuestión
     * @return devuelve e elevado a x
     */
    public static double eElevadoX(double x){
        return Math.pow(Math.E,x);
    }

    /**
     * Metodo que devuelve el numero x elevado al y
     * @param x es el número a elevar
     * @param y es la potencia
     * @return devuelve x elevado a y
     */
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

    /**
     * Metodo que devuelve la raiz cuadrada del numero x
     * @param x es el número en cuestión
     * @return devuelve la raiz cuadrada del numero x
     */
    public static double raízCuadrada(double x){
        return Math.sqrt(x);
    }

    /**
     * Metodo que devuelve la raiz cuadrada del numero x
     * @param x es el número en cuestión
     * @return devuelve la raiz cuadrada del numero x
     */
    public static double raízCubica(double x){
        return Math.cbrt(x);
    }

    /**
     * Metodo que devuelve la raiz y de x
     * @param x es el número dentro de la raiz
     * @param y es el grado de la raiz
     * @return devuelve la raiz y de x
     */
    public static double raizYdeX(double x, double y){
        return Math.pow(x, invertir(y));
    }

    /**
     * Metodo que devuelve el logaritmo neperiano del numero x
     * @param x es el número en cuestión
     * @return devuelve el logaritmo neperiano del numero x
     */
    public static double lnDeX(double x){
        return Math.log(x);
    }

    /**
     * Metodo que devuelve el logaritmo en base 10 del numero x
     * @param x es el número en cuestión
     * @return devuelve el logaritmo en base 10 del numero x
     */
    public static double log10deX(double x){
        return Math.log10(x);
    }

    /**
     * Metodo que devuelve el logaritmo en base y del numero x
     * @param x es el número en cuestión
     * @param y es la base del logaritmo
     * @return devuelve el logaritmo en base y del numero x
     */
    public static double logydeX(double y,double x){
        return (Math.log10(x) / Math.log10(y));
    }

    /**
     * Metodo que devuelve el seno del numero x
     * @param x es el número en cuestión
     * @return devuelve el seno del numero x
     */
    public static double seno(double x){
        return Math.sin(Math.toRadians(x));
    }

    /**
     * Metodo que devuelve el ArcSeno del numero x
     * @param x es el número en cuestión
     * @return devuelve el ArcSeno del numero x
     */
    public static double ArcSeno(double x){
        return Math.asin(Math.toRadians(x));
    }

    /**
     * Metodo que devuelve el coseno del numero x
     * @param x es el número en cuestión
     * @return devuelve el coseno del numero x
     */
    public static double coseno(double x){
        return Math.cos(Math.toRadians(x));
    }

    /**
     * Metodo que devuelve el ArcCoseno del numero x
     * @param x es el número en cuestión
     * @return devuelve el ArcCoseno del numero x
     */
    public static double ArcCoseno(double x){
        return Math.acos(Math.toRadians(x));
    }

    /**
     * Metodo que devuelve la tangente del numero x
     * @param x es el número en cuestión
     * @return devuelve la tangente del numero x
     */
    public static double tangente(double x){
        return Math.tan(Math.toRadians(x));
    }

    /**
     * Metodo que devuelve la ArcTangente del numero x
     * @param x es el número en cuestión
     * @return devuelve la ArcTangente del numero x
     */
    public static double ArcTangente(double x){
        return Math.atan(Math.toRadians(x));
    }

    /**
     * Metodo que devuelve el factorial del numero i
     * @param i es el número en cuestión
     * @return devuelve el factorial del numero i
     */
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

    /**
     * Metodo que devuelve el numero pi
     * @return devuelve el numero pi
     */
    public static double pi(){
        return Math.PI;
    }

    /**
     * Metodo que devuelve el numero e
     * @return devuelve el numero e
     */
    public static double e(){
        return Math.E;
    }

    /**
     * Metodo que devuelve el numero combinatorio n sobre m
     * @param n es el número n
     * @param m es el número m
     * @return devuelve el numero combinatorio n sobre m
     */
    public static int ncr(int n,int m) {
        return factorial(n)/(factorial(m)*factorial(n-m));
    }


    /**
     * Metodo que evalua una expresión con paréntesis
     * @param numero es el número en cuestion
     * @return devuelve el resultado de la expresion teniendo en cuenta la prioridad de los parentesis
     */
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


    /**
     * Metodo que evalua una expresión, basado en el encontrado en la
     * segunda respuesta de https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form
     * @param numero es el número en cuestion
     * @return devuelve el resultado de la expresion realizando los
     * calculos pertinentes y teniendo en cuenta los casos particulares
     */
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
