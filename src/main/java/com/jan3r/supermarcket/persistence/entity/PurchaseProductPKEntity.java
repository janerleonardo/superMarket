package com.jan3r.supermarcket.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;

@Data
@Embeddable
public class PurchaseProductPKEntity implements Serializable {

    @Column(name = "id_compra")
    private Integer idPurchase;

    @Column(name = "id_producto")
    private Integer idProduct;

}