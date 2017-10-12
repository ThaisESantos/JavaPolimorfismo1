package Polimorfismo;

public class Ave extends Animal{
	
	private String corDaPena;
	
	public String getCorDaPena(){
		
		return this.corDaPena;
	}
	
	public void setCorDaPena(String corDaPena){
		
		
	}
	
	public void construirNinho(){
		System.out.println("ninho construído");
	}

	@Override
	public void locomover() {
		System.out.println("voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Cantando");
		
	}
	
	
	
		

}
