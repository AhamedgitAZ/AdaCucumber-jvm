package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportJVM {

	public static void generateReport(String json) {

		File f = new File("D:\\Bank\\LastTry\\target");

		Configuration con = new Configuration(f, "Adatin");
		con.addClassifications("Operating System", "Windows");
		con.addClassifications("Version", "11");

		List<String> li = new ArrayList();
		li.add(json);

		
		ReportBuilder r = new ReportBuilder(li,con);
		r.generateReports();
	}

}
