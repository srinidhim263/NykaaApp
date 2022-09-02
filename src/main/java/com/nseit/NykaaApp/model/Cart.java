package com.nseit.NykaaApp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToMany
    @JoinTable(name = "cart_products", joinColumns =
    @JoinColumn(name = "cartId"), inverseJoinColumns = @JoinColumn(name = "productId"))
    private ProductUser productUser;
    
    @ManyToMany
    @JoinTable(name = "cart_products", joinColumns =
    @JoinColumn(name = "cartId"), inverseJoinColumns = @JoinColumn(name = "productId"))
    private Set<Product> products;
}
