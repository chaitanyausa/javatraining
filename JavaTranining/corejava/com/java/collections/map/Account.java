package com.java.collections.map;

public class Account {
	
	
	private String accntType;
	
	private int accno;
	
	private float accntBalance;
	
	private int ssn;

	/**
	 * @return the accntType
	 */
	public String getAccntType() {
		return accntType;
	}

	/**
	 * @param accntType the accntType to set
	 */
	public void setAccntType(String accntType) {
		this.accntType = accntType;
	}

	/**
	 * @return the accno
	 */
	public int getAccno() {
		return accno;
	}

	/**
	 * @param accno the accno to set
	 */
	public void setAccno(int accno) {
		this.accno = accno;
	}

	/**
	 * @return the accntBalance
	 */
	public float getAccntBalance() {
		return accntBalance;
	}

	/**
	 * @param accntBalance the accntBalance to set
	 */
	public void setAccntBalance(float accntBalance) {
		this.accntBalance = accntBalance;
	}

	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accno;
		result = prime * result + Float.floatToIntBits(accntBalance);
		result = prime * result + ((accntType == null) ? 0 : accntType.hashCode());
		result = prime * result + ssn;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accno != other.accno)
			return false;
		if (Float.floatToIntBits(accntBalance) != Float.floatToIntBits(other.accntBalance))
			return false;
		if (accntType == null) {
			if (other.accntType != null)
				return false;
		} else if (!accntType.equals(other.accntType))
			return false;
		if (ssn != other.ssn)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accntType=" + accntType + ", accno=" + accno + ", accntBalance=" + accntBalance + ", ssn="
				+ ssn + "]\n";
	}

	public Account(String accntType, int accno, float accntBalance, int ssn) {
		super();
		this.accntType = accntType;
		this.accno = accno;
		this.accntBalance = accntBalance;
		this.ssn = ssn;
	}

	public Account(){
	}
	
	
	
}
