
package lab;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Harjap Singh
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML private Label firstNameLabel;
    @FXML private Label lastNameLabel;
    @FXML private Label emailAddressLabel;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.firstNameLabel.setText("Harjap");
        this.lastNameLabel.setText("Singh");
        this.emailAddressLabel.setText("singhharjap200@gmail.com");
        
        
    }    
    
}
