package model;

public class Marks {
	private int s1;
	private int s2;
	private int s3;
	private int s4;
	private int s5;
	private int s6;
	private int s7;
	private float avg;
	private float percentage;
	private float total;
	private String name;

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public int getS3() {
		return s3;
	}

	public void setS3(int s3) {
		this.s3 = s3;
	}

	public int getS4() {
		return s4;
	}

	public void setS4(int s4) {
		this.s4 = s4;
	}

	public int getS5() {
		return s5;
	}

	public void setS5(int s5) {
		this.s5 = s5;
	}

	public int getS6() {
		return s6;
	}

	public void setS6(int s6) {
		this.s6 = s6;
	}

	public int getS7() {
		return s7;
	}

	public void setS7(int s7) {
		this.s7 = s7;
	}

	
	private void setTotal() {
		this.total = this.s1 + this.s2 + this.s3 + this.s4 + this.s5 + this.s6 + this.s7;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg() {
		setTotal();
		this.avg = this.total / (float) 7;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage() {
		this.percentage = this.total / 700 * 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Marks [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4 + ", s5=" + s5 + ", s6=" + s6 + ", s7="
				+ s7 + ", avg=" + avg + ", percentage=" + percentage + ", name=" + name + "]";
	}

}
