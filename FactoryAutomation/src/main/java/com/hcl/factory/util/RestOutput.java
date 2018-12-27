package com.hcl.factory.util;

import java.util.ArrayList;
import java.util.List;

import com.hcl.factory.model.Error;

public class RestOutput<T> {
	
	public boolean status = false;
	public T data = null;
	public List<Error> errors = new ArrayList<>();
	
	
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public List<Error> getErrors() {
		return errors;
	}


	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}


	public boolean addError(Error error) {
		if(error != null) {
			this.status = false;
			this.errors.add(error);
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {

	}

}
