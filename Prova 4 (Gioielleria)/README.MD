# Gioielleria 💍
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Gioielleria
-- -
## Traccia:
Si vuole realizzare un sistema di gestione di gioielli. 

Il sistema prevede una classe astratta **Prezioso** che descrive un oggetto di valore generico composto da pietre preziose e varie parti di oro. 

La classe **Prezioso** è caratterizzata da un intero positivo `peso` che esprime il peso in grammi del prezioso. 
Specializzare la classe **Prezioso** con le classi **Pietra** e **Oro**. 

La classe **Pietra** è caratterizzata dall'intero positivo `carati` che esprime i numeri di carati della pietra. 
Definire il costruttore di **Pietra** con eccezione se i parametri sono errati. 

La classe **Oro** è caratterizzata da un intero positivo `carati` compreso tra 8 e 14 indicante il numero di carati dell'oro. 
Definire il costruttore di **Oro** con eccezione se i parametri sono errati.

Definire la classe **Gioiello** e il suo costruttore che accetta un intero indicante il numero massimo di componenti preziosi presenti nel gioiello. 
Viene prodotta un'eccezione se il parametro è minore di 1. 

Definire il metodo `boolean add (Prezioso)` che accetta un prezioso (oro o pietra) e produce `true` se l'aggiunta ha successo, `false` altrimenti.

Definire il metodo `boolean check()` che verifica se la somma dei carati delle pietre presenti nel gioiello è maggiore al peso complessivo del gioiello.

Definire il metodo `int caratiPietre()` che produce somma del numero dei carati delle pietre presenti nel gioiello. Non modificare la classe **Prezioso**.

Non è consentito l'uso di classi della libreria standard di Java diverse da `String`, `Math` e dalle classi che rappresentano eccezioni. 
In particolare, non è consentito uso di alcuna classe contenitore (es. `ArrayList`, `Vector`, ecc.) fornita la classe **TestCoda** che esegue alcuni test per verificare le principali funzionalità delle classi 


>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **TestCoda** che esegue alcuni test per verificare le principali
>funzionalità delle classi **Prezioso**, **Oro**, **Pietra** e **Gioiello**.