package com.example.springdemo.Repository;

import java.util.List;

import com.example.springdemo.Model.LoanApplicationModel;

public interface LoanApplicationModelRepository {

	List<LoanApplicationModel> findAll();

	LoanApplicationModel save(LoanApplicationModel lobj);

	Object findById(int loanId);


}
