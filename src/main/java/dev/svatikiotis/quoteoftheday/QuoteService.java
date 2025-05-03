package dev.svatikiotis.quoteoftheday;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {

    public String getQuote(){

        Path filePath =  Paths.get("src/main/resources/quotes.txt");
        try {
            List<String> quotes = Files.readAllLines(filePath);
            if (quotes.isEmpty()) {
                return "No Quotes Found";
            }
            Random random = new Random();
            return quotes.get(random.nextInt(quotes.size()));
        }catch
            (IOException e) {
                e.printStackTrace();
                return "Error reading quotes file";
            }
        }


    }

