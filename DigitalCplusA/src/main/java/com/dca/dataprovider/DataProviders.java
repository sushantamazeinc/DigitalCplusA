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

}


