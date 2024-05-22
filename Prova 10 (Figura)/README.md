# Figura 🟦
-- -
#### ☑️ Qua è presente la soluzione dell'esercizio Figura
-- -
## Traccia:
Data l’interfaccia **Figura** che mette a disposizione i metodi
- double `getPerimetro()`
- double `getArea()`
  Realizzare:
1. La classe astratta **QuadrilateroRegolare** che:
   - implementa l’interfaccia `Figura`;
   - ha due attributi double `base` ed `altezza` che sono impostati dal costruttore;
   - fornisce i metodi `getBase()` e `getAltezza()` che restituiscono i valori dei campi.
2. La classe **Quadrato** che estende la classe **QuadrilateroRegolare** e che:
   - Fornisce un costruttore che riceve come argomento il lato della figura e che solleva una IllegalArgumentException se l’argomento passato è minore o uguale a zero.
3. La classe **Rettangolo** che estende la classe **QuadrilateroRegolare** e che:
   - Fornisce un costruttore che riceve come argomenti `base` e `altezza` e che solleva una IllegalArgumentException se uno degli argomenti passati è minore o uguale a zero.
4. La classe **Rombo** che estende la classe **QuadrilateroRegolare** e che:
   - Fornisce un costruttore che riceve come argomenti `base` e `altezza` e che solleva una IllegalArgumentException se uno degli argomenti passati è minore o uguale a zero.
5. I metodi `toString()` delle classi Quadrato, Rettangolo e Rombo riscritti in modo tale che si ottenga come risultato la stringa della forma:
   `<nomefigura>[base=<valore>,altezza=<valore>]`
6. La classe **Disegno** che:
   - contiene al più 100 figure;
   - offre il metodo `aggiungiFigura(Figura f)` che aggiunge una figura al disegno e che solleva una IllegalArgumentException se la figura passata è null o se il disegno già contiene il numero massimo di figure;
   - offre il metodo `getAreaTotale()` che ritorna l’area di tutte le figure nel disegno;
   - offre il metodo `getPerimetroTotale()` che il perimetro totale di tutte le figure;
   - riscrive il metodo `toString()` in modo che venga restituita una string della forma:
   
   `Numero figure: <numero figure nel disegno>`

   `Area totale: <valore area totale>`

   `Perimetro totale: <valore perimetro totale>`


>**Non è consentito l'uso di classi della libreria standard di Java diverse da String, Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)**
>
>È fornita la classe **TestCoda** che esegue alcuni test per verificare le principali
>funzionalità delle classi **XX** e **XX**

# TODO: Implementare le classi QuadrilateroRegolare, Quadrato, Rettangolo, Rombo e Disegno
# TODO: Aggiungere file TestFigura.java