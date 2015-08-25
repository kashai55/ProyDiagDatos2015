
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLFile {

	public void readXml(String request){
		try {
		    DocumentBuilderFactory fábricaCreadorDocumento = DocumentBuilderFactory.newInstance();
		    DocumentBuilder creadorDocumento = fábricaCreadorDocumento.newDocumentBuilder();
		    Document documento = creadorDocumento.parse("test.xml");
		    //Obtiene el elemento raíz del documento
		    Element raiz = documento.getDocumentElement();

		    //Obtiene la lista de nodos que tienen etiqueta que se quiere buscar
		    NodeList listaPatos = raiz.getElementsByTagName(request);
		    //Recorrer la lista de elementos
		    for(int i=0; i<listaPatos.getLength(); i++) {   
		        //Obtener de la lista un elemento tras otro
		        Node pato = listaPatos.item(i);
		        System.out.println(" Duck "+i);
		        System.out.println("==========");    

		        //Obtener la lista de los datos que contiene ese empleado
		        NodeList datosPato = pato.getChildNodes();
		        //Recorrer la lista de los datos que contiene el empleado
		        for(int j=0; j<datosPato.getLength(); j++) {
		            //Obtener de la lista de datos un dato tras otro
		            Node dato = datosPato.item(j);

		            //Comprobar que el dato se trata de un nodo de tipo Element
		            if(dato.getNodeType()==Node.ELEMENT_NODE) {
		                //Mostrar el nombre del tipo de dato
		                //System.out.print(dato.getNodeName()+": ");
		                //El valor está contenido en un hijo del nodo Element
		                Node datoContenido = dato.getFirstChild();                        
		                //Mostrar el valor contenido en el nodo que debe ser de tipo Text
		                if(datoContenido!=null && datoContenido.getNodeType()==Node.TEXT_NODE)
		                    System.out.println(datoContenido.getNodeValue());
		                	//return datoContenido.getNodeValue();
		            }
		        }
		        //Se deja un salto de línea de separación entre cada empleado
		        System.out.println();
		    }
		 
		} catch (SAXException ex) {
		    System.out.println("ERROR: El formato XML del fichero no es correcto\n"+ex.getMessage());
		    ex.printStackTrace();
		} catch (IOException ex) {
		    System.out.println("ERROR: Se ha producido un error el leer el fichero\n"+ex.getMessage());
		    ex.printStackTrace();
		} catch (ParserConfigurationException ex) {
		    System.out.println("ERROR: No se ha podido crear el generador de documentos XML\n"+ex.getMessage());
		    ex.printStackTrace();
		}
	}
}
