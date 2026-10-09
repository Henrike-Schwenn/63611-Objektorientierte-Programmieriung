### 1.1 Welches Objekt versteht welche Nachrichten?


| **Klasse**          | **Verstandene Nachricht**        |
| ------------------- | -------------------------------- |
| Fahrrad             | transportierePerson              |
| Lebewesen           | pflanzeDichFort                  |
| Biene               | pflanzeDichFort, sammle Honig    |
| Motorrad            | starteMotor, transportierePerson |
| Motorfahrzeug       | starteMotor, transportierePerson |
| Objekt              |                                  |
| Blume               | pflanzeDichFort, verwelke        |
| Auto                | starteMotor, transportierePerson |
| Fortbewegungsmittel | transportierePerson              |

### 1.2 Klassenhierarchie

```mermaid
graph TD
  Objekt --> Lebewesen
  Objekt --> Fortbewegungsmittel
  Lebewesen --> Biene
  Lebewesen --> Blume
  Fortbewegungsmittel --> Motorfahrzeug
  Fortbewegungsmittel --> Fahrrad
  Motorfahrzeug --> Auto
  Motorfahrzeug --> Motorrad


```

### 1.3

- starteMotor: Motorfahrzeug
- transportierePerson: Fahrzeug
- pflanzeDichFort: Lebewesen
- sammleHonig: Biene
- verwelke: Blume

### 1.4

Abstrakte Klassen: Objekt, Lebewesen, Fortbewegungsmittel

### 1.5
