# Libretto vaccinale 💉
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Libretto vaccinale
-- -
## Traccia:
Sviluppare, in forma semplificata, una applicazione per la gestione del libretto vaccinale di una
persona.

Una **persona** è caratterizzata da:
- `nome` (stringa di lunghezza maggiore o uguale di 2),
- `età` (intero maggiore o uguale a 0 e minore o uguale a 99).
- `sesso` (numero 0 per indicare sesso maschile e numero 1 per indicare sesso femminile, vedi uso costanti descritto sotto):
- `numero di dosi di vaccini effettuate` (intero),
- `elenco delle dosi di vaccini effettuate`.

  Definire quindi la classe **Persona** con il relativo costruttore, che crea una nuova persona che
  inizialmente non ha effettuato alcuna dose di vaccino. Il costruttore lancia un'eccezione di tipo
  DatiErrati se i rispettivi parametri di input sono errati. Il numero massimo di dosi di vaccini che
  possono essere memorizzati dall'applicazione per ogni persona è 100. La classe Persona
  include anche due costanti `MASCHILE` e `FEMMINILE` rispettivamente con valori 0 e 1, da
  utilizzare per definire il sesso della persona.

Una dose di **vaccino** è caratterizzata da:
- `identificativo` (intero),
- `azienda farmaceutica` (stringa).
- `durata in giorni prima del successivo richiamo` (intero maggiore di 10).
  Si considerano in particolare due tipologie di vaccini: A e B. Definire quindi la classe Vaccino
  come classe astratta, estesa dalle classi **VaccinoA** e **VaccinoB**. Un'eccezione di tipo DatiErrati
  viene lanciata se i parametri di input sono errati. I metodi costruttori di queste due classi
  permettono quindi di creare dosi dei rispettivi vaccini. Si noti che l'identificativo di una dose
  deve essere univoco per il tipo di vaccino. Inoltre, una dose di vaccino di tipo B è caratterizzata
  anche dalla modalità di `somministrazione` (stringa).
  Definire il metodo `eseguiDose(Vaccino dose)` per la classe Persona, che aggiunge una dose di
  un vaccino di tipo A o di tipo B al suo elenco di dosi effettuate; se il numero massimo delle
  dosi memorizzabili è stato già raggiunto, l'esecuzione del metodo terminerà senza effetti (cioè
  l'elenco delle dosi memorizzate non viene modificato e nessuna eccezione viene lanciata).
  Inoltre i seguenti vincoli devono essere rispettati al momento dell'inserimento della dose
  nell'elenco (se non lo sono, viene lanciata un'eccezione di tipo DoseNonSomministrabile):
- un vaccino di tipo A può essere assegnato a persone di qualunque sesso con età maggiore o
  uguale a 14 anni;
- un vaccino di tipo B può essere assegnato a persone di sesso maschile con età maggiore o
  uguale a 18 anni e a persone di sesso femminile con età maggiore o uguale a 60.
  Riscrivere il metodo toString() per la classe Persona in modo da restituire una stringa
  contenente tutti i dati della persona, inclusi i dati di tutte le dosi di vaccino effettuate.

>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **TestCoda** che esegue alcuni test per verificare le principali
>funzionalità delle classi **XX** e **XX**

# TODO: Implementare le classi Persona, Vaccino, VaccinoA, VaccinoB
# TODO: Aggiungere file TestLibrettoVaccinale.java