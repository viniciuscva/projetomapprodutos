
package br.com.map.ppm.relatorios;


import java.util.List;
 
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import br.com.map.ppm.model.bean.Produto;
import br.com.map.ppm.util.MensagensUtil;
import java.util.HashMap;
import net.sf.jasperreports.view.JasperViewer;
 
public class RelatorioProdutos{
    
	private String path; //Caminho base
	private String pathToReportPackage; // Caminho para o package onde estão armazenados os relatorios Jarper
	
	//Recupera os caminhos para que a classe possa encontrar os relatórios
	public RelatorioProdutos() {
		//this.path = this.getClass().getClassLoader().getResource("").getPath();
		//this.pathToReportPackage = this.path + "br/com/map/ppm/relatorios/";
                this.pathToReportPackage = "c:/";
		//System.out.println(path);
	}
	
	//Imprime/gera uma lista de Clientes
	public void imprimirProdutosComPrecoMaiorQueMil(List<Produto> produtos) throws Exception{
            JasperReport report = JasperCompileManager.compileReport(
                    this.getPathToReportPackage() + "templateRelatorio1.jrxml");
            HashMap parametros = new HashMap();
            parametros.put("titulo", MensagensUtil.getMensagem(MensagensUtil.MSG_MENUITEM_PRECOMAIORQUEMIL));
            JasperPrint print = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(produtos));
            //JasperExportManager.exportReportToPdfFile(print, "c:/RelatoriosProdutos/Relatorio_de_Produtos.pdf");
            JasperViewer jasperViewer = new JasperViewer(print, false);
            jasperViewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jasperViewer.setTitle(MensagensUtil.getMensagem(MensagensUtil.MSG_TITULO_JANELA_RELATORIOS));//Cria uma variavel para passar este titulo
            jasperViewer.setVisible(true);
	}
        
        public void imprimirProdutosComPrecoMenorQueMil(List<Produto> produtos) throws Exception{
            JasperReport report = JasperCompileManager.compileReport(
                    this.getPathToReportPackage() + "templateRelatorio1.jrxml");
            HashMap parametros = new HashMap();
            parametros.put("titulo", MensagensUtil.getMensagem(MensagensUtil.MSG_MENUITEM_PRECOMENORQUEMIL));
            JasperPrint print = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(produtos));
            //JasperExportManager.exportReportToPdfFile(print, "c:/RelatoriosProdutos/Relatorio_de_Produtos.pdf");
            JasperViewer jasperViewer = new JasperViewer(print, false);
            jasperViewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jasperViewer.setTitle(MensagensUtil.getMensagem(MensagensUtil.MSG_TITULO_JANELA_RELATORIOS));//Cria uma variavel para passar este titulo
            jasperViewer.setVisible(true);
	}
 
	public String getPathToReportPackage() {
            return this.pathToReportPackage;
	}
	
	public String getPath() {
            return this.path;
	}
}