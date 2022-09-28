package persona;


public class personaProva {
    
    public static void main(String[] args){
    
    persona p1 = new persona();
    
    persona p2 = new persona(1.80, "grattarola", "17/03/2005", "giacomo", 90f);
    
    String info2 = p2.info();
    
    String info1 = p1.info();
    
    System.out.println(info1);
    System.out.println(info2);
    }
    
}
