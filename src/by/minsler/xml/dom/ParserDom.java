package by.minsler.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserDom {

	public static void handleDocument(Document document) {
		System.out.println("<" + document.getDocumentElement().getNodeName()
				+ ">");
		handleExpenseElement(document.getElementsByTagName("expense"));
		System.out.println("</" + document.getDocumentElement().getNodeName()
				+ ">");
	}

	private static void handleExpenseElement(NodeList list) {
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				System.out.println("\t<" + element.getNodeName() + ">");
				String tab = "\t\t";
				printNodeByName(element, "num", tab);
				printNodeByName(element, "paydate", tab);
				printNodeByName(element, "receiver", tab);
				printNodeByName(element, "value", tab);
				System.out.println("\t</" + element.getNodeName() + ">");
			}
		}
	}

	private static void printNodeByName(Element element, String name, String tab) {
		NodeList nodeList = element.getElementsByTagName(name);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			// NodeList nodeListChild = node.getChildNodes();
			// for (int j = 0; j < nodeListChild.getLength(); j++) {
			// System.out.println(nodeListChild.item(j).getNodeName() + " "
			// + nodeListChild.item(j).getNodeValue());
			// }
			System.out.print(tab + "<" + node.getNodeName() + ">");
			System.out.print(node.getTextContent());
			System.out.println("</" + node.getNodeName() + ">");

		}
	}
}
