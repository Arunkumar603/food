package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Repository;
import com.example.demo.Repository.loginrep;
import com.example.demo.StudentModel.loginpage;
import com.example.demo.StudentModel.modelclass;
@Service
public class Serviceclass{
   @Autowired
   public Repository rep;
   public List<modelclass> getdetails()
   {
	   return rep.findAll();
   }
   public modelclass saveinfo(modelclass mc)
   {
	   return rep.save(mc);
   }
   public List<modelclass> sorting(String name) {
		// TODO Auto-generated method stub
		return rep.findAll(org.springframework.data.domain.Sort.by(name).descending());
	}
	
	public List<modelclass> page(int num, int size) {
		Page<modelclass> p=rep.findAll(PageRequest.of(num, size));
		return p.getContent();
	}

	public List<modelclass> paginationsorting(int pnum, int psize, String name) {
		// TODO Auto-generated method stub
		Page<modelclass> p=rep.findAll(PageRequest.of(pnum, psize, org.springframework.data.domain.Sort.by(name).descending()));
		return p.getContent();
	}
	
	
	
}
