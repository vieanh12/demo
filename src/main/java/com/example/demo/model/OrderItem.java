package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "menu_item_id")
    private Long menuItemId;

    @Column(name = "quantity")
    private int quantity;

    public OrderItem() {}

    public OrderItem(Long orderId, Long menuItemId, int quantity) {
        this.orderId = orderId;
        this.menuItemId = menuItemId;
        this.quantity = quantity;
    }

    // Getter và Setter
    public Long getId() { return id; }
    public Long getOrderId() { return orderId; }
    public Long getMenuItemId() { return menuItemId; }
    public int getQuantity() { return quantity; }

    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public void setMenuItemId(Long menuItemId) { this.menuItemId = menuItemId; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
