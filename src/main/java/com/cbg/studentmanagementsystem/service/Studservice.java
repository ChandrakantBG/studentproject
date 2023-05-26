package com.cbg.studentmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbg.studentmanagementsystem.dao.Studdao;
import com.cbg.studentmanagementsystem.entity.Stud;

@Service
public class Studservice {

	@Autowired
	Studdao dao;

	public List<Stud> getAllStudentdata() {
		return dao.getAllStudentdata();

	}

	public String getInsertData(Stud ss) {
		return dao.getInsertData(ss);
	}

	public String updateData(Stud ss) {
		return dao.updateData(ss);
	}

	public String deleteData(int id) {
		return dao.deleteData(id);
	}

}
