package com.generator;

import com.generator.DocumentGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("PdFGenerator")
public class PdFGenerator implements DocumentGenerator {


    @Override
    public String generate (){
        return "Generate PDF";

    }}


