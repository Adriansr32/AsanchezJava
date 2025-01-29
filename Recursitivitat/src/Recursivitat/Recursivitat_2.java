package Recursivitat;

public class Recursivitat_2 {

	    public static void main(String[] args) {
	        inv(12345);
	    }
	    
	    public static void inv(int valor) {
	    	if (valor < 10) {
	            System.out.print(valor);
	        } else {
	        	System.out.print(valor % 10); 
	            inv(valor / 10); 
	        }
	    }
	}

