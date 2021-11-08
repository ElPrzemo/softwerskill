package com.generator;

import com.generator.DocumentGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("TXTGenerator")
public class TXTGenerator implements DocumentGenerator {


    @Override
    public String generate (){
        return "Generate TXT";

    }}
