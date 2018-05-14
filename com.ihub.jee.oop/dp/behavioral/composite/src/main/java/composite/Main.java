package composite;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Creating the Employees.
		 * Çalışanlarımızı yaratıyoruz.
		 */
		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		/*
		 * Adding the other Employees as the subordinates of the selected Employees.
		 * Belirli çalışanların altına, diğer çalışanları alt olarak ekliyoruz.
		 */
		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		/*
		 * Printing the organization schema.
		 * Organizasyon şemasını bastırıyoruz.
		 */
		System.out.println(CEO);

		/*
		 * From the "headEmployee" as CEO, printing all the subordinates.
		 * "headEmployee", yani CEO'dan başlayarak, tüm çalışanları bastırıyoruz.
		 */
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}
