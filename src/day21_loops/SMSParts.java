package day21_loops;

public class SMSParts {
    public static void main(String[] args) {
        /*

        SMS parts]
            Given a ReplitTask.String in the following format:
            “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
            Separate these parts and print them separately: Sender: actualSender
            Number: actualNumber Message: actualMessage
            1) we need to find the all the index
               - sender find the index of < and >
               - number find the index of the [ and ]
               - message find the index of the { and }
               with our indexes we can now pull from the ReplitTask.String with substring

         */

        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {characterI love programming and problem solving}";

        int indexOfSenderBegin = msg.indexOf("<");
        int indexOfSenderClosing =msg.indexOf(">");

        int indexOfNumberBegin = msg.indexOf("[");
        int indexOfNumberClose = msg.indexOf("]");

        int indexOfMsgBegin = msg.indexOf("{");
        int indexOfMsgClose = msg.indexOf("{");

        String sender = msg.substring(indexOfSenderBegin,indexOfSenderClosing);
        String number = msg.substring(indexOfNumberBegin + 1, indexOfNumberClose);
        String message = msg.substring(indexOfMsgBegin + 1, indexOfMsgClose);


        System.out.println("Sender: " + sender);
        System.out.println("Number: " + sender);



    }

}
