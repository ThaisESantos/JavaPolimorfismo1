package Polimorfismo;

public class Mamifero extends Animal {
	
	private String corDoPelo;
	
	public String getCorDoPelo(){
		
		return this.corDoPelo;
	}
	
	public void setCorDoPelo(String corDoPelo){
		
	}

	@Override
	public void locomover() {
			System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
			System.out.println("mamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mamifero");
		
	}
	
		
	
	

}
