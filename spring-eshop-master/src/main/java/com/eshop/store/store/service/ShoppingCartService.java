package com.eshop.store.store.service;

import com.eshop.store.store.domain.Article;
import com.eshop.store.store.domain.CartItem;
import com.eshop.store.store.domain.ShoppingCart;
import com.eshop.store.store.domain.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);
	
	int getItemsNumber(User user);
	
	CartItem findCartItemById(Long cartItemId);
	
	CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);
		
	void clearShoppingCart(User user);
	
	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);
	
}
