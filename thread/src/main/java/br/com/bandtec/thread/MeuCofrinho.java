package br.com.bandtec.thread;

public class MeuCofrinho {

    public static void main(String[] args) {
    
        Cofrinho pp1 = new Cofrinho(100);
  
    Thread tarefa1 = new Thread(){
        
        @Override
        public void run() {
        
            for (int i=0; i<15; i++) {
                    System.out.println("depositou");
                    pp1.depositar(50);
                    
                                       
        }
            
        
    }
               
    }; tarefa1.start();
    
    Thread tarefa2 = new Thread(){
            @Override
            public void run() {
               
                for (int i=0; i<15; i++) {
                    System.out.println("alcançou a meta?");
                    pp1.status();
                
            }
      
        
        
    }
    
    
};tarefa2.start();
            }
}
