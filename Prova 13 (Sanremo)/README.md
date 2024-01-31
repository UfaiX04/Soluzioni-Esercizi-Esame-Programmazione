# Sanremo 🎶
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Sanremo
-- -
## Traccia:
Si vuole sviluppare un programma per il festival di Sanremo.

Definire la classe **Artista** con i seguenti attributi:
* `Nome` (di tipo String);
* `Cognome` (di tipo String);
* `Nome d’arte` (di tipo String);
* `Genere musicale` (di tipo String);
* `Gruppo` (di tipo boolean), il valore tue se è un gruppo e false se è un cantante singolo;

Definire il costruttore di Artista generando un’eccezione Runtime exception se i dati in ingresso sono mancanti o stringhe minori di due caratteri.

Definire la classe **Serata** che ha come attributi gli artisti che si esibiranno in quella serata, il giorno (in tempo di UNIX) e il numero massimo artisti che si possono esibire.

Creare i seguenti metodi:
* `nuovaEsibizione(Artista a)` che inserisce un nuovo artista nella serata facendo esibire prima i solisti e poi i gruppi. Il metodo genera un’eccezione in caso non sono più disponibili posti per la serata.
* `esibizioneInCorso()` che elimina l’esibizione che sta avvenendo e ritorna il prossimo artista in lista. Se la serata è finita viene ritornato null.
* `eliminaEsibizione()` che elimina una determinata esibizione di un artista di cui è dato il nome d’arte

Definire la classe **Sanremo** che aggrega tutte le serate disponibili in questa edizione, il numero di serate e il vincitore.

Definire i seguenti metodi:
* `nuovaSerata(Serata s)` inserisce in coda una nuova serata in ordine cronologico.
* `getVincitore()`;
* `getDataFinale()` che restituisce il giorno (in tempo di UNIX) della finale.

>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **Test** che esegue alcuni test per verificare le principali
>funzionalità delle classi **Artista**, **Serata** e **Sanremo**