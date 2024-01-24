Si vuole modellare un'agenda di appuntamenti in ordine cronologico.

A tal fine, definire una classe Appuntamento caratterizzato dagli
attributi "nome" (di tipo String), "giorno" (di tipo int) e "ora"
(di tipo int). L'attributo "giorno" puo` assumere solo valori
compresi tra 1 e 365 (ignoriamo la presenza di anni bisestili) e
l'attributo "ora" puo` assumere solo valori compresi tra 0 e
23. Definire poi i seguenti metodi:

Appuntamento(String nome, int giorno, int ora): costruttore, lancia
un'eccezione runtime se "nome" e` null oppure se "giorno" o "ora"
non sono valori validi.

String getNome(): getter per attributo "nome".

int getGiorno(): getter per attributo "giorno".

int getOra(): getter per attributo "ora".

int crono(): restituisce l'ora assoluta dell'appuntamento, ovvero la
quantita` (giorno - 1) * 24 + ora

Definire una classe Agenda che memorizza in un array oggetti di tipo
Appuntamento in ordine cronologico. Definire i seguenti metodi:

Agenda(int n): costruttore, l'argomento "n" indica il numero massimo
di appuntamenti che possono essere inseriti. Il costruttore lancia
un'eccezione runtime se "n" e` negativo.

boolean aggiungi(Appuntamento a): aggiunge l'appuntamento "a"
all'agenda. Se "a" e` null oppure se si e` raggiunta la dimensione
massima dell'agenda oppure se c'e` gia` un appuntamento nel giorno e
ora indicati in "a" il metodo non effettua alcuna operazione e
restituisce false. Altrimenti, il metodo aggiunge "a" rispettando
l'ordine cronologico degli appuntamenti. Da notare che, in generale,
il metodo puo` dover effettuare lo scorrimento di alcuni
appuntamenti gia` presenti nell'agenda.

boolean disdetta(int n): rimuove l'n-esimo appuntamento in ordine
cronologico (0 e` il primo appuntamento, 1 e` il secondo
appuntamento, ecc.). Restituisce "true" se "n" e` un indice valido,
ovvero e` relativo ad un appuntamento esistente nell'array, "false"
altrimenti.  Da notare che, in generale, il metodo puo` dover
effettuare lo scorrimento degli appuntamenti successivi a quello
rimosso.

int numeroAppuntamenti(): restituisce il numero di appuntamenti in
agenda.

Appuntamento appuntamento(int i): restituisce l'appuntamento con
indice "i" oppure null se "i" non e` un indice valido.

ATTENZIONE. E` vietato l'uso di classi della libreria standard di
Java ad eccezione di Math, String e delle sottoclassi di Exception.*/