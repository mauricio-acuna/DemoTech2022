package com.mtech.entities;

import io.swagger.annotations.ApiModelProperty;

public class mtechCredential {
	@ApiModelProperty(notes = "Usuario alfanumerico")
	private String userName;
	@ApiModelProperty(notes = "DU")
	private String dni;
	@ApiModelProperty(notes = "Pin de canales")
	private String pin;
	@ApiModelProperty(notes = "true, si se envian los datos de usuario y pin encriptados, sino false")
	private Boolean encripted;
	public Boolean getEncripted() {
		return encripted;
	}
	public void setEncripted(Boolean encripted) {
		this.encripted = encripted;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
}