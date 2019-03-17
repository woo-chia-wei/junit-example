import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EuclideanAlgorithmTest {

	@ParameterizedTest(name = "{index} => a={0}, result={1}")
    @CsvSource({
            "1, 1",
            "20, 20",
            "31, 31"
    })
    void SingleInputGCDTest(int a, int result) {
        EuclideanAlgorithm ea = new EuclideanAlgorithm();
        assertEquals(result, ea.GCD(a));
    }

	@ParameterizedTest(name = "{index} => a={0}, b={1}, result={2}")
    @CsvSource({
            "1, 13, 1",
            "19, 1, 1",
            "20, 15, 5",
            "15, 20, 5",
            "17, 13, 1",
            "13, 17, 1",
            "7, 49, 7",
            "55, 11, 11"
    })
    void DoubleInputGCDTest(int a, int b, int result) {
        EuclideanAlgorithm ea = new EuclideanAlgorithm();
        assertEquals(result, ea.GCD(a, b));
    }

	@Test
    void MultipleGCDTest() {
        EuclideanAlgorithm ea = new EuclideanAlgorithm();
        assertEquals(2, ea.GCD(new int[]{10, 18, 26}));
        assertEquals(1, ea.GCD(new int[]{1, 2, 3}));
        assertEquals(1, ea.GCD(new int[]{3, 2, 1}));
        assertEquals(10, ea.GCD(new int[]{20, 30, 10}));
    }
	
	@Test
    void ErrorGCDTest() {
        EuclideanAlgorithm ea = new EuclideanAlgorithm();
        assertThrows(IllegalArgumentException.class, () -> ea.GCD());
    }
}
