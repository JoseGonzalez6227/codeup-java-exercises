
import java.util.Random;

public class ServerNameGenerator {


    public static void main(String[] args) {

        Random random = new Random();

        String[] adj = {"fun", "good", "long", "beautiful", "watery", "lovely", "cold", "icy", "milky", "wonderful"};
        String[] noun = {"dog", "doggy", "doge", "puppy", "good boy", "a very good boy", "pepperoni", "puppy", "pup", "pups"};


        int num = random.nextInt(adj.length);
        int num2 = random.nextInt(noun.length);

        System.out.println("Here is your server name:");
        System.out.println(adj[num] + "-" + noun[num2]);

    }

}