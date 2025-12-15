public class FRSSystem {
    private InputReader reader;
    private AcademicResponder responder;

    public FRSSystem() {
        reader = new InputReader();
        responder = new AcademicResponder();
    }

    public void start() {
        printWelcome();

        boolean finished = false;
        while (!finished) {
            String input = reader.getInput();

            if (input.equalsIgnoreCase("selesai") || input.equalsIgnoreCase("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(input);
                System.out.println("Asisten FRS: " + response);
            }
        }

        printGoodbye();
    }

    private void printWelcome() {
        System.out.println("Selamat datang di Asisten FRS (Formulir Rencana Studi).");
        System.out.println("Ketik pertanyaan Anda (misal: 'info sks', 'jadwal algoritma').");
        System.out.println("Ketik 'selesai' untuk keluar.");
        System.out.println("-----------------------------------------------------");
    }

    private void printGoodbye() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Terima kasih. Selamat merencanakan studi Anda!");
    }

    public static void main(String[] args) {
        FRSSystem frs = new FRSSystem();
        frs.start();
    }
}

