// EXECÍCIO PRÁTICO 02
public class Carros {

	String marca;
	String modelo;
	int ano;
	int portas;
	double preco;
	
	public double verDesconto(double percent) {
		double precoComDes = this.preco - (this.preco*(percent/100));  
		
		return precoComDes;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getPortas() {
		return this.portas;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	
	}	
}
