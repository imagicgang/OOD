import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    // f(name) = "Hello somkiat"
    @Test
    @DisplayName("Test in process .....")
    public void case01() {
        // Arrange
        Hello hello = new Hello();
        String name = "winner";
        // Act
        String actualResult = hello.sawadee(name);
        // Assert
        assertEquals("Hello winner", actualResult);
    }
}