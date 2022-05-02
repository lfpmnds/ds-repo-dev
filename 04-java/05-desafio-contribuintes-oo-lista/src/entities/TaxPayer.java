package entities;

public class TaxPayer {
	
	private int id;
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer() {
	}

	public TaxPayer(int id, double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		super();
		this.id = id;
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double tax;
		if (getSalaryIncome() < 36000.0) {
			tax = getSalaryIncome() * 0.0;
		} else if (getSalaryIncome() < 60000.0) {
			tax = getSalaryIncome() * 0.10;
		} else {
			tax = getSalaryIncome() * 0.20;
		}
		return tax;
	}
	
	public double servicesTax() {
		double tax;
		if (getServicesIncome() > 0.0) {
			tax = getServicesIncome() * 0.15;
		} else {
			tax = 0.0;
		}
		return tax;
	}
	
	public double capitalTax() {
		double tax;
		if (getCapitalIncome() > 0.0) {
			tax = getCapitalIncome() * 0.20;
		} else {
			tax = 0.0;
		}
		return tax;
	}
	
	public double grossTax() {
		double tax = salaryTax() + servicesTax() + capitalTax();
		return tax;
	}
	
	public double taxRebate() {
		double tax;
		double expenseRebate = getHealthSpending() + getEducationSpending();
		double maxRebate = grossTax() * 0.30;
		if (maxRebate > expenseRebate) {
			tax = expenseRebate;
		} else {
			tax = maxRebate;
		}
		return tax;
	}
	
	public double netTax() {
		double tax = grossTax() - taxRebate();
		return tax;
	}
}
