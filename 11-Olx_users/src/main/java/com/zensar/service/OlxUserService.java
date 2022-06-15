package com.zensar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.OlxUser;
import com.zensar.db.OlxUserDAO;

@Service
public class OlxUserService {
	
	@Autowired
	OlxUserDAO dao;
	
	public OlxUser addolxUser(OlxUser olxuser) {
	return this.dao.save(olxuser);
		
	}
	public OlxUser findByUserName(String Username) {
		return this.dao.findByUserName(Username);
	}
	public OlxUser findbyId(int id) {
		Optional <OlxUser> optional =this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
			return null;
	}

}
