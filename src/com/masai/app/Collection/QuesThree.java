package com.masai.app.Collection;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class QuesThree {
    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        serializeMap(map, "map.ser");
        Map<String, Integer> deserializedMap = deserializeMap("map.ser");
        System.out.println("Deserialized Map: " + deserializedMap);
    }

            public static void serializeMap(Map<String, Integer> map, String fileName) {
                try {
                    FileOutputStream fos = new FileOutputStream(fileName);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);
                    oos.close();
                    fos.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }

            @SuppressWarnings("unchecked")
            public static Map<String, Integer> deserializeMap(String fileName) {
                Map<String, Integer> map = null;
                try {
                    FileInputStream fis = new FileInputStream(fileName);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    map = (HashMap<String, Integer>) ois.readObject();
                    ois.close();
                    fis.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                } catch (ClassNotFoundException c) {
                    System.out.println("Class not found");
                    c.printStackTrace();
                }
                return map;
            }




}
