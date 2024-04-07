package com.max.bff.service;

import com.itextpdf.text.DocumentException;
import org.springframework.stereotype.Service;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import java.io.IOException;

@Service
public class PdfGeneratorservice {
    STGroup stringTemplateGroup = new STGroupDir("",'$','$');

//    public <T> byte [] generatePdf(T data, String stringTemplateName) throws DocumentException, IOException{
//
//    }
}
