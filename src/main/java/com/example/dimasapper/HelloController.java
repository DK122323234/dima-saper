package com.example.dimasapper;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    List<Integer> list;
    boolean game = true;
    boolean ok = true;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cell0;

    @FXML
    private Button cell1;

    @FXML
    private Button cell10;

    @FXML
    private Button cell11;

    @FXML
    private Button cell12;

    @FXML
    private Button cell13;

    @FXML
    private Button cell14;

    @FXML
    private Button cell15;

    @FXML
    private Button cell16;

    @FXML
    private Button cell17;

    @FXML
    private Button cell18;

    @FXML
    private Button cell19;

    @FXML
    private Button cell2;

    @FXML
    private Button cell20;

    @FXML
    private Button cell21;

    @FXML
    private Button cell22;

    @FXML
    private Button cell23;

    @FXML
    private Button cell24;

    @FXML
    private Button cell25;

    @FXML
    private Button cell26;

    @FXML
    private Button cell27;

    @FXML
    private Button cell28;

    @FXML
    private Button cell29;

    @FXML
    private Button cell3;

    @FXML
    private Button cell30;

    @FXML
    private Button cell31;

    @FXML
    private Button cell32;

    @FXML
    private Button cell33;

    @FXML
    private Button cell34;

    @FXML
    private Button cell35;

    @FXML
    private Button cell36;

    @FXML
    private Button cell37;

    @FXML
    private Button cell38;

    @FXML
    private Button cell39;

    @FXML
    private Button cell4;

    @FXML
    private Button cell40;

    @FXML
    private Button cell41;

    @FXML
    private Button cell42;

    @FXML
    private Button cell43;

    @FXML
    private Button cell44;

    @FXML
    private Button cell45;

    @FXML
    private Button cell46;

    @FXML
    private Button cell47;

    @FXML
    private Button cell48;

    @FXML
    private Button cell49;

    @FXML
    private Button cell5;

    @FXML
    private Button cell50;

    @FXML
    private Button cell51;

    @FXML
    private Button cell52;

    @FXML
    private Button cell53;

    @FXML
    private Button cell54;

    @FXML
    private Button cell55;

    @FXML
    private Button cell56;

    @FXML
    private Button cell57;

    @FXML
    private Button cell58;

    @FXML
    private Button cell59;

    @FXML
    private Button cell6;

    @FXML
    private Button cell60;

    @FXML
    private Button cell61;

    @FXML
    private Button cell62;

    @FXML
    private Button cell63;

    @FXML
    private Button cell64;

    @FXML
    private Button cell65;

    @FXML
    private Button cell66;

    @FXML
    private Button cell67;

    @FXML
    private Button cell68;

    @FXML
    private Button cell69;

    @FXML
    private Button cell7;

    @FXML
    private Button cell70;

    @FXML
    private Button cell71;

    @FXML
    private Button cell72;

    @FXML
    private Button cell73;

    @FXML
    private Button cell74;

    @FXML
    private Button cell75;

    @FXML
    private Button cell76;

    @FXML
    private Button cell77;

    @FXML
    private Button cell78;

    @FXML
    private Button cell79;

    @FXML
    private Button cell8;

    @FXML
    private Button cell80;

    @FXML
    private Button cell9;

    @FXML
    private Label result;

    @FXML
    void click(ActionEvent event) {
        String buttonSource = event.getSource().toString();
       ButtonId buttonId = new ButtonId();

       switch (buttonId.sendingId(buttonSource)) {

            case "cell0":
                   if (list.get(0).equals(9)) {
                       cell0.setText("*");
                       game = false;
                       cell0.setDisable(true);
                   } else if (list.get(0).equals(0)) {
                       cell0.setText("");
                       cell0.setDisable(true);
                   } else {
                       cell0.setText(list.get(0).toString());
                       cell0.setDisable(true);
                   }
                   break;

               case "cell1":
                   if (list.get(1).equals(9)) {
                       cell1.setText("*");
                       game = false;
                       cell1.setDisable(true);
                   } else if (list.get(1).equals(0)) {
                       cell1.setText("");
                       cell1.setDisable(true);
                   } else {
                       cell1.setText(list.get(1).toString());
                       cell1.setDisable(true);
                   }
                   break;

               case "cell2":
                   if (list.get(2).equals(9)) {
                       cell2.setText("*");
                       game = false;
                       cell2.setDisable(true);
                   } else if (list.get(2).equals(0)) {
                       cell2.setText("");
                       cell2.setDisable(true);
                   } else {
                       cell2.setText(list.get(2).toString());
                       cell2.setDisable(true);
                   }
                   break;

               case "cell3":
                   if (list.get(3).equals(9)) {
                       cell3.setText("*");
                       game = false;
                       cell3.setDisable(true);
                   } else if (list.get(3).equals(0)) {
                       cell3.setText("");
                       cell3.setDisable(true);
                   } else {
                       cell3.setText(list.get(3).toString());
                       cell3.setDisable(true);
                   }
                   break;

               case "cell4":
                   if (list.get(4).equals(9)) {
                       cell4.setText("*");
                       game = false;
                       cell4.setDisable(true);
                   } else if (list.get(4).equals(0)) {
                       cell4.setText("");
                       cell4.setDisable(true);
                   } else {
                       cell4.setText(list.get(4).toString());
                       cell4.setDisable(true);
                   }
                   break;

               case "cell5":
                   if (list.get(5).equals(9)) {
                       cell5.setText("*");
                       game = false;
                       cell5.setDisable(true);
                   } else if (list.get(5).equals(0)) {
                       cell5.setText("");
                       cell5.setDisable(true);
                   } else {
                       cell5.setText(list.get(5).toString());
                       cell5.setDisable(true);
                   }
                   break;

               case "cell6":
                   if (list.get(6).equals(9)) {
                       cell6.setText("*");
                       game = false;
                       cell6.setDisable(true);
                   } else if (list.get(6).equals(0)) {
                       cell6.setText("");
                       cell6.setDisable(true);
                   } else {
                       cell6.setText(list.get(6).toString());
                       cell6.setDisable(true);
                   }
                   break;

               case "cell7":
                   if (list.get(7).equals(9)) {
                       cell7.setText("*");
                       game = false;
                       cell7.setDisable(true);
                   } else if (list.get(7).equals(0)) {
                       cell7.setText("");
                       cell7.setDisable(true);
                   } else {
                       cell7.setText(list.get(7).toString());
                       cell7.setDisable(true);
                   }
                   break;

               case "cell8":
                   if (list.get(8).equals(9)) {
                       cell8.setText("*");
                       game = false;
                       cell8.setDisable(true);
                   } else if (list.get(8).equals(0)) {
                       cell8.setText("");
                       cell8.setDisable(true);
                   } else {
                       cell8.setText(list.get(8).toString());
                       cell8.setDisable(true);
                   }
                   break;

               case "cell9":
                   if (list.get(9).equals(9)) {
                       cell9.setText("*");
                       game = false;
                       cell9.setDisable(true);
                   } else if (list.get(9).equals(0)) {
                       cell9.setText("");
                       cell9.setDisable(true);
                   } else {
                       cell9.setText(list.get(9).toString());
                       cell9.setDisable(true);
                   }
                   break;

               case "cell10":
                   if (list.get(10).equals(9)) {
                       cell10.setText("*");
                       game = false;
                       cell10.setDisable(true);
                   } else if (list.get(10).equals(0)) {
                       cell10.setText("");
                       cell10.setDisable(true);
                   } else {
                       cell10.setText(list.get(10).toString());
                       cell10.setDisable(true);
                   }
                   break;

               case "cell11":
                   if (list.get(11).equals(9)) {
                       cell11.setText("*");
                       game = false;
                       cell11.setDisable(true);
                   } else if (list.get(11).equals(0)) {
                       cell11.setText("");
                       cell11.setDisable(true);
                   } else {
                       cell11.setText(list.get(11).toString());
                       cell11.setDisable(true);
                   }
                   break;

               case "cell12":
                   if (list.get(12).equals(9)) {
                       cell12.setText("*");
                       game = false;
                       cell12.setDisable(true);
                   } else if (list.get(12).equals(0)) {
                       cell12.setText("");
                       cell12.setDisable(true);
                   } else {
                       cell12.setText(list.get(12).toString());
                       cell12.setDisable(true);
                   }
                   break;

               case "cell13":
                   if (list.get(13).equals(9)) {
                       cell13.setText("*");
                       game = false;
                       cell13.setDisable(true);
                   } else if (list.get(13).equals(0)) {
                       cell13.setText("");
                       cell13.setDisable(true);
                   } else {
                       cell13.setText(list.get(13).toString());
                       cell13.setDisable(true);
                   }
                   break;

               case "cell14":
                   if (list.get(14).equals(9)) {
                       cell14.setText("*");
                       game = false;
                       cell14.setDisable(true);
                   } else if (list.get(14).equals(0)) {
                       cell14.setText("");
                       cell14.setDisable(true);
                   } else {
                       cell14.setText(list.get(14).toString());
                       cell14.setDisable(true);
                   }
                   break;

               case "cell15":
                   if (list.get(15).equals(9)) {
                       cell15.setText("*");
                       game = false;
                       cell15.setDisable(true);
                   } else if (list.get(15).equals(0)) {
                       cell15.setText("");
                       cell15.setDisable(true);
                   } else {
                       cell15.setText(list.get(15).toString());
                       cell15.setDisable(true);
                   }
                   break;

               case "cell16":
                   if (list.get(16).equals(9)) {
                       cell16.setText("*");
                       game = false;
                       cell16.setDisable(true);
                   } else if (list.get(16).equals(0)) {
                       cell16.setText("");
                       cell16.setDisable(true);
                   } else {
                       cell16.setText(list.get(16).toString());
                       cell16.setDisable(true);
                   }
                   break;

               case "cell17":
                   if (list.get(17).equals(9)) {
                       cell17.setText("*");
                       game = false;
                       cell17.setDisable(true);
                   } else if (list.get(17).equals(0)) {
                       cell17.setText("");
                       cell17.setDisable(true);
                   } else {
                       cell17.setText(list.get(17).toString());
                       cell17.setDisable(true);
                   }
                   break;

               case "cell18":
                   if (list.get(18).equals(9)) {
                       cell18.setText("*");
                       game = false;
                       cell18.setDisable(true);
                   } else if (list.get(18).equals(0)) {
                       cell18.setText("");
                       cell18.setDisable(true);
                   } else {
                       cell18.setText(list.get(18).toString());
                       cell18.setDisable(true);
                   }
                   break;

               case "cell19":
                   if (list.get(19).equals(9)) {
                       cell19.setText("*");
                       game = false;
                       cell19.setDisable(true);
                   } else if (list.get(19).equals(0)) {
                       cell19.setText("");
                       cell19.setDisable(true);
                   } else {
                       cell19.setText(list.get(19).toString());
                       cell19.setDisable(true);
                   }
                   break;

               case "cell20":
                   if (list.get(20).equals(9)) {
                       cell20.setText("*");
                       game = false;
                       cell20.setDisable(true);
                   } else if (list.get(20).equals(0)) {
                       cell20.setText("");
                       cell20.setDisable(true);
                   } else {
                       cell20.setText(list.get(20).toString());
                       cell20.setDisable(true);
                   }
                   break;

               case "cell21":
                   if (list.get(21).equals(9)) {
                       cell21.setText("*");
                       game = false;
                       cell21.setDisable(true);
                   } else if (list.get(21).equals(0)) {
                       cell21.setText("");
                       cell21.setDisable(true);
                   } else {
                       cell21.setText(list.get(21).toString());
                       cell21.setDisable(true);
                   }
                   break;

               case "cell22":
                   if (list.get(22).equals(9)) {
                       cell22.setText("*");
                       game = false;
                       cell22.setDisable(true);
                   } else if (list.get(22).equals(0)) {
                       cell22.setText("");
                       cell22.setDisable(true);
                   } else {
                       cell22.setText(list.get(22).toString());
                       cell22.setDisable(true);
                   }
                   break;

               case "cell23":
                   if (list.get(23).equals(9)) {
                       cell23.setText("*");
                       game = false;
                       cell23.setDisable(true);
                   } else if (list.get(23).equals(0)) {
                       cell23.setText("");
                       cell23.setDisable(true);
                   } else {
                       cell23.setText(list.get(23).toString());
                       cell23.setDisable(true);
                   }
                   break;

               case "cell24":
                   if (list.get(24).equals(9)) {
                       cell24.setText("*");
                       game = false;
                       cell24.setDisable(true);
                   } else if (list.get(24).equals(0)) {
                       cell24.setText("");
                       cell24.setDisable(true);
                   } else {
                       cell24.setText(list.get(24).toString());
                       cell24.setDisable(true);
                   }
                   break;

               case "cell25":
                   if (list.get(25).equals(9)) {
                       cell25.setText("*");
                       game = false;
                       cell25.setDisable(true);
                   } else if (list.get(25).equals(0)) {
                       cell25.setText("");
                       cell25.setDisable(true);
                   } else {
                       cell25.setText(list.get(25).toString());
                       cell25.setDisable(true);
                   }
                   break;

               case "cell26":
                   if (list.get(26).equals(9)) {
                       cell26.setText("*");
                       game = false;
                       cell26.setDisable(true);
                   } else if (list.get(26).equals(0)) {
                       cell26.setText("");
                       cell26.setDisable(true);
                   } else {
                       cell26.setText(list.get(26).toString());
                       cell26.setDisable(true);
                   }
                   break;

               case "cell27":
                   if (list.get(27).equals(9)) {
                       cell27.setText("*");
                       game = false;
                       cell27.setDisable(true);
                   } else if (list.get(27).equals(0)) {
                       cell27.setText("");
                       cell27.setDisable(true);
                   } else {
                       cell27.setText(list.get(27).toString());
                       cell27.setDisable(true);
                   }
                   break;

               case "cell28":
                   if (list.get(28).equals(9)) {
                       cell28.setText("*");
                       game = false;
                       cell28.setDisable(true);
                   } else if (list.get(28).equals(0)) {
                       cell28.setText("");
                       cell28.setDisable(true);
                   } else {
                       cell28.setText(list.get(28).toString());
                       cell28.setDisable(true);
                   }
                   break;

               case "cell29":
                   if (list.get(29).equals(9)) {
                       cell29.setText("*");
                       game = false;
                       cell29.setDisable(true);
                   } else if (list.get(29).equals(0)) {
                       cell29.setText("");
                       cell29.setDisable(true);
                   } else {
                       cell29.setText(list.get(29).toString());
                       cell29.setDisable(true);
                   }
                   break;

               case "cell30":
                   if (list.get(30).equals(9)) {
                       cell30.setText("*");
                       game = false;
                       cell30.setDisable(true);
                   } else if (list.get(30).equals(0)) {
                       cell30.setText("");
                       cell30.setDisable(true);
                   } else {
                       cell30.setText(list.get(30).toString());
                       cell30.setDisable(true);
                   }
                   break;

               case "cell31":
                   if (list.get(31).equals(9)) {
                       cell31.setText("*");
                       game = false;
                       cell31.setDisable(true);
                   } else if (list.get(31).equals(0)) {
                       cell31.setText("");
                       cell31.setDisable(true);
                   } else {
                       cell31.setText(list.get(31).toString());
                       cell31.setDisable(true);
                   }
                   break;

               case "cell32":
                   if (list.get(32).equals(9)) {
                       cell32.setText("*");
                       game = false;
                       cell32.setDisable(true);
                   } else if (list.get(32).equals(0)) {
                       cell32.setText("");
                       cell32.setDisable(true);
                   } else {
                       cell32.setText(list.get(32).toString());
                       cell32.setDisable(true);
                   }
                   break;

               case "cell33":
                   if (list.get(33).equals(9)) {
                       cell33.setText("*");
                       game = false;
                       cell33.setDisable(true);
                   } else if (list.get(33).equals(0)) {
                       cell33.setText("");
                       cell33.setDisable(true);
                   }
                   else {
                       cell33.setText(list.get(33).toString());
                       cell33.setDisable(true);
                   }
                   break;

               case "cell34":
                   if (list.get(34).equals(9)) {
                       cell34.setText("*");
                       game = false;
                       cell34.setDisable(true);
                   } else if (list.get(34).equals(0)) {
                       cell34.setText("");
                       cell34.setDisable(true);
                   } else {
                       cell34.setText(list.get(34).toString());
                       cell34.setDisable(true);
                   }
                   break;

               case "cell35":
                   if (list.get(35).equals(9)) {
                       cell35.setText("*");
                       game = false;
                       cell35.setDisable(true);
                   } else if (list.get(35).equals(0)) {
                       cell35.setText("");
                       cell35.setDisable(true);
                   } else {
                       cell35.setText(list.get(35).toString());
                       cell35.setDisable(true);
                   }
                   break;

               case "cell36":
                   if (list.get(36).equals(9)) {
                       cell36.setText("*");
                       game = false;
                       cell36.setDisable(true);
                   } else if (list.get(36).equals(0)) {
                       cell36.setText("");
                       cell36.setDisable(true);
                   } else {
                       cell36.setText(list.get(36).toString());
                       cell36.setDisable(true);
                   }
                   break;

               case "cell37":
                   if (list.get(37).equals(9)) {
                       cell37.setText("*");
                       game = false;
                       cell37.setDisable(true);
                   } else if (list.get(37).equals(0)) {
                       cell37.setText("");
                       cell37.setDisable(true);
                   } else {
                       cell37.setText(list.get(37).toString());
                       cell37.setDisable(true);
                   }
                   break;

               case "cell38":
                   if (list.get(38).equals(9)) {
                       cell38.setText("*");
                       game = false;
                       cell38.setDisable(true);
                   } else if (list.get(38).equals(0)) {
                       cell38.setText("");
                       cell38.setDisable(true);
                   } else {
                       cell38.setText(list.get(38).toString());
                       cell38.setDisable(true);
                   }
                   break;

               case "cell39":
                   if (list.get(39).equals(9)) {
                       cell39.setText("*");
                       game = false;
                       cell39.setDisable(true);
                   } else if (list.get(39).equals(0)) {
                       cell39.setText("");
                       cell39.setDisable(true);
                   } else {
                       cell39.setText(list.get(39).toString());
                       cell39.setDisable(true);
                   }
                   break;

               case "cell40":
                   if (list.get(40).equals(9)) {
                       cell40.setText("*");
                       game = false;
                       cell40.setDisable(true);
                   } else if (list.get(40).equals(0)) {
                       cell40.setText("");
                       cell40.setDisable(true);
                   } else {
                       cell40.setText(list.get(40).toString());
                       cell40.setDisable(true);
                   }
                   break;

               case "cell41":
                   if (list.get(41).equals(9)) {
                       cell41.setText("*");
                       game = false;
                       cell41.setDisable(true);
                   } else if (list.get(41).equals(0)) {
                       cell41.setText("");
                       cell41.setDisable(true);
                   } else {
                       cell41.setText(list.get(41).toString());
                       cell41.setDisable(true);
                   }
                   break;

               case "cell42":
                   if (list.get(42).equals(9)) {
                       cell42.setText("*");
                       game = false;
                       cell42.setDisable(true);
                   } else if (list.get(42).equals(0)) {
                       cell42.setText("");
                       cell42.setDisable(true);
                   } else {
                       cell42.setText(list.get(42).toString());
                       cell42.setDisable(true);
                   }
                   break;

               case "cell43":
                   if (list.get(43).equals(9)) {
                       cell43.setText("*");
                       game = false;
                       cell43.setDisable(true);
                   } else if (list.get(43).equals(0)) {
                       cell43.setText("");
                       cell43.setDisable(true);
                   } else {
                       cell43.setText(list.get(43).toString());
                       cell43.setDisable(true);
                   }
                   break;

               case "cell44":
                   if (list.get(44).equals(9)) {
                       cell44.setText("*");
                       game = false;
                       cell44.setDisable(true);
                   } else if (list.get(44).equals(0)) {
                       cell44.setText("");
                       cell44.setDisable(true);
                   } else {
                       cell44.setText(list.get(44).toString());
                       cell44.setDisable(true);
                   }
                   break;

               case "cell45":
                   if (list.get(45).equals(9)) {
                       cell45.setText("*");
                       game = false;
                       cell45.setDisable(true);
                   } else if (list.get(45).equals(0)) {
                       cell45.setText("");
                       cell45.setDisable(true);
                   } else {
                       cell45.setText(list.get(45).toString());
                       cell45.setDisable(true);
                   }
                   break;

               case "cell46":
                   if (list.get(46).equals(9)) {
                       cell46.setText("*");
                       game = false;
                       cell46.setDisable(true);
                   } else if (list.get(46).equals(0)) {
                       cell46.setText("");
                       cell46.setDisable(true);
                   } else {
                       cell46.setText(list.get(46).toString());
                       cell46.setDisable(true);
                   }
                   break;

               case "cell47":
                   if (list.get(47).equals(9)) {
                       cell47.setText("*");
                       game = false;
                       cell47.setDisable(true);
                   } else if (list.get(47).equals(0)) {
                       cell47.setText("");
                       cell47.setDisable(true);
                   } else {
                       cell47.setText(list.get(47).toString());
                       cell47.setDisable(true);
                   }
                   break;

               case "cell48":
                   if (list.get(48).equals(9)) {
                       cell48.setText("*");
                       game = false;
                       cell48.setDisable(true);
                   } else if (list.get(48).equals(0)) {
                       cell48.setText("");
                       cell48.setDisable(true);
                   } else {
                       cell48.setText(list.get(48).toString());
                       cell48.setDisable(true);
                   }
                   break;

               case "cell49":
                   if (list.get(49).equals(9)) {
                       cell49.setText("*");
                       game = false;
                       cell49.setDisable(true);
                   } else if (list.get(49).equals(0)) {
                       cell49.setText("");
                       cell49.setDisable(true);
                   } else {
                       cell49.setText(list.get(49).toString());
                       cell49.setDisable(true);
                   }
                   break;

               case "cell50":
                   if (list.get(50).equals(9)) {
                       cell50.setText("*");
                       game = false;
                       cell50.setDisable(true);
                   } else if (list.get(50).equals(0)) {
                       cell50.setText("");
                       cell50.setDisable(true);
                   } else {
                       cell50.setText(list.get(50).toString());
                       cell50.setDisable(true);
                   }
                   break;

               case "cell51":
                   if (list.get(51).equals(9)) {
                       cell51.setText("*");
                       game = false;
                       cell51.setDisable(true);
                   } else if (list.get(51).equals(0)) {
                       cell51.setText("");
                       cell51.setDisable(true);
                   } else {
                       cell51.setText(list.get(51).toString());
                       cell51.setDisable(true);
                   }
                   break;

               case "cell52":
                   if (list.get(52).equals(9)) {
                       cell52.setText("*");
                       game = false;
                       cell52.setDisable(true);
                   } else if (list.get(52).equals(0)) {
                       cell52.setText("");
                       cell52.setDisable(true);
                   } else {
                       cell52.setText(list.get(52).toString());
                       cell52.setDisable(true);
                   }
                   break;

               case "cell53":
                   if (list.get(53).equals(9)) {
                       cell53.setText("*");
                       game = false;
                       cell53.setDisable(true);
                   } else if (list.get(53).equals(0)) {
                       cell53.setText("");
                       cell53.setDisable(true);
                   } else {
                       cell53.setText(list.get(53).toString());
                       cell53.setDisable(true);
                   }
                   break;

               case "cell54":
                   if (list.get(54).equals(9)) {
                       cell54.setText("*");
                       game = false;
                       cell54.setDisable(true);
                   } else if (list.get(54).equals(0)) {
                       cell54.setText("");
                       cell54.setDisable(true);
                   } else {
                       cell54.setText(list.get(54).toString());
                       cell54.setDisable(true);
                   }
                   break;

               case "cell55":
                   if (list.get(55).equals(9)) {
                       cell55.setText("*");
                       game = false;
                       cell55.setDisable(true);
                   } else if (list.get(55).equals(0)) {
                       cell55.setText("");
                       cell55.setDisable(true);
                   } else {
                       cell55.setText(list.get(55).toString());
                       cell55.setDisable(true);
                   }
                   break;

               case "cell56":
                   if (list.get(56).equals(9)) {
                       cell56.setText("*");
                       game = false;
                       cell56.setDisable(true);
                   } else if (list.get(56).equals(0)) {
                       cell56.setText("");
                       cell56.setDisable(true);
                   } else {
                       cell56.setText(list.get(56).toString());
                       cell56.setDisable(true);
                   }
                   break;

               case "cell57":
                   if (list.get(57).equals(9)) {
                       cell57.setText("*");
                       game = false;
                       cell57.setDisable(true);
                   } else if (list.get(57).equals(0)) {
                       cell57.setText("");
                       cell57.setDisable(true);
                   } else {
                       cell57.setText(list.get(57).toString());
                       cell57.setDisable(true);
                   }
                   break;

               case "cell58":
                   if (list.get(58).equals(9)) {
                       cell58.setText("*");
                       game = false;
                       cell58.setDisable(true);
                   } else if (list.get(58).equals(0)) {
                       cell58.setText("");
                       cell58.setDisable(true);
                   } else {
                       cell58.setText(list.get(58).toString());
                       cell58.setDisable(true);
                   }
                   break;

               case "cell59":
                   if (list.get(59).equals(9)) {
                       cell59.setText("*");
                       game = false;
                       cell59.setDisable(true);
                   } else if (list.get(59).equals(0)) {
                       cell59.setText("");
                       cell59.setDisable(true);
                   } else {
                       cell59.setText(list.get(59).toString());
                       cell59.setDisable(true);
                   }
                   break;

               case "cell60":
                   if (list.get(60).equals(9)) {
                       cell60.setText("*");
                       game = false;
                       cell60.setDisable(true);
                   } else if (list.get(60).equals(0)) {
                       cell60.setText("");
                       cell60.setDisable(true);
                   } else {
                       cell60.setText(list.get(60).toString());
                       cell60.setDisable(true);
                   }
                   break;

               case "cell61":
                   if (list.get(61).equals(9)) {
                       cell61.setText("*");
                       game = false;
                       cell61.setDisable(true);
                   } else if (list.get(61).equals(0)) {
                       cell61.setText("");
                       cell61.setDisable(true);
                   } else {
                       cell61.setText(list.get(61).toString());
                       cell61.setDisable(true);
                   }
                   break;

               case "cell62":
                   if (list.get(62).equals(9)) {
                       cell62.setText("*");
                       game = false;
                       cell62.setDisable(true);
                   } else if (list.get(62).equals(0)) {
                       cell62.setText("");
                       cell62.setDisable(true);
                   } else {
                       cell62.setText(list.get(62).toString());
                       cell62.setDisable(true);
                   }
                   break;

               case "cell63":
                   if (list.get(63).equals(9)) {
                       cell63.setText("*");
                       game = false;
                       cell63.setDisable(true);
                   } else if (list.get(63).equals(0)) {
                       cell63.setText("");
                       cell63.setDisable(true);
                   } else {
                       cell63.setText(list.get(63).toString());
                       cell63.setDisable(true);
                   }
                   break;

               case "cell64":
                   if (list.get(64).equals(9)) {
                       cell64.setText("*");
                       game = false;
                       cell64.setDisable(true);
                   } else if (list.get(64).equals(0)) {
                       cell64.setText("");
                       cell64.setDisable(true);
                   } else {
                       cell64.setText(list.get(64).toString());
                       cell64.setDisable(true);
                   }
                   break;

               case "cell65":
                   if (list.get(65).equals(9)) {
                       cell65.setText("*");
                       game = false;
                       cell65.setDisable(true);
                   } else if (list.get(65).equals(0)) {
                       cell65.setText("");
                       cell65.setDisable(true);
                   } else {
                       cell65.setText(list.get(65).toString());
                       cell65.setDisable(true);
                   }
                   break;

               case "cell66":
                   if (list.get(66).equals(9)) {
                       cell66.setText("*");
                       game = false;
                       cell66.setDisable(true);
                   } else if (list.get(66).equals(0)) {
                       cell66.setText("");
                       cell66.setDisable(true);
                   } else {
                       cell66.setText(list.get(66).toString());
                       cell66.setDisable(true);
                   }
                   break;

               case "cell67":
                   if (list.get(67).equals(9)) {
                       cell67.setText("*");
                       game = false;
                       cell67.setDisable(true);
                   } else if (list.get(67).equals(0)) {
                       cell67.setText("");
                       cell67.setDisable(true);
                   } else {
                       cell67.setText(list.get(67).toString());
                       cell67.setDisable(true);
                   }
                   break;

               case "cell68":
                   if (list.get(68).equals(9)) {
                       cell68.setText("*");
                       game = false;
                       cell68.setDisable(true);
                   } else if (list.get(68).equals(0)) {
                       cell68.setText("");
                       cell68.setDisable(true);
                   } else {
                       cell68.setText(list.get(68).toString());
                       cell68.setDisable(true);
                   }
                   break;

               case "cell69":
                   if (list.get(69).equals(9)) {
                       cell69.setText("*");
                       game = false;
                       cell69.setDisable(true);
                   } else if (list.get(69).equals(0)) {
                       cell69.setText("");
                       cell69.setDisable(true);
                   } else {
                       cell69.setText(list.get(69).toString());
                       cell69.setDisable(true);
                   }
                   break;

               case "cell70":
                   if (list.get(70).equals(9)) {
                       cell70.setText("*");
                       game = false;
                       cell70.setDisable(true);
                   } else if (list.get(70).equals(0)) {
                       cell70.setText("");
                       cell70.setDisable(true);
                   } else {
                       cell70.setText(list.get(70).toString());
                       cell70.setDisable(true);
                   }
                   break;

               case "cell71":
                   if (list.get(71).equals(9)) {
                       cell71.setText("*");
                       game = false;
                       cell71.setDisable(true);
                   } else if (list.get(71).equals(0)) {
                       cell71.setText("");
                       cell71.setDisable(true);
                   } else {
                       cell71.setText(list.get(71).toString());
                       cell71.setDisable(true);
                   }
                   break;

               case "cell72":
                   if (list.get(72).equals(9)) {
                       cell72.setText("*");
                       game = false;
                       cell72.setDisable(true);
                   } else if (list.get(72).equals(0)) {
                       cell72.setText("");
                       cell72.setDisable(true);
                   } else {
                       cell72.setText(list.get(72).toString());
                       cell72.setDisable(true);
                   }
                   break;

               case "cell73":
                   if (list.get(73).equals(9)) {
                       cell73.setText("*");
                       game = false;
                       cell73.setDisable(true);
                   } else if (list.get(73).equals(0)) {
                       cell73.setText("");
                       cell73.setDisable(true);
                   } else {
                       cell73.setText(list.get(73).toString());
                       cell73.setDisable(true);
                   }
                   break;

               case "cell74":
                   if (list.get(74).equals(9)) {
                       cell74.setText("*");
                       game = false;
                       cell74.setDisable(true);
                   } else if (list.get(74).equals(0)) {
                       cell74.setText("");
                       cell74.setDisable(true);
                   } else {
                       cell74.setText(list.get(74).toString());
                       cell74.setDisable(true);
                   }
                   break;

               case "cell75":
                   if (list.get(75).equals(9)) {
                       cell75.setText("*");
                       game = false;
                       cell75.setDisable(true);
                   } else if (list.get(75).equals(0)) {
                       cell75.setText("");
                       cell75.setDisable(true);
                   } else {
                       cell75.setText(list.get(75).toString());
                       cell75.setDisable(true);
                   }
                   break;

               case "cell76":
                   if (list.get(76).equals(9)) {
                       cell76.setText("*");
                       game = false;
                       cell76.setDisable(true);
                   } else if (list.get(76).equals(0)) {
                       cell76.setText("");
                       cell76.setDisable(true);
                   } else {
                       cell76.setText(list.get(76).toString());
                       cell76.setDisable(true);
                   }
                   break;

               case "cell77":
                   if (list.get(77).equals(9)) {
                       cell77.setText("*");
                       game = false;
                       cell77.setDisable(true);
                   } else if (list.get(77).equals(0)) {
                       cell77.setText("");
                       cell77.setDisable(true);
                   } else {
                       cell77.setText(list.get(77).toString());
                       cell77.setDisable(true);
                   }
                   break;

               case "cell78":
                   if (list.get(78).equals(9)) {
                       cell78.setText("*");
                       game = false;
                       cell78.setDisable(true);
                   } else if (list.get(78).equals(0)) {
                       cell78.setText("");
                       cell78.setDisable(true);
                   } else {
                       cell78.setText(list.get(78).toString());
                       cell78.setDisable(true);
                   }
                   break;

               case "cell79":
                   if (list.get(79).equals(9)) {
                       cell79.setText("*");
                       game = false;
                       cell79.setDisable(true);
                   } else if (list.get(79).equals(0)) {
                       cell79.setText("");
                       cell79.setDisable(true);
                   } else {
                       cell79.setText(list.get(79).toString());
                       cell79.setDisable(true);
                   }
                   break;

               case "cell80":
                   if (list.get(80).equals(9)) {
                       cell80.setText("*");
                       game = false;
                       cell80.setDisable(true);
                   } else if (list.get(80).equals(0)) {
                       cell80.setText("");
                       cell80.setDisable(true);
                   } else {
                       cell80.setText(list.get(80).toString());
                       cell80.setDisable(true);
           }
                   break;
       }
       if (!game){
           result.setText("   ВЫ ПРОИГРАЛИ");
           cell0.setDisable(true);
           cell1.setDisable(true);
           cell2.setDisable(true);
           cell3.setDisable(true);
           cell4.setDisable(true);
           cell5.setDisable(true);
           cell6.setDisable(true);
           cell7.setDisable(true);
           cell8.setDisable(true);
           cell9.setDisable(true);
           cell10.setDisable(true);
           cell11.setDisable(true);
           cell12.setDisable(true);
           cell13.setDisable(true);
           cell14.setDisable(true);
           cell15.setDisable(true);
           cell16.setDisable(true);
           cell17.setDisable(true);
           cell18.setDisable(true);
           cell19.setDisable(true);
           cell20.setDisable(true);
           cell21.setDisable(true);
           cell22.setDisable(true);
           cell23.setDisable(true);
           cell24.setDisable(true);
           cell25.setDisable(true);
           cell26.setDisable(true);
           cell27.setDisable(true);
           cell28.setDisable(true);
           cell29.setDisable(true);
           cell30.setDisable(true);
           cell31.setDisable(true);
           cell32.setDisable(true);
           cell33.setDisable(true);
           cell34.setDisable(true);
           cell35.setDisable(true);
           cell36.setDisable(true);
           cell37.setDisable(true);
           cell38.setDisable(true);
           cell39.setDisable(true);
           cell40.setDisable(true);
           cell41.setDisable(true);
           cell42.setDisable(true);
           cell43.setDisable(true);
           cell44.setDisable(true);
           cell45.setDisable(true);
           cell46.setDisable(true);
           cell47.setDisable(true);
           cell48.setDisable(true);
           cell49.setDisable(true);
           cell50.setDisable(true);
           cell51.setDisable(true);
           cell52.setDisable(true);
           cell53.setDisable(true);
           cell54.setDisable(true);
           cell55.setDisable(true);
           cell56.setDisable(true);
           cell57.setDisable(true);
           cell58.setDisable(true);
           cell59.setDisable(true);
           cell60.setDisable(true);
           cell61.setDisable(true);
           cell62.setDisable(true);
           cell63.setDisable(true);
           cell64.setDisable(true);
           cell65.setDisable(true);
           cell66.setDisable(true);
           cell67.setDisable(true);
           cell68.setDisable(true);
           cell69.setDisable(true);
           cell70.setDisable(true);
           cell71.setDisable(true);
           cell72.setDisable(true);
           cell73.setDisable(true);
           cell74.setDisable(true);
           cell75.setDisable(true);
           cell76.setDisable(true);
           cell77.setDisable(true);
           cell78.setDisable(true);
           cell79.setDisable(true);
           cell80.setDisable(true);

       }
    }
    @FXML
    void Rewrite(ActionEvent event) {
        cell0.setDisable(false);
        cell1.setDisable(false);
        cell2.setDisable(false);
        cell3.setDisable(false);
        cell4.setDisable(false);
        cell5.setDisable(false);
        cell6.setDisable(false);
        cell7.setDisable(false);
        cell8.setDisable(false);
        cell9.setDisable(false);
        cell10.setDisable(false);
        cell11.setDisable(false);
        cell12.setDisable(false);
        cell13.setDisable(false);
        cell14.setDisable(false);
        cell15.setDisable(false);
        cell16.setDisable(false);
        cell17.setDisable(false);
        cell18.setDisable(false);
        cell19.setDisable(false);
        cell20.setDisable(false);
        cell21.setDisable(false);
        cell22.setDisable(false);
        cell23.setDisable(false);
        cell24.setDisable(false);
        cell25.setDisable(false);
        cell26.setDisable(false);
        cell27.setDisable(false);
        cell28.setDisable(false);
        cell29.setDisable(false);
        cell30.setDisable(false);
        cell31.setDisable(false);
        cell32.setDisable(false);
        cell33.setDisable(false);
        cell34.setDisable(false);
        cell35.setDisable(false);
        cell36.setDisable(false);
        cell37.setDisable(false);
        cell38.setDisable(false);
        cell39.setDisable(false);
        cell40.setDisable(false);
        cell41.setDisable(false);
        cell42.setDisable(false);
        cell43.setDisable(false);
        cell44.setDisable(false);
        cell45.setDisable(false);
        cell46.setDisable(false);
        cell47.setDisable(false);
        cell48.setDisable(false);
        cell49.setDisable(false);
        cell50.setDisable(false);
        cell51.setDisable(false);
        cell52.setDisable(false);
        cell53.setDisable(false);
        cell54.setDisable(false);
        cell55.setDisable(false);
        cell56.setDisable(false);
        cell57.setDisable(false);
        cell58.setDisable(false);
        cell59.setDisable(false);
        cell60.setDisable(false);
        cell61.setDisable(false);
        cell62.setDisable(false);
        cell63.setDisable(false);
        cell64.setDisable(false);
        cell65.setDisable(false);
        cell66.setDisable(false);
        cell67.setDisable(false);
        cell68.setDisable(false);
        cell69.setDisable(false);
        cell70.setDisable(false);
        cell71.setDisable(false);
        cell72.setDisable(false);
        cell73.setDisable(false);
        cell74.setDisable(false);
        cell75.setDisable(false);
        cell76.setDisable(false);
        cell77.setDisable(false);
        cell78.setDisable(false);
        cell79.setDisable(false);
        cell80.setDisable(false);

        cell0.setText(" ");
        cell1.setText(" ");
        cell2.setText(" ");
        cell3.setText(" ");
        cell4.setText(" ");
        cell5.setText(" ");
        cell6.setText(" ");
        cell7.setText(" ");
        cell8.setText(" ");
        cell9.setText(" ");
        cell10.setText(" ");
        cell11.setText(" ");
        cell12.setText(" ");
        cell13.setText(" ");
        cell14.setText(" ");
        cell15.setText(" ");
        cell16.setText(" ");
        cell17.setText(" ");
        cell18.setText(" ");
        cell19.setText(" ");
        cell20.setText(" ");
        cell21.setText(" ");
        cell22.setText(" ");
        cell23.setText(" ");
        cell24.setText(" ");
        cell25.setText(" ");
        cell26.setText(" ");
        cell27.setText(" ");
        cell28.setText(" ");
        cell29.setText(" ");
        cell30.setText(" ");
        cell31.setText(" ");
        cell32.setText(" ");
        cell33.setText(" ");
        cell34.setText(" ");
        cell35.setText(" ");
        cell36.setText(" ");
        cell37.setText(" ");
        cell38.setText(" ");
        cell39.setText(" ");
        cell40.setText(" ");
        cell41.setText(" ");
        cell42.setText(" ");
        cell43.setText(" ");
        cell44.setText(" ");
        cell45.setText(" ");
        cell46.setText(" ");
        cell47.setText(" ");
        cell48.setText(" ");
        cell49.setText(" ");
        cell50.setText(" ");
        cell51.setText(" ");
        cell52.setText(" ");
        cell53.setText(" ");
        cell54.setText(" ");
        cell55.setText(" ");
        cell56.setText(" ");
        cell57.setText(" ");
        cell58.setText(" ");
        cell59.setText(" ");
        cell60.setText(" ");
        cell61.setText(" ");
        cell62.setText(" ");
        cell63.setText(" ");
        cell64.setText(" ");
        cell65.setText(" ");
        cell66.setText(" ");
        cell67.setText(" ");
        cell68.setText(" ");
        cell69.setText(" ");
        cell70.setText(" ");
        cell71.setText(" ");
        cell72.setText(" ");
        cell73.setText(" ");
        cell74.setText(" ");
        cell75.setText(" ");
        cell76.setText(" ");
        cell77.setText(" ");
        cell78.setText(" ");
        cell79.setText(" ");
        cell80.setText(" ");

        MinePlacement minePlacement = new MinePlacement();
        Field field = new Field();
        list = field.returnField(minePlacement.returnMines());
        result.setText("        ИГРА ИДЕТ");
          game = true;
    }
}