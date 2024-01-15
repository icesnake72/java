package fileio;

import java.io.*;
import java.util.Optional;

public class ObjectIO {

    public static long savePerson(String fileName, Person person) throws IOException {
        try(FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject( person );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File file = new File(fileName);
        return file.length();
    }

    public static Optional<Person> loadPerson(String fileName) throws IOException, ClassNotFoundException {
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person person = (Person) ois.readObject();
            return Optional.of(person);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return Optional.empty();
    }
}
