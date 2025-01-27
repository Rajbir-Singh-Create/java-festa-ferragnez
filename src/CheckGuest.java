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
        String checkName = null;

        // Itero l'array e se l'input dell'utente corrisponde ad uno degli elementi dell'array
        // lo salvo nella variabile che ho inizializzato in precedenza
        for (int i = 0; i < listaInvitati.length; i++){
            // System.out.println(listaInvitati[i]);
            if(listaInvitati[i].equals(name)){
                checkName = listaInvitati[i];
            }
        }

        // BONUS: usando il ciclo While
        int i = 0;
        while(i < listaInvitati.length){
            // System.out.println(listaInvitati[i]);
            if(listaInvitati[i].equals(name)){
                checkName = listaInvitati[i];
            }
            i++;
        }

        // Controllo se l'input dell'utente corrisponde ad uno degli elementi nell'array
        // Decido se farlo entrare o no
        if (name.equals(checkName)){
            System.out.println("Puoi entrare. Benvenuto/a!");
        } else {
            System.out.println("Non sei nell'elenco degli invitati. Non puoi entrare.");
        }
    }
}
