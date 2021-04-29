import java.util.Objects;

public class Vovo {
    private String nome;
    private int idade;
    private String dataNasc;
    private boolean precisouDeOxigenio;
    private int vitorias;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vovo)) return false;
        Vovo vovo = (Vovo) o;
        return idade == vovo.idade && precisouDeOxigenio == vovo.precisouDeOxigenio && vitorias == vovo.vitorias && Objects.equals(nome, vovo.nome) && Objects.equals(dataNasc, vovo.dataNasc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNasc, precisouDeOxigenio, vitorias);
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public boolean precisouDeOxigenio() {
        return precisouDeOxigenio;
    }

    public void setPrecisouDeOxigenio(boolean precisouDeOxigenio) {
        this.precisouDeOxigenio = precisouDeOxigenio;
    }
}
