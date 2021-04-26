/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapphere;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Christina
 */
public class FXMLDocumentController implements Initializable {

    static String name;
    static String carry = "";
    static String flavor = "";
    static String month = "";
    static String payment = "";
    static int day = 0;
    static int hour = 0;
    static int min = 0;
    static int scoop = 0;
    static double price = 0.00;

    @FXML
    private Label label;

    @FXML
    private TextField customerOrderName;

    @FXML
    private Button StartOrderButton;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        try {
            name = customerOrderName.getText();
            if (name.equals("")) {
                throw new Exception();
            }
            stage = (Stage) StartOrderButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewMenu.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            label.setText("Please provide a name for the order");
            System.out.println(ex.getMessage());
        }

    }

    //VIEW MENUE CONTROLLER
    @FXML
    private Button CookieDoughBtn;

    @FXML
    private Button VanillaBtn;

    @FXML
    private Button CocoBtn;

    @FXML
    private Button SberryBtn;

    @FXML
    private Button MintBtn;

    @FXML
    private Button CookiesNCreamBtn;

    @FXML
    private Button BlkRaspBtn;

    @FXML
    private Button MysteryBtn;

    @FXML
    private Button PeanutBtn;

    @FXML
    private Button ReturnToMenu;

    Stage stage;
    Parent root;

    @FXML
    private void CDBtnClick(ActionEvent event) {
        try {
            stage = (Stage) CookieDoughBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemCD.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void VBtnClick(ActionEvent event) {
        try {
            stage = (Stage) VanillaBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemV.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void CocoBtnClick(ActionEvent event) {
        try {
            stage = (Stage) CocoBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemCoco.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void SBerryBtnClick(ActionEvent event) {
        try {
            stage = (Stage) SberryBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemStraw.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void MintBtnClick(ActionEvent event) {
        try {
            stage = (Stage) MintBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemMint.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void CCBtnClick(ActionEvent event) {
        try {
            stage = (Stage) CookiesNCreamBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemCC.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void BRBtnClick(ActionEvent event) {
        try {
            stage = (Stage) BlkRaspBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemBRC.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void MystBtnClick(ActionEvent event) {
        try {
            stage = (Stage) MysteryBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemMyst.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void PeanutBtnClick(ActionEvent event) {
        try {
            stage = (Stage) PeanutBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewItemPeanut.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    //View Item Methods
    @FXML
    private Label ScoopsNum;

    @FXML
    private Label CarryChoice;

    //Note, this naming convention was a mistake
    //This button represents Place Order
    @FXML
    private Button Vanilla;

    @FXML
    private void returnToMenu(ActionEvent event) {
        try {
            stage = (Stage) ReturnToMenu.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ViewMenu.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void updateScoop1V(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Vanilla";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2V(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Vanilla";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3V(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Vanilla";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop1Coca(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Chocolate";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2Coca(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Chocolate";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3Coca(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Chocolate";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop1Straw(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Strawberry";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2Straw(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Strawberry";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3Straw(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Strawberry";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void updateScoop1Mint(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Mint Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2Mint(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Mint Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3Mint(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Mint Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop1CC(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Cookies & Cream";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2CC(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Cookies & Cream";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3CC(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Cookies & Cream";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop1CD(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Cookie Dough";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2CD(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Cookie Dough";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3CD(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Cookie Dough";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop1BRC(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Black Raspberry Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2BRC(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Black Raspberry Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3BRC(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Black Raspberry Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop1Myst(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Mystery";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2Myst(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Mystery";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3Myst(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Mystery";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop1Pea(ActionEvent event) {
        try {
            scoop = 1;
            flavor = "Peanutbutter Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop2Pea(ActionEvent event) {
        try {
            scoop = 2;
            flavor = "Peanutbutter Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateScoop3Pea(ActionEvent event) {
        try {
            scoop = 3;
            flavor = "Peanutbutter Chip";
            ScoopsNum.setText("" + scoop);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateHoldCup(ActionEvent event) {
        try {
            carry = "Cup";
            CarryChoice.setText(carry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void updateHoldCone(ActionEvent event) {
        try {
            carry = "Cone";
            CarryChoice.setText(carry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private Label IceFlavor;

    @FXML
    private Label ScoopNum;

    @FXML
    private Label Container;

    @FXML
    private Label Price;

    @FXML
    private void PlaceOrder(ActionEvent event) {
        try {
            if ((scoop == 0) || (flavor == "") || (carry == "")) {
                throw new Exception();
            } else {
                stage = (Stage) Vanilla.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("AddItemtoCart.fxml"));

                if (scoop == 1) {
                    price = 3.00;
                } else if (scoop == 2) {
                    price = 3.88;
                } else {
                    price = 4.66;
                }

                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            }
        } catch (Exception ex) {
            System.out.println("You did not specify how many scoops or what container");
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private Button ViewOrder;

    @FXML
    private void ViewOrderLabels(ActionEvent event) throws IOException {
        IceFlavor.setText(flavor);
        ScoopNum.setText("" + scoop);
        Container.setText(carry);
        Price.setText("" + price);

    }

    @FXML
    private Button GoToSchedule;

    @FXML
    private void scheduleBtn(ActionEvent event) throws IOException {
        stage = (Stage) GoToSchedule.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("ChoosePickUp.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button GoToPayBtn;

    @FXML
    private TextField Month;

    @FXML
    private TextField Day;

    @FXML
    private TextField Hour;

    @FXML
    private TextField Minute;

    @FXML
    private Button cancelOrder;

    @FXML
    private void CancelOrder(ActionEvent event) {
        try {
            stage = (Stage) cancelOrder.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("CancelOrderCustomer.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private Button returnToPay;

    @FXML
    private void ReturnToPay(ActionEvent event) {
        try {
            stage = (Stage) returnToPay.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ChoosePayment.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void GoToPay(ActionEvent event) {

        try {
            month = Month.getText();
            day = Integer.parseInt(Day.getText());
            hour = Integer.parseInt(Hour.getText());
            min = Integer.parseInt(Minute.getText());

            System.out.println(month);
            System.out.println(day);
            System.out.println(hour);
            System.out.println(min);

            if (!(month.equals("January") || month.equals("February") || month.equals("March") || month.equals("April") || month.equals("May") || month.equals("June") || month.equals("July") || month.equals("August") || month.equals("September") || month.equals("October") || month.equals("November") || month.equals("December"))) {
                throw new Exception();
            }

            if (day < 1 || day > 31) {
                throw new Exception();
            }

            if (hour < 1 || hour > 12) {
                throw new Exception();
            }
            if (min < 0 || min > 59) {
                throw new Exception();
            }

            stage = (Stage) GoToPayBtn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ChoosePayment.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("One of the fields does not have a valid input");
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private Button GoToFillerScreen;

    @FXML
    private Label PaymentChosen;

    @FXML
    private void creditPay(ActionEvent event) {
        try {
            payment = "Credit Card";
            PaymentChosen.setText(payment);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void flexPay(ActionEvent event) {
        try {
            payment = "Flex - Meal Plan";
            PaymentChosen.setText(payment);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void flyerPay(ActionEvent event) {
        try {
            payment = "Flyer Card";
            PaymentChosen.setText(payment);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void cashPay(ActionEvent event) {
        try {
            payment = "Cash";
            PaymentChosen.setText(payment);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void SubmitOrder(ActionEvent event) {

        try {
            stage = (Stage) GoToFillerScreen.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Info_Ask.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            label.setText("One of the fields does not have a valid input");
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private Button btnQuit;

    @FXML
    private void handleButtonQuitAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private Button goToFeedBack;

    @FXML
    private void goToResponse(ActionEvent event) {
        try {
            stage = (Stage) goToFeedBack.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Feedback.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            label.setText("One of the fields does not have a valid input");
            System.out.println(ex.getMessage());
        }
    }

    //The following is for Add Item To Cart
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
