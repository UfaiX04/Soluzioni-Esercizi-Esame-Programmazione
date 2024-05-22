# Colesterolo 🩸
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Colesterolo
-- -
## Traccia:
Si vuole realizzare un sistema per il monitoraggio del colesterolo
sanguigno.

Il sistema memorizza un insieme di valori per esame.

Ciascun esame è caratterizzato da un intero lungo positivo `data`
che esprime una data e ora in formato UNIX TIME, ovvero il numero di secondi
a partire dal primo gennaio 1970, da intero `hdl` e da un intero `ldl` con valori positivi e minore di 500.
Il valore di `hdl` deve essere inferiore di `ldl`.
Quindi un intero positivo `trigliceridi` con valori compresi tra e 600.

Realizzare il costruttore per la classe **Esame** che accetta i valori relativi
alla data del prelievo, i valori di hdl, ldl e trigliceridi e produce un'eccezione se i valori sono errati.

Definire la classe **Esami** che memorizza oggetti di tipo Esame.
Il costruttore di Esami ha come parametro il numero massimo di misurazioni memorizzabili e produce un'eccezione
se tale valore è negativo.

Definire i seguenti metodi per la classe Esami:
- `boolean add(Esame m)` che aggiunge un esame e produce true se ha successo, false altrimenti.
- `int trigliceridiMassimo()` che calcola il massimo valore di trigliceridi tra le misurazioni presenti
- `double intervallo()` che calcola la media delle differenze tra ldl e hdl tra le misurazioni presenti

>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **TestCoda** che esegue alcuni test per verificare le principali
>funzionalità delle classi **Esame** ed **Esami**

*NB*: Per questo esercizio i nomi dei file e delle classi sono stati modificati per evitare conflitti con altri esercizi.