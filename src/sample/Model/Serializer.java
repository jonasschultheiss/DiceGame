package sample.Model;

import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serializer
{
    private static final String SERIALIZED_FILE_NAME="settings.xml";

    XMLSerializer serializer;

    public Serializer()
    {
        this.serializer = new XMLSerializer();
    }



    public void TestSerialize() {
        UserDBO userDBO = new UserDBO();
        userDBO.UserList.add(new User("ques1onmark", "123456"));
        userDBO.UserList.add(new User("Computer", "123456"));
        userDBO.UserList.add(new User("Developer", "123456"));

        XMLEncoder encoder  = null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
        }
        encoder.writeObject(userDBO);
        encoder.close();

    }
}
