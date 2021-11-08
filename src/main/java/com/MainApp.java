package com;



import com.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainApp {

    private DocumentService documentService;


    @Autowired
    public MainApp(DocumentService documentService) {
        this.documentService = documentService;
    }

    public static void main(String[] args) {

      SpringApplication.run(MainApp.class, args);
    }
    public void init () {
        System.out.println(documentService.generate());
    }

}
