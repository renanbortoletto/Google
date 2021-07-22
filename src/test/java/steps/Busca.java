package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Busca {
    @Dado("^que a abri o Google$")
    public void queAAbriOGoogle() {
    }

    @Quando("^digito \"([^\"]*)\"$")
    public void digito(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @E("^aperto a tecla Enter$")
    public void apertoATeclaEnter() {
    }

    @Entao("^exibe os resultados para \"([^\"]*)\"$")
    public void exibeOsResultadosPara(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
