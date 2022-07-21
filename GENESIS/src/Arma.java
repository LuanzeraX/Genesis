import javax.swing.JOptionPane;

public class Arma {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void bater(Homem homem) {
		JOptionPane.showMessageDialog(
				null, "O " + homem.nome + " bateu com a " + this.nome + "!");
	} 
	
	public void bater(Homem homem, Mulher mulher) {
		JOptionPane.showMessageDialog(
				null, "A " + mulher.nome + " bateu no " + homem.nome + "!");
	}
}


