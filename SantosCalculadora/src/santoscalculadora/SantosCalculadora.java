/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package santoscalculadora;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 *
 * @author SNdzeko
 */
public class SantosCalculadora {

    public SantosCalculadora(double valor1, double valor2,String sinal) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.sinal = sinal;
    }

    public SantosCalculadora() {
    }
    
    
   

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the valor1
     */
    public double getValor1() {
        return valor1;
    }

    /**
     * @param valor1 the valor1 to set
     */
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    /**
     * @return the valor2
     */
    public double getValor2() {
        return valor2;
    }

    /**
     * @param valor2 the valor2 to set
     */
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    /**
     * @return the sinal
     */
    public String getSinal() {
        return sinal;
    }

    /**
     * @param sinal the sinal to set
     */
    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    
    private double valor1;
    private double valor2;
    private double resultado;
    private String sinal;
    /**
     * @param valor1
     * @param args the command line arguments
     */
    public double somatorio(Double v1, Double v2){
        this.valor1=v1;
        this.valor2=v2;
        this.setResultado(getValor1()+getValor2());
        
       return getResultado();
    
    }
    
    public double subtracao(Double v1, Double v2){
        this.valor1=valor1;
        this.valor2=valor2;
        
        this.setResultado(valor1+valor2);
        return getResultado();
    }
    public double multiplicacao(Double valor1, Double valor2){
        this.setResultado(valor1*valor2);
        return getResultado();
    }
    public double divisao(Double valor1, Double valor2){
        this.setResultado(valor1/valor2);
        
        return getResultado();
        
    }
    
    
    public String toString(){
        return "Valor1 :"+getValor1()+ "\n"
             + "Valor2 :"+getValor2()+"\n"
              +"Sinal :"+getSinal();
        
              
    }
}
