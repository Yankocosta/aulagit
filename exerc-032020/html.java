// ---------------------------------------------------
// curso de sistemas, disciplina de programacao III
// Ago/2013
// parametros via teclado
//---------------------------------------------------

public class aula3_argv_num {

  public static void main(String[ ] argv) {

    if (! (argv.length > 0) ) {
	System.out.printf("\n Sem argumentos \n\n");

    } else {

	    int ind = Integer.parseInt(argv[0]);

	    for (; ind > 0; ind--) {
		System.out.printf("\n num = %d ", ind);


	    }

    }

  }
}
