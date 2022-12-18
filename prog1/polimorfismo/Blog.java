import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Blog {
    static List<Post> posts = new ArrayList <Post>();

    public void readData(Post p){
        
        Scanner ler = new Scanner(System.in);
        Date data = new Date();
       
        if (p instanceof News){
            News news = (News) p;
            System.out.println("Digite o Title:");
            String title = ler.next();
            news.setTitle(title);

           for(int i = 0 ; i < posts.size() ; i++){
            System.out.println("Titre:" +title);
            System.out.println("GetTitle:" +posts.get(i).getTitle());
                if(title.equals(posts.get(i).getTitle())){
                    throw new RuntimeException("Titulo já existe!");
                }
           }

    
            System.out.println("Digite o conteúdo: ");
            String content = ler.next();
            news.setContent(content);

            System.out.println("Digite aqui the source of the news: ");
            String source = ler.next();
            news.setSource(source);

            news.setLikes(0);

            news.setDislikes(0);
            news.setData(data);

        }else if(p instanceof ProductReview){
            ProductReview productReview = (ProductReview) p;

            System.out.println("Digite o Title:");
            String title = ler.next();
            productReview.setTitle(title);

            for(int i = 0 ; i < posts.size() ; i++){
                if(title.equals(posts.get(i).getTitle())){
                    throw new RuntimeException("Titulo já existe!");
                }
           }

            System.out.println("Digite o conteúdo: ");
            String content = ler.next();
            productReview.setContent(content);

            System.out.println("Digite o brand do produto: ");
            String brand = ler.next();
            productReview.setBrand(brand);

            System.out.println("Digite o numero de stars: ");
            int stars = ler.nextInt();
            productReview.evaluate(stars);

            productReview.setLikes(0);

            productReview.setDislikes(0);
            productReview.setData(data);

        }else{

            Post post = p;

            System.out.println("Digite o Title:");
            String title = ler.next();
            post.setTitle(title);

            for(int i = 0 ; i < posts.size() ; i++){
                if(title.equals(posts.get(i).getTitle())){
                    throw new RuntimeException("Titulo já existe!");
                }
           }

            System.out.println("Digite o conteúdo: ");
            String content = ler.next();
            post.setContent(content);

            post.setLikes(2);
            post.setDislikes(1);
            post.setData(data);

            
        }

       
    }

    public void showAll(){
        Iterator <Post> p = posts.iterator();
        Post p1;
        while (p.hasNext()){
            p1 = p.next();
            p1.show();

            System.out.println("**==========================================================**\n");
        }
    }


    public static void curtirPostagem( Post returnV, Scanner ler) throws VoidListException{
        if ( Blog.posts.size() > 0){
            System.out.println("Digite o codigo do post: ");
            int codigo  = ler.nextInt();

            if (codigo >= 0 && codigo == (Blog.posts.size() - 1)){
                returnV = Blog.posts.get(codigo);
                returnV.like();
            }else{
                throw new ArrayIndexOutOfBoundsException("Código invalido, postagem inexistente!");
            }

        }else{
            throw new VoidListException("Lista vazia!!!");
        }
    }
  
    
    public static void dislikePostagem(Post returnV, Scanner ler) throws VoidListException{
        if (Blog.posts.size() > 0){
            System.out.println("Digite o codigo do post: ");
            int codigo  = ler.nextInt();

            if (codigo >= 0 && codigo == (Blog.posts.size() - 1)){
                returnV = Blog.posts.get(codigo);
                returnV.dislike();
            }else{
                throw new ArrayIndexOutOfBoundsException("Código invalido, postagem inexistente!");
            }
        }else{
            throw new VoidListException("Lista vazia!!!");
        }
    }



    public static void main(String []args) throws VoidListException{
        for( ; ; ){

            System.out.println("BLOG: O que você quer fazer?");
            System.out.println("******************************************");
            System.out.println("1 - Novo post de noticia");
            System.out.println("2 - Novo resenha de produto");
            System.out.println("3 - Novo post de outros assuntos");
            System.out.println("4 - Listar todas as postagem"); 
            System.out.println("5 - Curtir uma postagem");
            System.out.println("6 - Curtir uma postagem");
            System.out.println("10- Sair");
            System.out.println("Escolher a opção: .");

            Scanner ler = new Scanner(System.in);
            int choix = ler.nextInt();
            Blog blog = new Blog();

            Post returnV = new Post();

            if(choix == 1){
              try{
                News noticia = new News();
                Post post = (Post) noticia;
                blog.readData(post);
                Blog.posts.add(post);
              }catch(Exception e){
                System.out.println(e.getMessage());
            }


            }else if (choix == 2){
                try{
                    ProductReview prod = new ProductReview();
                    Post post = (Post) prod;
                    blog.readData(post);
                    Blog.posts.add(post);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            }else if(choix == 3){
                try{
                    Post post1 = new Post();
                    blog.readData(post1);
                    Blog.posts.add(post1);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
              

            }else if(choix == 4){
                blog.showAll();

            }else if(choix == 5){
               
               try{
                curtirPostagem(returnV, ler);
               }catch(Exception e){
                System.out.println(e.getMessage());
               }
                

            }else if( choix == 6){

                try{
                   dislikePostagem(returnV, ler);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            }else if(choix == 10){
                System.out.println("Você saiu do sitema. volte sempre!");
                break;
            }
    
        }


    }
}
