# IT-Academy-S1.02-Exceptions-Nivel3

### Exercisi: Cine

Una famosa empresa de cinemes ens ha demanat que desenvolupem una aplicació per a la reserva de seients en els seus cinemes. L’aplicació serà utilitzada pels venedors/es a l’hora de vendre les entrades.

#### Funcionament
L’aplicació un cop s’hagi iniciat, preguntarà a l’usuari/ària quantes files i quants seients per fila té la sala de cinema. Un cop introduïdes aquestes dades, es mostrarà el següent menú:

1.- Mostrar totes les butaques reservades.

2.- Mostrar les butaques reservades per una persona.

3.- Reservar una butaca.

4.- Anul·lar la reserva d’una butaca.

5.- Anul·lar totes les reserves d’una persona.

0.- Sortir.

### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell3-Cine

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercisi 1
Al package principal hi ha les classes:
- Cine: Inicialitza el programa i s'encarrega de cridar al management necessari per cada tasca.
- CineManagement: Gestiona tot lo referent al cine (afegir o anul·lar butaques, mostrar les dades, etc.)
- SeatManagement: Gestiona tot lo referent als seients reservats i guarda la llista de reserves.
- Seat: Informació bàsica d'un seient (fila, numero i persona).
- Entry: Util per obtenir valors adecuats de l'usuari.
- Main: inicia el programa.