package model.person;

public abstract class Person {
    
    private String name;
    
    private Double annualIncome;

    public Person(String name, Double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }
    /**
     * função para ver o nome 
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * função para setar nomes
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    /*****
     * return annualIncome
     * @return annualIncome
    */
    public Double getAnnualIncome(){
        return annualIncome;
    }

    /**
     * set AnnualIncome
     * @param annualIncome
     * 
    */
    public void setAnnualIncome(Double annualIncome){
        this.annualIncome = annualIncome;
    }

    public abstract Double tax();
}
