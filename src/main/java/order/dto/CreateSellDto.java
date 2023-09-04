package order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Table(name="wholesale_sell")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateSellDto {

    @Id
    @Column(name = "orderId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "vendorId")
    private int vendorId;

    @Column(name = "garmentType")
    private String garmentType;

    @Column(name = "garmentBrand")
    private String garmentBrand;

    @Column(name = "noOfProducts")
    private int noOfProducts;

    @Column(name = "costPerProduct")
    private double costPerProduct;

    @Column(name = "note")
    private String note;

}
