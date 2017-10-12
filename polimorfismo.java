package Polimorfismo;

public class polimorfismo {

	public static void main(String[] args) {
			
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
			m.setPeso(30f);
			m.setCorDoPelo("Branco");
			m.setIdade(5);
			m.alimentar();
			m.emitirSom();
			
			
			r.setPeso(5f);
			r.setCorEscama("Rosa");
			r.setIdade(3);
			r.alimentar();
			r.emitirSom();
			
			p.locomover();

	}

}
