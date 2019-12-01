
package br.com.map.ppm.model.bean.factory;

import br.com.map.ppm.model.bean.Especificacao;
import br.com.map.ppm.model.dao.EspecificacaoDao;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


//ESTA CLASSE NAO É MAIS ÚTIL POIS AGORA É COM GUI
public class EspecificacaoFactory {
    public static Especificacao criarNovaEspecificacao(){
        Scanner input = new Scanner(System.in);
        Especificacao esp = new Especificacao();
        System.out.println("Digite o fabricante da especificação:");
        esp.setFabricante(input.nextLine());
        System.out.println("Digit a cor da especificação");
        esp.setCor(input.nextLine());
        System.out.println("Digite o sistema da especificação:");
        esp.setSistema(input.nextLine());
        System.out.println("Digite os detalhes da especificação:");
        esp.setDetalhes(input.nextLine());
        EspecificacaoDao  espDao = new EspecificacaoDao();
        int codigo=-1;
        try {
            codigo = espDao.criar(esp);
        } catch (SQLException ex) {
            Logger.getLogger(EspecificacaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        esp.setCodigo(codigo);
        System.out.println("Especificação criada no banco de dados. Código: "+codigo);
        return esp;
    }
    
    
}
