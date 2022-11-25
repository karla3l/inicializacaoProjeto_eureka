package ifms.edu.br.mspayroll.model;

public class Payment {
    private String name;
    private Double dailyIncone;
    private Integer days;


    public String getName (){
        return this.name;
    }

    public Double getDailyIncone(){
        return this.dailyIncone;
    }

    public Integer getDays() {
        return this.days;
    }


    public void setName (String name) {
        this.name = name;
    }

    public void setDailyIncone (Double dailyIncone) {
        this.dailyIncone = dailyIncone;
    }
    
}
