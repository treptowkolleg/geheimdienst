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
besser zwischen Variable und Datentyp unterscheiden.

Um das Attribut manipulieren zu können, setzen wir die Sichtbarkeit auf public.
Warum das nicht immer sinnvoll ist, wird im Abschnitt **Methoden** erläutert.

Da der Agentenname eine Zeichenkette sein soll, setzen wir als Datentyp ``String``.

````java
public class Agent // Klassenkopf
{
    public String name; // Attribut    
}
````

### Methoden



#### Constructor

#### Aufträge

#### Anfragen

