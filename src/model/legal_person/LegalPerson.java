package model.legal_person;

import model.person.Person;

public class LegalPerson extends Person{
    
    private  int numberOfEmployees;
    /***
     * @author Luiz fernando
     * @param name
     * @param annualIncome
     * @param numberOfEmployees
     */
    public LegalPerson(String name, Double annualIncome, int numberOfEmployees){
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    /**
     * 
     * @return numberOfEmployees
     */
    public int getNumberOfEmployees(){
        return  numberOfEmployees;
    }
    /**
     * 
     * @param numberOfEmployees
     */
    public void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }
    /**
     * @return taxa
     * 
    */
    public final Double tax(){
        int tax = numberOfEmployees > 10 ? 14 : 16;
        return (super.getAnnualIncome() * tax)/100;
    }
}
