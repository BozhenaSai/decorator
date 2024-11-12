import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.decorator.MockedDocument;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MockedDocumentTests {
    
    @Test
    public void testMockedDocument() {
        String expected = "Mocked Document Parse";
        MockedDocument doc = new MockedDocument(expected);
        assertEquals(expected, doc.parse());
    }
}