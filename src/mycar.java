public class mycar {

    private String name ;
    private String color;
    private int price;

    mycar(String name,String color,int price){
        this.name = name ;
        this.color = color;
        this.price = price;
    }

    String getname(){
        return this.name;
    }
    String getcolor(){
        return this.color;
    }

    String getprice(){
        return "$ " + this.price;
    }
    void setColor(String color){
        this.color=color;
    }
void setname (String name ){
        this.name = name ;
}
void setprice (int price){
        if (price < 0){
            System.out.println("price cant be less than 0");

        }
        else {
            this.price = price ;
        }




}}
