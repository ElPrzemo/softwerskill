package com.service;

import com.generator.DocumentGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DocumentService {

    private final DocumentGenerator documentGenerator;

    @Autowired

    public DocumentService(@Qualifier ("TXTGenerator") DocumentGenerator documentGenerator) {
        this.documentGenerator = documentGenerator;
    }

    public String generate (){
        return documentGenerator.generate();
    }
}
