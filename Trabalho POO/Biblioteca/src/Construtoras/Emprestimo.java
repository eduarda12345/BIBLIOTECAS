package Construtoras;

public class Emprestimo {
	
	private int id_Emprestimo;
	private int id_Cliente;
	private int id_Livro;
	private String data_Emprestimo;
	private String data_Devolucao;
	
	
	public Emprestimo() {
		
	}
	
	public Emprestimo(int id_Emprestimo, int id_Cliente, int id_Livro, String data_Emprestimo, String data_Devolucao) {
		this.id_Emprestimo = id_Emprestimo;
		this.id_Cliente = id_Cliente;
		this.id_Livro = id_Livro;
		this.data_Emprestimo = data_Emprestimo;
		this.data_Devolucao = data_Devolucao;
	}

	public int getId_Emprestimo() {
		return id_Emprestimo;
	}

	public void setId_Emprestimo(int id_Emprestimo) {
		this.id_Emprestimo = id_Emprestimo;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public int getId_Livro() {
		return id_Livro;
	}

	public void setId_Livro(int id_Livro) {
		this.id_Livro = id_Livro;
	}

	public String getData_Emprestimo() {
		return data_Emprestimo;
	}

	public void setData_Emprestimo(String data_Emprestimo) {
		this.data_Emprestimo = data_Emprestimo;
	}

	public String getData_Devolucao() {
		return data_Devolucao;
	}

	public void setData_Devolucao(String data_Devolucao) {
		this.data_Devolucao = data_Devolucao;
	}
	
	
}
