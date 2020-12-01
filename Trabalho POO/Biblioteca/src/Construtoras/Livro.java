package Construtoras;

public class Livro {
	
	private int id;
	private String exemplar;
	private String autor;
	private byte edicao;
	private short ano;
	private String disponiblidade;
	
	public Livro() {
		
	}
	
	public Livro (int id, String exemplar, String autor, byte edicao, short ano, String disponiblidade) {
		this.id = id;
		this.exemplar = exemplar;
		this.autor = autor;
		this.edicao = edicao;
		this.ano = ano;
		this.disponiblidade = disponiblidade;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExemplar() {
		return exemplar;
	}

	public void setExemplar(String exemplar) {
		this.exemplar = exemplar;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public byte getEdicao() {
		return edicao;
	}

	public void setEdicao(byte edicao) {
		this.edicao = edicao;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String getDisponiblidade() {
		return disponiblidade;
	}

	public void setDisponiblidade(String disponiblidade) {
		this.disponiblidade = disponiblidade;
	}
	
	

}
