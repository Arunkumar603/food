package com.example.springdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.Model.LoanApplicationModel;
import com.example.springdemo.Model.UserModel;
import com.example.springdemo.Repository.LoanApplicationModelRepository;
import com.example.springdemo.Repository.UserRepository;

@Service
	public class UserService {
		
		@Autowired
		UserRepository urep;
		
		@Autowired
		LoanApplicationModelRepository lrep;
		
		public String ValidUser(String email,String password)
		{
			UserModel uobj=urep.findByEmail(email);
			if(uobj==null)
			{
				return "No user found";
			}
			else
			{
				if(uobj.getPassword().equals(password))
				{
					return "Login Successfully";
				}
				else
				{
					return "Login Failed";
				}
			}
		}
		public UserModel newUser(UserModel obj)
		{
			return urep.save(obj);
		}
		public List<UserModel> getUserDetails()
		{
			return urep.findAll();
		}
		public LoanApplicationModel getLoan(int loanId)
		{
			LoanApplicationModel l=lrep.findById(loanId).get();
			return l;
		}
		public UserModel getProfile(int id)
		{
			UserModel u=urep.findById(id).get();
			return u;
		}

	}

