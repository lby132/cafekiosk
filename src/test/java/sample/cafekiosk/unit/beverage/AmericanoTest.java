package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmericanoTest {

    @Test
    void getName() {
        final Americano americano = new Americano();

//        assertEquals(americano.getName(), "아메리카노");
        assertThat(americano.getName()).isEqualTo("아메리카노");
    }

    @Test
    void getPrice() {
        final Americano americano = new Americano();

        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}
