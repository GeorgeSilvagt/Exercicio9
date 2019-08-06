
public class funcionario {
	String nome;
	double salario;
	
	void aumento(double salario) {
		if(salario < 500) {
			double novoSalario = this.salario * 0.15;
			this.salario = novoSalario + this.salario;
		}
	
		if(salario >= 500 && salario <= 1000) {
			double novoSalario = this.salario * 0.10;
			this.salario = novoSalario + this.salario;
		}
		if(salario > 1000) {
			double novoSalario = this.salario * 0.5;
			this.salario = novoSalario + this.salario;
		}
	}
}