package com.repaso.Analizador;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by Sintelti on 09/09/2015.
 */
public class ArchivoXML
{
    Document doc;
    Element documento;
    public ArchivoXML()
    {
        crearDocumentoXML();

    }//fin del constructor

    //prepara el documento XML
    public void crearDocumentoXML()
    {
        try
        {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            doc = docBuilder.newDocument();
            doc.setXmlStandalone(true);

            //crea tag principal
            documento = doc.createElement("Documento");
        }catch(ParserConfigurationException ex){
            ex.printStackTrace();
        }
    }// fin del metodo crearDocumetnoXML


    public void crearTagsParrafoOracion(int numeroParrafo, int numeroOraciones)
    {

        for(int i = 0; i < numeroParrafo; i++)
        {
            Element parrafo = doc.createElement("Parrafo");
            for(int j = 0; j < numeroOraciones; j++)
            {
                //crea tag dentro del tag principal
                //parrafo.setTextContent("Texto dentro en hijo");

                //taga oracion que ira dentro del tag parrafo
                Element oracion = doc.createElement("Oracion");
                oracion.setTextContent("El lobo azul");


                //se agrega tag de oracion dentro del tag parrafo
                parrafo.appendChild(oracion);
            }// fin del for interno

            //se agrega tag de parrafo al tag principal tag documento
            documento.appendChild(parrafo);

        }//fin del for externo


    }// fin del elemento crearTagParrafoOracion

    //crear documento XML
    public void crearXML()
    {

        try
        {
            //se agrega el tago principal al documento
            doc.appendChild(documento);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(doc);
            File archivo = new File("archivoXML.xml");
            StreamResult result = new StreamResult(archivo);
            transformer.transform(source, result);
        }catch (TransformerConfigurationException ex){
            ex.printStackTrace();
        }catch (TransformerException ex){
            ex.printStackTrace();
        }

    }// fin del metodo crearXML

}
