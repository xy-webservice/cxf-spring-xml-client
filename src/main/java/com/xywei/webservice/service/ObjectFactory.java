
package com.xywei.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xywei.webservice.service package. 
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

    private final static QName _FindById_QNAME = new QName("http://service.xywei.com/", "findById");
    private final static QName _FindByIdAndAge_QNAME = new QName("http://service.xywei.com/", "findByIdAndAge");
    private final static QName _FindByIdAndAgeResponse_QNAME = new QName("http://service.xywei.com/", "findByIdAndAgeResponse");
    private final static QName _FindByIdResponse_QNAME = new QName("http://service.xywei.com/", "findByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xywei.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindByIdAndAge }
     * 
     */
    public FindByIdAndAge createFindByIdAndAge() {
        return new FindByIdAndAge();
    }

    /**
     * Create an instance of {@link FindByIdAndAgeResponse }
     * 
     */
    public FindByIdAndAgeResponse createFindByIdAndAgeResponse() {
        return new FindByIdAndAgeResponse();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.xywei.com/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdAndAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.xywei.com/", name = "findByIdAndAge")
    public JAXBElement<FindByIdAndAge> createFindByIdAndAge(FindByIdAndAge value) {
        return new JAXBElement<FindByIdAndAge>(_FindByIdAndAge_QNAME, FindByIdAndAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdAndAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.xywei.com/", name = "findByIdAndAgeResponse")
    public JAXBElement<FindByIdAndAgeResponse> createFindByIdAndAgeResponse(FindByIdAndAgeResponse value) {
        return new JAXBElement<FindByIdAndAgeResponse>(_FindByIdAndAgeResponse_QNAME, FindByIdAndAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.xywei.com/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

}
