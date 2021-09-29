package com.project.fos.services;

import java.util.List;

import com.project.fos.entities.Item;

public interface ItemService {
	List<Item> getMenu();
	Item getItem(Integer id);
	Item addItem(Item item);
	Item updateItem(Item item);
	void deleteItem(Integer id);
}
