
import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.decorator.TimedDocument;
import ua.ucu.edu.apps.decorator.MockedDocument;
import ua.ucu.edu.apps.decorator.Document;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimedDocumentTests {
        
        @Test
        public void testTimedDocument() {
            String expected = "Mocked Document Parse";
            Document doc = new MockedDocument(expected);
            TimedDocument timedDoc = new TimedDocument(doc);
            assertEquals(expected, timedDoc.parse());
        }
}