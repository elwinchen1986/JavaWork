/**
 *
 */
package xmldemo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 * @author chenqiang
 */
public class XmlTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Document document = null;

        try {

            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("D:\\下载\\book.xml"));

            Element rootElement = document.getDocumentElement();

            NodeList nodeList = rootElement.getElementsByTagName("book");

            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    /* get every node */
                    Node node = nodeList.item(i);
                    /* get the next lever's ChildNodes */
                    NodeList nodeList2 = node.getChildNodes();
                    for (int j = 0; j < nodeList2.getLength(); j++) {
                        Node node2 = nodeList2.item(j);
                        if (node2.hasChildNodes()) {
                            System.out.println(node2.getNodeName() + ":" + node2.getFirstChild().getNodeValue());
                        }
                    }
                }
            }

        } catch (SAXException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }

}
