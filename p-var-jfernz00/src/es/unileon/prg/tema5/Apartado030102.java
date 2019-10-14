package es.unileon.prg.tema5;


/**
 * Clase con los ejercicios correspondientes a operadores.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores";
	}

	/**
	 * Operadores - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para realizar las operaciones solicitadas
	 */
	public void ejercicio01() {
		cabecera("01","Utilizacion de operadores aritmeticos");

		// Inicio modificacion
		final int CONST=128;
		int op1 = 1;
		int op2 = 2;
		int resultado;
		//Preincrementa op1 y multiplicalo por 12
			op1 = (++op1) * 12;
		//El valor de op2 es la suma op1 predecrementado con CONST
			op2 = (--op1) - CONST;
		//Halla el resto de dividir op2 entre op1 y guardalo en resultado
			resultado = op1 % op2;
		//Muestra por pantalla los valores de op1, op2 y resultado
	System.out.println(resultado);
	System.out.println(op1);
	System.out.println(op2);
      // Fin modificacion
	}

	/**
	 * Operadores - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para calcular el valor de rebaja
	 */
	public void ejercicio02() {
		cabecera("02", "Utilizacion de operadores logicos");

		// Inicio modificacion
		int edad=24;
		int numeroPartes=1;
		boolean deportivo=true;
if (edad <60){
	if (edad >40){
		if (numeroPartes <3){
		boolean rebaja=true;
		System.out.println("Rebaja =" + rebaja);
		}
		else{
		boolean rebaja=false;
		System.out.println("Sin Rebaja =" + rebaja);
		}
	}

	else{
		if (edad >20 && numeroPartes <2){
		boolean rebaja=true;
		System.out.println("Rebaja =" + rebaja);
		}
		else {
		boolean rebaja=false;
		System.out.println("Sin Rebaja =" + rebaja);
		}
	}
}
else {
	boolean rebaja=false;
	System.out.println("Sin Rebaja =" + rebaja);
		
	}

}
		// rebaja = expresion booleana
		// Fin modificacion


	/**
	 * Operadores - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide calcular cuantas horas, minutos y segundos hay en 56000 segundos
	 */
	public void ejercicio03() {
		cabecera("03", "Calculos aritmeticos");

		// Inicio modificacion
		int segundos, horas, minutos, resto1, resto2;
		int totalSegundos=56000;
		
		horas = totalSegundos/3600;
		resto1 = totalSegundos%3600;
		minutos = horas/60;
		resto2 = horas%60;
		segundos = resto2;
		
		// Realizacion de calculos
		System.out.println(horas+"h "+minutos+"m "+segundos+"s ");
		// Fin modificacion
	}
}
