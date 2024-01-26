# Supermercato 🏪
#### Esercizio creato da MS e JJ
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Supermercato
-- -
## Traccia:

 Si vuole modellare un supermercato con i prodotti disponibili e le ricevute dei clienti. 
 
 Si definisce una classe **Prodotto** caratterizzata dagli attributi `codice` (di tipo int), `nome` (di tipo String), `quantità` (di tipo int) e `prezzo` (di tipo double).
 
 Si definisce il costruttore di Prodotto che genera un’eccezione runtime se il nome è nullo e la quantità è inferiore a 1 e il codice è nullo e il prezzo non sia inferiore a 0.1, se il prodotto esiste già genera un eccezione. 
 
 Si definiscono i seguenti metodi:
*  `boolean nuovoProdotto(Prodotto p)` che aggiunge alla lista di prodotti disponibili il nuovo prodotto e restituisce `true`. Il metodo genera `false` se non è possibile inserire il prodotto.
*  `boolean rimozioneProdotto(int codice)` che rimuove dagli articoli disponibili il prodotto con il codice dato restituendo `true`. In caso il prodotto non sia esistente restituisce `false`.
*  `int quantitaProdotto(int codice)` che restituisce la quantità disponibile dell’articolo e genera un’eccezione se gli articoli sono inferiori a 1.
*  `Prodotto getMaxProdotto()` che restituisce il prodotto con più disponibilità in magazzino.

 Si definisce la classe **Ricevuta** che genera la ricevuta d’acquisto contenente la lista degli articoli acquistati in un array di tipo `Prodotto[]`, il numero `progressivo` (di tipo int) e il prezzo `totale` (di tipo double).
 
 Si definiscono i seguenti metodi:
*  `boolean Ricevuta(Prodotto a[], int progressivo)` che genera una ricevuta contenente la lista degli articoli acquistati, il prezzo totale e il codice dello scontrino riportando `true`, rimuovendo dalla quantità il numero di articoli immessi nella ricevuta. Se lo scontrino non può essere creato, viene generato un errore runtime.
*  `double stampaRicevuta(Ricevuta r)` che stampa nel terminale lo scontrino nel seguente ordine (prodotti, totale, progressivo) e restituisce il valore del totale. Il metodo restituisce `0` se la ricevuta non contiene prodotti o manca il progressivo o il totale è minore di 1.
*  `void cancellaRicevuta(int codice)` che elimina la ricevuta con il codice dato.

>**Non modificare la classe Cassa.**
> 
>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **Cassa** che esegue alcuni test per verificare le principali
>funzionalità delle classi **Prodotto** e **Ricevuta**