package BangunRuang;

public class segitiga extends Bangunruang{
	 
	float r;
	final double phi = 3.14;
	
	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public double getPhi() {
		return phi;
	}

	@Override
	float hitungluas(){
		float luas = (float) (2*this.phi*this.r);
		System.out.println("luas:"+luas);
		return luas;
		
	}
	
	
}