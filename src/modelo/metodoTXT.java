package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class metodoTXT{

    public void setLista(ArrayList<Computador> lista) {
        this.lista = lista;
    }
    ArrayList<Computador> lista=new ArrayList<>();
    File arch=new File("src\\archivos\\BdTXT.txt");    
    public void escribir()throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        PrintWriter pw=new PrintWriter(arch);
        for(Computador p: lista){
            pw.println(p.dato());
        }
        pw.close();
        JOptionPane.showMessageDialog(null,"cambios guardados con exito");
    }

    public ArrayList<Computador> getLista() {
        return lista;
    }
    public void leer()throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        BufferedReader br=new BufferedReader(new FileReader(arch));
        String cad;
        while((cad=br.readLine())!=null){
            String cad2[]=cad.split(",");
            lista.add(new Computador(cad2[0],
                   cad2[1],cad2[2],cad2[3]));
        }
    }
    void ingresar(Computador A){
        lista.add(A);
    }
    void mostrar(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).informacion());
        }
    }
    
    void actualizar(int p,Computador x){
        lista.set(p, x);
    }
    
    void eliminar(int p){
        lista.remove(p);
    }
}