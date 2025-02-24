package metodes4_AdrianSanchez;
import java.util.Scanner;

/**
 * Aquesta classe conté mètodes per gestionar dates i verificar-ne la validesa.
 * @author Adrián Sánchez
 * @version 1.0
 */
public class metodes4_2 {

    /**
     * Mètode principal que executa el programa.
     * @param args Arguments de la línia de comandes (no s'utilitzen en aquest programa).
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
     * Demana a l'usuari que introdueixi una data en format dd/mm/aaaa i verifica que sigui vàlida.
     * @return Una cadena que representa una data vàlida en format dd/mm/aaaa.
     */
    public static String entradaNums() {
        Scanner in = new Scanner(System.in);
        String date;
        boolean valid = false;

        while (!valid) {
            System.out.print("Introdueix una data en format dd/mm/aaaa (anys vàlids: 2021-2024): ");
            date = in.nextLine();

            if (esFormatoCorrecto(date)) {
                int day = dia(date);
                int month = mes(date);
                int year = any(date);

                if (EsValidAny(year) && EsValidMes(month) && EsValidDia(day, month, year)) {
                    valid = true;
                    return date;
                } else {
                    System.err.println("Error: La data és incorrecta.");
                }
            } else {
                System.err.println("Error: Format incorrecte. Usa dd/mm/aaaa.");
            }
        }
        return "";
    }

    /**
     * Verifica si una cadena té el format correcte de data (dd/mm/aaaa).
     * @param date La cadena que es vol verificar.
     * @return true si el format és correcte, false en cas contrari.
     */
    public static boolean esFormatoCorrecto(String date) {
        String[] partes = date.split("/");
        if (partes.length != 3) return false;

        for (int i = 0; i < partes.length; i++) {
            if (!esNumero(partes[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica si una cadena és un número.
     * @param str La cadena que es vol verificar.
     * @return true si la cadena és un número, false en cas contrari.
     */
    public static boolean esNumero(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Extreu el dia d'una cadena de data en format dd/mm/aaaa.
     * @param Nums La cadena que conté la data.
     * @return El dia com a enter.
     */
    public static int dia(String Nums) {
        return Integer.parseInt(Nums.split("/")[0]);
    }

    /**
     * Retorna el dia passat com a paràmetre.
     * @param dia El dia com a enter.
     * @return El mateix dia com a enter.
     */
    public static int dia(int dia) {
        return dia;
    }

    /**
     * Extreu el mes d'una cadena de data en format dd/mm/aaaa.
     * @param Nums La cadena que conté la data.
     * @return El mes com a enter.
     */
    public static int mes(String Nums) {
        return Integer.parseInt(Nums.split("/")[1]);
    }

    /**
     * Retorna el mes passat com a paràmetre.
     * @param mes El mes com a enter.
     * @return El mateix mes com a enter.
     */
    public static int mes(int mes) {
        return mes;
    }

    /**
     * Extreu l'any d'una cadena de data en format dd/mm/aaaa.
     * @param Nums La cadena que conté la data.
     * @return L'any com a enter.
     */
    public static int any(String Nums) {
        return Integer.parseInt(Nums.split("/")[2]);
    }

    /**
     * Retorna l'any passat com a paràmetre.
     * @param any L'any com a enter.
     * @return El mateix any com a enter.
     */
    public static int any(int any) {
        return any;
    }

    /**
     * Verifica si un dia és vàlid per a un mes i any donats.
     * @param dia El dia a verificar.
     * @param mes El mes a verificar.
     * @param any L'any a verificar.
     * @return true si el dia és vàlid, false en cas contrari.
     */
    public static boolean EsValidDia(int dia, int mes, int any) {
        int[] diesPerMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) {
            diesPerMes[1] = 29;
        }
        return dia >= 1 && dia <= diesPerMes[mes - 1];
    }

    /**
     * Verifica si un mes és vàlid.
     * @param mes El mes a verificar.
     * @return true si el mes és vàlid, false en cas contrari.
     */
    public static boolean EsValidMes(int mes) {
        return mes >= 1 && mes <= 12;
    }

    /**
     * Verifica si un any és vàlid.
     * @param any L'any a verificar.
     * @return true si l'any és vàlid, false en cas contrari.
     */
    public static boolean EsValidAny(int any) {
        return any >= 2021 && any <= 2024;
    }

    /**
     * Calcula el dia de la setmana per a una data donada.
     * @param dia El dia de la data.
     * @param mes El mes de la data.
     * @param any L'any de la data.
     * @return El nom del dia de la setmana.
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
     * Retorna el nom del mes corresponent a un número de mes donat.
     * @param mes El número del mes.
     * @return El nom del mes.
     */
    public static String obtenirNomMes(int mes) {
        String[] nomsMesos = {"gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};
        return nomsMesos[mes - 1];
    }
}