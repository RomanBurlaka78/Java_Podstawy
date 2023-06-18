import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import java.util.stream.Stream;

public class Unit_Test_Calculator {
    private final Calculator calculator1 = new Calculator();

    @BeforeEach

    @Test
    void demoTestCalculatorAdd() {
        Assertions.assertEquals(6, calculator1.add(2, 4));
    }

    //@DisplayName("Subtruction")
    @Test
    void demoTestCalculatorSubtract() {
        Assertions.assertEquals(2, calculator1.subtraction(4, 2));
    }

    @Test
    void demotestDivided() {
        Assertions.assertEquals(3, 6, 3);
    }
    @Test
    void demotestMultiplication() {
        Assertions.assertEquals(4, 2, 2);
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    void adding(int a, int b, int c) {
        Assertions.assertEquals(c, calculator1.add(a, b));

    }


    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(5, 4, 9),
                Arguments.of(7, 4, 11),
                Arguments.of(5, 4, 9)
        );
    }
}
