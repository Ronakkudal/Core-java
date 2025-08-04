package printer;

import java.time.LocalDate;

public class Printer {
	private Integer serialNo;
	private String modelNo;
	private Double price;
	private PrinterEnum printerType;
	private LocalDate mfDate;
	
	public Printer() {
		this.serialNo = 0;
		this.modelNo = "";
		this.price = 0.0;
		this.printerType = PrinterEnum.INKJET;
		this.mfDate = LocalDate.now();
	}
	public Printer(Integer serialNo, String modelNo, Double price, PrinterEnum printerType, LocalDate mfDate) {
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.printerType = printerType;
		this.mfDate = mfDate;
	}
	
	@Override
	public String toString() {
		return "\nPrinter Serial No : " + serialNo + "\nModel No : " + modelNo + "\nPrice : " + price + "\nPrinter Type : "
				+ printerType + "\nManufacturing Date : " + mfDate;
	}

	public Integer getSerialNo() {return serialNo;}

	public void setSerialNo(Integer serialNo) {this.serialNo = serialNo;}

	public String getModelNo() {return modelNo;}

	public void setModelNo(String modelNo) {this.modelNo = modelNo;}

	public Double getPrice() {return price;}

	public void setPrice(Double price) {this.price = price;}

	public PrinterEnum getPrinterType() {return printerType;}

	public void setPrinterType(PrinterEnum printerType) {this.printerType = printerType;}

	public LocalDate getMfDate() {return mfDate;}

	public void setMfDate(LocalDate mfDate) {this.mfDate = mfDate;}
}
