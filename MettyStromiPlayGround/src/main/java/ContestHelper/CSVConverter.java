package main.java.ContestHelper;

import java.util.Arrays;
import java.util.List;

public class CSVConverter {
    public static List<String> csvToList(String csv){
        return Arrays.asList(csv.split(","));
    }
}
