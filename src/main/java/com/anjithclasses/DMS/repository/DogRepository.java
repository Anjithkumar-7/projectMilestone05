package com.anjithclasses.DMS.repository;


import java.util.List;

/**
 * @author S554041
 */
import org.springframework.data.repository.CrudRepository;

import com.anjithclasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog>findByName(String name);

}
