package com.jan3r.supermarcket.domain.data;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Purchase {
    private Integer id;
    private String idCustomer;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String status;
}
