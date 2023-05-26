package com.cbg.studentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbg.studentmanagementsystem.entity.Stud;
import com.cbg.studentmanagementsystem.service.Studservice;

@RestController
public class Studcontroller {
	@Autowired
	private Studservice sf;

	// all data show Get call
	@GetMapping("/allmanager")
	public List<Stud> getAllStudentdata() {
		return sf.getAllStudentdata();
	}

	// insert data Post call
	@PostMapping("/inserdata")
	public String getInsertData(@RequestBody Stud ss) {
		return sf.getInsertData(ss);
	}

	// update data Post call
	@PutMapping("/update")
	public String updateData(@RequestBody Stud ss) {
		return sf.updateData(ss);
	}

	// delete data Delete call
	@DeleteMapping("/deletebyid/{id}")
	public String deleteData(@PathVariable int id) {
		return sf.deleteData(id);
	}

}
