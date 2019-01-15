# SAP_Initial_Taskts

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private String name;
    private String egn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        if (egn != null) {
            this.egn = egn;
        }
    }

    public User(String name, String egn) {
        setEgn(egn);
        setName(name);
    }

    public User() {
        this("No name", "No egn");
    }

    public static List<User> readFromFile() {
        ArrayList<User> users = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("users.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            users = (ArrayList<User>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return users;
    }

    public static void writeToFile(List<User> users) {

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("users.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(users);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", egn='" + egn + '\'' +
                '}';
    }

}
