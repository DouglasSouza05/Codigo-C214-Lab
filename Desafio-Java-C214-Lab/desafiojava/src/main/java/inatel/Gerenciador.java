package inatel;

import java.util.ArrayList;
import java.util.List;

class ListaVaziaException extends Exception {
    public ListaVaziaException(String message) {
        super(message);
    }
}

public class Gerenciador {

    List<Filme> filmes;

    public Gerenciador() {

        // ArrayList<>() é lista dinâmica que pode crescer conforme a necessidade. Irá
        // conter objetos do tipo "Filme".
        filmes = new ArrayList<>();

    }

    public void showDetails(Filme filme) {

        System.out.println("ID: " + filme.getID());
        System.out.println("Titulo: " + filme.getTitulo());
        System.out.println("Ano de Lançamento: " + filme.getAno());
        System.out.println("Genêro: " + filme.getGenero());
        System.out.println("Duração: " + filme.getDuracao());
        if (filme.getState() == false) {
            System.out.println("Assistido: Não");
        } else {
            System.out.println("Assistido: Sim");
        }
        System.out.println("Avaliação: " + filme.getRating() + "\n");
    }

    public void addFilmes(Filme filme) {
        this.filmes.add(filme);
    }

    public boolean testEmptyArray() {

        try {
            if (filmes.isEmpty()) {
                throw new ListaVaziaException("Lista de filmes vazia.");
            }
            return false;
        } catch (ListaVaziaException e) {
            System.out.println("Erro: " + e.getMessage());
            return true;
        }

    }

    public void markFilmes(int id) {

        for (Filme filme : filmes) {
            if (filme.getID() == id) {
                filme.setState(true);
            }
        }

        // try {
        // if (filmes.isEmpty()) {
        // throw new ListaVaziaException("Lista de filmes vazia!");
        // }

        // for (Filme filme : filmes) {
        // if (filme.getID() == id) {
        // filme.setState(true);
        // return; // Sai do loop se o filme for encontrado.
        // }
        // }
        // } catch (ListaVaziaException e) {
        // System.out.println("Erro: " + e.getMessage());
        // }
    }

    public void rateFilmes(int id, float rate) {
        for (Filme filme : filmes) {
            if (filme.getID() == id) {
                filme.setRating(rate);
            }
        }
    }

    public void getFilmes() {
        for (Filme filme : filmes) {
            showDetails(filme);
        }
    }

}
