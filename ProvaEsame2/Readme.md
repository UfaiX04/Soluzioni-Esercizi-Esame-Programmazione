Si desidera gestire un sistema di prenotazione per visite mediche, 
che consenta agli utenti di prenotarsi indicando il loro nome e cognome.
Per realizzare ciò, definiamo la classe "Visita", la quale è caratterizzata da due attributi di tipo stringa,
ovvero "nome" e "cognome". Il costruttore di questa classe prende in input due parametri, "nome" e "cognome",
generando un'eccezione nel caso in cui uno dei due sia nullo o contenga meno di due caratteri.

Successivamente, definiamo la classe "Coda" che permette l'inserimento di oggetti di tipo "Visita".
La classe è caratterizzata da un attributo "coda" di tipo array di "Visita" e da un intero che indica il numero di pazienti prenotati.
Il costruttore di questa classe richiede un parametro intero che indica il numero massimo di elementi di tipo "Visita" gestiti,
generando un'eccezione nel caso in cui il parametro sia negativo.

La classe "Coda" dispone del metodo "inserimento(Visita v)",
il quale inserisce una visita in fondo alla coda e restituisce true se l'operazione ha successo.
Il metodo restituisce false nel caso in cui il numero di visite superi il numero massimo di posti disponibili,
evitando così sovraffollamenti.

Inoltre, viene definito il metodo "Visita estrazione()", che preleva e cancella il primo elemento dalla coda,
restituendo null nel caso in cui non ci siano elementi presenti.

Infine, si implementa il metodo booleano "cancella(String nome, String cognome)" che consente di cancellare la prenotazione
di una visita associata a un utente con un dato nome e cognome.
Questo metodo elimina la visita mantenendo l'ordine delle prenotazioni e compattando gli elementi presenti nell'array "coda". 
