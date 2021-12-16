package writer;

public class ConsoleWriterImpl implements ConsoleWriter{
    public void writeInfo() {
        System.out.println("" +
               "  _    _               _   _                        ______                                      _   _               _____                         \n" +
                " | |  | |             | \\ | |                      |  ____|                                    | | (_)             |  __ \\                        \n" +
                " | |  | |___  ___ _ __|  \\| | __ _ _ __ ___   ___  | |__   _ __  _   _ _ __ ___   ___ _ __ __ _| |_ _  ___  _ __   | |__) |_ _ _ __ ___  ___ _ __ \n" +
                " | |  | / __|/ _ \\ '__| . ` |/ _` | '_ ` _ \\ / _ \\ |  __| | '_ \\| | | | '_ ` _ \\ / _ \\ '__/ _` | __| |/ _ \\| '_ \\  |  ___/ _` | '__/ __|/ _ \\ '__|\n" +
                " | |__| \\__ \\  __/ |  | |\\  | (_| | | | | | |  __/ | |____| | | | |_| | | | | | |  __/ | | (_| | |_| | (_) | | | | | |  | (_| | |  \\__ \\  __/ |   \n" +
                "  \\____/|___/\\___|_|  |_| \\_|\\__,_|_| |_| |_|\\___| |______|_| |_|\\__,_|_| |_| |_|\\___|_|  \\__,_|\\__|_|\\___/|_| |_| |_|   \\__,_|_|  |___/\\___|_|   \n" +
                "                                                                                                                                                  \n" +
                "                                                                                                                                                  ");
    }
    public void writeChoseClient(){
        System.out.println("Chose client:");
    }
    public void writeLink(){
        System.out.println("Enter login link:");
    }
    public void writePathToFile() {
        System.out.println("Enter path to file with user names:");
    }
    public void write(String str) {
        System.out.println(str);
    }
    public void writeNoExistingUsers(){
        System.out.println("No existing users");
    }
}
