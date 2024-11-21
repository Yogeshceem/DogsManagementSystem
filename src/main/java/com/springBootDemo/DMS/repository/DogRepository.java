package com.springBootDemo.DMS.repository;

import java.util.List;

/**
 * @author S572178 Ceemarla Yogeshwar Reddy
 */

import org.springframework.data.repository.CrudRepository;

import com.springBootDemo.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog>findByName(String name);

}
