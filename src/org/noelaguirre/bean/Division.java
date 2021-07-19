package org.noelaguirre.bean;

import javax.swing.JOptionPane;

public class Division {
    double num1;
    double num2;
    
    public Division(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Division(){
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
    
    public void Cociente(double num1,double num2){
        if (num2 == 0){
            JOptionPane.showMessageDialog(null,"Indivisible entre 0");
        }else{
            double division = num1/num2;
            JOptionPane.showMessageDialog(null,"La división es: " + String.valueOf(division));
        }
    }
}