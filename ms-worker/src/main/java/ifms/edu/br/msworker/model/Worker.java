package ifms.edu.br.msworker.model;

public class Worker {
    private String name;
    private Double dailyIncone;

    public Worker(String name, Double dailyIncone){
        this.name= name;
        this.dailyIncone = dailyIncone;
    }

    public String getName(){
        return this.name;
    }
    public Double getDailyIncone(){
        return this.dailyIncone;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setDailyIncone (Double dailyIncone) {
        this.dailyIncone = dailyIncone;
    }
    
}


