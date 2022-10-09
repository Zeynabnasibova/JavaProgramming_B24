package day35_methods;

public class PersonInformation {

        /*
        uilding up email

        parameters: name (first and last), domain

        buildEmail("james bond", "gmail")
        Output: james_bond@gmail.com
        */
        public static void main(String[] args) {
            buildEmail("Zeynab Nasibova","gmail");
            login("jbond007","bond007");
        }

        public static void buildEmail(String name, String domain){

            name = name.replace(" ", "_");

            System.out.println( name + "@" + domain + ".com");
        }

        public static void login(String username, String pasword){
            if(username.equals("jbond007") && pasword.equals("bond007")){
                System.out.println("LOGGED IN");
            }else {
                System.out.println("INVALID CREDENTIALS");
            }

        }



    }
