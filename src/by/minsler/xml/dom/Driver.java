package by.minsler.xml.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Driver {

	public static void main(String[] args) throws SAXException, IOException,
			ParserConfigurationException {

		File file = new File("xml/expenses.xml");
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder db = builderFactory.newDocumentBuilder();
		Document document = db.parse(file);
		ParserDom.handleDocument(document);
	}
}
