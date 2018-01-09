package com.oa.commons.model;


/**
 * RSA 公钥 
 * @author	Wangyan
 * @version	 1.0
 *
 */
public class RSAPublicKeyModel {
	/**
	 * Hex.encode 编码之后的公钥系数
	 */
	private String hexModulus;
	/**
	 * Hex.encode 编码之后的 公钥指数
	 */
	private String hexPublicExponent;

	public String getHexModulus() {
		return hexModulus;
	}

	public void setHexModulus(String hexModulus) {
		this.hexModulus = hexModulus;
	}

	public String getHexPublicExponent() {
		return hexPublicExponent;
	}

	public void setHexPublicExponent(String hexPublicExponent) {
		this.hexPublicExponent = hexPublicExponent;
	}
	
}
