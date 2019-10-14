package es.unileon.prg.tema5;


/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion

	System.out.println(cadena.length());

	int posIntermedia=cadena.length()/2;
	System.out.println(posIntermedia);
	System.out.println(cadena.charAt(posIntermedia));
	System.out.println(cadena.charAt(posIntermedia)+ " = " +cadena.codePointAt(posIntermedia));
			
	        
	// Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion

//Sin excepciones
	if(cadena.equals(otraCadena)){
	System.out.println("Son iguales");
	}
	else{
	System.out.println("Son distintos");
	}

//Omitimos mayusculas
	if(cadena.equalsIgnoreCase(otraCadena)){
	System.out.println("Son iguales");
	}
	else{
	System.out.println("Son distintos");
	}

//Conversion minusculas
	String cadMinus = cadena.toLowerCase();
	String otraCadMinus = otraCadena.toLowerCase();
	if(cadMinus.equals(otraCadMinus)){
	System.out.println("Son iguales");
	}
	else{
	System.out.println("Son distintos");
	}


      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");
      
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion

// con +
	String sumaCad = cadena+" "+otraCadena;
	System.out.println(sumaCad);

// concatenacion
	System.out.println(cadena.concat(" "+otraCadena));

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion
	boolean ultima;
	boolean primera;
	//ends
	ultima = cadena.endsWith("Parnaso");
	System.out.println(ultima);
	//starts
	primera = cadena.startsWith("Viaje");
	System.out.println(primera);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	//contiene "p"?
	boolean letra = cadena.contains("p");
	System.out.println("¿contiene la letra buscada? = "+letra);

	//contiene cadena "par"?
	String cadPar = "Par";
	boolean buscaPar = cadena.contains(cadPar);
	System.out.println("contiene la cadena 'par'? = "+buscaPar);

	//ocurrencia de a
	String pos1=cadena;
	int posicionDeA=pos1.indexOf("a");
	int posicionRealDeA=posicionDeA+1;
	System.out.println("la posicion de a en la cadena es la numero = "+posicionRealDeA);


	// posicion de a empezando en posicion3
	
	
        // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	System.out.println(cadena.replace("a","*"));
	System.out.println(cadena.replace("Parnaso","Olimpo"));
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	int posFinal=cadena.length();
	int posIntermedia=cadena.length()/2;
	String subIni=cadena.substring(posIntermedia,posFinal);
	System.out.println(subIni);

	//j to s
	int posicionDeJ=cadena.indexOf("j");
	int posicionDeS=cadena.indexOf("s");
	posicionDeS+=1;//para que aparezca la s en la subcadena
	String jToS=cadena.substring(posicionDeJ,posicionDeS);
	System.out.println(jToS);

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
	System.out.println(cadena.replace("^\\s*$",""));
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion

	String cadena="";
	cadena=String.valueOf(numero);
	System.out.println(cadena);
	cadena=String.valueOf(expresion);
	System.out.println(cadena);
	cadena=String.valueOf(enteroGrande);
	System.out.println(cadena);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion

	
	if(cadena.compareTo(otraCadena)==0){
	System.out.println("iguales");
	}
	else{
	System.out.println("distintas");	
	}


        // Fin modificacion
      }
   }
