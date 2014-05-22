/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author Guilherme Gehling
 */
public class Organizador {

    public void execute(String path) {
        printFiles(getAllFiles(path, ".mp3"));
    }

    private static void printFiles(File[] files) {
        for (File file : files) {
            System.out.println(file);
        }
    }

    //Monta a lista de arquivos
     private static File[] getAllFiles(String path, final String extension) {
     File dir = new File(path);

     // filtro pela extensão procurada  
     FileFilter filter = null;

     if (extension != null) {
     filter = new FileFilter() {
     public boolean accept(File pathname) {
     return pathname.getAbsolutePath().endsWith(extension);
     }
     };
     }

     // lista os arquivos que correspondem ao match  
     return dir.listFiles(filter);
     }
     }
