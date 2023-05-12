import java.util.*;//for scanner class and arraylist
class Movie{
    Scanner sc= new Scanner(System.in);
    String Title;
    int Age_res;
    float Cost;
    Movie(){}
    Movie(String Title){
        this.Title=Title;
    }//title of movie is passed through a constructor
    void getData(){//method to get data from user
        System.out.println("Enter the cost of the movie");
        Cost=sc.nextFloat();
        System.out.println("Enter the Age restriction of the movie");
        Age_res= sc.nextInt();
    }
}
class User{
    Movie M= new Movie();
    int age;
    String name;
    float acc_balance;
    User(Movie m,int age,String name,float bal){//Method to initialise all relevant variables for the object
        M=m;
        this.age=age;
        this.name=name;
        acc_balance=bal;
    }
    boolean Can_Watch = age>=M.Age_res;//Is true if user age is >= age restriction
    void can_watch_movie(){//Tells whether user can watch movie based on his age
        if(Can_Watch){
            System.out.println("You can watch this movie");
        }
        else{
            System.out.println("You cannot watch this movie");
        }
    }
    void Watch(){//deducts cost of movie from balance or tells that balance is inadequate
        if(Can_Watch && (acc_balance>=M.Cost)) {
            acc_balance -= M.Cost;
        }
        else{
            System.out.println("You cannot watch this movie or balance is insufficient");
        }
    }
    float printbal(){
        System.out.println("The updated balance is: "+ acc_balance);
        return acc_balance;
    }//prints balance and returns updated balance to update the balance variable in main
}
public class Movie_watch {
    public static void main(String[] args) {
        int usr_age;
        String usr_name;
        float usr_bal;
        Scanner sc= new Scanner (System.in);
        String Temp_Mov_name;//Temporary variables to be used later
        String Temp_Mov_name_user;
        ArrayList<Movie>Moviearr = new ArrayList<>();//Dynamic array defined using arraylist,
        // as we do not know the number of movies that would be entered
        System.out.println("Type the name, age and initial account balance of user");
        usr_name=sc.nextLine();
        usr_age=sc.nextInt();
        usr_bal=sc.nextFloat();
        System.out.println("Type 0 to exit the admin interface(or 1 to remain in it)");
        while(sc.nextInt()!=0){
            sc.nextLine();//To clear input buffer, as nextint reads the integer but leaves the \n behind
            System.out.println("Enter name of movie");
            Temp_Mov_name= sc.nextLine();
            Temp_Mov_name=Temp_Mov_name.toLowerCase();
            Movie Tempmov= new Movie(Temp_Mov_name);//creating a temporary movie object to add at end of arraylist
            Tempmov.getData();
            Moviearr.add(Tempmov);//adding the object at the end of the arraylist
            System.out.println("Type 0 to exit the admin interface(or 1 to remain in it)");
        }
        System.out.println("You are now in User interface, press 0 to exit it, 1 to remain");
        while(sc.nextInt()!=0) {
            sc.nextLine();//To clear \n from buffer
            int req_index=-1;
            System.out.println("Enter name of movie");
            Temp_Mov_name_user = sc.nextLine();
            Temp_Mov_name_user=Temp_Mov_name_user.toLowerCase();
            for(int i=0;i<Moviearr.size();i++){//To check for required movie and fetch it from the library
                if(Moviearr.get(i).Title.equals(Temp_Mov_name_user)){
                    req_index=i;
                    break;
                }
            }
            if(req_index==-1){
                System.out.println("Movie not found");
            }
            else{//Driver Code
                User usr=new User(Moviearr.get(req_index),usr_age,usr_name,usr_bal);
                usr.can_watch_movie();
                System.out.println("Do you want to watch this movie? (enter 1 for yes, 0 for no)");
                if(sc.nextInt()==1){
                    usr.Watch();
                    usr_bal=usr.printbal();
                }
            }
            System.out.println("Enter 0 to exit program, 1 to check for another movie");
        }
    }
}
