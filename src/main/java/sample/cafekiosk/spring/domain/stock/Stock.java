package sample.cafekiosk.spring.domain.stock;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    private int quantity;

    @Builder
    public Stock(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public static Stock create(String productNumber, int quantity) {
        return Stock.builder()
                .product(productNumber)
                .quantity(quantity)
                .build();
    }
}
