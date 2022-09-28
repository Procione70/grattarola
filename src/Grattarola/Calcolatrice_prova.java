package Grattarola;

import static Grattarola.Calcolatrice.sc;

public class Calcolatrice_prova {

   
    public static void main(String[] args) {
        
        Calcolatrice Calc = new Calcolatrice();
        
          char menu;
        do{
            float n1 = 0, n2 = 0;
            System.out.print(">> inserire + per addizione \n>> inserire - per sottrazione \n>> inserire * per moltiplicazione \n>> inserire / per divisione \n>> inserire 0 per spegnere la calcolatrice \ninserire simbolo operazione: ");
            menu = sc.next().charAt(0);

            switch(menu){
                case '+':
                    n1 = Calc.inserimento();
                    n2 = Calc.inserimento();
                    Calc.addizione(n1, n2);
                    break;
                case '-':
                    n1 = Calc.inserimento();
                    n2 = Calc.inserimento();
                    Calc.sottrazione(n1, n2);
                    break;
                case '*':
                    n1 = Calc.inserimento();
                    n2 = Calc.inserimento();
                    Calc.moltiplicazione(n1, n2);
                    break;
                case '/':
                    n1 = Calc.inserimento();
                    n2 = Calc.inserimento();
                    Calc.divisione(n1, n2);
                    break;
                case '0': 
                    System.exit(0);
                default:
                    System.out.println("inserire uno dei 4 simboli di operazione base!!!\n");
                    break;
            }
        }while(true);
        
    }
    
}
