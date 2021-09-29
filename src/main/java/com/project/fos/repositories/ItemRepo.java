package com.project.fos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fos.entities.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer>{

}
