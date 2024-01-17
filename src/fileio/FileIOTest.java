package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import java.util.function.Consumer;

public class FileIOTest {
    public static void main(String[] args) {

        // text file : ansi-code, unicode(utf-8, utf-16, utf-32,...)
        // binary file

//        StringBuilder sb = new StringBuilder();
//        sb.append("test file입니다.\n");
//        sb.append("이것은 java로 만들어진 파일입니다.\n");
//        sb.append("파일 쓰기 및 읽기 작업입니다.\n");
//        TextIO.write("test.txt", sb.toString());

//        try {
//            StringBuilder sb = TextIO.read("test.txt");
//            System.out.println(sb.toString());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        BinaryIO.copy("test.txt", "copy.txt");

        Person kang = new Person(20, "강호동", "1234-1234");
        Person yoo = new Person(21, "유재석", "1234-4567");
        Person park = new Person(22, "박명수", "4567-1234");

        try {
            ObjectIO.savePerson("kang.per", kang);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            Optional<Person> byPerson = ObjectIO.loadPerson("kang.per");
            byPerson.orElseThrow(() -> new RuntimeException("객체를 정상적으로 로딩하지 못했습니다."));
            Person fileObject = byPerson.get();
            System.out.println( fileObject );

        } catch (IOException | ClassNotFoundException | RuntimeException e) {
            System.out.println( e.getMessage() );
        }


        Family<Person> fam = new Family<>();
        fam.add( kang );
        fam.add( yoo );
        fam.add( park );

        try {
            ObjectIO.saveFamily("person.fam", fam);
        } catch (IOException e) {
            System.out.println( e.getMessage() );
        }

        // byFam.orElseThrow( parameter );

        try {
            Optional<Family<Person>> byFam = ObjectIO.loadFamily("person.fam");
            byFam.orElseThrow(() -> new RuntimeException("객체를 정상적으로 로딩하지 못했습니다."));
            Family<Person> fileObject = byFam.get();
            fileObject.showItems();

        } catch (IOException | ClassNotFoundException | RuntimeException e) {
            System.out.println( e.getMessage() );
        }

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        // String str = "hello";
//        String str = new String("hello");
//        String ptr = str;

    }
}
