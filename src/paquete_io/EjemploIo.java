/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author s109e19
 */
public class EjemploIo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // crearArchivoBytes();
            // leerArchivoBytes();
            leerArchivoCharacter();
            crearArchivoCharacter();
        } catch (IOException e) {
        }

    }

    private static void leerArchivoBytes() throws IOException {
        FileInputStream miStream = null;
        try {
            miStream = new FileInputStream("pruebaInputStream.txt");
            int miByte = miStream.read();
            while (miByte != -1) {
                System.out.println(miByte);
                miByte = miStream.read();
            }

        } catch (Exception e) {
        } finally {
            if (miStream != null) {
                miStream.close();
            }
        }
    }

    public static void crearArchivoBytes() throws IOException {
        FileOutputStream miStream = null;
        try {
            miStream = new FileOutputStream("pruebaOutputStream.txt");
            miStream.write(new byte[]{100, 101, 102, 103});

        } finally {
            if (miStream != null) {
                miStream.close();
            }
        }
    }

    private static void leerArchivoCharacter() throws IOException {
        FileReader miStream = null;
        try {
            miStream = new FileReader("pruebaInputStream.txt");
            int miByte = miStream.read();
            while (miByte != -1) {
                System.out.println((char) miByte);
                miByte = miStream.read();
            }

        } catch (Exception e) {
        } finally {
            if (miStream != null) {
                miStream.close();
            }
        }
    }

    public static void crearArchivoCharacter() throws IOException {
        FileWriter miStream = null;
        try {
            miStream = new FileWriter("pruebaOutputStream.txt");
            miStream.write("Escribir linea 1");

        } finally {
            if (miStream != null) {
                miStream.close();
            }
        }
    }

}
