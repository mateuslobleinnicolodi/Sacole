/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Sacole {
    private int codigo;
    private int nr_serie;
    private Double preco;
    private LocalDate data_validade;
    private String sabor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNr_serie() {
        return nr_serie;
    }

    public void setNr_serie(int nr_serie) {
        this.nr_serie = nr_serie;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getData_validade() {
        return data_validade;
    }

    public void setData_validade(LocalDate data) {
        this.data_validade = data_validade;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    

    @Override
    public String toString() {
        return sabor;
    }
}
