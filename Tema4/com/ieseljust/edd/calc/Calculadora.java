package com.ieseljust.edd.calc;

public class Calculadora{

    private float lastResult;
    private String lastOp;

    public float getLastResult(){
        return this.lastResult;
    }

    public String getLastOp(){
        return this.lastOp;
    }

    public float suma(float a, float b){
        this.lastResult = a + b;
        this.lastOp = "suma";
        return this.lastResult;
    }

    public float resta(float a, float b){
        this.lastResult = a - b;
        this.lastOp = "resta";
        return this.lastResult;
    }

    public float multiplica(float a, float b){
        this.lastResult = a * b;
        this.lastOp = "multiplica";
        return this.lastResult;
    }

    public float divide(float a, float b){
        this.lastResult = a / b;
        this.lastOp = "divide";
        return this.lastResult;
    }

    
    

}