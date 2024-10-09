# IT-Academy-S1.02-Exceptions-Nivel2

### Exercisi: Entry

Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar les diferents excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe Scanner.

El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí, crear mètodes estàtics per llegir els diferents tipus de dades des del teclat.  

Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària, per exemple: “Introdueix la teva edat”, i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode, per exemple: un byte amb l’edat de l’usuari/ària.

Mètodes a implantar capturant l’excepció de la classe "InputMismatchException":

- public static byte llegirByte(String missatge); 
- public static int llegirInt(String missatge); 
- public static float llegirFloat(String missatge); 
- public static double llegirDouble(String missatge);

Mètodes a implantar capturant una excepció personalitzada de la classe Exception:

- public static char llegirChar(String missatge); 
- public static String llegirString(String missatge); 
- public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari/ària introdueix “n”, retorna “false”.

### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell2-Entry

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercici 1
He creat una custom Exception CharException per capturar en els casos que es demanen.
Al Main hi ha una crida a cada mètode demanat a mode formulari. Es pregunta a l'usuari en bucle fins que dona un valor adequat i llavors passem al següent.

