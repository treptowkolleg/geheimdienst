package fachklassen;

public class Agent {
 // Deklaration von Attributen
private String name;
private String vorname;
private int agentenNr;

//Refererenzattribut für Objektbeziehung
private Fahrzeug fahrzeug;
 
    
// Konstruktor (einer oder mehrere (Überladen von Methoden))

    public Agent() {
        // Initialisieren der Attribute (erstmalige Zuweisung eines Wertes)
        this.name = "Bond";
        this.agentenNr = 7;
           
    }
    
    public Agent(int agentenNr){
        this.agentenNr = agentenNr;
    }
    
    public Agent(String nachname, int agentenNr){
        
       this.name = nachname;
       this.agentenNr = agentenNr;
    }
    
       
//Methoden
    
    // Zuweisungsmethode für Assoziation zwischen Agent-Objekt und Fahrzeug-Objekt
    
    public void setFahrzeug(Fahrzeug fahrzeug){
        this.fahrzeug = fahrzeug;
    
    }
    
    public Fahrzeug getFahrzeug(){
        return this.fahrzeug;
    }

    public String getName() {
        return name;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }


    public String getVorname() {
        return vorname;
    }

    public int getAgentenNr() {
        return agentenNr;
    }

    public String datenAnzeigen(){
        return "Test";
    }
   
}
