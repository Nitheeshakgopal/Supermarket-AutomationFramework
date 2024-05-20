package context;

import Utils.UniqueGenerator;

public class Constants {

	
		public static final String WORKINGDIRECTORY=System.getProperty("user.dir");
		public static final String IMAGEPATH=WORKINGDIRECTORY+"\\src\\test\\resources\\pexels-pixabay-56866.jpg";
		public static final String  IMAGEFILE=WORKINGDIRECTORY+"\\src\\test\\resources\\download.png";
		public static final String PROPERTIESFILEPATH = WORKINGDIRECTORY+"\\src\\main\\resources\\Configuration\\confi.properties";
	    public static final String EXCELPATH=WORKINGDIRECTORY+"\\src\\test\\resources\\SeleniumExcel.xlsx";
        public static final String REPORTPATH=WORKINGDIRECTORY+"\\Reports\\AutomationReport.html";
        public static final String SCREENSHOTPATH = WORKINGDIRECTORY+"//Reports//"+UniqueGenerator.getCurrentDateTime()+".png";

}
