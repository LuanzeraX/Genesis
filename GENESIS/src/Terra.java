
public class Terra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar objeto
		Homem adao = new Homem();
		Mulher eva = new Mulher();
		adao.falar();
		eva.falar();
		
		Homem caim = new Homem();
		Homem abel = new Homem();
		
		adao.nome ="Adão";
		eva.nome ="Eva";
		caim.nome="Caim";
		abel.nome="Abel";
		Arma arma1 = new Arma();
		arma1.setNome("pedra");
		arma1.bater(caim);
		arma1.bater(adao, eva);
		
		//Polimorfismo
		Homem prRosa = new Homem();
		Mulher prAzul= new Mulher();
		
		prRosa = new Ranger();
		prAzul = new Ranger();
		
		Ranger r = new Ranger();
		r = new Homem();
		r = new Mulher();
		
		prRosa.falar();
		prAzul.falar();
		prRosa.lutar();
		prAzul.lutar();
		
		
	}

}
