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
        assertEquals(6, classUnderTest.sumar(3,2));
    }
}
