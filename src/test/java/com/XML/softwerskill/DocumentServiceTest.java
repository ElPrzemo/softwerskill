package com.XML.softwerskill;

import com.generator.*;
import com.service.DocumentService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DocumentServiceTest {

    @Test
    public void generateJson(){
        //given
        DocumentGenerator documentGenerator = new JsonGenerator();
        DocumentService documentService = new DocumentService(documentGenerator);


        //when
        String result = documentService.generate();

        //then

        assertThat(result).contains("Json");



        //given
        documentGenerator = new XmlGenerator();
        documentService = new DocumentService(documentGenerator);


        //when
        result = documentService.generate();

        //then

        assertThat(result).contains("Xml");

        //given
        documentGenerator = new PdFGenerator();
        documentService = new DocumentService(documentGenerator);


        //when
        result = documentService.generate();

        //then

        assertThat(result).contains("PDF");

        //given
        documentGenerator = new TXTGenerator();
        documentService = new DocumentService(documentGenerator);


        //when
        result = documentService.generate();

        //then

        assertThat(result).contains("TXT");

    }

}