public class impCar {

    String model;
    int year;
    Engine engine;

    impCar (String model,int year,String engineType){
        this.model= model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
    void start (){
        this.engine.start();
        System.out.println("the"+this.model +"is running");
    }



}
