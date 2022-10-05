package persona;
/**
 * La classe Persona definisce alcune caratteristiche e comportamenti di un
 * essere umano
 * 
 * 
 * 
 * @author giacomo.grattarola 4InC 2022 
 * @version 1.0 del 28 / 09 / 2022
 */

public class Persona1 {
    
    
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float  peso;

    /**
     * Costruttore della classe Persona senza parametri Per impostare i
     * parametri si possono usare i seguenti metodi:
     * {@link #setAltezza(double altezza) }         <br>
     * {@link #setCognome(String cognome) }         <br>
     * {@link #setNome(String nome) }               <br>
     * {@link #setPeso(Float peso) }                <br>
     * {@link #setDataDiNascita(java.lang.String) }
     */
    public Persona1() {
    }

    
    /**
     * 
     * @param altezza Altezza
     * @param cognome Cognome
     * @param dataDiNascita Data di nascita
     * @param nome Nome
     * @param peso Peso
     */
    public Persona1(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        this.altezza        = altezza;
        this.cognome        = cognome;
        this.dataDiNascita  = dataDiNascita;
        this.nome           = nome;
        this.peso           = peso;
    }

    /**
     * restituisce l'altezza della Persona1
     * 
     * @return altezza
     */
    public Double getAltezza() {
        return altezza;
    }
    
    /**
     * inserisce l'altezza della Persona1
     * 
     * @param altezza Altezza
     */
    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }

    
    /**
     * restituisce il cognome della Persona1
     * 
     * @return cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * inserisce il cognome della Persona1
     * 
     * @param cognome Cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    
    /**
     * restituisce la data di nascita della Persona1
     * 
     * @return dataDiNascita
     */
    public String getDataDiNascita() {
        return dataDiNascita;
    }
    
    /**
     * inserisce la data di nascita della Persona1
     * 
     * @param dataDiNascita Data di nascita
     */
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    
    /**
     * restituisce nome della Persona1
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * inserisce il nome della Persona1
     * 
     * @param nome Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /**
     * restituisce il peso della Persona1
     * 
     * @return peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * inserisce il peso della Persona1
     * 
     * @param peso Peso
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    /**
     * restituisce le caratteristiche della Persona1
     * 
     * @return riepilogo caratteristiche
     */
    public String info(){
        
        String testo;
        
        testo = "altezza          :" + this.altezza.toString() + "\n"
               + "cognome         :" + this.getCognome()       + "\n"
               + "data di nascita :" + this.getDataDiNascita() + "\n"
               + "nome            :" + this.getNome()          + "\n"
               + "peso            :" + this.peso.toString()     + "\n";
        
        
        return testo;
    }
    
}
