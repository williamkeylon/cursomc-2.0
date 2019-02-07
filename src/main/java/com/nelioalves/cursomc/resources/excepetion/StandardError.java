package com.nelioalves.cursomc.resources.excepetion;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Integer status;
	private String msg;
	private Long timeStamp;
	
	
	public StandardError(Integer status, String msg, Long l) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = l;
	}
	
	
}
