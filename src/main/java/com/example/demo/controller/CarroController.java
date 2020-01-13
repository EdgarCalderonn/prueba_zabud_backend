package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Repository.CarroRepository;
import com.example.demo.model.CarroModel;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Controller
public class CarroController {

	@Autowired
	private CarroRepository carroRepository;

	@GetMapping(path = "/carros")
	public @ResponseBody Iterable<CarroModel> getAllUsers() {
		// This returns a JSON or XML with the users
		return carroRepository.findAll();
	}

	@PostMapping(path = "/carros") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestParam String marca, @RequestParam String modelo,
			@RequestParam Integer anio) {

		Date date = new Date();
		long time = date.getTime();

		CarroModel car = new CarroModel();
		car.setMarca(marca);
		car.setModelo(modelo);
		car.setAnio(anio);
		car.setLast_modify(time);

		carroRepository.save(car);

		return "OK, guardado!";
	}
	
	@DeleteMapping(path="/carros")
	public @ResponseBody String deleteUser(@RequestParam Integer id) {

		carroRepository.deleteById(id);;

		return "OK, eliminado!";
	}
	
	@PutMapping(path="/carros")
	public @ResponseBody String modifyUser(@RequestParam Integer id,@RequestParam String marca, @RequestParam String modelo,
			@RequestParam Integer anio) {

		Date date = new Date();
		long time = date.getTime();
		String last_modify_formated = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(date);
		
		CarroModel car = new CarroModel();
		car.setId(id);
		car.setMarca(marca);
		car.setModelo(modelo);
		car.setAnio(anio);
		car.setLast_modify(time);
		car.setLast_modify_formated(last_modify_formated);

		carroRepository.save(car);

		return "OK, Actualizado!";
	}
	

}
