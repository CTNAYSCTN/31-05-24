package radyo;                								

public class RadyoIstasyonu {          			            
	private String name;									
	private double frekans;									
	
	public RadyoIstasyonu(String name, double frekans) {   
		this.frekans=frekans;								
		this.name=name;										
	}														
	public double getFrekans() {   							
		return frekans;            							
	}														
	public String getName() {  								
		return name;										
	}														
}															
