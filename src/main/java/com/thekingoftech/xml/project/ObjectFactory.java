//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.09 às 10:15:56 PM BRT 
//


package com.thekingoftech.xml.project;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thekingoftech.xml.project package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thekingoftech.xml.project
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProjectDetailsRequest }
     * 
     */
    public ProjectDetailsRequest createProjectDetailsRequest() {
        return new ProjectDetailsRequest();
    }

    /**
     * Create an instance of {@link ProjectDetailsResponse }
     * 
     */
    public ProjectDetailsResponse createProjectDetailsResponse() {
        return new ProjectDetailsResponse();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

}
