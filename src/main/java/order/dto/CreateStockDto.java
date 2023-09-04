package order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="wholesale_stock")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateStockDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;

    @Column(name = "providerId")
    private int providerId;

    @Column(name = "garmentType")
    private String garmentType;

    @Column(name = "garmentBrand")
    private String garmentBrand;

/*    @Column(name = "NoOfProductsPerSet")
    private int noOfProductsPerSet;*/

/*    @Column(name = "garmentSets")
    private int garmentSets;*/

    @Column(name = "costPerProduct")
    private double costPerProduct;

    @Column(name = "noOfProducts")
    private int noOfProducts;

}
