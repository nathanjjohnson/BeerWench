package jaxb.beerxml2.util;

import java.io.File;
import javax.xml.bind.*;

import jaxb.beerxml2.BeerXml;
import jaxb.beerxml2.ObjectFactory;

public class BeerXml2File {
    
    private BeerXml myRecipe;
    private File myFile;
    
    public BeerXml2File() {
        ObjectFactory of = new ObjectFactory();
        myRecipe = of.createBeerXml();
        myFile = new File("NewRecipe");
    }
    
    public BeerXml2File(File f) {
        myFile = f;
    }
    
    public String getName() {
        return myFile.getName();
    }
    
    public void setFile(File f) {
        myFile = f;
    }

    public File getFile() {
        return myFile;
    }
    
    public BeerXml getBeerXml() {
        return myRecipe;
    }
    
    public boolean unmarshal() {

        //create a new BeerXml Object
        //BeerXml recipe = new BeerXml();
        
        try {
            JAXBContext jc = JAXBContext.newInstance( "jaxb.beerxml2" );
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            
            myRecipe = (BeerXml)
            unmarshaller.unmarshal(myFile);
            

        } catch( JAXBException jbe ) {
            System.out.println("Exception caught in unmarshal.");
            jbe.printStackTrace();
            // ...
        }
        
        if(myRecipe != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void marshal() {
        
       // try {
            //ObjectFactory of = new ObjectFactory();
           // JAXBElement<BeerXml> recipe =
           //     of.createBeerXml( );
            //JAXBContext jc = JAXBContext.newInstance( "jaxb.beerxml2" );
            //Marshaller m = jc.createMarshaller();
         //   m.marshal( gl, System.out );
        //} catch( JAXBException jbe ){
            // ...
        //}
    }
    
}

