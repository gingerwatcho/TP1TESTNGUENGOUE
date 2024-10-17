package TPTESTNGUENGOUE.isi4fr;

import org.junit.Test;

import junit.framework.TestCase;

public class OperationMathematiqueTest extends TestCase {
    @Test
    public void testEstPositif() {
        assertTrue(OperationMathematique.estPositif(1));
        assertFalse(OperationMathematique.estPositif(-1));
    }

    @Test
    public void testFactoriel() {
        assertEquals(1, OperationMathematique.factoriel(0));
        assertEquals(120, OperationMathematique.factoriel(5));
    }

}
