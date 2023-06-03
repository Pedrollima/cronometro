import java.time.Duration;
import java.time.Instant;

public class Cronometro {
    public Instant inicio;
    public Instant fim;

    public void iniciar() {
        inicio = Instant.now();
    }

    public void parar() {
        fim = Instant.now();
    }

    public long obterTempoDecorridoSegundos() {
        if (inicio == null || fim == null) {
            throw new IllegalStateException("O cronômetro não foi iniciado ou parado.");
        }

        Duration duracao = Duration.between(inicio, fim);
        return duracao.getSeconds();
    }
}
