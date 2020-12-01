package Construtoras;

public class Multa {
	private int id_Multa;
	private int id_Cliente;
	private String descricao;
	private float valor;
	
	public Multa() {
		
	}
	
	public Multa (int id_Multa, int id_Cliente, String descricao, float valor) {
		this.id_Multa = id_Multa;
		this.id_Cliente = id_Cliente;
		this.descricao = descricao;
		this.valor = valor;
		
	}

	public int getId_Multa() {
		return id_Multa;
	}

	public void setId_Multa(int id_Multa) {
		this.id_Multa = id_Multa;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public static void clear() {
		// TODO Auto-generated method stub
		
	}
	
	

}
