package metodes_4;
import java.util.*;

/**
 * Clase que permite introducir una fecha en formato dd/mm/aaaa y validar si la fecha es correcta,
 * mostrando también el día de la semana correspondiente a esa fecha.
 * 
 * <p>Esta clase valida que el año esté dentro del rango 2021-2024, que el mes esté entre 1 y 12,
 * y que el día sea válido para el mes y año indicados (considerando años bisiestos).</p>
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2025-01-29
 */
public class metodes4_2 {

    /**
     * Método principal que recibe una fecha como entrada, la valida y muestra el día de la semana correspondiente.
     *
     * @param args Los argumentos de línea de comandos, no utilizados en este programa.
     * @see #entradaNums()
     * @see #dia(String)
     * @see #mes(String)
     * @see #any(String)
     * @see #EsValidAny(int)
     * @see #EsValidMes(int)
     * @see #EsValidDia(int, int, int)
     * @see #EsValidDiaDeLaSemana(int, int, int)
     */
    public static void main(String[] args) {
        String Nums = entradaNums();
        int dia = dia(Nums);
        int mes = mes(Nums);
        int any = any(Nums);
        
        if (EsValidAny(any) && EsValidMes(mes) && EsValidDia(dia, mes, any)) {
            String DiaSetmana = EsValidDiaDeLaSemana(dia, mes, any);
            System.out.println();
            System.out.println("La teva data es: " + DiaSetmana + " dia " + dia + " de " + obtenirNomMes(mes) + " de " + any);
        } 
        if (!EsValidAny(any)) {
            System.err.println("L'any es invalid, l'any ha de ser entre el 2021 - 2024!");
        }
        if (!EsValidMes(mes)) {
            System.err.println("El mes es invalid, el mes ha de ser entre 1 - 12!");
        }
        if (!EsValidDia(dia, mes, any)) {
            System.err.println("El dia es invalid, el any NO es de tráspas!");
        }
    }

    /**
     * Solicita al usuario que ingrese una fecha en formato dd/mm/aaaa.
     *
     * @return Una cadena que representa la fecha ingresada por el usuario.
     * @see #dia(String)
     * @see #mes(String)
     * @see #any(String)
     */
    public static String entradaNums() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix una data en format dd/mm/aaaa (anys vàlids: 2021-2024): ");
        return in.nextLine();
        
    }

    /**
     * Extrae el día de la fecha ingresada.
     *
     * @param Nums La fecha en formato dd/mm/aaaa.
     * @return El día como un número entero.
     * @see #entradaNums()
     */
    public static int dia(String Nums) {
        return Integer.parseInt(Nums.split("/")[0]);
    }

    /**
     * Método sobrecargado que retorna el día pasado como parámetro.
     *
     * @param dia El día que se desea retornar.
     * @return El mismo día pasado como parámetro.
     */
    public static int dia(int dia) {
        return dia;
    }

    /**
     * Extrae el mes de la fecha ingresada.
     *
     * @param Nums La fecha en formato dd/mm/aaaa.
     * @return El mes como un número entero.
     * @see #entradaNums()
     */
    public static int mes(String Nums) {
        return Integer.parseInt(Nums.split("/")[1]);
    }

    /**
     * Método sobrecargado que retorna el mes pasado como parámetro.
     *
     * @param mes El mes que se desea retornar.
     * @return El mismo mes pasado como parámetro.
     */
    public static int mes(int mes) {
        return mes;
    }

    /**
     * Extrae el año de la fecha ingresada.
     *
     * @param Nums La fecha en formato dd/mm/aaaa.
     * @return El año como un número entero.
     * @see #entradaNums()
     */
    public static int any(String Nums) {
        return Integer.parseInt(Nums.split("/")[2]);
    }

    /**
     * Método sobrecargado que retorna el año pasado como parámetro.
     *
     * @param any El año que se desea retornar.
     * @return El mismo año pasado como parámetro.
     */
    public static int any(int any) {
        return any;
    }

    /**
     * Valida si el día es válido para el mes y año dados, considerando los años bisiestos.
     *
     * @param dia El día que se desea validar.
     * @param mes El mes que se desea validar.
     * @param any El año que se desea validar.
     * @return {@code true} si el día es válido, {@code false} si es inválido.
     * @see #EsValidMes(int)
     * @see #EsValidAny(int)
     */
    public static boolean EsValidDia(int dia, int mes, int any) {
        int[] diesPerMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) {
            diesPerMes[1] = 29;
        }
        return dia >= 1 && dia <= diesPerMes[mes - 1];
    }

    /**
     * Valida si el mes es válido.
     *
     * @param mes El mes que se desea validar.
     * @return {@code true} si el mes es válido, {@code false} si es inválido.
     * @see #EsValidDia(int, int, int)
     */
    public static boolean EsValidMes(int mes) {
        return mes >= 1 && mes <= 12;
    }

    /**
     * Valida si el año es válido, en el rango 2021-2024.
     *
     * @param any El año que se desea validar.
     * @return {@code true} si el año es válido, {@code false} si es inválido.
     * @see #EsValidMes(int)
     */
    public static boolean EsValidAny(int any) {
        return any >= 2021 && any <= 2024;
    }

    /**
     * Calcula el día de la semana correspondiente a una fecha dada.
     *
     * @param dia El día de la fecha.
     * @param mes El mes de la fecha.
     * @param any El año de la fecha.
     * @return El nombre del día de la semana correspondiente (por ejemplo, "Diumenge").
     * @see #EsValidDia(int, int, int)
     */
    public static String EsValidDiaDeLaSemana(int dia, int mes, int any) {
        if (mes == 1 || mes == 2) {
            mes += 12;
            any--;
        }
        int K = any % 100;
        int J = any / 100;
        int h = (dia + (13 * (mes + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        String[] diesSetmana = {"Dissabte", "Diumenge", "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"};
        return diesSetmana[h];
    }

    /**
     * Obtiene el nombre del mes correspondiente al número de mes dado.
     *
     * @param mes El número del mes (1-12).
     * @return El nombre del mes correspondiente.
     * @see #EsValidDiaDeLaSemana(int, int, int)
     */
    public static String obtenirNomMes(int mes) {
        String[] nomsMesos = {"gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};
        return nomsMesos[mes - 1];
    }
}
