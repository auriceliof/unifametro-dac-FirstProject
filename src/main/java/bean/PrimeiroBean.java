package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PrimeiroBean {

	private String nome;
	private Integer idade;
	
	public String salvar() {
		System.out.println(nome);
		System.out.println(idade);
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
