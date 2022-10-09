package ReplitTask.Variables;

public class casting {
    public static void main(String[] args) {


        long workPnoneNumber = 31212423535l,
                personalPhoneNumber = 23523666l;
        String email = "zeynabnasibova7@gmail.com";
        String contacts = workPnoneNumber + ","+ personalPhoneNumber + "," + email;

        //you can not use -->long contacts = workPnoneNumber + personalPhoneNumber + email;

        System.out.println(contacts);
    }
}
