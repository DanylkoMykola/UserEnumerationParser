import parser.HtmlParser;
import parser.ParserFactory;
import reader.CustomFileReader;
import writer.ConsoleWriter;
import writer.ConsoleWriterImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    private final ConsoleWriter console;
    private final CustomFileReader fileReader;

    public Main(ConsoleWriter console, CustomFileReader fileReader) {
        this.console = console;
        this.fileReader = fileReader;
    }

    public static void main(String[] args) {
        Main app = new Main(new ConsoleWriterImpl(), new CustomFileReader());
        app.startUp();
    }
    public void startUp() {
        List<String> names;
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String temp = "";
        int count = 0;
        console.writeInfo();
        try {
            while(!temp.equals("end")) {
                console.writeLink();
                temp = consoleReader.readLine();
                HtmlParser parser = ParserFactory.getInstance(temp);
                console.writePathToFile();
                temp = consoleReader.readLine();
                names = fileReader.getUserNamesFromFile(temp);
                for (String name : names) {
                    if(parser.isUserExists(name)) {
                        console.write(name);
                        count++;
                    }
                }
                if (count == 0) {
                    console.writeNoExistingUsers();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
