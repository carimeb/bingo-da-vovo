import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bingo {
    public static void main(String[] args) {
        var vovo1 = new Vovo();
        vovo1.setNome("Artrite");
        vovo1.setIdade(90);
        vovo1.setDataNasc("09/09/1930");
        //vovo1.setPrecisouDeOxigenio();
        vovo1.setVitorias(1);

        var vovo2 = new Vovo();
        vovo2.setNome("Artrose");
        vovo2.setIdade(80);
        vovo2.setDataNasc("09/09/1940");
        vovo2.setPrecisouDeOxigenio(true);
        vovo2.setVitorias(2);

        var vovo3 = new Vovo();
        vovo3.setNome("Osteoporose");
        vovo3.setIdade(70);
        vovo3.setDataNasc("09/09/1950");
        vovo3.setPrecisouDeOxigenio(true);
        vovo3.setVitorias(0);

        List<Vovo> vovoList = Arrays.asList(vovo1, vovo2, vovo3);

        List<Vovo> vovoListaOrdenada = vovoList.stream()
                .sorted(Comparator.comparingInt(Vovo::getVitorias).reversed())
                .collect(Collectors.toList());

        int qtasJogaram = vovoListaOrdenada.size();
        System.out.println("Número de participantes: " + qtasJogaram);
        System.out.println("********************************************************");

        System.out.println("Nome da vencedora da noite: " + vovoList.get(2).getNome() + " Idade: " + vovoList.get(2).getIdade());
        System.out.println("********************************************************");


        List<Vovo> precisaramOxigenio = vovoList.stream().filter(vovo -> vovo.precisouDeOxigenio()).collect(Collectors.toList());

        System.out.println("Qtas precisaram de oxigênio: " + precisaramOxigenio.size());
        precisaramOxigenio.stream().forEach(vovo -> {
            System.out.println("Nome: " + vovo.getNome() + " Idade: " + vovo.getIdade());
        });

    }
}
