/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formatoapa;

/**
 *
 * @author cavil
 */
public class Articulo extends Base{
    private String pagina;
    private String journal;

    public Articulo() {
    }

    public Articulo(String pagina, String journal) {
        this.pagina = pagina;
        this.journal = journal;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
    
}
