/**
 * 
 */
package jaxb.beerxml2.test;

/**
 * @author nate
 *
 */

import java.io.File;
import java.util.*;
import javax.xml.bind.*;
import jaxb.beerxml2.*;

public class BeerXML_Test {

   // private ObjectFactory of;
    private BeerXml newRecipe;
    private File myFile;
    
    public BeerXML_Test(String file){
        
        myFile = new File(file);
       // of = new ObjectFactory(); 
        newRecipe = unmarshal();
        System.out.println(newRecipe.getRecipes().getRecipe().get(0).getName());
        
        List<RecipeType> recipes = newRecipe.getRecipes().getRecipe();
        System.out.println("there are " + recipes.size() + " recipes in this file");
    }

    public BeerXml unmarshal() {
        System.out.println("unmarshal");
        
        BeerXml beerxml = new BeerXml();
        
        try {
            JAXBContext jc = JAXBContext.newInstance( "jaxb.beerxml2" );
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            
            beerxml= (BeerXml)
            unmarshaller.unmarshal(myFile);
            

        } catch( JAXBException jbe ) {
            System.out.println("Exception caught in unmarshal.");
            jbe.printStackTrace();
            // ...
        }
        
        return beerxml;
    }
    
    public void marshal() {
        //try {
          //  JAXBElement<GreetingListType> gl =
          //      of.createRecipeType( newRecipe );
            //JAXBContext jc = JAXBContext.newInstance( "jaxb.beerxml2" );
          //  Marshaller m = jc.createMarshaller();
         //   m.marshal( gl, System.out );
        //} catch( JAXBException jbe ){
            // ...
        //}
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BeerXML_Test test = new BeerXML_Test("/Users/nate/Desktop/recipe_ex_01.xml");
        System.out.println(test.hashCode());

    }

}