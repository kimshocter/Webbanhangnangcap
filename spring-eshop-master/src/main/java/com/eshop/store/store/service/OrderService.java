package com.eshop.store.store.service;

import java.util.List;

import com.eshop.store.store.domain.Order;
import com.eshop.store.store.domain.Payment;
import com.eshop.store.store.domain.Shipping;
import com.eshop.store.store.domain.ShoppingCart;
import com.eshop.store.store.domain.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
