public class ProductReview extends Post implements Evaluable{
    private String brand;
    private int stars;


    // public ProductReview(String title,String content,String source, String brand){
    //     super(title, content);
    //     this.brand = brand;
    //     this.stars = 0;
    // }
    public ProductReview (){

    }


    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }


    public void setStars(int stars){
        this.stars = stars;
    }

    public int getStars(){
        return this.stars;
    }

    public void show(){
        super.show();
        System.out.println("Marca do produto: "+this.brand +"\n" +"Number of stars: "+this.stars);
    }

    @Override

    public void evaluate (int value){
        if(value >= 1 && value <= 10){
            this.stars = value;
        }else{
            System.out.println("you must avaluate again!!!");
        }
    }


}
