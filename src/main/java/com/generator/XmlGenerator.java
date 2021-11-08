package com.generator;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class XmlGenerator implements DocumentGenerator {


    @Override
    public String generate(){
        return "Generate Xml";
    };
}
