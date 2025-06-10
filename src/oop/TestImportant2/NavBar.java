package examen;

import java.util.*;

public class NavBar {
	private Deque<String> historialDesfer;
	private Deque<String> historialRefer;
	private Deque<String> urls;
	private ArrayList<String> historialComplet;
	private Map<String, Integer> historialURLS;

	public NavBar() {
		this.historialDesfer = new LinkedList<>();
		this.historialRefer = new LinkedList<>();
		this.urls = new LinkedList<>();
		this.historialComplet = new ArrayList<>();
		this.historialURLS = new HashMap<>();
	}

	public void navegar(String urlInput) {
		if (urlInput.contains("https://") || urlInput.contains("http://")) {
			if (urls.size() > 10) {
				urls.removeLast();
				urls.addFirst(urlInput);
				historialComplet.add(urlInput);
				actualizarURL(urlInput);
				System.out.println(urlInput);
			} else {
				urls.addFirst(urlInput);
				historialComplet.add(urlInput);
				actualizarURL(urlInput);
				System.out.println(urlInput);
			}
			historialDesfer.push(urlInput);
			historialRefer.clear();
		} else {
			System.out.println("Has de posar (https:// o http://)!");
		}

	}

	public void enrere() {
		if (urls.size() > 1) {
			if (!historialDesfer.isEmpty()) {
				String accio = urls.removeFirst();
				historialRefer.push(accio);

				// int index = url.lastIndexOf(accio);
				// if (index != -1) {
				// url.delete(index, index + accio.length() + 1);
				// }
				
				actualizarHistorial(urls.getFirst());
				actualizarURL(urls.getFirst());
				System.out.println("URL: " + urls.getFirst());
			}
		} else {
			System.out.println("No pots anar enrere!");
		}

	}

	public void endevant() {
		if (!historialRefer.isEmpty()) {
			String accio = historialRefer.pop();
			urls.push(accio);
			
			actualizarHistorial(accio);
			actualizarURL(accio);
			System.out.println("URL: " + urls.getFirst());
		} else {
			System.out.println("No pots anar mes endevant!");
		}

	}

	private void actualizarHistorial(String url) {
		historialComplet.add(url);
	}

	public void actualizarURL(String url) {
		if (historialURLS.containsKey(url)) {
			int count = historialURLS.get(url);
			historialURLS.put(url, count + 1);
		} else {
			historialURLS.put(url, 1);
		}
	}

	public void mostrarURLS() {
		System.out.println("Urls Visitades: ");
		for (String url : historialURLS.keySet()) {
			int counter = historialURLS.get(url);
			System.out.println(" - " + url + " : " + counter + " vegades.");
		}
	}

	public void mostrarHistorial() {
		System.out.println("Historial: ");
		for (String h : historialComplet) {
			System.out.println(" - " + h);
		}
	}

}