##Qua è presente la soluzione dell'esercizio Treno

>Si vuole realizzare un sistema di gestione di treni.
> 
>Il sistema prevede una classe astratta Vagone che descrive un vagone
>generico. La classe Vagone è caratterizzata da un intero positivo 'peso'
>che esprime il peso in tonnelate del vagone.
>Specializzare la classe Vagone con le classi Locomotiva e Carrozza.
 
>La classe Locomotiva è caratterizzata dall'intero positivo 'cavalli' che esprime
>i cavalli vapore della locomotiva. Definire il costruttore di Locomotiva
>con eccezione se i parametri sono errati.
>
>La classe Carrozza è caratterizzata
>da un intero positivo 'posti' compreso tra 40 e 200 indicante il numero di posti
>della carrozza. Definire il costruttore di Carrozza con eccezione se i
>parametri sono errati.

>Definire la classe Treno e il suo costruttore
>che accetta un intero indicante il numero massimo di vagoni presenti in
>un treno. Viene prodotta un'eccezione se il parametro è minore di 1.
>
>Definire la classe boolean add(Vagone) che accetta un vagone
>(locomotiva o carrozza) e produce true se l'aggiunta ha successo, false
>altrimenti.
 
>Definire il metodo boolean check() che verifica se la somma
>dei cavalli delle locomotive presenti è maggiore al peso
>complessivo del tremo.
 
>Definire il metodo int passeggeri() che produce
>la somma del numero di posti presenti nel treno.

>Non modificare la classe Vagone.
>Non è consentito l'uso di classi della libreria standard di Java diverse da String,


>Math e dalle classi che rappresentano eccezioni. In particolare, non è consentito
>l’uso di alcuna classe contenitore (es. ArrayList, Vector, ecc.)
>E' fornita la classe Test che esegue alcuni test per verificare le principali
>funzionalità delle classi Vagone, Locomotiva, Carrozza e Treno