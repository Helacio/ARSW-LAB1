package edu.eci.arsw.threads;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;
import java.util.List;

public class ThreadSearch extends Thread{
    private int inicio;
    private int fin;
    private String ip;

    private int ocurrencias;
    private int revisadas;
    private List<Integer> listas = new LinkedList<>();

    public ThreadSearch(int inicio, int fin, String ip){
        this.inicio = inicio;
        this.fin = fin;
        this.ip = ip;
    }

    @Override
    public void run(){
        HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();

        for (int i = inicio; i <= fin; i++){
            revisadas++;
            if (skds.isInBlackListServer(i, ip)){
                listas.add(i);
                ocurrencias++;
            }
        }
    }

    public int getOcurrencias(){
        return ocurrencias;
    }

    public int getRevisadas(){
        return revisadas;
    }

    public List<Integer> getListas(){
        return listas;
    }
}
