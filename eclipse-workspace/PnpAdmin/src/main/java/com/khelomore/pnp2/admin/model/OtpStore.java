package com.khelomore.pnp2.admin.model;

public class OtpStore {

	private String mobileNumber;
	private int otp;

	public OtpStore() {
		super();
// TODO Auto-generated constructor stub
	}

	public OtpStore(String mobileNumber, int otp) {
		super();
		this.mobileNumber = mobileNumber;
		this.otp = otp;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

}
