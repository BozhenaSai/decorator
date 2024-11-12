package ua.ucu.edu.apps;
import ua.ucu.edu.apps.decorator.MockedDocument;
import ua.ucu.edu.apps.decorator.TimedDocument;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MockedDocument mockedDoc = new MockedDocument("parsed");
        System.out.println(mockedDoc.parse());

        TimedDocument timedDoc = new TimedDocument(mockedDoc);
        System.out.println(timedDoc.parse());
    }
}