/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_hectorsabillon;
import java.util.Scanner;
import java.security.SecureRandom;
public class Examen1P1_HectorSabillon {

    public static String primos(int n){
        String factores = "";
        int cont = 0;
        factores += "1 ";
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
               for (int j = 1; j < i; j++){
                   if (i % j == 0){
                       cont++;
                   }
                   if (cont <= 2){
                       factores += Integer.toString(i);
                       factores += " ";
                       break;
                   }
               }
            }//es un factor de n;
        }
        return factores;
    }
    
    public static void contorno(int n){
        for (int i = 0; i < n/2; i++){
            for (int j = n/2; j > i; j--){
                System.out.print("*");
            }
            if (i > 0){
            System.out.print("+");
            }
            
            for (int m = 0; m < i; m++){
                System.out.print(" ");
                if (m > 0){
                    System.out.print(" ");
                }
            }
            
            for (int k = (n/2)+1; k > i+1; k--){
                for (int l = n/2; l < k; l++){

                    if (l == n/2){              
                    System.out.print("+");
                    
                    }
                }
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int p = 0; p < n; p++){
            System.out.print("*");
        }
    }
    
    public static String vecinos(String cadena){
        char caracter, ascii2;
        int ascii;
        String palabratemp = "";
        SecureRandom aleatorio = new SecureRandom();
        int num = aleatorio.nextInt(2);
        
            for (int i = 0; i < cadena.length(); i++){
                caracter = cadena.charAt(i);
                if (num == 0){
                    ascii = ((int) caracter) - 1;
                    ascii2 = (char) ascii;
                    palabratemp += ascii2;
                } else {
                    ascii = ((int) caracter) + 1;
                    ascii2 = (char) ascii;
                    palabratemp += ascii2;
                }
                
            }
        return palabratemp;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("1 <- Divisores primo");
        System.out.println("2 <- Contorno de piramide");
        System.out.println("3 <- Vecinos");
        System.out.println("4 <- Salida");
        System.out.println("Ingrese el ejercicio a visualizar: ");
        opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                int n;
                do{
                System.out.println("Ingrese un numero: ");
                n = leer.nextInt();
                if (n < 1){
                    System.out.println("El numero debe ser mayor o igual a 1");
                } else{
                    System.out.println(primos(n));
                } 
                } while (n < 1);
                
                break;
            case 2:
                do{
                System.out.println("Ingrese el tamaño del triangulo: ");
                n = leer.nextInt();
                if (n % 2 == 0){
                    System.out.println("El numero debe ser impar");
                } else {
                    contorno(n);
                }
                } while (n % 2 == 0);
                break;
            case 3:
                System.out.println("Ingrese una cadena: ");
                String cadena = leer.next();
                int cont = 0;
                for (int i = 0; i < cadena.length(); i++){
                    char caracter = cadena.charAt(i);
                    int ascii = (int) caracter;
                    if (ascii > 48 && ascii < 58){
                        cont++;
                    }
                }
                if (cont >= 1){
                    System.out.println("La cadena no puede contener numeros");
                } else {
                    System.out.print(vecinos(cadena));
                    
                }
        }
    }
    
}
