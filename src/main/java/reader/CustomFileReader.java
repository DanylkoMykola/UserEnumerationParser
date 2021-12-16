package reader;

import entity.ErrorMessages;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReader {
    public List<String> getUserNamesFromFile(String path) {
        List<String> names = new ArrayList<>();
        String temp = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((temp = reader.readLine()) != null) {
                names.add(temp.trim().replace(",:;", ""));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(ErrorMessages.FILE_NOT_FOUND.getErrorMessage());
        } catch (IOException e) {
            throw new RuntimeException(ErrorMessages.UNABLE_TO_READ_FILE.getErrorMessage());
        }
        return names;
    }
}
