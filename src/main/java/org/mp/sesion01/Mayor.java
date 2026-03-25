package org.mp.sesion01;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mayor {

	public void testElEnteroMayor() {
        int[] a = {1, 3, 9, 2};
        
        // Se corrige la logica empezando por el valor mas pequeño
        int max = Integer.MIN_VALUE; 
        
        for (int indice = 0; indice < a.length; indice++) {
            if (a[indice] > max) {
                max = a[indice];
            }
        }
        
        // Se comprueba que el valor sea 9
        assertEquals(9, max);
    }
}

