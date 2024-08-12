package com.example.demo.vo;

import lombok.Getter;

public class ResultData{
	@Getter
	private String ResultCode;
	@Getter
	private String msg;
	@Getter
	private Object data1;
	
	public static ResultData from (String ResultCode, String msg, Object data1) {
		ResultData rd = new ResultData();
		
	}
}