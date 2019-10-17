package BangunRuang;

public class persegi extends Bangunruang {
	
	float sisi;
	
	public float getSisi() {
		return sisi;
	}

	public void setSisi(float sisi) {
		this.sisi = sisi;
	}

	@Override
	float hitungluas(){
		float luas= this.sisi*this.sisi;
		System.out.println("luas : " +luas);
		return luas;
	}
	

}
