package org.noelaguirre.bean;

public class Suma {
    double num1;
    double num2;
    
    // Constructor
    public Suma(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Constructor NULO
    public Suma() {
    }
    
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public double getNum1(){
        return num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }
    public double getNum2(){
        return num2;
    }
    
    public double Sumatoria(double num1,double num2){
        double result = num1 + num2;
        return result;
    }
}