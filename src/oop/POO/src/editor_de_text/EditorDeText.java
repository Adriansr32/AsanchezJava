package editor_de_text;

import java.util.*;

public class EditorDeText {
	private StringBuilder text;
	private Deque<String> historialDesfets;
	private Deque<String> historialRefets;
	private Map<String, Integer> estadistiquesParaules;
	private Set<String> paraulesUniques;

	public EditorDeText() {
		this.text = new StringBuilder();
		this.historialDesfets = new LinkedList<>();
		this.historialRefets = new LinkedList<>();
		this.estadistiquesParaules = new HashMap<>();
		this.paraulesUniques = new HashSet<>();
	}

	public void escriure(String paraula) {
		historialDesfets.push(paraula);
		historialRefets.clear();
		text.append(paraula).append(" ");
		actualizarEstadistiques(paraula);
		paraulesUniques.add(paraula);
	}



	public void desfer() {
		if(!historialDesfets.isEmpty()) {
			String accio = historialDesfets.pop();
			historialRefets.push(accio);
			
			int index = text.lastIndexOf(accio);
			if (index != -1) {
				text.delete(index, index + accio.length() + 1);
			}
			
			revertirEstadistiques(accio);
			System.out.println("Acció desfeta: " + accio);
		}
	}

	public void refer() {
		if(!historialRefets.isEmpty()) {
			String accio = historialRefets.pop();
			text.append(accio).append(" ");
			historialDesfets.push(accio);
			
			actualizarEstadistiques(accio);
			paraulesUniques.add(accio);
			System.out.println("Acció desfeta: " + accio);
		}	
	}
	public void actualizarEstadistiques(String paraula) {
		if(estadistiquesParaules.containsKey(paraula)) {
			int count = estadistiquesParaules.get(paraula);
			estadistiquesParaules.put(paraula, count + 1);
		} else {
			estadistiquesParaules.put(paraula, 1);
		}
	}
	private void revertirEstadistiques(String paraula) {
		if(estadistiquesParaules.containsKey(paraula)) {
			int count = estadistiquesParaules.get(paraula);
			if (count > 1) {
				estadistiquesParaules.put(paraula, count - 1);
			}
		} else {
			estadistiquesParaules.remove(paraula);
			paraulesUniques.remove(paraula);
		}
	}

	public void mostrarText() {
		System.out.println("Text actual: " + text.toString().trim());
	}

	public void mostrarEstadisques() {
		System.out.println("Estadistiques de paraules: ");
		for (String paraula: estadistiquesParaules.keySet()) {
			int counter = estadistiquesParaules.get(paraula);
			System.out.println(" - " + paraula + " : " + counter + " vegades.");
		}
	}

	public void mostrarParaulesUniques() {
		System.out.println("Paraules Uniques:");
		for (String paraules : paraulesUniques) {
			System.out.println(" - " + paraules);
		}
	}

}
