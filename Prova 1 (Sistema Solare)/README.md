# Sistema Solare 🪐
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Sistema Solare
-- -
## Traccia:
Si vuole modellare un sistema solare in cui registrare i pianeti che orbitano attorno a una certa stella.

Definire una classe **Pianeta** caratterizzata dagli attributi `nome` (di tipo `String`), `massa` e `distanza` (di tipo `double`) per rappresentare un pianeta chiamato `nome` con una certa `massa` e che orbita a `distanza` dalla stella. Definire il costruttore di **Pianeta** con tre argomenti, `nome`, `massa` e `distanza`, che lancia un'eccezione runtime se `nome` è nullo oppure se `massa` o `distanza` sono negativi. Dotare la classe **Pianeta** di opportuni metodi getter.

Definire una classe **SistemaSolare** che memorizza oggetti di tipo **Pianeta** mantenendoli in ordine crescente di distanza dalla stella. Il costruttore di **SistemaSolare** ha un argomento di tipo `int` indicante il numero massimo di pianeti che possono appartenere al sistema solare. Il costruttore lancia un'eccezione runtime se l'argomento è negativo. Definire quindi i seguenti metodi di **SistemaSolare**:

* `boolean nuovo(Pianeta p)` che aggiunge il pianeta `p` nella posizione corrispondente alla sua distanza dalla stella. Il metodo restituisce `true` se l'inserimento ha successo e `false` altrimenti.

* `int getNumero()` che restituisce il numero corrente di pianeti che appartengono al sistema solare.

* `Pianeta getPianeta(int n)` che restituisce l'oggetto **Pianeta** in posizione `n`, dove 0 è la posizione del pianeta più vicino alla stella. Il metodo restituisce `null` se la posizione non è valida.

* `Pianeta getMaxPianeta()` che restituisce il pianeta con massa maggiore o `null` se non ci sono pianeti nel sistema solare. Se ci sono più pianeti con la stessa massa massima, il metodo restituisce quello più vicino alla stella.


>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **Test** che esegue alcuni test per verificare le principali
>funzionalità delle classi **SistemaSolare** e **Pianeta**