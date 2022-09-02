package com.nseit.NykaaApp.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.Order;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private Integer productId;
    private String productName;
    private Integer price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "categoryId")
    private Category category;

    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Cart> carts;

    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<OrderProducts> orders;

}