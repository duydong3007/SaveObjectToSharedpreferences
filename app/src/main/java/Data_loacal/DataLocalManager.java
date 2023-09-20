package Data_loacal;

import android.content.Context;

import com.google.gson.Gson;

import Model.User;

public class DataLocalManager {
    public static DataLocalManager instance;
    public static MySharedpreferences mySharedpreferences;
    private static String fref_object_user="fref_object_user";

    public static void init(Context context){
        instance=new DataLocalManager();
        mySharedpreferences=new MySharedpreferences(context);
    }

    public static DataLocalManager getInstance(){
        if(instance==null){
            instance=new DataLocalManager();
        }
        return instance;
    }


    public static void setuser(User user){
        Gson gson=new Gson();
        String gsonuser=gson.toJson(user);
        DataLocalManager.getInstance().mySharedpreferences.putStringvalues(fref_object_user,gsonuser);

    }
    public static User getuser(){
        String gsonuser=DataLocalManager.getInstance().mySharedpreferences.getStringvalues(fref_object_user);
        Gson gson=new Gson();
        User user=gson.fromJson(gsonuser,User.class);
        return user;
    }
}
