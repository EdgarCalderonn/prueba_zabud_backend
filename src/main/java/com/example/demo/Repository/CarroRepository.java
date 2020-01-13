package com.example.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.CarroModel;


	// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
	// CRUD refers Create, Read, Update, Delete

	public interface CarroRepository extends CrudRepository<CarroModel, Integer> {

	}


