package homeworkChapter3;

class Invoice {
	private String partNum;
	private String partDescr;
	private int cant;
	private double price;

	Invoice(String partNum, String partDescr, int cant, double price) {
		this.partNum = partNum;
		this.partDescr = partDescr;
		this.cant = cant;
		this.price = price;
	}

	String getPartNum() {
		return partNum;
	}

	String getPartDescr() {
		return partDescr;
	}

	int getCant() {
		return cant;
	}

	double getPrice() {
		return price;
	}

	void setPartNum() {
		this.partNum = partNum;
	}

	void setPartDescr() {
		this.partDescr = partDescr;
	}

	void setCant(int cant) {
		if (cant < 0)
			this.cant = 0;
		else
			this.cant = cant;
	}

	void setPrice(double price) {
		if (price < 0.0)
			this.price = 0.0;
		else
			this.price = price;
	}

	double invoiceAmount() {
		double invoiceAmount = this.price * this.cant;
		return invoiceAmount;
	}
}


public class Homework2 {

	public static void main(String[] args) {
		Invoice test = new Invoice("apples", "green", 17, 10.0);
		System.out.println("partNum : " + test.getPartNum());
		System.out.println("partDescriptiton : " + test.getPartDescr());
		System.out.println("Quantity : " + test.getCant());
		System.out.println("Price : " + test.getPrice());
		double invoiceAmount = test.invoiceAmount();
		System.out.println("Amount : " + test.invoiceAmount());

		test.setCant(-17);
		test.setPrice(-13);

		System.out.println("Quantity now : " + test.getCant());
		System.out.println("Price now : " + test.getPrice());
	}

}

//3.12	(Invoice Class) Create a class called Invoice that a hardware store might use to represent
//an invoice for an item sold at the store. An Invoice should include four pieces of information as
//instance variables—a part number (type String), a part description (type String), a quantity of the
//item being purchased (type int) and a price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//multiplies the quantity by the price per item), then returns the amount as a double value. If the
//quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
