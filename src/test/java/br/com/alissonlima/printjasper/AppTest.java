/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.com.alissonlima.printjasper;

import br.com.alissonlima.printjasper.exporters.JasperViewerExporter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.InputStream;
import java.util.Collections;

class AppTest {
    public static void main(String[] args) {
        try{
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream jasperIS = loader.getResourceAsStream("report.jasper");

            JasperData jasperData = new JasperData();
            jasperData.jasperInputStream = jasperIS;

            String content = "<p>\n" +
                    "      Lorem ipsum dolor sit amet, no dictas mollis <b><i>definiebas</i></b> cum, duo dolor quodsi ei.&nbsp;</p><p><br></p><p>Usu veniam\n" +
                    "      honestatis eu. Iracundia instructior ad mea, eu eos nostro corrumpit cotidieque. Iracundia urbanitas\n" +
                    "      signiferumque id usu, ex adversarium <u>consequuntur</u> definitionem quo. An per vituperata suscipiantur, graece\n" +
                    "      persecuti eum in.\n" +
                    "    </p>";

            jasperData.jrDataSource = new JRBeanCollectionDataSource(Collections.singleton(new Data(content)));

//            new JasperHtmlExporter(jasperData).exportToFile("/Users/alissonlima/teste.html");

            JasperViewerExporter exporter = new JasperViewerExporter(jasperData);
            exporter.displayReport();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
