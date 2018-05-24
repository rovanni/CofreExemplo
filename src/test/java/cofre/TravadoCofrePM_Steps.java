
package cofre;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
public class TravadoCofrePM_Steps extends Cofre {
    
    public TravadoCofrePM_Steps() {
        sensorMock = mock(SensorPorta.class);
        memoriaMock = mock(Memoria.class);
        cofrePM = new CofrePM(sensorMock, memoriaMock);    

        when(sensorMock.fechada())
                .thenReturn(Boolean.TRUE);
        when(sensorMock.travada())
                .thenReturn(Boolean.TRUE);  
    }

    @Before
    public void fecharPorta() {
        when(sensorMock.fechada())
                .thenReturn(Boolean.TRUE);
    }
    @Before    
    public void abrirPorta() {
        when(sensorMock.fechada())
                .thenReturn(Boolean.FALSE);        
    }       
    //
    //        Cenário: testar digitar senha invalida
    //
    @Dado("^que digite um (\\d+) (\\d+) (\\d+) (\\d+) (\\d+) (\\d+) com a porta fechada e travada$")
    public void que_digite_um_com_a_porta_fechada_e_travada(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        when(memoriaMock.getSenha()).thenReturn("123456");
        cofrePM.pressButton(arg1);
        cofrePM.pressButton(arg2);
        cofrePM.pressButton(arg3);
        cofrePM.pressButton(arg4);
        cofrePM.pressButton(arg5);
        cofrePM.pressButton(arg6);
    }
    @Quando("^eu clico no botao ok$")
    public void eu_clico_no_botao_ok() throws Exception {
        cofrePM.pressionarOk();
    }
    @Então("^é exibida a mensagem \"([^\"]*)\"$")
    public void é_exibida_a_mensagem(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());        
    }
    //    
    //    Cenário: testar digitar uma senha com menos de seis digitos   
    //    
    @Dado("^que pressiono o numero (\\d+)$")
    public void que_pressiono_o_numero(int arg1) throws Exception {
        when(memoriaMock.getSenha()).thenReturn("123456");       
        cofrePM.pressButton(arg1);
    }

    @Quando("^verifico o que foi digitado no display e vejo \"([^\"]*)\"$")
    public void verifico_o_que_foi_digitado_no_display_e_vejo(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay()); 
    }    

    @Quando("^aperto o botao ok$")
    public void aperto_o_botao_ok() throws Exception {
        cofrePM.pressionarOk();
    }

    @Então("^o display exibi a seguinte mensagem \"([^\"]*)\"$")
    public void o_display_exibi_a_seguinte_mensagem(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }
    @Dado("^que digito o numero (\\d+) e (\\d+)$")
    public void que_digito_o_numero_e(int arg1, int arg2) throws Exception {
        cofrePM.pressButton(arg1);
        cofrePM.pressButton(arg2);        
    }

    @Quando("^verifico o que esta sendo exibido no display e vejo \"([^\"]*)\"$")
    public void verifico_o_que_esta_sendo_exibido_no_display_e_vejo(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay()); 
    }    
    @Quando("^clicar no botao ok$")
    public void clicar_no_botao_ok() throws Exception {
        cofrePM.pressionarOk();
    }

    @Então("^será exibi a seguinte mensagem \"([^\"]*)\"$")
    public void será_exibi_a_seguinte_mensagem(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }    
    //    
    //  Cenário: teste digitar senha válida    
    //   
    @Dado("^que informe a senha (\\d+) (\\d+) (\\d+) (\\d+) (\\d+) (\\d+) com a porta fechada e travada$")
    public void que_informe_a_senha_com_a_porta_fechada_e_travada(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        when(memoriaMock.getSenha()).thenReturn("123456");
        cofrePM.pressButton(arg1);
        cofrePM.pressButton(arg2);
        cofrePM.pressButton(arg3);
        cofrePM.pressButton(arg4);
        cofrePM.pressButton(arg5);
        cofrePM.pressButton(arg6);        
    }

    @Quando("^pressionar o botão ok$")
    public void pressionar_o_botão_ok() throws Exception {
        cofrePM.pressionarOk();        
    }

    @Então("^será exibida a mensagem \"([^\"]*)\" e a porta vai abrir$")
    public void será_exibida_a_mensagem_e_a_porta_vai_abrir(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());        
        assertEquals("senha correta. Cofre aberto", cofrePM.getDisplay());        
    }    
}
