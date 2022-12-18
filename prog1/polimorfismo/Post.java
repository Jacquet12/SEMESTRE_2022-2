import java.util.Date;
public class Post{
    private String title;
    private String content;
    private int likes = 0;
    private int dislikes ;
    private Date date;
    
    public Post (){

    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public int getLikes(){
        return this.likes;
    }

    public void setDislikes(int dislikes){
        this.dislikes = dislikes;
    }

    public int getDilikes(){
        return this.dislikes;
    }

    public void setData(Date data){
        this.date = data;
    }

    public void show(){
        System.out.print("Titulo: "+this.title+"\n" +"Data: "+this.date+"\n"+"Conteúdo: "+this.content+"\n"+"Like: "+this.likes+"\n"+"Dislike: "+this.dislikes+"\n");
    }

    public void like(){
        this.likes += 1;
    }

    public void dislike(){
        this.dislikes += 1;
    }

    public Date getDate(){
        return this.date;
    } 

    public static void add(Post p) {

    }

    // public void PrintData(){
    //     System.out.println(date);
    // }

}