package com.mycompany.calcularesfera;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularEsfera {

    public static void main(String[] args) {
        //scanner pra pegar o que o usuario digitar
        Scanner sc = new Scanner(System.in);
        
        //limitador de casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        
        //definindo valor fixo pra pi 
        final float PI = (float) 3.14159;
        
        System.out.print("digite o valor de r: ");
        double raio = sc.nextDouble();
        //metodo math.pow usado pra calcular exponenciação
        float raioResultado = (float) Math.pow(raio, 3);
        
        float calculoEsfera = (float) ((4/3.0) * PI * raioResultado);
        System.out.println("Volume: " + df.format(calculoEsfera));
    }
}
