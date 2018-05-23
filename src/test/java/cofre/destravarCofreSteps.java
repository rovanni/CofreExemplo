package cofre;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import static org.mockito.Mockito.*;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class destravarCofreSteps extends Cofre{

    public destravarCofreSteps() {
        sensorMock = mock(SensorPorta.class);
        memoriaMock = mock(Memoria.class);
        cofrePM = new CofrePM(sensorMock, memoriaMock);
        when(sensorMock.travada())
                .thenReturn(Boolean.FALSE);
    }

    @Before
    public void fecharPorta() {
        when(sensorMock.fechada())
                .thenReturn(Boolean.TRUE);
    }
    public void abrirPorta() {
        when(sensorMock.fechada())
                .thenReturn(Boolean.FALSE);        
    }    

    @Dado("^que ao digitar o numero (\\d+)$")
    public void que_ao_digitar_o_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }
    
    @Dado("^digito o numero (\\d+)$")
    public void digito_o_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }

    @Quando("^pressione o botao clear$")
    public void pressione_o_botao_clear() throws Exception {
        cofrePM.clear();  
    }

    @Então("^o display mostra a mensagem \"([^\"]*)\"$")
    public void o_display_mostra_a_mensagem(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }

    @Dado("^que digite um numero (\\d+) com a porta aberta$")
    public void que_digite_um_numero_com_a_porta_aberta(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }

    @Quando("^a porta estiver aberta$")
    public void a_porta_estiver_aberta() throws Exception {
        when(sensorMock.fechada()).thenReturn(Boolean.FALSE);
    }

    @Então("^o display deve mostrar a mensagem \"([^\"]*)\"$")
    public void o_display_deve_mostrar_a_mensagem(String arg1) throws Exception {
        when(sensorMock.fechada()).thenReturn(Boolean.TRUE);
    }

    @Dado("^que eu entrei com o numero (\\d+) com a porta fechada$")
    public void que_eu_entrei_com_o_numero_com_a_porta_fechada(int arg1) throws Exception {
        fecharPorta();
        cofrePM.pressButton(arg1);
    }

    @Quando("^eu olhar para o display$")
    public void eu_olhar_para_o_display() throws Exception {
        assertEquals("0", cofrePM.getDisplay());
    }

    @Quando("^e pressione o botao ok$")
    public void e_pressione_o_botao_ok() throws Exception {
        cofrePM.pressionarOk();
    }

    @Dado("^que eu entrei com o numero (\\d+)$")
    public void que_eu_entrei_com_o_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }
    @Dado("^que digito o numero (\\d+) em um display vazio$")
    public void que_digito_o_numero_em_um_display_vazio(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }    
    @Dado("^digito mais um numero (\\d+)$")
    public void digito_mais_um_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }

    @Dado("^digito outro numero (\\d+)$")
    public void digito_outro_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }

    @Dado("^digito também numero (\\d+)$")
    public void digito_também_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }

    @Dado("^digito mais outro numero (\\d+)$")
    public void digito_mais_outro_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }    

    @Quando("^eu pressionei o botao ok$")
    public void eu_pressionei_o_botao_ok() throws Exception {
        cofrePM.pressionarOk();
    }

    @Quando("^verificar o display$")
    public void verificar_o_display() throws Exception {
        assertEquals("Senha salva. Cofre trancado", cofrePM.getDisplay());      
    }

    @Dado("^também digito o numero (\\d+)$")
    public void também_digito_o_numero(int arg1) throws Exception {
        fecharPorta();
        cofrePM.pressButton(arg1);
    }
    @Quando("^pressionar o botao ok$")
    public void pressionar_o_botao_ok() throws Exception {
        cofrePM.pressionarOk();
    }

    @Então("^o display mostrara a seguinte mensagem \"([^\"]*)\"$")
    public void o_display_mostrara_a_seguinte_mensagem(String arg1) throws Exception {
        assertEquals("Senha precisa de 6 digitos. Tente novamente", cofrePM.getDisplay());
    }    

    @Dado("^eu digito o numero (\\d+)$")
    public void eu_digito_o_numero(int arg1) throws Exception {
        fecharPorta();        
        cofrePM.pressButton(arg1);
    }

    @Dado("^depois digito o numero (\\d+)$")
    public void depois_digito_o_numero(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }    
    
    @Quando("^verificar o display ele mostrará a mensagem \"([^\"]*)\"$")
    public void verificar_o_display_ele_mostrará_a_mensagem(String arg1) throws Exception {
        assertEquals("98", cofrePM.getDisplay());
    }

    @Dado("^abrir a porta e digitar o numero (\\d+)$")
    public void abrir_a_porta_e_digitar_o_numero(int arg1) throws Exception {
        abrirPorta();
        cofrePM.pressButton(arg1);        
    }

    @Quando("^verifico o display para ver a mensagem \"([^\"]*)\"$")
    public void verifico_o_display_para_ver_a_mensagem(String arg1) throws Exception {
        assertEquals("Feche a porta antes de digitar a senha", cofrePM.getDisplay());        
    }

    @Dado("^fechar a porta e digitar o numero (\\d+)$")
    public void fechar_a_porta_e_digitar_o_numero(int arg1) throws Exception {
        fecharPorta();
        cofrePM.pressButton(arg1);        
    }

    @Quando("^olho para o display ele mostrará a mensagem \"([^\"]*)\"$")
    public void olho_para_o_display_ele_mostrará_a_mensagem(String arg1) throws Exception {
        assertEquals("7", cofrePM.getDisplay());        
    }
}
    

