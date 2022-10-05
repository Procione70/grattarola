package persona;


public class Persona1Prova {
    
    public static void main(String[] args){
    
    Persona1 p1 = new Persona1();
    
    Persona1 p2 = new Persona1(1.80, "grattarola", "17/03/2005", "giacomo", 90f);
    
    String info2 = p2.info();
    
    String info1 = p1.info();
    
    System.out.println(info1);
    System.out.println(info2);
    }
    
}
