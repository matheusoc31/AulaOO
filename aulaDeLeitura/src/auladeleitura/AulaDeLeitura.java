/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladeleitura;

import auladeheranca.Cachorro;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class AulaDeLeitura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Arquivo de texto");
        try {
            FileWriter arquivo = new FileWriter(file);
            arquivo.write("Teste aula oo\nTeste1\nTeste2\nTeste3");
            arquivo.flush();

            lerArquivo();
            lerArquivoBinario();
        } catch (IOException ex) {
            Logger.getLogger(AulaDeLeitura.class.getName()).log(Level.SEVERE, null, ex);
        }

        Cachorro cadu = new Cachorro();
        gravarObjeto(cadu);

    }

    public static void lerArquivo() {
        File file = new File("Arquivo de texto");
        try {
            FileReader arquivo = new FileReader(file);

            int leitura = arquivo.read();
            while (leitura != -1) {
                System.out.print((char) leitura);
                leitura = arquivo.read();
            }
        } catch (IOException ex) {
            Logger.getLogger(AulaDeLeitura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void lerArquivoBinario() {
        File file = new File("Arquivo de texto");
        try {
            FileReader arquivo = new FileReader(file);
            BufferedReader buffer = new BufferedReader(arquivo);
            String leitura = "";
            while (true) {
                leitura = buffer.readLine();
                if (leitura != null) {
                    System.out.print("\n");
                    System.out.print(leitura);
                } else {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(AulaDeLeitura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void salvarArquivoBianrio() {
        try {
            File arq = new File("Teste binario");
            OutputStream out = new FileOutputStream(arq);
            BufferedOutputStream buff = new BufferedOutputStream(out);
            byte[] bytes = {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0};
            buff.write(bytes);
            String palavra = "TesteBinario";
            buff.write(palavra.getBytes());
            buff.flush();
        } catch (IOException ex) {
            System.out.print("ERRO");
        }
    }

    public static void gravarObjeto(Cachorro cachorro) {
        try {
            FileOutputStream arq = new FileOutputStream("CACHORRO");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(cachorro);
            obj.flush();
        } catch (IOException ex) {
            System.out.print("ERRO EM SALVAR OBJETO");
        }
    }
}
