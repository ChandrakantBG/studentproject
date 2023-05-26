package com.cbg.studentmanagementsystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cbg.studentmanagementsystem.entity.Stud;

@Repository
public class Studdao {

	@Autowired
	SessionFactory sf;

	public List<Stud> getAllStudentdata() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Stud.class);
		List<Stud> list = criteria.list();
		return list;
	}

	public String getInsertData(Stud ss) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(ss);
		tr.commit();
		return "Insert The Data...";

	}

	public String updateData(Stud ss) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(ss);
		tr.commit();
		return "Update The Data...";
	}

	public String deleteData(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Stud s = session.get(Stud.class, id);
		session.delete(s);
		return "your Data Delete Successfully...";
	}

}
