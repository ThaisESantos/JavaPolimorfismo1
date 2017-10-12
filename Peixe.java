package Polimorfismo;

public class Peixe extends Animal{
		
		private String corEscama;
		
		public String getCorEscama(){
			
			return this.corEscama;
		}
		
		public void setCorEscama(String corEscama){
			
			
		}
		
		public void soltarBolhas(){
			
			System.out.println("Soltar bolhas");
		}

		@Override
		public void locomover() {
			System.out.println("continue a nadar, nadar, nadar");
			
		}

		@Override
		public void alimentar() {
			System.out.println("Comendo planctons");
			
		}

		@Override
		public void emitirSom() {
			System.out.println("Peixe não faz som");
			
		}
		
		
		
		
}
