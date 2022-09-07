/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_14_Paso_ref {
    public static void main(String[]args){
        
        int[] arregloDatos=new int[100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
    }
    public static void llenar(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=100;
            
        }
    }
    public static void imprimir(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("["+arreglo[i]+"]");
            
        }
    }
}
