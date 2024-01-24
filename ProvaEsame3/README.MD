# CONSEGNA

Si desidera progettare un sistema per gestire un'agenda di appuntamenti organizzati in ordine cronologico.

A tale scopo, definire una classe "Appuntamento" caratterizzata dagli attributi "nome" (di tipo String), "giorno" (di tipo int) e "ora" (di tipo int). L'attributo "giorno" può assumere solo valori compresi tra 1 e 365 (ignorando la presenza di anni bisestili), mentre l'attributo "ora" può assumere solo valori compresi tra 0 e 23. Successivamente, definire i seguenti metodi:

1. **Costruttore Appuntamento(String nome, int giorno, int ora):** costruttore che solleva un'eccezione runtime se "nome" è null o se "giorno" o "ora" non rappresentano valori validi.

2. **String getNome():** metodo getter per l'attributo "nome".

3. **int getGiorno():** metodo getter per l'attributo "giorno".

4. **int getOra():** metodo getter per l'attributo "ora".

5. **int crono():** metodo che restituisce l'ora assoluta dell'appuntamento, calcolata come la quantità (giorno - 1) * 24 + ora.

Successivamente, definire una classe "Agenda" che memorizzi in un array oggetti di tipo "Appuntamento" ordinati in modo cronologico. Definire i seguenti metodi per la classe "Agenda":

1. **Costruttore Agenda(int n):** costruttore in cui l'argomento "n" indica il numero massimo di appuntamenti che possono essere inseriti. Il costruttore solleva un'eccezione runtime se "n" è negativo.

2. **boolean aggiungi(Appuntamento a):** metodo che aggiunge l'appuntamento "a" all'agenda. Se "a" è null, se è stata raggiunta la dimensione massima dell'agenda o se esiste già un appuntamento nel giorno e ora indicati in "a", il metodo non effettua alcuna operazione e restituisce false. Altrimenti, il metodo aggiunge "a" rispettando l'ordine cronologico degli appuntamenti. Si noti che il metodo potrebbe dover effettuare lo spostamento di alcuni appuntamenti già presenti nell'agenda.

3. **boolean disdetta(int n):** metodo che rimuove l'appuntamento di indice "n" in ordine cronologico (0 è il primo appuntamento, 1 è il secondo, ecc.). Restituisce "true" se "n" è un indice valido, cioè relativo a un appuntamento esistente nell'array, altrimenti restituisce "false". Si noti che il metodo potrebbe dover effettuare lo spostamento degli appuntamenti successivi a quello rimosso.

4. **int numeroAppuntamenti():** metodo che restituisce il numero di appuntamenti presenti nell'agenda.

5. **Appuntamento appuntamento(int i):** metodo che restituisce l'appuntamento con indice "i" o null se "i" non è un indice valido.

Nota: È vietato l'uso di classi della libreria standard di Java, ad eccezione di Math, String e delle sottoclassi di Exception.