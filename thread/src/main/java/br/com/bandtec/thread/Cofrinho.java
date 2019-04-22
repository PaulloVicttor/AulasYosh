package br.com.bandtec.thread;

public class Cofrinho {

    double meta;
    double total;

    public Cofrinho(double meta) {
        this.meta = meta;
    }
    
    public void depositar(double valor){
        
        this.total += valor;
        
    }
    
    public void status(){
        
        if(total >= meta){
            System.out.println("Meta alcançada");
        }
        return;
        
    }
    
}
