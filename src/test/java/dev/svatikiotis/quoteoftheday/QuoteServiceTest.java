package dev.svatikiotis.quoteoftheday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuoteServiceTest {

    private QuoteService quoteService;

    @BeforeEach
    void setUp() throws Exception {
        Path tempFile = Files.createTempFile("quotes", ".txt");
        Files.write(tempFile, List.of(
                "Quote 1",
                "Quote 2",
                "Quote 3"));
        System.out.println("Temporary file created: " + tempFile.toString());
        quoteService = new QuoteService();
    }
    @Test
    void testGetQuote() {
        String quote = quoteService.getQuote();
        System.out.println("Random Quote: " + quote);
        assertNotNull(quote);
        assertFalse(quote.isEmpty());
    }
}
