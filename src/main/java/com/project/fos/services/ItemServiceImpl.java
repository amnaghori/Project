package com.project.fos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fos.entities.Item;
import com.project.fos.repositories.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepo itemRepo;

	@Override
	public List<Item> getMenu() {
		return itemRepo.findAll();
	}

	@Override
	public Item getItem(Integer id) {
		return itemRepo.findById(id).get();
	}

	@Override
	public Item addItem(Item item) {
		itemRepo.save(item);
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		itemRepo.save(item);
		return item;
	}

	@Override
	public void deleteItem(Integer id) {
		Item entity = itemRepo.getById(id);
		itemRepo.delete(entity);
	}

}
