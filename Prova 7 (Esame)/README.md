# Esame 📄
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Esame
-- -
## Traccia:
Definire la classe *Esame*, i cui oggetti sono caratterizzati dai seguenti attributi:
- `nome` (stringa);
- `CFU` (intero compreso tra 1 e 18);
- `voto` (intero tra 0 e 31);
- `data` (intero maggiore di 20200000).

Definire il costruttore della classe Esame, che ha come parametri una stringa per il `nome` e un intero per i `CFU`.
Verrà lanciata un'eccezione se i dati dei parametri sono errati.
Definire il metodo `esameSostenuto` della classe *Esame*, che ha come parametri il `voto` (un valore compreso tra 0 e 31) e
la `data` nel formato anno-mese-giorno (ad esempio 13 settembre 2021 è codificato con 20210913). Non vi è controllo sul
formato della data se non che sia un intero maggiore di 20200000. Verrà lanciata un'eccezione se i dati dei parametri sono errati.


Definire la classe *Studente*, i cui oggetti sono caratterizzati dai seguenti attributi:
- `nome` (stringa);
- `cognome` (stringa);
- `numero di matricola` (intero positivo);
- `elenco esami` (al massimo 30).

Definire il costruttore della classe Studente, che ha come parametri una stringa per il `nome`, una stringa per il `cognome`,
un intero per il `numero di matricola`. Verrà lanciata un'eccezione se i dati dei parametri sono errati.
Definire il metodo `aggiungiEsame` della classe *Studente*, che ha come parametro un `esame`. Il metodo aggiungiEsame aggiunge
l'esame se la somma dei `CFU` relativi agli esami dello studente (incluso l'esame da aggiungere) non eccede 180 CFU, altrimenti genera una eccezione.

Riscrivere il metodo `toString` della classe Studente di modo che generi una stringa contenente `nome`, `cognome matricola` e l'elenco
degli `esami superati` (ovvero con voto >= 18) e relativo voto.


>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **Main** che esegue alcuni test per verificare le principali
>funzionalità delle classi **Esame** e **Studente**
