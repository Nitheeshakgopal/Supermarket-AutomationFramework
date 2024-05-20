package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import context.Constants;

public class ExtentReporterUtil {
	public static  ExtentReports extent;
	
	public static  ExtentReports getReporter() {
		ExtentSparkReporter reporter = new ExtentSparkReporter(Constants.REPORTPATH);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Obsqura Zone");
        extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Name","Nitheesha");
		extent.setSystemInfo("Environment","QA");
		return extent;
}
}
