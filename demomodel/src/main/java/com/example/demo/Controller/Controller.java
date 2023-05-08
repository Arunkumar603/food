package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Serviceclass;
import com.example.demo.StudentModel.loginpage;
import com.example.demo.StudentModel.modelclass;
@RestController
public class Controller {
   @Autowired
   Serviceclass sec;
   @GetMapping("/get")
    public List<modelclass> get()
    {
    	return sec.getdetails();
    }
    @PostMapping("/add")
    public modelclass savemethod(@RequestBody modelclass mc)
    {
    	return sec.saveinfo(mc);
    }
  //sorting
  	@GetMapping("/sort/{name}")
  	public List<modelclass> sorting(@PathVariable("name")String name)
  	{
  		 return sec.sorting(name);
  	}
  	
  	//pagination
  	@GetMapping("/page/{pnum}/{psize}")
  	public List<modelclass> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
  	{
  		return sec.page(num,size);
  	}
  	
  	//pagination sorting
  	@GetMapping("/paginationsort/{pnum}/{psize}/{name}")
  	public List<modelclass> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)
  	{
  		return sec.paginationsorting(pnum,psize,name);
  	}
  	
  

}
