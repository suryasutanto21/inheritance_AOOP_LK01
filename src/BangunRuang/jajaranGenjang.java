package BangunRuang;

public class jajaranGenjang extends Bangunruang {
	float sisi;
	@Override
	float hitungluas(){
		float luas= this.sisi*this.sisi;
		System.out.println("luas : " +luas);
		return luas;
	}
}
