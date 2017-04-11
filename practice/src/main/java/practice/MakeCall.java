package practice;


import com.skype.Skype;

public class MakeCall {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java com.skype.sample.MakeCall 'skype_id'");
            return;
        }
        Skype.call(args[0]);
    }
}

