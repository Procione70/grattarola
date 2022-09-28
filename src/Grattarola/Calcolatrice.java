package Grattarola;
import java.util.Scanner;

public class Calcolatrice {
    
    public static Scanner sc = new Scanner(System.in);
    
    private double CONST_PI = 3.14;
    public float n1, n2;
    private float n3;
    
    
    Calcolatrice(){
        
       /* 
        char menu;
        do{
        System.out.print(">> inserire + per addizione \n>> inserire - per sottrazione \n>> inserire * per moltiplicazione \n>> inserire / per divisione \n>> inserire 0 per spegnere la calcolatrice \ninserire simbolo operazione: ");
        menu = sc.next().charAt(0);
        
        switch(menu){
            case '+':
                n1 = inserimento();
                n2 = inserimento();
                addizione(n1, n2);
                break;
            case '-':
                n1 = inserimento();
                n2 = inserimento();
                sottrazione(n1, n2);
                break;
            case '*':
                n1 = inserimento();
                n2 = inserimento();
                moltiplicazione(n1, n2);
                break;
            case '/':
                n1 = inserimento();
                n2 = inserimento();
                divisione(n1, n2);
                break;
            case '0': 
                System.exit(0);
            default:
                System.out.println("inserire uno dei 4 simboli di operazione base!!!\n");
                break;
        }
        }while(true);
        
        */
    }
    
    public double getN3(){
        
        System.out.print(n3 + "\n\n\n");
        return 0;
    }
    
    public double getCONST_PI(){
        
        System.out.print(CONST_PI);
        return 0;
    }
    
    public void addizione(float a, float b){
        
        n3 = a + b; 
        getN3();
    }
    
    public void sottrazione(float a, float b){
        
        n3 = a - b; 
        getN3();
    }
    
    public void moltiplicazione(float a, float b){
        
        n3 = a * b;  
        getN3();
    }
    
    public void divisione(float a, float b){
        
        if(b == 0){
            
            System.out.println("non si può dividere per 0");
            n3 = 0;
            getN3();
        }
        else{
            n3 = a / b;  
            getN3();
        }
    }
    
    public float inserimento(){
        
        System.out.print("inserire un numero: ");
        return sc.nextInt();
        
    }
    
}
