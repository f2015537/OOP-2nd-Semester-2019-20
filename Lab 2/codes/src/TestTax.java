
public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxOnSalary tax1 = new TaxOnSalary(true);
		TaxOnSalary tax2 = new TaxOnSalary();
		
		tax1.inputSalary();
		tax2.inputSalary();
		
		TaxOnSalary.sc.close();
		
		System.out.println(tax1.calculateTax());;
		System.out.println(tax2.calculateTax());;
	}

}
