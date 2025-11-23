public class userdata {
    public static void main(String[] args) {

        boolean isLoggedIn = true;
        int age = 22;
        double accountBalance = 15000000000000000.55; 
        char loyaltyTier = 'A'; 
        String userName = "Aswin";
        String[] favoriteLanguages = {"Java", "Python", "SQL"}; 
        System.out.println(" User Profile Data Summary ");
        System.out.println("Name: " + userName); 
        System.out.println("Age: " + age);
        System.out.println("is Logged In: " + isLoggedIn); 
        System.out.println("Loyalty Tier: " + loyaltyTier); 
        System.out.println("Account Balance: " + accountBalance); 
        System.out.println("\n Complex Data");
        System.out.println("Number of Favorite Languages: " + favoriteLanguages.length); 
        System.out.println("First Favorite Language: " + favoriteLanguages[0]); 
        System.out.println("Username in Uppercase: " + userName.toUpperCase()); 

    } 
} 
    
    

