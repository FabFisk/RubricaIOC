package it.alfasoft.fabrizio.rubrica;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	
	private String nomeRubrica;
	private List<Voce> voci = new ArrayList<>();
	
	public Rubrica(){}
	
	public Rubrica(String nome){
		this.nomeRubrica = nome;
	}

	public String getNomeRubrica() {
		return nomeRubrica;
	}

	public void setNomeRubrica(String nomeRubrica) {
		this.nomeRubrica = nomeRubrica;
	}

	public List<Voce> getVoci() {
		return voci;
	}

	public void setVoci(List<Voce> voci) {
		this.voci = voci;
	}
	
	public Voce getVoceByName(String nome){
		Voce voce = null;
		for(Voce v : voci){
			if(v.getNome().equals(nome)){
				voce = v;
			}
			continue;
		}
		return voce;
	}
}
