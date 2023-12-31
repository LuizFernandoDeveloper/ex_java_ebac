package model.physical_person;

import model.person.Person;

public class PhysicalPerson extends Person {
    
    private Double healthExpense;

    public PhysicalPerson( String name, Double annualIncome, Double healthExpense){
        super(name, annualIncome);
        this.healthExpense = healthExpense;
    }
    /**
     * get helthExpense
     * @return healthExpense
     */
    public Double getHealthExpense(){
        return healthExpense;
    }
    /**
     * set ahealthExpense
     * @param healthExpense
     */
    public void setHealthExpense(Double healthExpense){
        this.healthExpense = healthExpense;
    }
    /**
     * Return tax
     * @return tax
    */
    public final Double tax(){
        int taxAnnualIncome = super.getAnnualIncome() < 20000.00? 15 : 25;
        double resultado = 0;
        resultado = ((super.getAnnualIncome() * taxAnnualIncome)/100);
        return healthExpense == 0 ? resultado: (resultado -= (healthExpense * 50)/100);
    }
}
