package com.moontech.sms.vo;


import java.util.Date;
import lombok.Data;

@Data
public class MatVO {
	private int matSq;
	private String matNm;
	private String matSize;
	private String picture;
	private String stanPrice;
	private String weight;

	// TB_MAT_STOCK
	private int stockSq;
	private int stockAmt;
	private int inAmt;
	private int outAmt;

	private Date renewDate;
}
