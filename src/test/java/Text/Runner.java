package Text;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportJVM;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { 
		
		
		"D:\\Bank\\LastTry\\src\\test\\resources\\Features\\Login.Feature",
		"D:\\Bank\\LastTry\\src\\test\\resources\\Features\\SearchHotel.feature" ,
		"D:\\Bank\\LastTry\\src\\test\\resources\\Features\\SelectHotel.feature",
		"D:\\Bank\\LastTry\\src\\test\\resources\\Features\\ZzBOOK.feature",
		"D:\\Bank\\LastTry\\src\\test\\resources\\Features\\ZZZconfirm.feature"
		
		}, dryRun = false, glue = "org.steps", monochrome = true,
		plugin="json:D:\\Bank\\LastTry\\target\\sample.json ")

public class Runner {

	
	@AfterClass
	
	public static void tc01() {
		
		
		ReportJVM.generateReport("D:\\Bank\\LastTry\\target\\sample.json");
		
	}
}
