package com.acme.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.function.Function;

import org.junit.Test;

public class FilesFun {



    @Test
    public void lazyStreams() {
        Arrays.asList(new N(1),new N(2),new N(3),new N(4),new N(5),new N(6),new N(7),new N(8),new N(9))
                .stream()
                .filter(n -> n.getNumber() > 5)
                // where input is Stream<N> and map(<Function<? super N, ? extends Integer mapper>)
                .map(n-> Math.multiplyExact(n.getNumber(), 2))
                .forEach(System.out::println);




        // example using function defined external
        // where input is Stream<N> and map(<Function<? super N, ? extends Integer mapper>)
        Function<N, Integer> twice = (n) -> Math.multiplyExact(n.getNumber(), 2);

        Arrays.asList(new N(1),new N(2),new N(3),new N(4),new N(5),new N(6),new N(7),new N(8),new N(9))
                .stream()
                .filter(n -> n.getNumber() > 5)
                .map(twice)
                .forEach(System.out::println);


    }




    static int dirCount = 0;


    private void filesFun() {


        Files.readAllLines()
        try {

//			Files.walk(new File(".").toPath())
//					.filter(p -> p.getFileName().toString().endsWith(".java"))
//					.forEach(p -> lambdaMethodToInspectPath(p));



            // had to call method in this context because Files.lines throws exception
            // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=472373
            Files.walk(new File(".").toPath())
//			.filter(p -> p.getFileName().toString().endsWith(".java"))
                    .forEach(	p -> lambdaMethodToPrintFile(p)	);

            System.out.println(dirCount + " paths were directories");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    private void lambdaMethodToPrintFile(Path p){
        if (Files.isDirectory(p)) {
            dirCount++;
        }

        //System.out.println("Printing file " + p.getFileName());// print file contents
//				try {
//					Files.lines(p).forEach(System.out::println);
//				} catch (IOException e) {e.printStackTrace();}
    }





    private void methodToAppendLineToFile(Path p){
        try {
            // if this file, append a new line
            if (p.getFileName().toString().equalsIgnoreCase("FilesFun.java")) {
                Files.newOutputStream(p,StandardOpenOption.APPEND).write("// New comment \n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void lambdaMethodToInspectPath(Path p) {
        System.out.print("this type ==> " + getClass().getName());
        System.out.print("  ****  arg type ==> " +p.getClass().getName());
        System.out.println(" **** arg value ==> " +p);
    }

    public static void main(String[] args) throws Exception{
        new FilesFun();
    }

}
