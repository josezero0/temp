/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sistemas;

import java.util.Arrays;

/**
 *
 * @author Jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        String name = Read.line().toUpperCase();
        if(name.trim().isEmpty()){
            System.out.println("No se ha introducido ningún nombre...");
            main(null);
        }else{
            // Elimina espacios y muestra el nombre
            name = removeSpaces(name);
            System.out.println("Nombre introducido sin espacios: " + name);
            // Proceso ASCII
            int[] ascii = new int[name.length()];
            System.out.println("El valor de cada caracter en ascii: ");
            for(int i=0;i<name.length();i++){
                System.out.println("El caracter '"+ name.charAt(i) + "' es en ascii: " + (int)name.charAt(i));
                ascii[i] = name.charAt(i);
            }
            // Proceso Decimal a XXX
            System.out.println("Se procesan los valores ascii a binario/octal/decimal:");
            String[] salida = new String[name.length()];
            for(int i=0;i<ascii.length;i++){
                if((i%3)==0){ //Binario
                    salida[i] = Integer.toBinaryString(ascii[i]);
                    System.out.println("Valor binario de     '"+ascii[i]+"' es: "+salida[i]);
                }
                if((i%3)==1){ //Octal
                    salida[i] = Integer.toOctalString(ascii[i]);
                    System.out.println("Valor octal de       '"+ascii[i]+"' es: "+salida[i]);
                }
                if((i%3)==2){ //Hexadecimal
                    salida[i] = Integer.toHexString(ascii[i]);
                    System.out.println("Valor hexadecimal de '"+ascii[i]+"' es: "+salida[i]);
                }
            }
            System.out.println("Codificación del nombre: "+name);
            System.out.println(Arrays.toString(salida));
        }
    }
    
    /**
     * Elimina los espacios del String pasado por parametros.
     * @param txt
     * @return 
     */
    private static String removeSpaces(String txt){
        String aux = "";
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)!=' '){
                aux += txt.charAt(i);
            }
        }
        return aux;
    }
    
}
