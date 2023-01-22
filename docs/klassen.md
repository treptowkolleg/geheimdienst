# Klassen

## Code Struktur

Jede Java Klasse wird wie im Beispiel definiert, wobei jede Klasse aus
einem Klassenkopf und einem Klassenkörper besteht.

### Klassenkopf

Der Klassenkopf enthält
mindestens:

- Sichtbarkeit (_public, private_)
- Typ (_class, enum, interface_)
- Bezeichnung (_selbstgewählter Name_)

Der Klassenname wird grundsätzlich am Anfang großgeschrieben und sollte
nur ASCII-Zeichen enthalten.

### Klassenkörper

Die Attribute und Methoden der Klassen werden innerhalb der geschweiften
Klammern notiert. Der Klassenkörper folgt unmittelbar dem Klassenkopf.

````java
public class Klassenname // Klassenkopf
{    
    // Klassenkörper    
}
````

### Attribute

Jede Klasse kann mehrere Attribute besitzen, muss sie jedoch nicht.
Attribute werden - ebenso wie Methoden - innerhalb des Klassenkörpers
notiert.

Im Folgenden ist die Klasse ``Agent`` beispielhaft dargestellt. Jede Instanz
der Klasse Agent soll einen **Namen** haben.

Wie bei den Klassenkörpern erwartet jedes Attribut drei Schlüsselwörter:

- Sichtbarkeit (_public,_protected_, private_)
- Typ (_Datentyp_)
- Bezeichnung (_selbstgewählter Name_)

Attribute werden, ebenso wie Variablen, stets kleingeschrieben. So lässt sich
besser zwischen Variable und Datentyp unterscheiden. Der Datentyp wird immer großgeschrieben.
Ausnahmen stellen nur die sogenannten primitiven Datentypen dar, wie etwa ``int``, da diese
keiner Datentypklasse entspringen und deshalb auch keine eigenen Methoden besitzen.
Mehr dazu auch unter [Datentypen]()

Um das Attribut manipulieren zu können, setzen wir die Sichtbarkeit auf public.
Warum das nicht immer sinnvoll ist, wird im Abschnitt **Methoden** erläutert.

Da der Agentenname eine Zeichenkette sein soll, setzen wir als Datentyp ``String``.


````java
public class Agent // Klassenkopf
{
    public String name; // Attribut (Datentyp attributName)
}
````

### Methoden

Methoden werden im Klassenkörper notiert und haben denselben formalen Aufbau wie die Klassen
selbst. Sie bestehen also aus einem Methodenkopf und einem Methodenkörper.

````java
public class Agent // Klassenkopf
{

    public String name; // Attribut (Datentyp attributName)
    
    public Rückgabedatentyp methodenName // Methodenkopf
            (
                    Parameterdatentyp parameterBezeichner // Parameterliste (kommagetrennt)
            ) 
    {
        // Methodenkörper
    }    
    
}
````

Obwohl alle Methoden demselben Aufbau folgen, lassen sich mindestens drei Arten von Methoden
unterscheiden.

#### Constructor

Constructor-Methoden werden beim Initialisieren einer Instanz ausgeführt. Sie sind daran
erkennbar, dass sie grundsätzlich großgeschrieben werden und denselben Namen haben wie ihre
Klasse.

Da Constructor-Methoden immer die eigene Klasse zurückgeben, fehlt hier der Rückgabetyp.

Unsere Klasse ``Agent`` könnte also folgenden Constructor haben:

````java
public class Agent // Klassenkopf
{
    public String name; // Attribut
    
    public Agent() // Constructor, Methodenkopf
    {
        // Constructor, Methodenkörper
    }
}
````

Um zu verstehen, was die Constructor-Methode macht, könnten wir uns den Aufbau so vorstellen:

````java
public class Agent // Klassenkopf
{    
    public Agent constructor() // Constructor, Methodenkopf
    {
        // Constructor, Methodenkörper
    }
}
````

Da die Constructor-Methode nur ihre Klasse zurückgibt (ähnliches Verhalten wie ``void``),
handelt es sich hier also um einen sogenannten Auftrag. Denn es wurde mit ``Agent bond = new Agent()``
der Auftrag erteilt, eine neue Instanz vom Typ Agent zu erstellen.

Wir können also Methoden unterscheiden in **Aufträge** und **Anfragen**.

#### Aufträge

#### Anfragen

