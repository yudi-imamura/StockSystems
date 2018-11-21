package com.felicidade.sistema.response;

import java.util.List;

public class Response<T> {

	private T data;
	private List<String> errors;
	
	
	public Response(T data) {
		super();
		this.data = data;
	}
	
	public Response(List<String> errors) {
		super();
		this.errors = errors;
	}
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
}
