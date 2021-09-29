package com.project.fos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fos.entities.Item;
import com.project.fos.services.ItemService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:9091")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to Food Ordering System";
	}

	@GetMapping("/menu")
	public List<Item> getMenu() {
		return itemService.getMenu();
	}

	@GetMapping("/menu/{itemId}")
	public Item getItem(@PathVariable String itemId) {
		Item i = itemService.getItem(Integer.parseInt(itemId));
		return i;
	}

	@PostMapping(value = "/menu")
	public Item add(@RequestBody Item item) {
		return itemService.addItem(item);
	}

	@PutMapping(value = "/menu")
	public Item update(@RequestBody Item item) {
		return itemService.updateItem(item);
	}

	@DeleteMapping("/menu/{itemId}")
	public ResponseEntity<HttpStatus> update(@PathVariable String itemId) {
		try {
			itemService.deleteItem(Integer.parseInt(itemId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
