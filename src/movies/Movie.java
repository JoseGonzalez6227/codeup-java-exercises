package movies;

public class Movie {

    private String name;
    private String category;


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Your updated movie name is: " + name);
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
        System.out.println("Your updated movie category is: " + category);
    }


}