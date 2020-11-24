//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.11.24 alle 09:21:33 AM CET 
//


package it.pagoPA.toolkit.rptGenerator.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.pagoPA.toolkit.rptGenerator.xsd package. 
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

    private final static QName _RT_QNAME = new QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "RT");
    private final static QName _RPT_QNAME = new QName("http://www.digitpa.gov.it/schemas/2011/Pagamenti/", "RPT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.pagoPA.toolkit.rptGenerator.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CtRicevutaTelematica }
     * 
     */
    public CtRicevutaTelematica createCtRicevutaTelematica() {
        return new CtRicevutaTelematica();
    }

    /**
     * Create an instance of {@link CtRichiestaPagamentoTelematico }
     * 
     */
    public CtRichiestaPagamentoTelematico createCtRichiestaPagamentoTelematico() {
        return new CtRichiestaPagamentoTelematico();
    }

    /**
     * Create an instance of {@link CtDatiSingoloVersamentoRPT }
     * 
     */
    public CtDatiSingoloVersamentoRPT createCtDatiSingoloVersamentoRPT() {
        return new CtDatiSingoloVersamentoRPT();
    }

    /**
     * Create an instance of {@link CtEnteBeneficiario }
     * 
     */
    public CtEnteBeneficiario createCtEnteBeneficiario() {
        return new CtEnteBeneficiario();
    }

    /**
     * Create an instance of {@link CtIstitutoAttestante }
     * 
     */
    public CtIstitutoAttestante createCtIstitutoAttestante() {
        return new CtIstitutoAttestante();
    }

    /**
     * Create an instance of {@link CtIdentificativoUnivocoPersonaFG }
     * 
     */
    public CtIdentificativoUnivocoPersonaFG createCtIdentificativoUnivocoPersonaFG() {
        return new CtIdentificativoUnivocoPersonaFG();
    }

    /**
     * Create an instance of {@link CtSoggettoPagatore }
     * 
     */
    public CtSoggettoPagatore createCtSoggettoPagatore() {
        return new CtSoggettoPagatore();
    }

    /**
     * Create an instance of {@link CtSoggettoVersante }
     * 
     */
    public CtSoggettoVersante createCtSoggettoVersante() {
        return new CtSoggettoVersante();
    }

    /**
     * Create an instance of {@link CtDominio }
     * 
     */
    public CtDominio createCtDominio() {
        return new CtDominio();
    }

    /**
     * Create an instance of {@link CtAllegatoRicevuta }
     * 
     */
    public CtAllegatoRicevuta createCtAllegatoRicevuta() {
        return new CtAllegatoRicevuta();
    }

    /**
     * Create an instance of {@link CtDatiVersamentoRT }
     * 
     */
    public CtDatiVersamentoRT createCtDatiVersamentoRT() {
        return new CtDatiVersamentoRT();
    }

    /**
     * Create an instance of {@link CtDatiVersamentoRPT }
     * 
     */
    public CtDatiVersamentoRPT createCtDatiVersamentoRPT() {
        return new CtDatiVersamentoRPT();
    }

    /**
     * Create an instance of {@link CtDatiMarcaBolloDigitale }
     * 
     */
    public CtDatiMarcaBolloDigitale createCtDatiMarcaBolloDigitale() {
        return new CtDatiMarcaBolloDigitale();
    }

    /**
     * Create an instance of {@link CtIdentificativoUnivocoPersonaG }
     * 
     */
    public CtIdentificativoUnivocoPersonaG createCtIdentificativoUnivocoPersonaG() {
        return new CtIdentificativoUnivocoPersonaG();
    }

    /**
     * Create an instance of {@link CtDatiSingoloPagamentoRT }
     * 
     */
    public CtDatiSingoloPagamentoRT createCtDatiSingoloPagamentoRT() {
        return new CtDatiSingoloPagamentoRT();
    }

    /**
     * Create an instance of {@link CtIdentificativoUnivoco }
     * 
     */
    public CtIdentificativoUnivoco createCtIdentificativoUnivoco() {
        return new CtIdentificativoUnivoco();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtRicevutaTelematica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.digitpa.gov.it/schemas/2011/Pagamenti/", name = "RT")
    public JAXBElement<CtRicevutaTelematica> createRT(CtRicevutaTelematica value) {
        return new JAXBElement<CtRicevutaTelematica>(_RT_QNAME, CtRicevutaTelematica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtRichiestaPagamentoTelematico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.digitpa.gov.it/schemas/2011/Pagamenti/", name = "RPT")
    public JAXBElement<CtRichiestaPagamentoTelematico> createRPT(CtRichiestaPagamentoTelematico value) {
        return new JAXBElement<CtRichiestaPagamentoTelematico>(_RPT_QNAME, CtRichiestaPagamentoTelematico.class, null, value);
    }

}
