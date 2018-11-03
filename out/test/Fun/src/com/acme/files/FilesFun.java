package com.acme.files;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.function.Function;

public class FilesFun {





    static int dirCount = 0;


    private void filesFun() {
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


