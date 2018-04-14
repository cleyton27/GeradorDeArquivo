package br.com.integrati.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CriadorDeArquivos {
    Scanner sc = new Scanner(System.in);

    public String criarArquivoDeTexto(){
        System.out.println("Digite o nome do arquivo");
         String nomeArquivo = sc.nextLine();
        File file = new File(nomeArquivo+".txt").getAbsoluteFile();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nomeArquivo;
    }

    public  File criadorDePastas(){
        System.out.println("Digite o nome da pasta");
        String nomePasta = sc.nextLine();
        File diretorio = new File(nomePasta);
        diretorio.mkdir();
        System.out.println(diretorio.getAbsoluteFile());
        return diretorio;
    }

    public void criadorDeArquivoDentroDaPasta() throws IOException {
        System.out.println("Digite o nome do direitorio");
        String nomePasta = sc.nextLine();
        File diretorio = new File(nomePasta);
        diretorio.mkdir();
        System.out.println("Digite o nome do arquivo");
        String nomeDoAqrquivo = sc.nextLine()+".txt";
        File file = new File(nomePasta,nomeDoAqrquivo);
        file.createNewFile();
        System.out.println(file.getAbsoluteFile());
    }

}
