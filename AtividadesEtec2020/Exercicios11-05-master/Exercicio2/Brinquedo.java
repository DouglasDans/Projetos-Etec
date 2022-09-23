package Exercicio2;

public class Brinquedo {
	private String nome;
	private String faixaEtaria;
	private float preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		switch(faixaEtaria) {
			case "1":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "2":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "3":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "4":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "5":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "6":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "7":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "8":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "9":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			case "10":
			{
				this.faixaEtaria = faixaEtaria;
				break;
			}
			default:
			{
				System.out.println("Faixa Etária inválida");
			}
		}
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+nome);
		System.out.println("Preco: R$"+preco);
		System.out.println("Faixa Etaria: "+faixaEtaria);
		
	}
	
}
