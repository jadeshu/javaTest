package club.jadeshu.base.sxt.server;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @ClassName: XMLTest01
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月28日 上午12:19:26
 * @Description: 
 * 熟悉解析XML流程 
 * 1、获取解析工程 
 * 2、从解析工厂获取解析器 
 * 3、加载文档Document注册处理器 4、编写处理器
 */
public class XMLTest01 {

	public static void main(String[] args) throws SAXException,
			ParserConfigurationException, IOException {
		// SAX解析
		// 1、获取解析工程
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 2、从解析工厂获取解析器
		SAXParser parser = factory.newSAXParser();
		// 3、加载文档Document注册处理器
		// 4、编写处理器
		PersonHandle handler = new PersonHandle();
		parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream(
								"club/jadeshu/base/sxt/server/personXML.xml"),handler);
		
	}

}

class PersonHandle extends DefaultHandler {
	@Override
	public void startDocument() throws SAXException {
		System.out.println("---解析文档开始----");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println(qName + "--->" + "解析开始");
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String str = new String(ch, start, length).trim();
		if (str.length() > 0) {
			System.out.println(str);
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println(qName + "--->" + "解析结束");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("---解析文档结束----");
	}
}