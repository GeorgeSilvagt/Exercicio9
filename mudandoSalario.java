import javax.swing.JOptionPane;

public class mudandoSalario {

	public static void main(String[] args) {
		funcionario f1 = new funcionario();
		
		f1.nome = " João";
		f1.salario = 400;
		
		funcionario f2 = new funcionario();
		
		f2.nome = " thais";
		f2.salario = 1500;
		
		f2.aumento(f2.salario);
		f1.aumento(f1.salario);
		
		JOptionPane.showMessageDialog(null, f2.salario + f2.nome);
		JOptionPane.showMessageDialog(null, f1.salario + f1.nome);
	}

}
