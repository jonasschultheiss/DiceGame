package sample.Model;

import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Serializer
{
    private static final String SERIALIZED_FILE_NAME="userDBO.xml";

    XMLSerializer serializer;

    public Serializer()
    {
        this.serializer = new XMLSerializer();
    }



    public void TestSerialize(){
        UserDBO userDBO = new UserDBO();
        userDBO.UserList.add(new User("ques1onmark", "123456"));
        userDBO.UserList.add(new User("Computer", "123456"));
        userDBO.UserList.add(new User("Developer", "123456"));
        serializeToXML(userDBO);
    }

    private void serializeToXML (UserDBO userDBO)  {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Hello");
        al.add("Hi");
        al.add("Howdy");

        try{
            FileOutputStream fos= new FileOutputStream("myfile");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
