public class TorresDeHanoi {
    //metodo recursivo
    public void Torre (int disco, int torre1, int torre2, int torre3){
        //caso base
        if (disco == 1){
            System.out.println("Mover disco de torre" + torre1 + " a torre " + torre3);
        }else{
            Torre(disco -1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre" + torre1 + " a torre " + torre3);
            
            Torre(disco - 1, torre2, torre1, torre3);
        }
    }
  
   //metodo ciclo
    public int TorreWhile(int disco, int torre1, int torre2, int torre3){
        do {
            Torre(disco -1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre" + torre1 + " a torre " + torre3);
            
            Torre(disco - 1, torre2, torre1, torre3);
        }while (disco < 0);
                return disco;
        
       
    }
}
