package ru.mikhail.katya.lab1.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mikhail.katya.lab1.pojo.DocumentProxy;
import ru.mikhail.katya.lab1.pojo.Pdf;

@Component
public class PdfTestFactory implements DocumentFactory {
    @Autowired
    private Pdf pdf;
    public DocumentProxy getDocument() {
        return DocumentProxy.of(pdf);
    }

}