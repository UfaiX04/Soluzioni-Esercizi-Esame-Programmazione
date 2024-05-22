# Agenda 📒
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Treno
-- -
## Traccia:
Si desidera progettare un sistema per gestire un'agenda di appuntamenti organizzati in ordine cronologico.

A tale scopo, definire una classe **Appuntamento** caratterizzata dagli attributi `nome` (di tipo String), `giorno` (di tipo int) e `ora` (di tipo int). L'attributo `giorno` può assumere solo valori compresi tra 1 e 365 (ignorando la presenza di anni bisestili), mentre l'attributo `ora` può assumere solo valori compresi tra 0 e 23. Successivamente, definire i seguenti metodi:

* Costruttore **Appuntamento(String nome, int giorno, int ora)**: costruttore che solleva un'eccezione runtime se `nome` è null o se `giorno` o `ora` non rappresentano valori validi.

* **String getNome()**: metodo getter per l'attributo `nome`.

* **int getGiorno()**: metodo getter per l'attributo `giorno`.

* **int getOra()**: metodo getter per l'attributo `ora`.

* **int crono()**: metodo che restituisce l'ora assoluta dell'appuntamento, calcolata come la quantità `(giorno - 1) * 24 + ora`.

Successivamente, definire una classe **Agenda** che memorizzi in un array oggetti di tipo `Appuntamento` ordinati in modo cronologico. Definire i seguenti metodi per la classe **Agenda**:

* **Costruttore Agenda(int n)**: costruttore in cui l'argomento `n` indica il numero massimo di appuntamenti che possono essere inseriti. Il costruttore solleva un'eccezione runtime se `n` è negativo.

* **boolean aggiungi(Appuntamento a)**: metodo che aggiunge l'appuntamento `a` all'agenda. Se `a` è null, se è stata raggiunta la dimensione massima dell'agenda o se esiste già un appuntamento nel giorno e ora indicati in `a`, il metodo non effettua alcuna operazione e restituisce false. Altrimenti, il metodo aggiunge `a` rispettando l'ordine cronologico degli appuntamenti. Si noti che il metodo potrebbe dover effettuare lo spostamento di alcuni appuntamenti già presenti nell'agenda.

* **boolean disdetta(int n)**: metodo che rimuove l'appuntamento di indice `n` in ordine cronologico (0 è il primo appuntamento, 1 è il secondo, ecc.). Restituisce `true` se `n` è un indice valido, cioè relativo a un appuntamento esistente nell'array, altrimenti restituisce `false`. Si noti che il metodo potrebbe dover effettuare lo spostamento degli appuntamenti successivi a quello rimosso.

* **int numeroAppuntamenti()**: metodo che restituisce il numero di appuntamenti presenti nell'agenda.

* **Appuntamento appuntamento(int i)**: metodo che restituisce l'appuntamento con indice `i` o null se `i` non è un indice valido.


>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **TestCoda** che esegue alcuni test per verificare le principali
>funzionalità delle classi **Agenda** e **Appuntamento**