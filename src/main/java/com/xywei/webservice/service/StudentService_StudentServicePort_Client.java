
package com.xywei.webservice.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.11
 * 2019-11-04T15:58:11.539+08:00
 * Generated source version: 3.2.11
 *
 */
public final class StudentService_StudentServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.xywei.com/", "StudentServiceService");

    private StudentService_StudentServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = StudentServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        StudentServiceService ss = new StudentServiceService(wsdlURL, SERVICE_NAME);
        StudentService port = ss.getStudentServicePort();

        {
        System.out.println("Invoking findByIdAndAge...");
        java.lang.String _findByIdAndAge_arg0 = "";
        java.lang.Integer _findByIdAndAge_arg1 = null;
        java.util.List<com.xywei.webservice.service.Student> _findByIdAndAge__return = port.findByIdAndAge(_findByIdAndAge_arg0, _findByIdAndAge_arg1);
        System.out.println("findByIdAndAge.result=" + _findByIdAndAge__return);


        }
        {
        System.out.println("Invoking findById...");
        com.xywei.webservice.service.Student _findById__return = port.findById();
        System.out.println("findById.result=" + _findById__return);


        }

        System.exit(0);
    }

}
