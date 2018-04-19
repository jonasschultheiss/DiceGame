package sample.Model;

import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Serializer
{
    private static final String USER_DATABASE="src/sample/XML/userDBO.xml";
    private static final String SETTINGS="src/sample/XML/settings.xml";

    XMLSerializer serializer;

    public Serializer()
    {
        this.serializer = new XMLSerializer();
    }




    public void serializeUserDBO (UserDBO userDBO)  {
        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(USER_DATABASE)));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
        }
        encoder.writeObject(userDBO);
        encoder.close();
    }

    public UserDBO deserializeUserDBO()
    {
        XMLDecoder decoder=null;
        try {
            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream(USER_DATABASE)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File dvd.xml not found");
        }
        return (UserDBO) decoder.readObject();
    }

    public void serializeSettings (Settings settings)  {
        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SETTINGS)));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
        }
        encoder.writeObject(settings);
        encoder.close();
    }

    public Settings deserializeSettings()
    {
        XMLDecoder decoder=null;
        try {
            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream(SETTINGS)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File dvd.xml not found");
        }
        return (Settings) decoder.readObject();
    }
}
