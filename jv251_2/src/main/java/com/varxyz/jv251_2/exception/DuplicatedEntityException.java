package com.varxyz.jv251_2.exception;

@SuppressWarnings("serial")
public class DuplicatedEntityException extends RuntimeException {
	public DuplicatedEntityException(String msg){
		super(msg);
	}
}
