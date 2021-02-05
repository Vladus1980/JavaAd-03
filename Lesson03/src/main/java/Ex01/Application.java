package Ex01;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {
	
	private static Logger LOG = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		
		logWithDasicConf();
		logWithDomConf();
	}
	
	public static void logWithDomConf() {
		DOMConfigurator.configure("LoggerConfigFile.xml");
		LOG.debug("Message from DEBUG Logger");
		LOG.warn("Message from WARN Logger");
		LOG.info("Message from INFO Logger");
		LOG.error("Message from ERROR Logger");
	}
	
	public static void logWithDasicConf() {
		BasicConfigurator.configure();
		LOG.debug("Message from DEBUG Logger");
		LOG.warn("Message from WARN Logger");
		LOG.info("Message from INFO Logger");
		LOG.error("Message from ERROR Logger");		
	}

}