/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package repoentornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void sumaPrueba() {
        App classUnderTest = new App();
        assertEquals(8, classUnderTest.sumar(3,2));
    }
}

//feat or fix 
//origin feat/sumar

//nos hemos saltado una cosa, creado un repsotiroio, un project inicial, hemos arreaglado permismos en la main
//hemos hecho un cambio para que no se toque la main, creamos  con cehckout -b feat/loque hacemos 
//y ahora un git status 
//git pull request 