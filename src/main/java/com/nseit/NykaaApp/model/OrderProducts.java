package com.nseit.NykaaApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class OrderProducts {
    @Id
    @GeneratedValue
    private Integer orderId;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_Id", referencedColumnName = "userId")
    private ProductUser productUser;

    @ManyToMany
    @JoinTable(name = "orderedProducts",
            joinColumns = @JoinColumn(name = "o_Id", referencedColumnName = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "productId"))
    private Set<Product> products;
}
