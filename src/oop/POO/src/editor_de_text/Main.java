package editor_de_text;

public class Main {

	public static void main(String[] args) {
		EditorDeText bn = new EditorDeText();
		
		bn.escriure("Avui");
		bn.escriure("fa");
		bn.escriure("bon");
		bn.escriure("dia");
		bn.escriure("bon");
		
		bn.mostrarText();
		bn.mostrarEstadisques();
		bn.mostrarParaulesUniques();
		
		bn.desfer();
		bn.mostrarText();
		bn.mostrarEstadisques();
		
		bn.refer();
		bn.mostrarText();
		bn.mostrarEstadisques();
	}

}
