package com.generator;

import com.generator.DocumentGenerator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("JsonGenerator")
public class JsonGenerator implements DocumentGenerator {


    @Override
    public String generate (){
        return "Generate Json";

    }


}
