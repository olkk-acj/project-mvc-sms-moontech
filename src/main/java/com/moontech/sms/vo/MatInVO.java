package com.moontech.sms.vo;


import java.util.Date;
import lombok.Data;

@Data
public class MatInVO {
	private int inSq;
	private Date inDT;
	private int empNo;
	private int purSq;

	private int deSq;
	private int matSq;
	private String matNm;
	private int stockAmt;
	private int inAmt;
	private int outAmt;
}
