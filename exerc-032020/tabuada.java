// ---------------------------------------------------
// tabuada (passando parametro em linha de comando)
//---------------------------------------------------

public class tabuada {

  public static void main(String[ ] argv) {

    if (! (argv.length > 0) ) {
	   System.out.printf("\n Sem argumentos \n\n");

    } else {

        int ind;
	    int tab = Integer.parseInt(argv[0]);

	    for (ind=1; ind < 11; ind++) {
		   System.out.printf(" %d x %d = %d \n", tab, ind, tab*ind);

	    }

    }

  }
}
