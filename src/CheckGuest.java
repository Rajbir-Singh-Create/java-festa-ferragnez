import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {
        // Array lista di invitati
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        
        // Prendo l'input dall'utente
        System.out.println("Benvenuto/a, come ti chiami?");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();

        // Inizializzo una variabile per fare un controllo
        boolean checkName = false;
        // In alternativa:
        // int checkName = -1;

        // Itero l'array e se l'input dell'utente corrisponde ad uno degli elementi dell'array
        // cambio lo stato della variabile che ho inizializzato in precedenza
        for (int i = 0; i < listaInvitati.length; i++){
            // System.out.println(listaInvitati[i]);
            if(listaInvitati[i].equals(name)){
                System.out.println("Puoi entrare. Benvenuto/a!");
                checkName = true;
                // checkName = i;
                break;
            }
        }

        // BONUS: usando il ciclo While
        int i = 0;
        while(i < listaInvitati.length){
            // System.out.println(listaInvitati[i]);
            if(listaInvitati[i].equals(name)){
                System.out.println("Puoi entrare. Benvenuto/a!");
                checkName = true;
                // checkName = i;
                break;
            }
            i++;
        }

        // Controllo sulla variabile e decido se farlo entrare o no
        if (!checkName){
            System.out.println("Non sei nell'elenco degli invitati. Non puoi entrare.");
        }
    }
}