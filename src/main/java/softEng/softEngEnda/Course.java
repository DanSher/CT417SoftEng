package softEng.softEngEnda;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {
	private String name;
	private ArrayList<Module> moduleList;
	private DateTime startDate;
	private DateTime endDate;

	public Course(String name, ArrayList<Module> moduleList, 
			DateTime startDate, DateTime endDate) {
		this.name = name;
		this.moduleList = moduleList;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(ArrayList<Module> moduleList) {
		this.moduleList = moduleList;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

}
