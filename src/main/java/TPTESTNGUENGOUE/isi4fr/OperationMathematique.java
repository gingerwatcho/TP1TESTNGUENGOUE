package TPTESTNGUENGOUE.isi4fr;

import java.util.Arrays;

public class OperationMathematique {

    public static boolean estPositif(int nombre) {
        return nombre > 0;
    }

    public static int factoriel(int nombre) {
        if (nombre < 0) {
            throw new IllegalArgumentException("Nombre doit être >= 0");
        }
        int result = 1;
        for (int i = 1; i <= nombre; i++) {
            result *= i;
        }
        return result;
    }
    
    public static int[] trier(int[] liste) {
        Arrays.sort(liste);
        return liste;
    }

}
