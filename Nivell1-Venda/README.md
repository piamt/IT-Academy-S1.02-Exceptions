# IT-Academy-S1.02-Exceptions-Nivel1

### Exercisi: Venda

Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "EmptySaleException" i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.

L’excepció personalitzada "EmptySaleException" ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".


### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell1-Venda

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:  

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercisi 2
Al main hi ha 2 try-catch:  
- Un que crida al mètode calcularTotal() i llança una excepció personalitzada EmptySaleException, perquè he creat un array de productes buit.  
- Un que intenta accedir a un item de l'array de productes que no existeix i, per tant, llança l'excepció IndexOutOfBoundsException. 