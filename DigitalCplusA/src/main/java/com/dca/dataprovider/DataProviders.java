package com.dca.dataprovider;

import org.testng.annotations.DataProvider;

import com.dca.utility.NewExcelLibrary;

public class DataProviders {
NewExcelLibrary obj=new NewExcelLibrary();
@DataProvider(name = "credentials")
public Object[][] getCredentials() {
	// Totals rows count
	int rows = obj.getRowCount("Credentials");
	// Total Columns
	int column = obj.getColumnCount("Credentials");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Credentials", j, i + 2);
		}
	}
	return data;
}



@DataProvider(name = "Projectfile")
public Object[][] getProjectfile() {
	// Totals rows count
	int rows = obj.getRowCount("Projectfiles");
	// Total Columns
	int column = obj.getColumnCount("Projectfiles");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Projectfiles", j, i + 2);
		}
	}
	return data;
}


@DataProvider(name = "Projecttimeline")
public Object[][] getProjecttimeline() {
	// Totals rows count
	int rows = obj.getRowCount("projecttimeline");
	// Total Columns
	int column = obj.getColumnCount("projecttimeline");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("projecttimeline", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Communication")
public Object[][] getCommunication() {
	// Totals rows count
	int rows = obj.getRowCount("communication");
	// Total Columns
	int column = obj.getColumnCount("communication");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("communication", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Communicationmeet")
public Object[][] getCommunicationmeet() {
	// Totals rows count
	int rows = obj.getRowCount("communicationmeeting");
	// Total Columns
	int column = obj.getColumnCount("communicationmeeting");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("communicationmeeting", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "ProjectEmails")
public Object[][] getProjectEmails() {
	// Totals rows count
	int rows = obj.getRowCount("projectemail");
	// Total Columns
	int column = obj.getColumnCount("projectemail");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("projectemail", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "LocatorRequest")
public Object[][] getLocatorRequest() {
	// Totals rows count
	int rows = obj.getRowCount("locatorrequest");
	// Total Columns
	int column = obj.getColumnCount("locatorrequest");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("locatorrequest", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "FieldManagementTool")
public Object[][] getFieldManagementTool() {
	// Totals rows count
	int rows = obj.getRowCount("fieldmanagementtool");
	// Total Columns
	int column = obj.getColumnCount("fieldmanagementtool");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("fieldmanagementtool", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Expences")
public Object[][] getExpences() {
	// Totals rows count
	int rows = obj.getRowCount("expences");
	// Total Columns
	int column = obj.getColumnCount("expences");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("expences", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "LabourExpences")
public Object[][] getLabourExpences() {
	// Totals rows count
	int rows = obj.getRowCount("expencelabour");
	// Total Columns
	int column = obj.getColumnCount("expencelabour");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("expencelabour", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Labour")
public Object[][] getLabour() {
	// Totals rows count
	int rows = obj.getRowCount("labours");
	// Total Columns
	int column = obj.getColumnCount("labours");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("labours", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "CasasEmployee")
public Object[][] getCasasEmployee() {
	// Totals rows count
	int rows = obj.getRowCount("casasemployee");
	// Total Columns
	int column = obj.getColumnCount("casasemployee");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("casasemployee", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "ClientContacts")
public Object[][] getClientContacts() {
	// Totals rows count
	int rows = obj.getRowCount("clientcontact");
	// Total Columns
	int column = obj.getColumnCount("clientcontact");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("clientcontact", j, i + 2);
		}
	}
	return data;
}

@DataProvider(name = "StaffLeave")
public Object[][] getStaffLeave() {
	// Totals rows count
	int rows = obj.getRowCount("staffleave");
	// Total Columns
	int column = obj.getColumnCount("staffleave");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("staffleave", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Inventory")
public Object[][] getInventory() {
	// Totals rows count
	int rows = obj.getRowCount("inventory");
	// Total Columns
	int column = obj.getColumnCount("inventory");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("inventory", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "SupplierOnly")
public Object[][] getSupplierOnly() {
	// Totals rows count
	int rows = obj.getRowCount("supplieronly");
	// Total Columns
	int column = obj.getColumnCount("supplieronly");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("supplieronly", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "SupplierInvoice")
public Object[][] getSupplierInvoice() {
	// Totals rows count
	int rows = obj.getRowCount("supplierinvoice");
	// Total Columns
	int column = obj.getColumnCount("supplierinvoice");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("supplierinvoice", j, i + 2);
		}
	}
	return data;
	
	
	
	
}
@DataProvider(name = "BudgetDashboard")
public Object[][] getBudgetDashboard() {
	// Totals rows count
	int rows = obj.getRowCount("Budgetdashboard");
	// Total Columns
	int column = obj.getColumnCount("Budgetdashboard");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Budgetdashboard", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "ProjectTeam")
public Object[][] getProjectTeam() {
	// Totals rows count
	int rows = obj.getRowCount("Projectteam");
	// Total Columns
	int column = obj.getColumnCount("Projectteam");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Projectteam", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "ProjectActivities")
public Object[][] getProjectActivities() {
	// Totals rows count
	int rows = obj.getRowCount("Projectactivities");
	// Total Columns
	int column = obj.getColumnCount("Projectactivities");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Projectactivities", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "SiteVisits")
public Object[][] getSiteVisits() {
	// Totals rows count
	int rows = obj.getRowCount("Sitevisit");
	// Total Columns
	int column = obj.getColumnCount("Sitevisit");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Sitevisit", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "MyVisit")
public Object[][] getMyVisit() {
	// Totals rows count
	int rows = obj.getRowCount("Mytask");
	// Total Columns
	int column = obj.getColumnCount("Mytask");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Mytask", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "ActionItem")
public Object[][] getActionItem() {
	// Totals rows count
	int rows = obj.getRowCount("Actionitem");
	// Total Columns
	int column = obj.getColumnCount("Actionitem");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Actionitem", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Assets")
public Object[][] getAssets() {
	// Totals rows counts
	int rows = obj.getRowCount("Asset");
	// Total Columns
	int column = obj.getColumnCount("Asset");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Asset", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Announcements")
public Object[][] getAnnouncements() {
	// Totals rows counts
	int rows = obj.getRowCount("Announcement");
	// Total Columns
	int column = obj.getColumnCount("Announcement");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("Announcement", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Punchlistmaster")
public Object[][] getPunchlistmaster() {
	// Totals rows counts
	int rows = obj.getRowCount("punchlistmasters");
	// Total Columns
	int column = obj.getColumnCount("punchlistmasters");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("punchlistmasters", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Architecturalstagemaster")
public Object[][] getArchitecturalstagemaster() {
	// Totals rows counts
	int rows = obj.getRowCount("architecturalstagemaster");
	// Total Columns
	int column = obj.getColumnCount("architecturalstagemaster");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("architecturalstagemaster", j, i + 2);
		}
	}
	return data;
}
@DataProvider(name = "Techsupport")
public Object[][] getTechsupport() {
	// Totals rows counts
	int rows = obj.getRowCount("techsupport");
	// Total Columns
	int column = obj.getColumnCount("techsupport");
	int actRows = rows - 1;

	Object[][] data = new Object[actRows][column];

	for (int i = 0; i < actRows; i++) {
		for (int j = 0; j < column; j++) {
			data[i][j] = obj.getCellData("techsupport", j, i + 2);
		}
	}
	return data;
}


}


