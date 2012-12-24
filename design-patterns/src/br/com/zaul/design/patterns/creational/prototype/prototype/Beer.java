package br.com.zaul.design.patterns.creational.prototype.prototype;

public abstract class Beer implements Cloneable {

	private String malt;
	
	private String hop;
	
	private Double alcoholicStrength;
	
	public Beer(String malt, String hop, Double alcoholicStrength) {
		this.malt = malt;
		this.hop = hop;
		this.alcoholicStrength = alcoholicStrength;
	}
	
	public String getMalt() {
		return malt;
	}

	public void setMalt(String malt) {
		this.malt = malt;
	}

	public String getHop() {
		return hop;
	}

	public void setHop(String hop) {
		this.hop = hop;
	}

	public Double getAlcoholicStrength() {
		return alcoholicStrength;
	}

	public void setAlcoholicStrength(Double alcoholicStrength) {
		this.alcoholicStrength = alcoholicStrength;
	}

	@Override
	public Beer clone() throws CloneNotSupportedException {
		return (Beer) super.clone();
	}
}
